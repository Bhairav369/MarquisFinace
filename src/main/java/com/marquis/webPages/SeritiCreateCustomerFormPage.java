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
	public static By groupSelected(String groupSel) {
        return By.xpath("//*[@name='Group']//*[text()='"+groupSel+"']");
    }
	
	//Branch select mandatory field
	public static By branchSelect = By.name("Branch");
	
	//Selected branch text retrieval
	public static By branchSelected(String branchSel) {
        return By.xpath("//*[@name='Branch']//*[text()='"+branchSel+"']");
    }
	
	
	//Customer section header
	public static By customerSectionHeader = By.xpath("//*[contains(text(),\"Customer\")]");
	
	//Customer type select mandatory field
	public static By custTypeSelect = By.name("clnCategory");
	
	//custTypeSelected
		public static By custTypeSelected(String custTypeSel) {
	        return By.xpath("//*[@name='clnCategory']//*[text()='"+custTypeSel+"']");
	    }
	
	
	//Last Name text mandatory field
	public static By lastName = By.id("txtClientLastName");
	
	//Company Name text mandatory field
	public static By companyName = By.id("txtCompanyName");
	
	//Finance select mandatory field
	public static By financeSelect = By.name("CashInd");
	
	//financeSelected
	public static By financeSelected(String financeSel) {
        return By.xpath("//*[@name='CashInd']//*[text()='"+financeSel+"']");
    }
	
	
	//Create transaction button
	public static By createSubmitButton = By.xpath("//*[@type=\"submit\" and contains(text(),\"CREATE\")]");
	
	//not used:No Such Button present now //Cancel transaction button
	public static By cancelButton = By.xpath("//*[@type=\"button\" and contains(text(),\"Cancel\")]");
	
	   
	 	// Methods 
	//-------------------------------------
	/**
	 * Method To create Customer Transaction Form
	 * This method is first step to collect customer details
	 * and Dealer/D-Group details
	 * @throws Exception
	 * 
	 *
	 */
	
	public static void createCustomerTransactionForm() throws Exception {
		ExtentReporter.HeaderChildNode("TC_008 : Verify the UI of Create Transaction page");
		ExtentReporter.HeaderChildNode("TC_009 : Verify the UI of Create Transaction page");

		Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.dashBoardHeader,20);
		String dashboardHeaderText = Utilities.getText(SeritiCreateCustomerFormPage.dashBoardHeader);
		Assert.assertEquals(dashboardHeaderText,"MY DASHBOARD");
		
		Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.createCustomerTransactionButton,20);

		Utilities.verifyElementPresentAndClick(SeritiCreateCustomerFormPage.createCustomerTransactionButton,"Create Transaction footer button");
		logger.info("Create Transaction footer button");
		ExtentReporter.extentLoggerPass("Create Transaction footer button", "Create transaction footer button is clicked");
		
		Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.createTransactionHeader,5);
		String createTransactionHeaderText = Utilities.getText(SeritiCreateCustomerFormPage.createTransactionHeader);
	    Assert.assertEquals(createTransactionHeaderText, "create transaction");
	    
		logger.info("Filling dealer section");
		String readFinanceGroup = ExcelFunctions.getCellValue(xlpath,"Sheet1",1,7);
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.groupSelect,readFinanceGroup);
		String selectedGroup = Utilities.getText(SeritiCreateCustomerFormPage.groupSelected(readFinanceGroup));
		Assert.assertEquals(selectedGroup, readFinanceGroup);
		
		logger.info("Dealer group selection");
		ExtentReporter.extentLoggerPass("Dealer group select dropdown", "MARQUIS FINANCE TEST ENVIRONMENT is selected from DD");
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.branchSelect,"MARQUIS FINANCE UAT TEST BRANCH");
		
		logger.info("Dealer branch selection");
		String readFinanceBranch = ExcelFunctions.getCellValue(xlpath,"Sheet1",2,7);
		ExtentReporter.extentLoggerPass("Dealer branch select dropdown", "MARQUIS FINANCE UAT TEST BRANCH is selected from DD");
		Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.groupSelected(readFinanceGroup),10);
		String selectedBranch = Utilities.getText(SeritiCreateCustomerFormPage.branchSelected(readFinanceBranch));
		Assert.assertEquals(selectedBranch,readFinanceBranch);
		
		logger.info("Filling Customer section");
		String readCustomerType = ExcelFunctions.getCellValue(xlpath,"Sheet1",3,7);
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.custTypeSelect,readCustomerType);
		String selectedCustType = Utilities.getText(SeritiCreateCustomerFormPage.custTypeSelected(readCustomerType));
		Assert.assertEquals(selectedCustType, readCustomerType);
		
		String readLastName = ExcelFunctions.getCellValue(xlpath,"Sheet1",4,7);
		Utilities.type(SeritiCreateCustomerFormPage.lastName,readLastName,"Last Name text field");
		logger.info("LastName is entered");
		ExtentReporter.extentLoggerPass("LastName field", "Last name is entered");
		
		logger.info("Filling Finance section");
		String readDeal = ExcelFunctions.getCellValue(xlpath,"Sheet1",5,7);
		Utilities.selectByVisibleTextByLocator(SeritiCreateCustomerFormPage.financeSelect,readDeal);
		
		String financeSel = ExcelFunctions.getCellValue(xlpath,"Sheet1",5,7);
		String selectedFinanceType = Utilities.getText(SeritiCreateCustomerFormPage.financeSelected(financeSel));
		Assert.assertEquals(selectedFinanceType, readDeal);
		Utilities.JSClick(SeritiCreateCustomerFormPage.createSubmitButton,"Create Transaction ");
	}

}
