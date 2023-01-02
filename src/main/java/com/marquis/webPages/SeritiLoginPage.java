package com.marquis.webPages;

import org.openqa.selenium.By;
import org.testng.Assert;

//import com.marquis.Financier.WebPages.portalLoginPage;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import com.utility.Utilities;

public class SeritiLoginPage {
	
	static LoggingUtils logger = new LoggingUtils();
	
	//Login page title
		public static By loginPageTitle = By.xpath("//*[@id=\"hedHeader\"]/title");
		
		//Login page header
		public static By loginHeader = By.id("Heading1");
		
		//User name text field
		public static By userNameField = By.id("txtUserName");
		
		//User name required text message
		public static By userNameRequiredMsg = By.xpath("//*[@id=\"_val_txtUserName\"]");
		
		//User Password text field
		public static By userPwdField = By.id("txtPassword");
		
		//User Password required text message
		public static By pwdRequiredMsg = By.xpath("//*[@id=\"_val_txtPassword\"]");
		
		//Forgot Password link
		public static By forgotPwdLink = By.partialLinkText("Forgot your");
		
		//Terms and condition first half message
		public static By termsAndConditionsFirst = By.xpath("//*[@id=\"pnlSupportedBrowser\"]/table/tbody/tr[4]/td/text()[2]");
		
		//Terms and conditions link
		public static By termsLink = By.partialLinkText("Terms and ");
		
		//Terms and condition second half message
		public static By termsAndConditionsSecond = By.xpath("//*[@id=\"pnlSupportedBrowser\"]/table/tbody/tr[4]/td/text()[3]");
		
		//Login button
		public static By loginButton = By.id("btnLogon");
		
		
		  //Login page Methods
		//-------------------------------------------------------------------------------------------
		
		/**
		 * Method for login into Marquis Financier DMS
		 * @throws Exception
		 * 
		 *
		 */
		
		public static void login(String userName, String password) throws Exception {
			ExtentReporter.HeaderChildNode("TC_003 : Verify the Login functionality of Seriti portal");
			userName = Utilities.getParameterFromXML("UserName");
			System.out.println(userName);
			password = Utilities.getParameterFromXML("Password");
			System.out.println(password);
			
			
			Utilities.getTitle("Login");
			String loginHeaderText = Utilities.getText(SeritiLoginPage.loginHeader);
			Assert.assertEquals(loginHeaderText,"LOGIN");
			//type(portalLoginPage.userNameField,"SHAKIRM","Username text field");
			
			Utilities.type(SeritiLoginPage.userNameField,userName,"Username text field");
			logger.info("UserName is entered");
			ExtentReporter.extentLoggerPass("userName field", "Username is entered");
			
			Utilities.type(SeritiLoginPage.userPwdField,password,"Password text field");	
			logger.info("Password is entered");
			ExtentReporter.extentLoggerPass("Password field", "Password is entered");
			Utilities.verifyElementPresentAndClick(SeritiLoginPage.loginButton,"Login button");
			logger.info("Login button");
			ExtentReporter.extentLoggerPass("Login button", "Login button is clicked");
		}
	
}
