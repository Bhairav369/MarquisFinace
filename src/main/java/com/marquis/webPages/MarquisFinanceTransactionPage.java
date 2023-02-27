package com.marquis.webPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.excel.ExcelFunctions;
import com.marquis.SanityScripts.marquisFinancierSanityScript;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import com.utility.Utilities;
 
public class MarquisFinanceTransactionPage {

	static LoggingUtils logger = new LoggingUtils();
	static ExcelFunctions xcl = new ExcelFunctions();
	public static String transactionNumberSaved = "";

	public static String xlpath = "./XLSX/MarquisDataForm.xlsx";
	public static String marquisReferenceNumber ="";

	// Green finance house button
	public static By financeHouseButton = By.xpath("(//button[@title=\"Finance Companies\"])[1]");

	// Applications header text
	public static By applicationHeader = By.xpath("//div/span[text()=\"Applications\"]");
	


	// Products-value added
	public static By productsTab = By.xpath("//*[@class='secondary-menu-divider']//*[.='Products']");

	public static By applicationsTab = By.xpath("//*[@class='secondary-menu-divider']//*[.='Applications']");

	public static By valueAddProducts = By
			.xpath("//*[@class='dropdown-content dropdown-content-secondary']//a[.='Value Added Products']");

	public static By valueAddProductsHeader = By.xpath("//*[@id='mainHeader']");
	public static By deliveryFee = By.xpath("//*[@class='RadioButton']//*[.='DELIVERY FEE']/..//input");

	public static By deliveryFeeText = By
			.xpath("//*[@class='RadioButton']//*[.='DELIVERY FEE']/../../..//td[5]//input");

	public static By licenseAndRegClick = By.xpath("//*[@class='RadioButton']//*[.='LICENCE AND REGISTRATION']/..//input");

	public static By licenseAndRegValue = By
			.xpath("//*[@class='RadioButton']//*[.='LICENCE AND REGISTRATION']/../../..//td[5]//input");

	public static By saveValueAdd = By.xpath("//input[@id='btnSaveBottom']");
	
	public static By saveSuccessful = By.id("lblInformationBottom");

	
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
	
	public static By transactionTabBtn = By.xpath("//*[@class='dropdown active']//a");
	
	// Client Details (Select, Add, Edit) buttons
	public static By clientDetailsAddButton = By.id("personClient_btnAdd");

	// Client Details (Select, Add, Edit) buttons
	public static By clientDetailsEditButton = By.id("personClient_btnEdit");

	// Select client details button
	public static By clientDetailsSelectButton = By.id("personClient_btnSelect");

	public static By documentsUpload = By.xpath("//tbody//tr[1]//td[2]//div//a");

	
	
	// public static By fileUploadButton = By.xpath("//*[@id='drop-zone' and
	// @for='file-upload']");
	public static By fileUploadButton = By.xpath("//input[@id='file-upload' and @type='file']");

	public static By spinningRole = By.xpath("//*[@class='overlay-loader no-user-select ng-scope']//*[@class='loader-title']");

	public static By documentCategory = By.xpath("//*[@id='advanceduploaded']//select");

	public static By selectDocument = By.xpath("//*[contains(@id, 'INVOICE')]//img");
	public static By selectDocument2 = By.xpath("//*[contains(@id, 'BANK STATEMENT')]//img");
	public static By selectDocument3 = By.xpath("//*[contains(@id, 'ID DOCUMENT')]//img");
	public static By transactionNumberElement = By.xpath("//*[@class='allow-user-select ng-binding']");

	public static By feedbackIcon = By.xpath("//*[@class='fas fa-check-circle t-feedback-btn-icon']");

	public static By saveButton = By.xpath("//*[@id='advanceduploaded']//div[2]/button[.='Save']");
	
	public static By fileUploadSuccess = By.id("feedback-msg-success");
	
	public static By vehcileCodeIframe = By.xpath("//*[@id='vsVehicleCodeId_ifrm']");
	
	public static By requestContract = By.xpath("//input[@value='Request Contract']");
	
	public static By requestPin = By.xpath("//input[@value='Request PIN']");
	
	

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
	public static By marquisRefDocument = By.xpath("//*[@id='dgDocumentsReceived']//tr[2]//td[2]");
	
	public static By refreshApplicationStatus = By.id("imgRefresh");

	// Likhitha's Changes to Add Vehcile Details
	public static By vehicleUse(String vehicleUse) {
		return By.xpath("//*[@id='rbnCarVehiclePurpose']//*[@value='" + vehicleUse + "']");
	}

	public static By residualValue = By.id("txtFinResidualValue");

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
	public static By firstDebitDate = By.id("txtFirstDebitDate");

	public static By agreementType(String AType) {
		return By.xpath("//*[@value='" + AType + "']");
	}

	public static By interestRate = By.id("txtFinPreferredInterestRate");
	
	
	public static By interestRateTypeLinked(String val)
	{
		return By.xpath("//*[@id='rbnFinInterestRateType']//input[@value='"+val+"']");
	}
	
	
	public static By financeTerm_72 = By.xpath("//*[@id='rbnFinTerm']//input[5]");
	public static By paymentFrequency_monthly = By.id("rbnFinPaymentFrequency_0");
	public static By vehicleSellingPrice = By.id("txtRetailPrice");
	public static By refreshApplications = By.id("btn-footer-refresh");

	// Likitha's change
	
	public static By supportingDocumentsTab = By.xpath("//button[@class='btn btn-xsm btn-lcyan ng-scope']");
	public static By supportingDocuments = By.id("btnSupportingDocuments");
	public static By supportingDocAssert= By.xpath("//div//span[.='Supporting Documents']");
	public static By docSentToMfYesNo = By.id("ddlNoQueue-0");
	public static By documentsList = By.xpath("//*[@id='supportingDocumentsForm']//button[3]");
	public static By selDocument1 = By.xpath("//div[3]//*[@class='tqcard-tile-document-text']/../../..");
	public static By selDocument2 = By.xpath("//div[4]//*[@class='tqcard-tile-document-text']/../../..");
	public static By selDocument3 = By.xpath("//div[5]//*[@class='tqcard-tile-document-text']/../../..");

	public static By doneButton = By.xpath("//button[.='Done']");
	public static By sendDocuments = By.xpath("//*[@type='submit']");

	public static By documentSubmissionSuccess = By.xpath("//*[@id='feedback-msg-success']");

	public static By applicationHistory = By.id("btnGetPolicyApplicationHistory");
	
	//public static By applicationHistAction = By.xpath("//*[@id='dgApplicationHistory']//td[.='Action']/../..//*[.='RECEIPT']");
	public static By applicationHistAction = By.xpath("//*[@id='dgApplicationHistory']//td[.='Action']/../..//*[.='RECEIPT']");

	public static By paidStatus = By.xpath("//*[@id='lblInformationApplyTop']");
	
	
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



		ExtentReporter.HeaderChildNode(
				"TC_010 & TC_011 : Verify user is able to enter the all the fields of OTP information page");

		
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.transactionTab, 10);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.transactionTab, " Click transaction Tab");


		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.financeHouseButton, 15);
		System.out.println("Finance button is found");
		Utilities.JSClick(MarquisFinanceTransactionPage.financeHouseButton, "Finance House Button");

		logger.info("Finance House Button");
		ExtentReporter.extentLoggerPass("Finance House Button", "Finance House Button is clicked");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.applicationHeader, 10);
		String applicationsHeaderText = Utilities.getText(MarquisFinanceTransactionPage.applicationHeader);

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.transactionNumberElement, 15);
        
		Utilities.Wait(4000);
		transactionNumberSaved = Utilities.getText(transactionNumberElement);
		System.out.println(" transaction number********** "+transactionNumberSaved);
	//	ExcelFunctions.writeData(xlpath, "RefNumber", 1, 1, transactionNumberSaved);
		ExcelFunctions.writeDataForExistingRow(xlpath,"RefNumber",marquisFinancierSanityScript.rowIterate,1,transactionNumberSaved);
		
		ExtentReporter.extentLoggerPass("Marquis Transaction Number ", "Marquis Transaction Number returned Successfully ");
		logger.info(" Marquis Transaction Number is Returned : " + marquisRef);
		
		System.out.println(" Transaction Number *** " + transactionNumberSaved);

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
		ExtentReporter.HeaderChildNode("TC_014 : Verify user is able to add the details to Marquis finance application");
		
		addVehicleDetails();
		addInterestDetails();
		ExtentReporter.extentLoggerPass(" enterMandatoryTransactionMarquisFinancePage ", " passed ");

	}
	
	/***
	 * Saves the Application Details
	 * @throws Exception
	 */
	public static void saveTransaction() throws Exception
	{
		Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.saveFooterBtn);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.saveFooterBtn,"Save client details footer button");
		logger.info("Save client details footer button");
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.saveSuccessful, 10);

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
		String vUse = ExcelFunctions.testData.get("Vehicle Use");
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.vehicleUse(vUse), 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.vehicleUse(vUse), "Select Vehicle use ");

		String vehicleType = ExcelFunctions.testData.get("vehicle Condition");
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.vehicleCondition(vehicleType),
				"is  Vehicle New ?");
		logger.info("Is Vehicle New ");
		ExtentReporter.extentLoggerPass("Is Vehicle New ", "Option selected ");

		if (vehicleType == "USED") {
			String odoMeter = ExcelFunctions.testData.get("Odometer");
			Utilities.clearField(MarquisFinanceTransactionPage.odoMeterReading, "Clear Price Field ");
			Utilities.type(MarquisFinanceTransactionPage.odoMeterReading, odoMeter, "Enter Vehicle Code ");
		}

		Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.searchVehicle);

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.searchVehicle, 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.searchVehicle, "Seaarch Vehicle");

		//Utilities.switchFrame_id("vsVehicleCodeId_ifrm");
		Utilities.switchFrame_xpath(vehcileCodeIframe);


		String vehicleCode = ExcelFunctions.testData.get("Vehicle Code");
		Utilities.type(MarquisFinanceTransactionPage.vehicleCode, vehicleCode, "Enter Vehicle Code ");
		logger.info("Enter Vehicle Code");
		ExtentReporter.extentLoggerPass(" Enter Vehicle Code ", "Vehicle Code Entered ");

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.vehicleSearchButton,
				"Search Vehcile Code");
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.selectSearchResult,
				"Select Searched Result ");

		Utilities.switchFrame_parent();

		Utilities.clearField(MarquisFinanceTransactionPage.vehRegNumber, " vehRegNumber field");
		String readRegNumber = ExcelFunctions.testData.get("Registration Number");
		Utilities.type(MarquisFinanceTransactionPage.vehRegNumber, readRegNumber, "Enter Vehicle Reg Number ");

		Utilities.clearField(MarquisFinanceTransactionPage.vehChasisNumber, " vehChasisNumber field");
		String readChasis = ExcelFunctions.testData.get("Vehicle Chasis");
		Utilities.type(MarquisFinanceTransactionPage.vehChasisNumber, readChasis, "Enter chasis Number ");
		logger.info("Enter Chasis Number ");
		ExtentReporter.extentLoggerPass(" Enter Chasis Code ", "Chasis  Number Entered ");

		String readEngineNumber = ExcelFunctions.testData.get("EngineNumber");
		Utilities.clearField(MarquisFinanceTransactionPage.vehEngineNumber, " vehEngineNumber field");

		Utilities.type(MarquisFinanceTransactionPage.vehEngineNumber, readEngineNumber, "Enter Vehicle Engine Number ");
		Utilities.type(MarquisFinanceTransactionPage.vehColour, "RED", "Enter Vehicle Color ");

	}

	/**
	 * Method to add Banking Interest
	 *  and Vehicle Selling price Details as passed from excel data sheet
	 * 
	 * @throws Exception
	 */
	public static void addInterestDetails() throws Exception {

		Utilities.clearField(MarquisFinanceTransactionPage.vehicleSellingPrice, "Clear Price Field ");
		String sellingPrice = ExcelFunctions.testData.get("sellingPrice");
		Utilities.type(MarquisFinanceTransactionPage.vehicleSellingPrice, sellingPrice, "Selling price");
		logger.info("Enter Vehicle Selling ");

		Utilities.clearField(MarquisFinanceTransactionPage.firstRegDateVehicle, " First Reg Date ");
		String firstRegDate = ExcelFunctions.testData.get("firstRegDate");
		Utilities.type(MarquisFinanceTransactionPage.firstRegDateVehicle, firstRegDate, " First Reg Date ");
		

		
		Utilities.clearField(MarquisFinanceTransactionPage.firstDebitDate, " First Debt Date ");
		String firstDebitDate = ExcelFunctions.testData.get("First Debit Date");
		Utilities.type(MarquisFinanceTransactionPage.firstDebitDate, firstDebitDate, " first Debit Date");
		
		String agreementType = ExcelFunctions.testData.get("Agreement Type");
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.agreementType(agreementType),
				" Agreement Type ");
		logger.info("Enter Agreement Tye");
		ExtentReporter.extentLoggerPass(" Enter Agreement Type ", "Entered Agreement Type ");

		Utilities.clearField(MarquisFinanceTransactionPage.interestRate, " Clear interest field");
		String interestRate = ExcelFunctions.testData.get("interestRate");
		Utilities.type(MarquisFinanceTransactionPage.interestRate, interestRate, "pref interest rate ");
		logger.info("Enter Interest Rate");
		ExtentReporter.extentLoggerPass(" Enter Interest Rate ", "Entered Interest Rate ");

	  String interestRateType=	ExcelFunctions.testData.get("InterestRateType");
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.interestRateTypeLinked(interestRateType), "Interest Type");
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.financeTerm_72, "Finance Term ");
		logger.info("Enter Finance Term");
		ExtentReporter.extentLoggerPass(" Enter Finance Term Code ", "Finance Term Entered ");
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.paymentFrequency_monthly,
				" Payment Frequency ");
		
		  String residualVar =	ExcelFunctions.testData.get("residualAmount");
			Utilities.type(MarquisFinanceTransactionPage.residualValue, residualVar, "pref interest rate ");

		
	}

	/**
	 * To Verify application status and Retrieve the Marquis Reference number. We
	 * are refreshing the page for particular times until the Reference number is
	 * retrieved.
	 * 
	 * Writing to Excel sheet the MQ Reference Number
	 * 
	 * @throws Exception
	 */
	public static void verifyApplicationStatus() throws Exception {
		ExtentReporter.HeaderChildNode("TC_016 To verify if user is able to Submit (apply) MF application and verify the Status after Refresh(s).");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.applyCheckButton, 20);
		Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.applyCheckButton);
		Utilities.JSClick(MarquisFinanceTransactionPage.applyCheckButton, "Apply check button");
		logger.info("Apply check button");
		ExtentReporter.extentLoggerPass("Apply check button", "Apply check button clicked");

		Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.saveFooterBtn);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.saveFooterBtn,"Save client details footer button");
		logger.info("Save client details footer button");
		ExtentReporter.extentLoggerPass("Save client details footer button","Save client details footer button clicked");


		
		Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.applyFooterBtn);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.applyFooterBtn, "Apply footer button");
		logger.info("Apply footer button");
		ExtentReporter.extentLoggerPass("Apply footer button", "Apply footer button is clicked");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.applySuccessMsg, 10);
		String applySuccessText = Utilities.getText(MarquisFinanceTransactionPage.applySuccessMsg);
		Assert.assertEquals(applySuccessText, "Application has been made:\n"
				+ "The information is currently being processed, this may take up to 5 minutes. The results will be displayed as soon as they become available.");

		Utilities.waitTime(3000);

		int count = 0;
		boolean flag = false;
		while (flag == false) {
			Utilities.waitTime(4000);
			flag = Utilities.getText(MarquisFinanceTransactionPage.marquisRef).contains("succeeded");

			if (flag == true || count == 6)
				break;
			Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.refreshApplicationStatus,
					"Refresh Application Status ");
			count++;

		}
		
		MarquisFinanceTransactionPage.clickTransactionTabAndApplication();
		
		
		
		logger.info("To Retrieve Marquis Reference Number");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.marquisRef, 10);
		String marquisRef = Utilities.getText(MarquisFinanceTransactionPage.marquisRef);
		String[] str = marquisRef.split(" ");
		marquisReferenceNumber = str[10].replace(".", "");

		System.out.println(marquisRef);// E.g: 2000007321 Now it can be used in OPS portal
	//	ExcelFunctions.writeData(xlpath, "RefNumber", 1, 0, marquisReferenceNumber);
     	ExcelFunctions.writeDataForExistingRow(xlpath,"RefNumber",marquisFinancierSanityScript.rowIterate,0,marquisReferenceNumber);
		
		ExtentReporter.extentLoggerPass("Submit Application ", "Application is Submitted Successfully ");
		logger.info(" Marquis Reference Number is Returned : " + marquisRef);

	}

	public static void clickTransactionTabAndApplication() throws Exception
	{
		System.out.println(" in Click Transaction page ");
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.transactionTab, 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.transactionTab, " Click transaction Tab");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.searchTransaction, 10);

		System.out.println("Transaction Number  " + MarquisFinanceTransactionPage.transactionNumberSaved);
		Utilities.type(MarquisFinanceTransactionPage.searchTransaction,MarquisFinanceTransactionPage.transactionNumberSaved, " Transaction Number Filtering ");

		
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.financeHouseButton, 15);
		System.out.println("Finance button is found");
		Utilities.JSClick(MarquisFinanceTransactionPage.financeHouseButton, "Finance House Button");

		logger.info("Finance House Button");
		ExtentReporter.extentLoggerPass("Finance House Button", "Finance House Button is clicked");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.applicationHeader, 10);
		String applicationsHeaderText = Utilities.getText(MarquisFinanceTransactionPage.applicationHeader);

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.transactionNumberElement, 15);

		Utilities.Wait(2000);
		transactionNumberSaved = Utilities.getText(transactionNumberElement);
		System.out.println(" Transaction Number *** " + transactionNumberSaved);

		Assert.assertEquals(applicationsHeaderText, "APPLICATIONS");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.marquisFinanceLinkLocator, 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.marquisFinanceLinkLocator,
				"Marquis finance link");
		logger.info("Marquis Finance Link");
		ExtentReporter.extentLoggerPass("Marquis Finance Link", "Marquis Finance link is clicked");

	}
	
	
	/**
	 * To Upload Documents( Bank Statment and ID copy) We can add other document
	 * category and upload when required.
	 * 
	 * @throws Exception
	 */
	public static void documentUpload() throws Exception {
		ExtentReporter.HeaderChildNode("TC_017 To Veriify If User is able to Upload the Required Documents.");

		String documentType = "";

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.transactionTab, 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.transactionTab, " Click transaction Tab");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.searchTransaction, 10);

		System.out.println("Transaction Number  " + MarquisFinanceTransactionPage.transactionNumberSaved);
		Utilities.type(MarquisFinanceTransactionPage.searchTransaction,MarquisFinanceTransactionPage.transactionNumberSaved, " Transaction Number Filtering ");
        
		//Uploading 1st Document
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.documentsUpload, 10);
		
		Utilities.JSClick(MarquisFinanceTransactionPage.documentsUpload, " Documents Upload ");
		
		Utilities.type(MarquisFinanceTransactionPage.fileUploadButton,"C:\\Code\\Docs Seriti Upload\\BANK STATEMENT.pdf", "");
		//Utilities.waitForElementInVisible(MarquisFinanceTransactionPage.spinningRole, 3, "");
		Utilities.type(MarquisFinanceTransactionPage.fileUploadButton,"C:\\Code\\Docs Seriti Upload\\ID DOCUMENT - CLIENT.pdf", "");
	//	Utilities.waitForElementInVisible(MarquisFinanceTransactionPage.spinningRole, 3, "");
		Utilities.type(MarquisFinanceTransactionPage.fileUploadButton,"C:\\Code\\Docs Seriti Upload\\INVOICE.pdf", "");
	//	Utilities.waitForElementInVisible(MarquisFinanceTransactionPage.spinningRole, 3, "");

		
		
		//Select and submit Doc1
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.selectDocument, 15);
		Utilities.JSClick(MarquisFinanceTransactionPage.selectDocument, " Select Document ");		

		documentType = ExcelFunctions.testData.get("DocumentUpload1");
		//Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.documentCategory," document Category Click ");
		Utilities.selectByVisibleTextByLocator(MarquisFinanceTransactionPage.documentCategory, "BANK STATEMENT");
        Utilities.Wait(2000);
		Utilities.waitForElementVisible(MarquisFinanceTransactionPage.saveButton, 15, " Save Button is Displayed ");
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.saveButton, " Click Save Button ");
		ExtentReporter.extentLoggerPass("Document 1", " passed ");
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.fileUploadSuccess, 15);

		
		
		//Select and submit Doc 2
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.selectDocument2, 15);
		Utilities.JSClick(MarquisFinanceTransactionPage.selectDocument2, " Select Document ");
		Utilities.waitForElementVisible(MarquisFinanceTransactionPage.documentCategory, 15, " Document Category ");
			documentType = ExcelFunctions.testData.get("DocumentUpload2");
	        Utilities.Wait(2000);
			Utilities.selectByVisibleTextByLocator(MarquisFinanceTransactionPage.documentCategory, documentType);
			Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.saveButton, 15);
			Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.saveButton, " Click Save Button ");
			ExtentReporter.extentLoggerPass("Document 2", " passed ");	
			Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.fileUploadSuccess, 15); 


			
			//Select and submit Doc 3
	 		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.selectDocument3, 15);
			Utilities.JSClick(MarquisFinanceTransactionPage.selectDocument3, " Select Document ");
			documentType = ExcelFunctions.testData.get("DocumentUpload3");
	        Utilities.Wait(2000);
			Utilities.selectByVisibleTextByLocator(MarquisFinanceTransactionPage.documentCategory, documentType);
			Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.saveButton, 15);
			Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.saveButton, " Click Save Button ");
			ExtentReporter.extentLoggerPass("Document 3", " passed ");	
			
			Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.fileUploadSuccess, 15);

		    String fileUploadSucessMsg=	Utilities.getText(MarquisFinanceTransactionPage.fileUploadSuccess);
			Assert.assertEquals( fileUploadSucessMsg.trim(),"File upload successful");
			ExtentReporter.extentLoggerPass("Documents Upload is Successful", " passed ");	

	
	}

	/**
	 * To Send ID and Bank Statement Documents( Uploaded from previous step) to OPS
	 * portal We can add other documents if required.
	 * 
	 * @throws Exception
	 */
	public static void sendDocuments() throws Exception {
		ExtentReporter.HeaderChildNode("TC_018 To Verify if user is able to Send Documents Successfully");

		// Supporting Documents
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.supportingDocumentsTab, 10);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.supportingDocumentsTab, "Send Documents Tab Click");
	
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.sendDocuments, 10);
		Utilities.selectByVisibleTextByLocator(MarquisFinanceTransactionPage.docSentToMfYesNo, "YES");

		
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.documentsList, 10);
    	Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.documentsList, "Documents list ");

		// Send Documents
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.selDocument1, 10);
		Utilities.moveToElementActionAndClick(MarquisFinanceTransactionPage.selDocument1, "select Documents ");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.selDocument2, 10);
		Utilities.moveToElementActionAndClick(MarquisFinanceTransactionPage.selDocument2, "select Documents ");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.selDocument3, 10);
		Utilities.moveToElementActionAndClick(MarquisFinanceTransactionPage.selDocument3, "select Documents ");

		
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.doneButton, 10);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.doneButton, "Done Submission ");

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.sendDocuments, 10);
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.sendDocuments, "Send Documents ");

		// Verify the Final document submission
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.documentSubmissionSuccess, 10);

		String successMessage = Utilities.getText(MarquisFinanceTransactionPage.documentSubmissionSuccess);
		String expectedMessage = "Documents submitted successfully";
        
		//Documents Submitted Successfully
		Assert.assertEquals(expectedMessage.trim(), successMessage.trim());
		logger.info("End of Documents Submission ");
		ExtentReporter.extentLoggerPass("Document Submission ", "Documents submitted successfully");
		
		
		/**
		 * Agreement process completes here and deal moves to OPS portal
		 * Next step it goes to Dashboard to create next transaction
		 * 
		 */
		System.out.println(" in Click Transaction page ");
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.transactionTabBtn, 10);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.transactionTabBtn, " Click transaction Tab");

		
	}

	/***
	 * To Verify if user is able to add Value added Products
	 * and Save successfully.
	 * @throws Exception
	 */
	public static void addValueAddedProducts() throws Exception {

		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.productsTab, 15);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.productsTab, " Click on productsTab");
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.valueAddProducts, 10);
		
		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.valueAddProducts,"Click on Value Add Products");
		
		String valueAddProductHeader = Utilities.getText(MarquisFinanceTransactionPage.valueAddProductsHeader);
		Assert.assertEquals(valueAddProductHeader,"VALUE ADDED PRODUCTS");
		
		
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.deliveryFee, 15);
		Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.deliveryFee);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.deliveryFee, "Click on deliveryFee ");

		String deiveryfeeValue = ExcelFunctions.testData.get("Delivery Fee");
		Utilities.clearField(MarquisFinanceTransactionPage.deliveryFeeText, "");
		Utilities.type(MarquisFinanceTransactionPage.deliveryFeeText, deiveryfeeValue, "enter deiveryfeeValue");
		

		
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.licenseAndRegClick, 10);
		Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.licenseAndRegClick);

		Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.licenseAndRegClick,"Click on licenseAndReg  ");

		String licenseAndRegistratonCharge = ExcelFunctions.testData.get("License Charge");

		Utilities.clearField(MarquisFinanceTransactionPage.licenseAndRegValue, "");
		Utilities.type(MarquisFinanceTransactionPage.licenseAndRegValue, licenseAndRegistratonCharge,"enter deiveryfeeValue");		

		
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.saveValueAdd, 10);
		Utilities.JSClick(MarquisFinanceTransactionPage.saveValueAdd,"Click on save in Value Add page ");
      
		
		Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.saveSuccessful);
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.saveSuccessful, 10);
		
      
		
		
		  Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.applicationsTab, "Marquis finance Tab");
		  
		  Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.
		  marquisFinanceLinkLocator, 15);
		  Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.marquisFinanceLinkLocator,"Marquis finance link");
		  logger.info("Marquis Finance Link");
		  ExtentReporter.extentLoggerPass("Marquis Finance Link","Marquis Finance link is clicked");
				
	}
	

	public static void RequestContract() throws Exception {
		 Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.requestContract,10);
		 Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.requestContract, "Request Contract ");		
	}
	
	

	public static void RequestPin() throws Exception {
		 
		 Utilities.ScrollToTheElementWEB(MarquisFinanceTransactionPage.requestPin);
		  Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.requestPin,30);
		  Utilities.JSClick(MarquisFinanceTransactionPage.requestPin, "Request PIN");

		  //Call for Financier to hack DigiSigin 
		  
	
		  
	}

	/***
	 * This method is used to search the application number and then click on the respective finance link
	 * @param applicationNumber
	 * @throws Exception
	 */
	public static void searchAndGoToApplicationPage(String applicationNumber) throws Exception {
	
	Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.searchTransaction,30);
    Utilities.type(MarquisFinanceTransactionPage.searchTransaction,applicationNumber, " Transaction Number Filtering ");
    
   
    
	Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.financeHouseButton, 15);
	System.out.println("Finance button is found");
	Utilities.JSClick(MarquisFinanceTransactionPage.financeHouseButton, "Finance House Button");

	Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.marquisFinanceLinkLocator,"Marquis finance link");
	logger.info("Marquis Finance Link");
	ExtentReporter.extentLoggerPass("Marquis Finance Link", "Marquis Finance link is clicked");

	
	}

	/**
	 * This method is used to Verify the Status of Contract at Final stage in Seriti.
	 * We are reading the marquis Ref number from excel for which status will be checked.
	 * @throws Exception
	 */
	public static void verifyPaidStatus() throws Exception {
		// TODO Auto-generated method stub
		
		Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.paidStatus, 15);
		String res= Utilities.getText(MarquisFinanceTransactionPage.paidStatus);
		String expected = "This application is in paid state.";
				
				Assert.assertEquals(res.contains(expected), true);
		
				//To Fetch Application history and verify
				Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.applicationHistory, "applicationHistory");
				
                String marquisRef = ExcelFunctions.getCellValue(xlpath,"RefNumber",2,0);
				
				String xpathPaid= "//*[@id='dgApplicationHistory']//td[.='"+marquisRef+"']/../..//tr//td[.='PAID']";
				By verifyPaid = By.xpath(xpathPaid);

				Utilities.explicitWaitVisible(verifyPaid, 15);

				
				//To Verify the PAID status for the given MArquis Reference number.
				Assert.assertEquals(Utilities.checkElementExist(verifyPaid, xpathPaid), true);
				ExtentReporter.screencapture();
			
				
				
	//	//*[@id='lblInformationApplyTop']
		
	}



}
