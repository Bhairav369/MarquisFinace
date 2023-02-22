package com.marquis.webPages;

import org.openqa.selenium.By;

import com.driverInstance.ExcelFunctions;
import com.utility.ExtentReporter;
import com.utility.Utilities;

public class DigiSignInPage {
	
	public static By userName = By.id("UserName");
	public static By password = By.id("Password");
    public static By digiLoginButton = By.xpath("//*[@class=\"btn btn-primary input-block-level\"]");
	
	public static By viewClick = By.xpath("//*[@name='ViewPDF']");
	
	public static By totalInvestSlider = By.xpath("//*[contains(text(),'Total Instalment')]/../..//span[2]");
	
	public static By dateOfFirstSlider = By.xpath("//*[contains(text(),'Date of First')]/../..//span[2]");
	
	
	public static By acceptSlider = By.xpath("//h3[contains(text(),'Accept')]/../..//span[2]");

	public static By confirmApproval = By.id("AcceptDoc");
	
	public static By acceptAndSign = By.xpath("//*[@id='AcceptSign'and @id !='RequestAmendment']");
	
	
	public static By cancelView = By.id("pdfviewmodalclose");
	
	public static By otpVerifcation = By.id("OtpVerifcation");
	
	
	public static By AcceptVerify2 = By.id("AcceptVerify");
	
	
	
	
	public static By logoutDigi = By.xpath("//a[@class='btn btn-primary btn-lg signing-btn py-3 border border-secondary']");
	public static void digiSignLogin(String username, String password) throws Exception
	{
		ExtentReporter.HeaderChildNode("DigiSign Login");
		
		Utilities.explicitWaitVisible(DigiSignInPage.userName, 20);
		Utilities.type(DigiSignInPage.userName, username, "enter user id");

		Utilities.type(DigiSignInPage.password, password, "enter password");

		Utilities.explicitWaitVisible(DigiSignInPage.digiLoginButton, 20);

		Utilities.verifyElementPresentAndClick(DigiSignInPage.digiLoginButton, "Click digiLoginButton");

		
		Utilities.verifyElementPresentAndClick(DigiSignInPage.viewClick, "viewClick ");
		Utilities.explicitWaitVisible(DigiSignInPage.totalInvestSlider, 10);
		Utilities.verifyElementPresentAndClick(DigiSignInPage.totalInvestSlider, " totalInvestSlider");
		Utilities.verifyElementPresentAndClick(DigiSignInPage.dateOfFirstSlider, " dateOfFirstSlider");	
		Utilities.verifyElementPresentAndClick(DigiSignInPage.acceptSlider, "acceptSlider");
		Utilities.explicitWaitVisible(DigiSignInPage.confirmApproval, 10);
		Utilities.verifyElementPresentAndClick(DigiSignInPage.confirmApproval, "confirmApproval");
		Utilities.explicitWaitVisible(DigiSignInPage.viewClick, 10);
		Utilities.verifyElementPresentAndClick(DigiSignInPage.viewClick, "viewClick ");
		Utilities.explicitWaitVisible(DigiSignInPage.cancelView, 10);
		Utilities.verifyElementPresentAndClick(DigiSignInPage.cancelView, "cancelView ");

		
		Utilities.explicitWaitVisible(DigiSignInPage.acceptAndSign, 10);		
		//Utilities.ScrollToTheElement(DigiSignInPage.acceptAndSign);
		Utilities.click(DigiSignInPage.acceptAndSign, "acceptAndSign");
		
	
		
	}


	public static void secondLevelAuthentication(String secondOtp) throws Exception {
		
		
		Utilities.explicitWaitVisible(DigiSignInPage.otpVerifcation, 10);		
		
		
		Utilities.type(DigiSignInPage.otpVerifcation, secondOtp, "enter password");
		Utilities.explicitWaitVisible(DigiSignInPage.AcceptVerify2, 10);		
		Utilities.verifyElementPresentAndClick(DigiSignInPage.AcceptVerify2, "AcceptVerify2 ");
		
		Utilities.explicitWaitVisible(DigiSignInPage.logoutDigi, 10);		
		Utilities.verifyElementPresentAndClick(DigiSignInPage.logoutDigi, "logoutDigi ");
		 
		
  
		

	}

}
