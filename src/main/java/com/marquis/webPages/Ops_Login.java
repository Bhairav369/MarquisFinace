package com.marquis.webPages;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.excel.ExcelFunctions;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import com.utility.Utilities;

public class Ops_Login {

	static LoggingUtils logger = new LoggingUtils();

	static ExcelFunctions xcl = new ExcelFunctions();

	public static String ExcelPath = "./XLSX/Operational PortalDataForm.xlsx";

	static SoftAssert softassert = new SoftAssert();

	public SoftAssert softAssert = new SoftAssert();

	public static String xlpath = "Marquis/XLSX/Operational PortalDataForm.xlsx";

	// Marquis Logo
	public static By MQLogo = By.xpath("//*[@src='assets/img/Marquis_main_logo.png']");

	// MQ Text Title
	public static By MQText = By.xpath("/html/body/app-root/app-login/div/div/div/div[1]/div/div[2]");

	// Username TextPlaceHolder
	public static By UserNameTxtPlacHlder = By.xpath("//label[@for='Username']//span[@class='bg-white']");

	// Password Text Placeholder
	public static By PasswrdTxtPlcHlder = By.xpath("//label[@for='Password']//span[@class='bg-white']");

	// Password Field Eye Icon
	public static By EyeIcon = By.xpath("//i[@class='bg-white pointer pi pi-eye text-secondary ng-star-inserted']");

	// I am Not a robot field
	public static By ImNtRbtFld = By
			.xpath("//div[@class='col-12 d-flex justify-content-center mx-0 ng-star-inserted']");

	// Forgot password option
	public static By frgtPswrd = By.xpath("//*[text()='Forgot Password?']");

	// Click on password field
	public static By paswrdFld = By.xpath("//*[contains(@id, 'Password')]");

	// Click on the USerName Field
	public static By UserNAmeFld = By.xpath("//*[contains(@id, 'Username')]");

	// UserName Required I icon
	public static By UserNameReqIcon = By
			.xpath("(//i[@class='bg-white pointer pi pi-info-circle text-danger ng-star-inserted'])[1]");

	// Password Requird I icon
	public static By PasswrdReqIicon = By.xpath("//i[@ng-reflect-text='Password is required.']");

	// Sumbit button
	public static By submitBtn = By.xpath("//*[contains(@id, 'getProfile')]");

	// Passing the data into User name field
	public static By UserNAme = By.xpath("//input[@id='Username']");

	// Passing the data into Password field
	public static By Password = By.xpath("//*[contains(@id, \"Password\")]");

	// Password text is in Decryption mode
	public static By PswrdDecryption = By
			.xpath("//i[@class='bg-white pointer pi pi-eye text-secondary ng-star-inserted']");

	// Password text is in Encryption mode
	public static By PswrdTextEncryption = By.xpath(
			"/html/body/app-root/app-login/div/div/div/div[2]/form/div/div[1]/field-display[2]/span/div/div/label/span/i");

	// I Am Not A Robot
	public static By IamNtRobot = By
			.xpath("//div[@class='col-12 d-flex justify-content-center mx-0 ng-star-inserted']");

	// Click on the Forgot Password Field
	public static By FrgtPswrdOption = By.xpath("//div/button[contains(text(), 'Forgot Password?')]");

	// Reset your password text title
	public static By ResetPaswrdpg = By.xpath("//*[text()=' Operations Portal - Reset Password ']");

	// BAck to Login
	public static By BckToLgin = By.xpath("//*[text()='Back To Login']");

	// Submit Button
	public static By SubmitBtn = By.xpath("//*[@type='submit']");

	// Username fld
	public static By usrName1 = By.xpath("(//span[@class='bg-white'])[1]");

	// Send OTP Title
	public static By SendOtpTitle = By.xpath(
			"//body/app-root/app-login[@class='ng-star-inserted']/div[@class='back-ground']/div[@class='container']/div[@class='row d-flex justify-content-center']/div[@class='col form-login py-5 m-0 shadow-lg bg-body']/form[@class='ng-invalid ng-dirty ng-touched']/div[@class='row ng-star-inserted']/div[@class='col-12']/label[1]");

	// Email Radio Button
	public static By EmlRadioBtn = By.xpath("//label[@for='opt2']");

	// Mobile No Radio Button
	public static By MobNoRadioBtn = By.xpath("//label[@for='opt1']");

	// Back Button
	public static By BackBtn = By.xpath("(//i[@class='pi pi-chevron-circle-left pt-2'])[1] || (//button[@type='button'])[1]");

	// Submit Button in Send OTP
	public static By GetotpBtn = By.xpath("(//i[@class='pi pi-chevron-circle-right pt-2'])[1]");

	// Enter OTP Text Placeholder
	public static By EntrOtpTxtPlc = By
			.xpath("//label[@for='Enter OTP']//span[@class='bg-white'] || (//span[@class='bg-white'])[3]");

	// Resend OTP Via Mobile no
	public static By ResendOtpViMob = By.xpath("(//button[@type='button'])[1]");

	// Resend OTP Via Email
	public static By ResendOtpViEmail = By.xpath(
			"(//button[@ng-reflect-text='Resent OTP Via Email on bh****'])[1] || /html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/button[2]");

	// Back Button
	public static By Backbtns = By.xpath("(//button[@class='btn btn-danger'])[1]");

	// Submit Button
	public static By SubMtBtn = By.xpath("//*[@type='submit'][1]");

	// submit button
	public static By SubMitButton1 = By.xpath("//button[@class='btn btn-success']");
	
	
	

	public static void Login() throws Exception {
		ExtentReporter.HeaderChildNode("Login");
		Utilities.getTitle("Marquis Finance");

		Utilities.verifyIsElementDisplayed(Ops_Login.MQLogo, "MQlogo");

		Utilities.verifyIsElementDisplayed(Ops_Login.MQText, "MQ Text Title");

		Utilities.verifyElementPresent(Ops_Login.UserNameTxtPlacHlder, "UserNAme Text PlaceHolder");

		Utilities.verifyElementPresent(Ops_Login.PasswrdTxtPlcHlder, "Password Text Place Holder");

		Utilities.verifyElementPresent(Ops_Login.EyeIcon, "Password Field Eye Icon");

		Utilities.verifyIsElementDisplayed(Ops_Login.ImNtRbtFld, "I am Not Robot Field");

		Utilities.verifyElementPresent(Ops_Login.frgtPswrd, "Fogot Password Option");

		Utilities.click(Ops_Login.paswrdFld, "Password Field");

		Utilities.click(Ops_Login.UserNAmeFld, "UserName Field");

		Utilities.verifyElementPresent(Ops_Login.UserNameReqIcon, "UserName Field I icon");

		Utilities.verifyIsElementDisplayed(Ops_Login.PasswrdReqIicon, "Password Field Required I icon");

		Utilities.verifyElementPresent(Ops_Login.submitBtn, "Submit button");

		String username = ExcelFunctions.getCellValue(ExcelPath, "sheet1", 2, 6);
		Utilities.type(Ops_Login.UserNAme, username, "username field");
		logger.info("Username Is Entered");
		ExtentReporter.extentLoggerPass("UserNAme Field", "UserNAme IS Entered");

		String password = ExcelFunctions.getCellValue(ExcelPath, "sheet1", 3, 6);
		Utilities.type(Ops_Login.Password, password, "password field");
		logger.info("Password IS Entered");
		ExtentReporter.extentLogger("Password Field", "Password IS Entered");

		Utilities.verifyIsElementDisplayed(Ops_Login.PswrdDecryption, "Password text is on the decryption mode");
		Utilities.screencapture();

		Utilities.waitTime(3000);
		Utilities.click(Ops_Login.PswrdTextEncryption, "The Eye Icon");

		Utilities.verifyIsElementDisplayed(Ops_Login.PswrdTextEncryption,
				"password text is turns to the Encryption mode");
		Utilities.screencapture();

		Utilities.click(Ops_Login.IamNtRobot, "I am Not a Robot Checkbox");

		Utilities.click(Ops_Login.FrgtPswrdOption, "Forgot your password button");

		String ActualUrl = Utilities.getBrowserCurrentUrl();
		System.out.println(ActualUrl);
		String ExpectedUrl = "https://www.operations.uat-mqf.co.za/reset-password";
		softassert.assertEquals(ActualUrl, ExpectedUrl);
		logger.info("The Reset PAssword PAge URL IS Matched");
		ExtentReporter.extentLogger(ActualUrl, ExpectedUrl);

		Utilities.verifyIsElementDisplayed(Ops_Login.ResetPaswrdpg, "The Reset Password PAge text title");

		Utilities.click(Ops_Login.BckToLgin, "The Back to Login Button");
		Utilities.getTitle("Marquis Finance");
		logger.info("Login PAge");
		ExtentReporter.extentLogger("Back to the", "Loginpage");

		String username1 = ExcelFunctions.getCellValue(ExcelPath, "sheet1", 2, 6);
		Utilities.type(Ops_Login.UserNAme, username1, "username field");
		logger.info("Username Is Entered");
		ExtentReporter.extentLoggerPass("UserNAme Field", "UserNAme IS Entered");

		String password1 = ExcelFunctions.getCellValue(ExcelPath, "sheet1", 3, 6);
		Utilities.type(Ops_Login.Password, password1, "password field");
		logger.info("Password IS Entered");
		ExtentReporter.extentLogger("Password Field", "Password IS Entered");

		Utilities.waitTime(3000);
		Utilities.click(Ops_Login.SubmitBtn, "Submit Button");

		Utilities.verifyIsElementDisplayed(Ops_Login.usrName1, "User NAme Field");

		Utilities.waitTime(3000);
		Utilities.verifyIsElementDisplayed(Ops_Login.SendOtpTitle, "Send OTP TO field Title");

		Utilities.verifyElementEnabled(Ops_Login.MobNoRadioBtn, "Mobile No Radio Button");
		Utilities.click(Ops_Login.MobNoRadioBtn, "The Mobile No Radio Button");

		Utilities.verifyElementEnabled(Ops_Login.EmlRadioBtn, "Email Radio Button");
		Utilities.click(Ops_Login.EmlRadioBtn, "The Email Radio Button");
		 
		Utilities.Wait(1000);
		Utilities.verifyIsElementDisplayed(Ops_Login.GetotpBtn, "Get OTP Button");
		Utilities.JSClick(Ops_Login.GetotpBtn, "Get OTP Button");

		Utilities.Wait(1000);
		Utilities.verifyElementPresent(Ops_Login.EntrOtpTxtPlc, "Enter OTP text Placeholder");

		Utilities.verifyElementPresent(Ops_Login.ResendOtpViMob, "Resend OTP Via Mobile Number Option");

		Utilities.verifyElementPresent(Ops_Login.ResendOtpViEmail, "Resend OTP Via Email Option");

		Utilities.verifyElementPresent(Ops_Login.Backbtns, "Back CTA");

		Utilities.verifyElementPresent(Ops_Login.SubMtBtn, "Submit Button");

		/*
		 * Utilities.JSClick(Ops_Login.Backbtns, "Back Button");
		 * 
		 * Utilities.verifyIsElementDisplayed(Ops_Login.SendOtpTitle,
		 * "Send OTP To Title");
		 * 
		 * Utilities.click(Ops_Login.GetotpBtn, "Get OTP Button");
		 */
		Utilities.waitTime(50000);
		Utilities.click(Ops_Login.SubMitButton1, "SubMit Button");

	}
}