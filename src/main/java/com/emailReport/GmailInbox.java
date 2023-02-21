package com.emailReport;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMessage;
import javax.mail.search.FlagTerm;

import org.jsoup.Jsoup;

import com.utility.ExtentReporter;

public class GmailInbox {
		
	public static String readEmail(String subject){
		ExtentReporter.HeaderChildNode("TC_003 : Verify the Login functionality of Seriti portal");

		GmailInbox gmail = new GmailInbox();
		return gmail.fetchPassword2(gmail.read(subject));
	}
	
	
	public static String readEmailOtp(String subject) throws InterruptedException{
		//ExtentReporter.HeaderChildNode("TC_003 : Verify the Login functionality of Seriti portal");
           Thread.sleep(45000);
		GmailInbox gmail = new GmailInbox();
		return gmail.fetchPassword3(gmail.read(subject));
	}
	
	@SuppressWarnings("unused")
	/**
	 * Method to retrieve the OTP from Gmail
	 * @param subject
	 * @return
	 */
	public String read(String subject) {

		String plainText = null;
		String OTP = null;
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.port", "465");
        try {
            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("MarquisIGS123@gmail.com", "lxygjehlgxrbvvsa");
                        }
                    });
            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", "MarquisIGS123@gmail.com", "lxygjehlgxrbvvsa");// need to enter the required Mail ID and password
            System.out.println("connection is established with the Mail ID");
            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_WRITE);
            int messageCount = inbox.getMessageCount();
            System.out.println(messageCount);
            FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
            Message[] message = inbox.search(ft);
            boolean emailFound = false;
            for (int i = 1; i < message.length; i++) {
               System.out.println("Mail Subject:- " + message[i].getSubject());
                if(emailFound == false){
                    if(message[i].getSubject().contains(subject)){
                        MimeMessage msg = (MimeMessage) message[i];
                        System.out.println(msg.getContentType());
                        Multipart mp = (Multipart) msg.getContent();
                        int mp_count = mp.getCount();
                        System.out.println(mp_count);
//                        for (int j = 0; j < mp_count; j++) {
//                            System.out.println(mp.getBodyPart(j).getContent());
//                        }
//                        System.out.println(mp.getBodyPart(0).getContent());
                        String s = (String)mp.getBodyPart(0).getContent();
                        plainText = Jsoup.parse(s).text();
//                        System.out.println(plainText);
                        FlagTerm ft1 = new FlagTerm(new Flags(Flags.Flag.SEEN), true);
                        Message[] message1 = inbox.search(ft1);
                        emailFound = true;
                        break;
                    }
                }
            }
            if(emailFound == false){
                System.out.println("User is not received the mail or the mail content is read");
            }
            inbox.close(true);
            store.close();
        } catch (Exception e) {
            e.printStackTrace();
		}
		return plainText;
	}

	public String fetchPassword(String Message){
		Pattern p = Pattern.compile("\\b((?:https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|])");
		Matcher m = p.matcher(Message);
		m.find();
		return m.group(0);
	}
	
	
	
	/**
	 * Method to split the OTP text and retrieve only OTP number 
	 * @param text
	 * @return
	 */
	public String FetchPassword1(String text) {
		 String [] array = text.split("Your Login OTP is ");
         String [] array1 = array[1].split("\\.");
     //    System.out.println(array1[0]);
         return array1[0];
	}
	
	
	public String fetchPassword2(String text)
	{
		String [] array = text.split("Your ID number Password: ");
		 String [] array1 = array[1].split("\\s");
		 
		 System.out.println(array1[0]);
	     
	     String res= array1[0];
		return res;
	}
	
	
	public String fetchPassword3(String text)
	{
		String [] array = text.split("Pin: ");
		 String otp = array[1];
		 
		 System.out.println(otp);
	     
	     String res= otp;
		return res;
	}

	
}



