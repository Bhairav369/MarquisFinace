package com.marquis.webPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.excel.ExcelFunctions;
//import com.marquis.Financier.WebPages.createCustomerForm;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import com.utility.Utilities;

public class SeritiCreateCustomerFormPage {
static ExcelFunctions xcl = new ExcelFunctions();
	
	static LoggingUtils logger = new LoggingUtils();
	public static String xlpath = "./XLSX/MarquisDataForm.xlsx";
	
	//Dashboard Header
	public static By dashBoardHeader = By.xpath("//*[contains(text(),\"My Dashboard\")]");
	
	
	public static By transactionHeader = By.xpath("//*[@id='mainHeader']");
	
	//Create customer footer button
	public static By createCustomerTransactionButton = By.id("btn-footer-create");
	
	
	//Create transaction header
	public static By createTransactionHeader = By.id("modal-title");
	
	//Dealer section header
	public static By dealerSectionHeader = By.xpath("//*[contains(text(),\"Dealer\")]");
	
	//Group select mandatory field
	public static By groupSelect = By.name("Group");
	
	public static By clickCreateText= By.id("modal-title");
	
	//Selected group text retrieval
	public static By groupSelected = By.xpath("//*[@name=\"Group\"]//*[text()=\"MARQUIS FINANCE TEST ENVIRONMENT\"]");
	
	//Branch select mandatory field
	public static By branchSelect = By.name("Branch");
	
	//Selected branch text retrieval
	public static By branchSelected = By.xpath("//*[@name=\"Branch\"]//*[text()=\"MARQUIS FINANCE UAT TEST BRANCH\"]");
	
	//Customer section header
	public static By customerSectionHeader = By.xpath("//*[contains(text(),\"Customer\")]");
	
	//Customer type select mandatory field
	public static By custTypeSelect = By.name("clnCategory");
	
	//Customer type text retrieval 
	public static By custTypeSelected = By.xpath("//*[@name=\"clnCategory\"]//*[text()=\"PRIVATE\"]");
	
	//Last Name text mandatory field
	public static By lastName = By.id("txtClientLastName");
	
	//Company Name text mandatory field
	public static By companyName = By.id("txtCompanyName");
	
	//Finance select mandatory field
	public static By financeSelect = By.name("CashInd");
	
	//Finance select text retrieval
	public static By financeSelected = By.xpath("//*[@name=\"CashInd\"]//*[text()=\"FINANCE\"]");
	
	//Create transaction button
	public static By createSubmitButton = By.xpath("//*[@type=\"submit\" and contains(text(),\"CREATE\")]");
	
	//Cancel transaction button
	public static By cancelButton = By.xpath("//*[@type=\"button\" and contains(text(),\"Cancel\")]");
	
	   
	 	// Methods 
	//-------------------------------------
	/**
	 * Method for create customer create form
	 * `
	 * 
	 *
	 */
	
	public static void createCustomerTransactionForm() throws Exception {
		ExtentReporter.HeaderChildNode("TC_008 & TC_009 : Verify the UI & Functionality of Create Transaction page");
		
			
		Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.createCustomerTransactionButton,20);

		Utilities.verifyElementPresentAndClick(SeritiCreateCustomerFormPage.createCustomerTransactionButton,"Create Transaction footer button");
		logger.info("Create Transaction footer button");
		ExtentReporter.extentLoggerPass("Create Transaction footer button", "Create transaction footer button is clicked");
		
		Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.createTransactionHeader,5);
		String createTransactionHeaderText = Utilities.getText(SeritiCreateCustomerFormPage.createTransactionHeader);
	    Assert.assertEquals(createTransactionHeaderText, "create transaction");
	    
		logger.info("Filling dealer section");
		String readFinanceGroup = ExcelFunctions.testData.get("Dealer Group");
		System.out.println("   readFinanceGroup  "+readFinanceGroup);
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.groupSelect,readFinanceGroup);
		
		Utilities.JSClick(SeritiCreateCustomerFormPage.clickCreateText, "Sample click to bring Focus");
		
		String selectedGroup = Utilities.getText(SeritiCreateCustomerFormPage.groupSelected);
		Assert.assertEquals(selectedGroup, readFinanceGroup);
		
		logger.info("Dealer group selection");
		ExtentReporter.extentLoggerPass("Dealer group select dropdown", "MARQUIS FINANCE TEST ENVIRONMENT is selected from DD");
		    
		logger.info("Dealer branch selection");
		String readFinanceBranch = ExcelFunctions.testData.get("Dealer Branch");
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.branchSelect,readFinanceBranch);

		ExtentReporter.extentLoggerPass("Dealer branch select dropdown", "MARQUIS FINANCE UAT TEST BRANCH is selected from DD");
		
		Utilities.JSClick(SeritiCreateCustomerFormPage.clickCreateText, "Sample click to bring Focus");
		String selectedBranch = Utilities.getText(SeritiCreateCustomerFormPage.branchSelected);
		Assert.assertEquals(selectedBranch,readFinanceBranch);
		
		logger.info("Filling Customer section");
		String readCustomerType = ExcelFunctions.testData.get("Customer Type");
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.custTypeSelect,readCustomerType);
		String selectedCustType = Utilities.getText(SeritiCreateCustomerFormPage.custTypeSelected);
		Assert.assertEquals(selectedCustType, readCustomerType);
		
		Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.lastName,5);

		String readLastName = ExcelFunctions.testData.get("Last Name");
		Utilities.type(SeritiCreateCustomerFormPage.lastName,readLastName,"Last Name text field");
		logger.info("LastName is entered");
		ExtentReporter.extentLoggerPass("LastName field", "Last name is entered");
//		Utilities.waitTime(3000);
//		Utilities.robotClassDown();
//		Utilities.waitTime(3000);
		
		logger.info("Filling Finance section");
		String readDeal = ExcelFunctions.testData.get("Finance/Cash Deal");
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.financeSelect,readDeal);
		String selectedFinanceType = Utilities.getText(SeritiCreateCustomerFormPage.financeSelected);
		Assert.assertEquals(selectedFinanceType, readDeal);
		
		Utilities.JSClick(SeritiCreateCustomerFormPage.createSubmitButton,"Create Transaction ");
		
		Utilities.Wait(3000);
//		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.transactionTab,5);
//	    Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.transactionTab, "");
	}

}
