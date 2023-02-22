package com.marquis.webPages;

import org.openqa.selenium.By;

import com.driverInstance.ExcelFunctions;
import com.utility.ExtentReporter;
import com.utility.Utilities;

public class financierWebPage {
	public static String xlpath = "./XLSX/MarquisDataForm.xlsx";

	public static By userID = By.id("UserId");
	public static By password = By.id("Password");

	public static By login = By.xpath("//*[@id='btn-login']");
	
	public static By agreementReference = By.xpath("//*[@id='AgreementReference']");

	public static By searchCustomerWelcome = By.xpath("//a[@class='btn btn-primary btn-anchor']");
    public static By searchCustomer = By.xpath("//*[@id=\"btn-customersearch\"]");
    
    
    
	public static By clickSearchCustRef = By.id("btn-customersearch");
	
	
	public static By customerReferenceClick  = By.xpath("//*[@class=' customer-link-active']");

	
	public static By editAgreementRef  = By.xpath("//*[@class='editproposal']");
	
	public static By tastTabClick = By.xpath("//*[@id='ribbon-DiaryTasks']//a");
	
	public static By policeIntApi = By.xpath("//*[@class='jq-task-row']//td[contains(text(),'Police Int API  Failed Queue')]");
	
	public static By actionsClick = By.xpath("//h4[.='Actions']");
	
	public static By acceptPoliceInterest = By.xpath("//*[@data-actionname='Accept Police interest checks']");
	
	
	
	
	public static void financierLogin() throws Exception {
		ExtentReporter.HeaderChildNode("Financier Login");

		
		Utilities.explicitWaitVisible(financierWebPage.userID, 10);
		String userName = ExcelFunctions.getCellValue(xlpath, "Credentials", 6, 0);
		Utilities.type(financierWebPage.userID, userName, "enter user id");

		String password = ExcelFunctions.getCellValue(xlpath, "Credentials", 6, 1);
		Utilities.type(financierWebPage.password, password, "enter password");

		Utilities.explicitWaitVisible(financierWebPage.login, 10);

		Utilities.verifyElementPresentAndClick(financierWebPage.login, "Click Login");

		//Utilities.explicitWaitVisible(financierPage.userID, 10);
		Utilities.verifyElementPresentAndClick(financierWebPage.searchCustomerWelcome, " searchCustomerWelcome ");

	}
	
	/**
	 * This method is used for updating the Police Verification Check as Passed.
	 * @param ref
	 * @throws Exception
	 */
	public static void searchCustomerReference(String ref) throws Exception {

		Utilities.explicitWaitVisible(financierWebPage.agreementReference, 10);
		Utilities.type(financierWebPage.agreementReference, ref, "enter reference number");
		
		Utilities.explicitWaitVisible(financierWebPage.clickSearchCustRef, 10);
		Utilities.verifyElementPresentAndClick(financierWebPage.clickSearchCustRef, "Click Search ");
		
		Utilities.explicitWaitVisible(financierWebPage.customerReferenceClick, 10);
		Utilities.verifyElementPresentAndClick(financierWebPage.customerReferenceClick, " customerReferenceClick ");

		Utilities.explicitWaitVisible(financierWebPage.editAgreementRef, 10);
		Utilities.verifyElementPresentAndClick(financierWebPage.editAgreementRef, " editAgreementRef ");
		
		
		Utilities.explicitWaitVisible(financierWebPage.tastTabClick, 10);
		Utilities.verifyElementPresentAndClick(financierWebPage.tastTabClick, " tastTabClick ");
		

		Utilities.explicitWaitVisible(financierWebPage.policeIntApi, 10);
		Utilities.verifyElementPresentAndClick(financierWebPage.policeIntApi, " policeIntApi ");
		
		
		Utilities.explicitWaitVisible(financierWebPage.actionsClick, 10);
		Utilities.verifyElementPresentAndClick(financierWebPage.actionsClick, " actionsClick ");

		
		Utilities.explicitWaitVisible(financierWebPage.acceptPoliceInterest, 10);
		Utilities.verifyElementPresentAndClick(financierWebPage.acceptPoliceInterest, " acceptPoliceInterest ");
		
		
		
	}
		
}
