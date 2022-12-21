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
	
	//Create customer footer button
	public static By createCustomerTransactionButton = By.id("btn-footer-create");
	
	//Create transaction header
	public static By createTransactionHeader = By.id("modal-title");
	
	//Dealer section header
	public static By dealerSectionHeader = By.xpath("//*[contains(text(),\"Dealer\")]");
	
	//Group select mandatory field
	public static By groupSelect = By.name("Group");
	
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
	public static By financeSelected = By.xpath("//*[@name=\"CashInd\"]//*[text()=\"CASH\"]");
	
	//Create transaction button
	public static By createSubmitButton = By.xpath("//*[@type=\"submit\" and contains(text(),\"CREATE\")]");
	
	//Cancel transaction button
	public static By cancelButton = By.xpath("//*[@type=\"button\" and contains(text(),\"Cancel\")]");
	
	   
	 	// Methods 
	//-------------------------------------
	/**
	 * Method for create customer create form
	 * 
	 * 
	 *
	 */
	
	public static void createCustomerTransactionForm() throws Exception {
		ExtentReporter.HeaderChildNode("Customer Form");
		Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.dashBoardHeader,15);
		String dashboardHeaderText = Utilities.getText(SeritiCreateCustomerFormPage.dashBoardHeader);
		Assert.assertEquals(dashboardHeaderText,"MY DASHBOARD");
		
		Utilities.verifyElementPresentAndClick(SeritiCreateCustomerFormPage.createCustomerTransactionButton,"Create Transaction footer button");
		logger.info("Create Transaction footer button");
		ExtentReporter.extentLoggerPass("Create Transaction footer button", "Create transaction footer button is clicked");
		
		Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.createTransactionHeader,5);
		String createTransactionHeaderText = Utilities.getText(SeritiCreateCustomerFormPage.createTransactionHeader);
	    Assert.assertEquals(createTransactionHeaderText, "create transaction");
	    
		logger.info("Filling dealer section");
		String readFinanceGroup = xcl.getCellValue(xlpath,"Sheet1",1,7);
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.groupSelect,readFinanceGroup);
		String selectedGroup = Utilities.getText(SeritiCreateCustomerFormPage.groupSelected);
		Assert.assertEquals(selectedGroup, readFinanceGroup);
		
		logger.info("Dealer group selection");
		ExtentReporter.extentLoggerPass("Dealer group select dropdown", "MARQUIS FINANCE TEST ENVIRONMENT is selected from DD");
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.branchSelect,"MARQUIS FINANCE UAT TEST BRANCH");
		
		logger.info("Dealer branch selection");
		String readFinanceBranch = xcl.getCellValue(xlpath,"Sheet1",2,7);
		ExtentReporter.extentLoggerPass("Dealer branch select dropdown", "MARQUIS FINANCE UAT TEST BRANCH is selected from DD");
		Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.groupSelected,10);
		String selectedBranch = Utilities.getText(SeritiCreateCustomerFormPage.branchSelected);
		Assert.assertEquals(selectedBranch,readFinanceBranch);
		
		logger.info("Filling Customer section");
		String readCustomerType = xcl.getCellValue(xlpath,"Sheet1",3,7);
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.custTypeSelect,readCustomerType);
		String selectedCustType = Utilities.getText(SeritiCreateCustomerFormPage.custTypeSelected);
		Assert.assertEquals(selectedCustType, readCustomerType);
		
		String readLastName = xcl.getCellValue(xlpath,"Sheet1",4,7);
		Utilities.type(SeritiCreateCustomerFormPage.lastName,readLastName,"Last Name text field");
		logger.info("LastName is entered");
		ExtentReporter.extentLoggerPass("LastName field", "Last name is entered");
		Utilities.waitTime(3000);
		Utilities.robotClassDown();
		Utilities.waitTime(3000);
		
		logger.info("Filling Finance section");
		String readDeal = xcl.getCellValue(xlpath,"Sheet1",5,7);
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.financeSelect,readDeal);
		String selectedFinanceType = Utilities.getText(SeritiCreateCustomerFormPage.financeSelected);
		Assert.assertEquals(selectedFinanceType, readDeal);
		//modalScrollUp();
		Utilities.waitTime(3000);
		Utilities.robotClassUp();
		Utilities.waitTime(3000);
		Utilities.JSClick(SeritiCreateCustomerFormPage.cancelButton,"Cancel Transaction button");
	}

}
