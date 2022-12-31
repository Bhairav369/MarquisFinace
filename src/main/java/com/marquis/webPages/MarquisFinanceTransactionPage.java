package com.marquis.webPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.excel.ExcelFunctions;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import com.utility.Utilities;

public class MarquisFinanceTransactionPage {

	static LoggingUtils logger = new LoggingUtils();
	static ExcelFunctions xcl = new ExcelFunctions();
	public static String transactionNumberSaved = "";
	public static String  marquisReferenceNumber = "";

	public static String xlpath = "./XLSX/MarquisDataForm.xlsx";

	// Green finance house button
	public static By financeHouseButton = By.xpath("(//button[@title=\"Finance Companies\"])[1]");

	// Applications header text
	public static By applicationHeader = By.xpath("//div/span[text()=\"Applications\"]");

	// Marquis finance house
	public static By marquisFinanceLinkLocator = By.xpath("(//img[@class='company-logo'])[1]");
	// public static WebElement marquisFinanceLink =
	// getWebDriver().findElement(By.xpath("//span[text()=\"MARQUIS FINANCE \"]"));

	// Main header finance page
	public static By mainHeader = By.id("mainHeader");

	// Filter with policy ID
	public static By searchTransaction = By.id("GeneratedFriendlyNameSearch");

	// Client Details (Select, Add, Edit) buttons

	public static By applicationTab = By.xpath("//*[@id='secondaryMenu']//a[.='Applications']");

	public static By transactionTab = By.xpath("//*[@id='topMenu']//a[.='Transactions']");

	// Client Details (Select, Add, Edit) buttons
	public static By clientDetailsAddButton = By.id("personClient_btnAdd");

	// Client Details (Select, Add, Edit) buttons
	public static By clientDetailsEditButton = By.id("personClient_btnEdit");

	// Select client details button
	public static By clientDetailsSelectButton = By.id("personClient_btnSelect");

	public static By documentsUpload = By.xpath("//tbody//tr[1]//td[2]//div//a");

	// public static By fileUploadButton = By.xpath("//*[@id='drop-zone' and
	// @for='file-upload']");
	public static By fileUploadButton = By.xpath("//*[@id='file-upload']");

	public static By spinningRole = By
			.xpath("//*[@class='overlay-loader no-user-select ng-scope']//*[@class='loader-title']");

	public static By documentCategory = By.xpath("//*[@id='advanceduploaded']//select");

	public static By selectDocument = By.xpath("//*[@class='ng-scope un_selected']");
	public static By selectDocument2 = By.xpath("(//*[@class='ng-scope un_selected'])[2]");
	public static By transactionNumberElement = By.xpath("//*[@class='allow-user-select ng-binding']");

	public static By feedbackIcon = By.xpath("//*[@class='fas fa-check-circle t-feedback-btn-icon']");

	public static By saveButton = By.xpath("//*[@id='advanceduploaded']//div[2]/button[.='Save']");

	/*
	 * //Agreement type radio buttons (Installment sale, Lease, Rental) public
	 * static By leaseRadioButton = By.xpath("//*[@value=\"LEASE\"]");
	 * 
	 * //Preferred Interest type text field public static By preferredInterest =
	 * By.id("txtFinPreferredInterestRate");
	 * 
	 * //Interest rate type radio buttons (Fixed, Linked) public static By
	 * linkedRadioButton = By.xpath("//*[@value=\"LINKED\"]");
	 * 
	 * //Finance term (months) radio buttons public static By term_96_radioButton =
	 * By.xpath("//*[@value=\"60\" and @type=\"radio\"]");
	 * 
	 * //Payment frequency radio buttons public static By monthlyRadioButton =
	 * By.xpath("//*[@value=\"MONTHLY\"]");
	 * 
	 * //Vehicle usage radio buttons public static By privateRadioButton =
	 * By.xpath("//*[@value=\"PRIVATE\"]");
	 * 
	 * //Vehicle Search buttons public static By searchVehicleButton =
	 * By.id("btnSelect");
	 * 
	 * //Is the vehicle new radio buttons public static By usedRadioButton =
	 * By.xpath("//*[@value=\"USED\"]");
	 * 
	 * //First registration date field public static By firstRegistrationDate =
	 * By.id("txtFirstRegistrationDate");
	 * 
	 * //Vehicle selling price public static By sellingPrice =
	 * By.id("txtRetailPrice");
	 * 
	 * //Personal info sharing consent radio buttons public static By
	 * personalInfoConsent_yes = By.id("rbnOtherCompanyConsentInd_0");
	 * 
	 * //Market info receiving consent radio buttons public static By
	 * marketInfoConsent_yes = By.id("rbnExternalMarketingConsentInd_0");
	 */

	// Apply check button
	public static By applyCheckButton = By.id("btnApplyCheck");

	// Transaction pass checked text
	public static By transactionPassMsg = By.id("lblInformationBottom");

	// Transaction fail message
	public static By transactionFailMsg = By.xpath("//*[text()=\"The application could not be made: \"]");

	// Save footer Button
	public static By saveFooterBtn = By.id("btnSaveInfo");

	// Apply button
	public static By applyFooterBtn = By.xpath("//*[@type=\"submit\" and @value=\"Apply\"]");

	// Approved finance message
	public static By approvedMsg = By.id("lblInformationApplyBottom");

	public static By applySuccessMsg = By.id("lblInformationBottom");
	public static By transactionNumber = By.xpath("//*[@id='marquee']/span/text()[1]");

	public static By marquisRef = By.xpath("//*[@id='lblInformationApplyTop']");
	public static By refreshApplicationStatus = By.id("imgRefresh");

	// Likhitha's Changes to Add Vehcile Details
	public static By vehicleUse(String vehicleUse) {
		return By.xpath("//*[@id='rbnCarVehiclePurpose']//*[@value='" + vehicleUse + "']");
	}

	public static By searchVehicle = By.xpath("//*[@id='btnSelect']");
	public static By vehicleCode = By.id("txtVehicleCode");

	public static By odoMeterReading = By.id("txtOdometerReading");

	public static By vehicleManufacturer = By.id("txtManufacturer");
	public static By vehicleModel = By.id("txtModel");
	public static By vehicleYear = By.id("ddlActiveYear");
	public static By vehicleSearchButton = By.id("btnSearchForVehicle");
	public static By selectSearchResult = By.xpath("//*[@id='dgVehicleSearchResults']//input");

	public static By vehRegNumber = By.id("txtRegistrationNumber");

	public static By vehChasisNumber = By.id("txtChassisVINNumber");

	public static By vehEngineNumber = By.id("txtEngineNumber");

	public static By vehColour = By.id("txtColour");

	public static By vehicleCondition(String vType) {
		return By.xpath("//*[@value='" + vType + "']");
	}

	// Interest Details
	public static By firstRegDateVehicle = By.id("txtFirstRegistrationDate");

	public static By agreementType(String AType) {
		return By.xpath("//*[@value='" + AType + "']");
	}

	public static By interestRate = By.id("txtFinPreferredInterestRate");
	public static By interestRateTypeFixed = By.id("rbnFinInterestRateType_0");
	public static By financeTerm_72 = By.xpath("//*[@id='rbnFinTerm']//input[5]");
	public static By paymentFrequency_monthly = By.id("rbnFinPaymentFrequency_0");
	public static By vehicleSellingPrice = By.id("txtRetailPrice");
	public static By residualValue = By.id("txtFinResidualValue");
	public static By refreshApplications = By.id("btn-footer-refresh");

	// Likitha's change
	public static By supportingDocuments = By.id("btnSupportingDocuments");
	public static By docSentToMfYesNo = By.id("ddlNoQueue-0");
	public static By documentsList = By.xpath("//*[@id='supportingDocumentsForm']//button[3]");
	public static By selDocument1 = By.xpath("//div[3]//*[@class='tqcard-tile-document-text']/../../..");
	public static By selDocument2 = By.xpath("//div[4]//*[@class='tqcard-tile-document-text']/../../..");
	public static By doneButton = By.xpath("//button[.='Done']");
	public static By sendDocuments = By.xpath("//*[@type='submit']");

	public static By documentSubmissionSuccess = By.xpath("//*[@id='feedback-msg-success']");

	// Methods
	// --------------

	/**
	 * Method for Marquis Finance main page
	 * 
	 * This method helps user navigate to the Marquis Transaction page by selecting
	 * the required Application that is been created in earlier step by selecting
	 * 
	 * @throws Exception
	 * 
	 *
	 */

	public static void marquisFinancePageForm() throws Exception {

		ExtentReporter.HeaderChildNode("TC_010 : Verify the UI of Create Transaction page");
		ExtentReporter.HeaderChildNode("TC_011 : Verify the Functionality of Create Transaction page");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.transactionTab, 10);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.transactionTab, " Click transaction Tab");

//		ExtentReporter.HeaderChildNode("Marquis Finance Page Form");
//		Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.dashBoardHeader, 10);
//
//		String dashboardHeaderText = Utilities.getText(SeritiCreateCustomerFormPage.dashBoardHeader);
//		Assert.assertEquals(dashboardHeaderText, "MY DASHBOARD");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.financeHouseButton, 15);
		System.out.println("Finance button is found");
		Utilities.JSClick(MarquisFinanceTransactionPage.financeHouseButton, "Finance House Button");

		logger.info("Finance House Button");
		ExtentReporter.extentLoggerPass("Finance House Button", "Finance House Button is clicked");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.applicationHeader, 10);
		String applicationsHeaderText = Utilities.getText(MarquisFinanceTransactionPage.applicationHeader);

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.transactionNumberElement, 10);

		transactionNumberSaved = Utilities.getText(transactionNumberElement);
		logger.info(" Transaction Number " + transactionNumberSaved);

		Assert.assertEquals(applicationsHeaderText, "APPLICATIONS");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.marquisFinanceLinkLocator, 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.marquisFinanceLinkLocator,
				"Marquis finance link");
		logger.info("Marquis Finance Link");
		ExtentReporter.extentLoggerPass("Marquis Finance Link", "Marquis Finance link is clicked");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.mainHeader, 15);
		String mainHeaderText = Utilities.getText(MarquisFinanceTransactionPage.mainHeader);
		Assert.assertEquals(mainHeaderText, "MARQUIS FINANCE APPLICATIONS");
		ExtentReporter.extentLoggerPass(" Marquis Transaction   ", "");

	}

	/**
	 * This is Continuation step in filling the Finance Application
	 * 
	 * @throws Exception
	 */
	public static void enterMandatoryTransactionMarquisFinancePage() throws Exception {
		ExtentReporter
				.HeaderChildNode("TC_014 : Verify user is able to add the details to Marquis finance application");

		addVehicleDetails();
		addInterestDetails();
		ExtentReporter.extentLoggerPass(" enterMandatoryTransactionMarquisFinancePage ", " passed ");

	}

	// Added separate method, need to do for others as well later
	/***
	 * Method to add Vehicle Details
	 * 
	 * @throws Exception
	 */
	public static void addVehicleDetails() throws Exception {
		// private vehicle
		// explicitWaitVisible(MarquisFinanceTransactionPage.vehicleUse,10);
		String vUse = ExcelFunctions.getCellValue(xlpath, "Sheet1", 37, 12);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.vehicleUse(vUse), "Select Vehicle use ");

		String vehicleType = ExcelFunctions.getCellValue(xlpath, "Sheet1", 35, 12);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.vehicleCondition(vehicleType),
				"is  Vehicle New ?");
		logger.info("Is Vehicle New ");
		ExtentReporter.extentLoggerPass("Is Vehicle New ", "Option selected ");

		if (vehicleType == "USED") {
			String odoMeter = ExcelFunctions.getCellValue(xlpath, "Sheet1", 36, 12);
			Utilities.clearField(MarquisFinanceTransactionPage.odoMeterReading, "Clear Price Field ");
			Utilities.type(MarquisFinanceTransactionPage.odoMeterReading, odoMeter, "Enter Vehicle Code ");
		}

		Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.searchVehicle);

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.searchVehicle, 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.searchVehicle, "Seaarch Vehicle");

		Utilities.switchFrame_id("vsVehicleCodeId_ifrm");

		String vehicleCode = ExcelFunctions.getCellValue(xlpath, "Sheet1", 31, 12);
		Utilities.type(MarquisFinanceTransactionPage.vehicleCode, vehicleCode, "Enter Vehicle Code ");
		logger.info("Enter Vehicle Code");
		ExtentReporter.extentLoggerPass(" Enter Vehicle Code ", "Vehicle Code Entered ");

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.vehicleSearchButton,
				"Search Vehcile Code");
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.selectSearchResult,
				"Select Searched Result ");

		Utilities.switchFrame_parent();

		Utilities.clearField(MarquisFinanceTransactionPage.vehRegNumber, " vehRegNumber field");
		String readRegNumber = ExcelFunctions.getCellValue(xlpath, "Sheet1", 30, 12);
		Utilities.type(MarquisFinanceTransactionPage.vehRegNumber, readRegNumber, "Enter Vehicle Reg Number ");

		Utilities.clearField(MarquisFinanceTransactionPage.vehChasisNumber, " vehChasisNumber field");
		String readChasis = ExcelFunctions.getCellValue(xlpath, "Sheet1", 28, 12);
		Utilities.type(MarquisFinanceTransactionPage.vehChasisNumber, readChasis, "Enter chasis Number ");
		logger.info("Enter Chasis Number ");
		ExtentReporter.extentLoggerPass(" Enter Chasis Code ", "Chasis  Number Entered ");

		String readEngineNumber = ExcelFunctions.getCellValue(xlpath, "Sheet1", 29, 12);
		Utilities.clearField(MarquisFinanceTransactionPage.vehEngineNumber, " vehEngineNumber field");

		Utilities.type(MarquisFinanceTransactionPage.vehEngineNumber, readEngineNumber, "Enter Vehicle Engine Number ");
		Utilities.type(MarquisFinanceTransactionPage.vehColour, "RED", "Enter Vehicle Color ");

	}

	/**
	 * Method to add Interest and Vehicle Selling price Details
	 * 
	 * @throws Exception
	 */
	public static void addInterestDetails() throws Exception {

		Utilities.clearField(MarquisFinanceTransactionPage.vehicleSellingPrice, "Clear Price Field ");
		String sellingPrice = ExcelFunctions.getCellValue(xlpath, "Sheet1", 32, 12);
		Utilities.type(MarquisFinanceTransactionPage.vehicleSellingPrice, sellingPrice, "Selling price");
		logger.info("Enter Vehicle Selling ");
		
		//43
		Utilities.clearField(MarquisFinanceTransactionPage.residualValue, " Residual Amount ");
		String residualAmt = ExcelFunctions.getCellValue(xlpath, "Sheet1", 43, 12);
		Utilities.type(MarquisFinanceTransactionPage.residualValue, residualAmt, "residual Amount ");


		Utilities.clearField(MarquisFinanceTransactionPage.firstRegDateVehicle, " First Reg Date ");
		String firstRegDate = ExcelFunctions.getCellValue(xlpath, "Sheet1", 33, 12);
		Utilities.type(MarquisFinanceTransactionPage.firstRegDateVehicle, firstRegDate, " First Reg Date ");

		String agreementType = ExcelFunctions.getCellValue(xlpath, "Sheet1", 38, 12);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.agreementType(agreementType),
				" Agreement Type ");
		logger.info("Enter Agreement Tye");
		ExtentReporter.extentLoggerPass(" Enter Agreement Type ", "Entered Agreement Type ");

		Utilities.clearField(MarquisFinanceTransactionPage.interestRate, " Clear interest field");
		String interestRate = ExcelFunctions.getCellValue(xlpath, "Sheet1", 34, 12);
		Utilities.type(MarquisFinanceTransactionPage.interestRate, interestRate, "pref interest rate ");
		logger.info("Enter Interest Rate");
		ExtentReporter.extentLoggerPass(" Enter Interest Rate ", "Entered Interest Rate ");

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.interestRateTypeFixed, "Interest Type");
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.financeTerm_72, "Finance Term ");
		logger.info("Enter Finance Term");
		ExtentReporter.extentLoggerPass(" Enter Finance Term Code ", "Finance Term Entered ");
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.paymentFrequency_monthly,
				" Payment Frequency ");
	}

	/**
	 * To Verify application status and Retrieve the Marquis Reference number
	 * 
	 * @throws Exception
	 */
	public static void verifyApplicationStatus() throws Exception {

		Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.applyFooterBtn);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.applyFooterBtn, "Apply footer button");
		logger.info("Apply footer button");
		ExtentReporter.extentLoggerPass("Apply footer button", "Apply footer button is clicked");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.applySuccessMsg, 10);
		String applySuccessText = Utilities.getText(MarquisFinanceTransactionPage.applySuccessMsg);
		Assert.assertEquals(applySuccessText, "Application has been made:\n"
				+ "The information is currently being processed, this may take up to 5 minutes. The results will be displayed as soon as they become available.");

		int count = 0;
		boolean flag = false;
		while (flag == false) {
			Utilities.waitTime(4000);
			flag = Utilities.getText(MarquisFinanceTransactionPage.marquisRef).contains("succeeded");
			Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.refreshApplicationStatus,
					"Refresh Application Status ");
			count++;
			if (flag == true || count == 5)
				break;
		}

		logger.info(" To Retrieve Marquis Reference Number ");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.marquisRef, 10);
		String marquisRef = Utilities.getText(MarquisFinanceTransactionPage.marquisRef);
		String[] str = marquisRef.split(" ");
		marquisReferenceNumber = str[10].replace(".", "");

		System.out.println(" Marquis Refernece Number : "+ marquisReferenceNumber);
		// E.g: 2000007321 Now it can be used in OPS portal

		ExtentReporter.extentLoggerPass("Submit Application ", "Application is Submitted Successfully ");
		logger.info(" Marquis Reference Number is Returned : " + marquisReferenceNumber);

	}

	/**
	 * To Upload Documents like: Bank Statement and ID proof
	 * 
	 * 
	 * @throws Exception
	 */
	public static void documentUpload() throws Exception {
		String documentType= "";

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.transactionTab, 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.transactionTab, " Click transaction Tab");
//		Thread.sleep(5000);
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.searchTransaction, 10);

		Utilities.type(MarquisFinanceTransactionPage.searchTransaction,MarquisFinanceTransactionPage.transactionNumberSaved, " Transaction Number Filtering ");

		// Uploading 1st Document
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.documentsUpload, 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.documentsUpload, " Documents Upload ");

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.documentsUpload, " Documents Upload ");

		Utilities.type(MarquisFinanceTransactionPage.fileUploadButton,"C:\\Users\\Likhitha\\Downloads\\BANK STATEMENT.pdf", "");

		Utilities.waitForElementInVisible(MarquisFinanceTransactionPage.spinningRole, 10, "");
		Utilities.waitForElementVisible(MarquisFinanceTransactionPage.documentCategory, 15, " Document Category ");

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.documentCategory, "");
		 documentType = ExcelFunctions.getCellValue(xlpath, "Sheet1", 41, 12);
		Utilities.selectByVisibleTextByLocator(MarquisFinanceTransactionPage.documentCategory, documentType);

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.selectDocument, 15);

		Utilities.JSClick(MarquisFinanceTransactionPage.selectDocument, " Select Document ");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.saveButton, 15);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.saveButton, " Click Save Button ");
		ExtentReporter.extentLoggerPass("Document 1", " passed ");

		// Uploading 2nd Document-- ID
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.documentCategory, 15);

		Utilities.type(MarquisFinanceTransactionPage.fileUploadButton,"C:\\Users\\Likhitha\\Downloads\\ID_DOCUMENT_CLIENT.pdf", "");

		Utilities.waitForElementInVisible(MarquisFinanceTransactionPage.spinningRole, 10, "");
		Utilities.waitForElementVisible(MarquisFinanceTransactionPage.documentCategory, 15, " Document Category ");

		
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.documentCategory, "");
		 documentType = ExcelFunctions.getCellValue(xlpath, "Sheet1", 42, 12);

		Utilities.selectByVisibleTextByLocator(MarquisFinanceTransactionPage.documentCategory, documentType);

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.selectDocument2, 15);

		Utilities.JSClick(MarquisFinanceTransactionPage.selectDocument2, " Select Document ");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.saveButton, 15);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.saveButton, " Click Save Button ");

		ExtentReporter.extentLoggerPass("Document 2", " passed ");

	}

	/***
	 * To Send the Uploaded Documents( from previous Step) to Marquis.
	 * 
	 * @throws Exception
	 */
	public static void sendDocuments() throws Exception {

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.applicationTab, 10);

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.feedbackIcon, 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.applicationTab, " Click application Tab");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.marquisFinanceLinkLocator, 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.marquisFinanceLinkLocator,"Marquis finance link");
		logger.info("Marquis Finance Link");
		ExtentReporter.extentLoggerPass("Marquis Finance Link", "Marquis Finance link is clicked");

		// Supporting Documents
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.supportingDocuments, 10);

		Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.supportingDocuments);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.supportingDocuments, " Clicked Supporting Documents link ");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.sendDocuments, 10);
		Utilities.selectByVisibleTextByLocator(MarquisFinanceTransactionPage.docSentToMfYesNo, "YES");

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.documentsList, "Documents list ");


		// Send Documents
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.selDocument1, 10);
		Utilities.moveToElementActionAndClick(MarquisFinanceTransactionPage.selDocument1, "select Documents ");

		Utilities.moveToElementActionAndClick(MarquisFinanceTransactionPage.selDocument2, "select Documents ");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.doneButton, 10);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.doneButton, "Done Submission ");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.sendDocuments, 10);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.sendDocuments, "Send Documents ");

		// Verify the Final document submission
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.documentSubmissionSuccess, 10);

		String successMessage = Utilities.getText(MarquisFinanceTransactionPage.documentSubmissionSuccess);
		String expectedMessage = "Documents submitted successfully";

		Assert.assertEquals(expectedMessage.trim(), successMessage.trim());

		logger.info("End of Documents Submission ");
		ExtentReporter.extentLoggerPass("Document Submission ", "Documents submitted successfully");

	}

}
