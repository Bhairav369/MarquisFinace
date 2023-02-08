package com.marquis.webPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.excel.ExcelFunctions;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import com.utility.Utilities;

public class payouts {
	static LoggingUtils logger = new LoggingUtils();

	public static String xlpath = "./XLSX/MarquisDataForm.xlsx";
	static ExcelFunctions xcl = new ExcelFunctions();

	static SoftAssert softassert = new SoftAssert();
	// payoutab
	public static By payoutTab = By.xpath("//*[contains(text(),'Payouts')]");

	// payouts text
	public static By payoutsText = By.xpath("//div[text()=' Payouts ']");

	// pending drawdown agreement text
	public static By pendingDradownAgreementText = By.xpath("//*[text()='pending payouts: ']");

	// drawdown generated agreement text
	public static By DradownGeneratedAgreementText = By.xpath("//*[text()='drawdown payouts: ']");

	// Hamberger Button
	public static By payout_Hamberger_btn = By
			.xpath("//button[@class='invisible-button ng-star-inserted']/i[@class='pi pi-bars ']");

	// Marquis Finance icon
	public static By Marquis_icon = By.xpath("//*[@class='img-fluid-logo']");

	// Dealership request tab
	public static By D_request_Tab = By.xpath("//div[@class='col small-font']//*[text()=' Dealerships Requests']");

	// Manual refresh button
	public static By Manual_refresh_btn = By.xpath("//*[text()=' Manual Refresh ']");

	// App reference number text field
	public static By App_reference_no = By.xpath("//*[@id='App Reference Number']");

	// Payouts search button
	public static By search_btn = By
			.xpath("//div[@class='col-1 pt-2 ng-star-inserted']/child::button/child::i[@class='pi pi-search']");

	// payouts cancel btn
	public static By Cancel_btn = By
			.xpath("//div[@class='col-1 pt-2 ng-star-inserted']/child::button/following-sibling::button");

	// Drawdown pending
	public static By Drawdown_pendingtab = By.xpath("//span[text()='MIC Queue - Drawdown pending']");

	// Drawdown generated
	public static By Drawdown_generatingtab = By.xpath("//span[text()='MIC Queue - Drawdown Generated']");

	// Completed tab
	public static By Completed_tab = By.xpath("//span[text()='MIC Queue - Completed']");

	// logout btn
	public static By logout_btn = By.xpath("//button[@ptooltip='Logout']");

	// drawdown pending
	// pending contract document(searchd result)
	public static By Searched_pndng_dcmt = By.xpath("(//*[@class='table-router ng-star-inserted'])[1]");

	// generating contract document(searched result)
	public static By searched_gnrtd_dcmt = By.xpath("(//*[@class='table-router ng-star-inserted'])[2]");

	// completed contract document (searched result)
	public static By searched_completed_dcmt = By.xpath("(//*[@class='table-router ng-star-inserted'])[3]");

	// lock icon
	public static By lock_icon = By
			.xpath("//button[@class='btn btn-success ng-star-inserted']/i[@class='pi pi-lock-open']");

	// Back button
	public static By back_button = By
			.xpath("//button[@class='btn btn-primary ']/i[@class='pi pi-chevron-circle-left pt-1']");

	// contract document text
	public static By Contract_doc_text = By.xpath("//b[text()='Contract Document']");

	// contract document verify button
	public static By Contract_doc_v_b = By.xpath(
			"//b[text()='Contract Document']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");

	public static By objContractVerifyBtn = By.xpath("//b[text()='Verify']");

	// contract document view button
	public static By Contract_doc_view_b = By.xpath(
			"//b[text()='Contract Document']/ancestor::div[@class='col-12']/descendant::button/child::b[text()='View']");

	// stamped id verify button
	public static By Stamped_id_v_b = By.xpath(
			"//b[text()='Stamped ID']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");

	// Stamped id view btn
	public static By StampedID_view_btn = By.xpath(
			"//b[text()='Stamped ID']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@ptooltip='Click to un-verify']");

	// release notes verify button
	public static By release_notes_v_b = By.xpath(
			"//b[text()='Release Notes']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");

	// release notes view button
	public static By release_notes_view_b = By.xpath(
			"//b[text()='Release Notes']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-success ng-star-inserted']");

	// Dealer invoice verify button
	public static By dealer_invoice_v_b = By.xpath(
			"//b[text()='Dealer Invoice']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");

	// Dealer invoice view button
	public static By Dealer_invoice_view_btn = By.xpath(
			"//b[text()='Dealer Invoice']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-success ng-star-inserted']");

	// proof of insurence verify button
	public static By proofof_insurance_v_b = By.xpath(
			"//b[text()='Proof Of Insurance']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");

	// proof of insurence view button
	public static By proofof_insurence_view_btn = By.xpath(
			"//b[text()='Proof Of Insurance']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-success ng-star-inserted']");
	// Natice element
	public static By Natice_element = By.xpath("//b[text()='Natis Document']");

	// Natice document verify verify button
	public static By Natice_doc_v_b = By.xpath(
			"//b[text()='Natis Document']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");

	// Approve document(contract document)
	public static By selecct_doc_aprv = By.xpath("//*[@class='list-group-item ng-star-inserted']");

	// select and verify button
	public static By select_n_verify = By.xpath("//button[@class='btn btn-primary btn-block']");
	// page ending buttons
	// request drawdown method
	public static By request_drawdown_btn = By.xpath("//span/small/*[text()='Request DrawDown']");

	// refresh btn
	public static By Refresh_btn = By
			.xpath("//div[@class='col-12 d-flex justify-content-end']/button[@class='btn btn-info  ']");

	// Raises btn
	public static By Raises__btn = By.xpath("//button[@class='btn btn-info ']");

	// Accept Mic task
	public static By AcceptMicTask_btn = By.xpath("//b[text()='Accept MIC Task']");

	// Decline Mic task btn
	public static By DeclineMicTask_btn__btn = By.xpath("//*[@class='btn btn-danger ']");

	// close Mic task
	public static By CloseMicTask_btn = By.xpath("//*[@class='btn btn-warning  text-white']");

	// select dropdown
	public static By select = By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']");

	// select template text box
	public static By select_template = By.xpath("//input[@id='Select Template']");

	// Approve document close button
	public static By Arv_doc_cancl_btn = By.xpath("//div[@class='ui-dialog-titlebar-icons']/child::a");

	// pagination
	// pagination 1
	public static By pgntion_1 = By.xpath("(//li[@class='current ng-star-inserted']/descendant::span[text()='1'])[1]");

	// pagination next
	public static By pgntion_Next = By.xpath("(//a[text()=' Next '])[1]");

	// pagination previous
	public static By pgntion_previous = By.xpath("(//pagination-controls/descendant::span[text()=' Previous '])[1]");

	// searched pending agreement number
	public static By SearchedAgreementNumber = By.xpath(
			"(//th[text()='Agreement Number']/parent::tr/parent::thead/following-sibling::tbody/descendant::td)[2]");
//searched generated agreenment number
	public static By SearchedAgreementNumber1 = By.xpath("//*[@id=\"drawdownFileUploaded\"]/table/tbody/tr/td[2]");

	// searched completed agreement number
	public static By SearchedAgreementNumber2 = By.xpath("//*[@id=\"complete\"]/table/tbody/tr/td[2]");
	// documents
	// Agreement text field
	public static By Agreement_field = By
			.xpath("//b[text()='Agreement:']/parent::div/following-sibling::div/descendant::b");

	// Customer full name
	public static By Customer_Namefield = By
			.xpath("//b[text()='Customer Full Name:']/parent::div/following-sibling::div/descendant::b");

	// Customer ID
	public static By Customer_IDfield = By
			.xpath("//b[text()='Customer ID:']/parent::div/following-sibling::div/descendant::b");

	// Entered date
	public static By Entereddate_field = By
			.xpath("//b[text()='Entered Into Date:']/parent::div/following-sibling::div/descendant::b");

	// Description of vehicle
	public static By Descriptionf_vehicle_field = By
			.xpath("//b[text()='Description of Vehicle:']/parent::div/following-sibling::div/descendant::b");

	// Lightstone check
	public static By Lightstonecheck__field = By
			.xpath("//b[text()='Lightstone Check:']/parent::div/following-sibling::div/descendant::b");

	// Chassis number field
	public static By ChassisNumber_field = By
			.xpath("//b[text()='Chassis Number:']/parent::div/following-sibling::div/descendant::b");

	// Engine number field
	public static By EngineNumber_field = By
			.xpath("//b[text()='Engine Number:']/parent::div/following-sibling::div/descendant::b");

	// police interest indicator field
	public static By Police_itrst_indicator_field = By
			.xpath("//b[text()='Police Interest Indicator:']/parent::div/following-sibling::div/descendant::b");

	// Status field
	public static By Status_field = By.xpath("//b[text()='Status:']/parent::div/following-sibling::div/descendant::b");

	// comments
	// comments field
	public static By commentstext_field = By
			.xpath("//b[text()='Comments:']/parent::div/following-sibling::div/descendant::textarea");

	// add comment buttonn
	public static By Add_comment_button = By.xpath("//b[text()='Add Comment']");

	// view commwent
	public static By View_comment_button = By.xpath("//b[text()='View Comments']");

	// View comments cncel button
	public static By View_comment_cnclbutton = By.xpath("//a[@role='button']/child::span");

	// Error cancel button
	public static By ErrorCancelButton = By.xpath("//p-toastitem/descendant::a");

	// complete payouts text
	public static By CompletePayoutsText = By.xpath("//*[contains(text(),'complete payouts: ')]");

	/**
	 * Verify user is able to search the drawdown pending documnet
	 * 
	 * 
	 * 
	 */

	public static void pendingdocumentsearch() throws Exception {
		//ExcelFunctions.getMapData(xlpath, "TestData", 2);
		ExtentReporter.extentLogger("TC_019_TC_20_TC_022_TC_023", "Verify the UI of the Payouts page");
		Utilities.waitTime(2000);
		Utilities.JSClick(payoutTab, "payoutTab");
		String ActualpayoutText = Utilities.getText(payoutsText);
		System.out.println(ActualpayoutText);
		softassert.assertEquals(ActualpayoutText, "Payouts");
		Utilities.click(payout_Hamberger_btn, "payout_Hamberger_btn");
		logger.info("payout_Hamberger_btn is clicked");
		ExtentReporter.extentLoggerPass("Click onpayout_Hamberger_btn", "payout_Hamberger_btn is clicked");
		Utilities.verifyElementPresentAndClick(Marquis_icon, "Marquis_icon");
		Utilities.waitTime(2000);
		Utilities.click(payout_Hamberger_btn, "payout_Hamberger_btn");
		Utilities.JSClick(payoutTab, "payoutTab");
		Utilities.verifyElementExist(Drawdown_pendingtab, "Drawdown_pendingtab");
		String expectedpendingName = "MIC Queue - Drawdown pending";
		String ActualpendingName = Utilities.getText(Drawdown_pendingtab);
		softassert.assertEquals(ActualpendingName, expectedpendingName);
		Utilities.verifyElementExist(Drawdown_generatingtab, "Drawdown_generatingtab");
		Utilities.verifyElementExist(Completed_tab, "Completed_tab");
		Utilities.verifyElementExist(Marquis_icon, "Marquis_icon");
		Utilities.verifyElementExist(pgntion_1, "pgntion_1");
		Utilities.verifyElementExist(pgntion_Next, "pgntion_Next");
		Utilities.verifyElementExist(pgntion_previous, "pgntion_previous");
		Utilities.verifyElementExist(logout_btn, "logout_btn");
		Utilities.verifyElementPresentAndClick(payout_Hamberger_btn, "payout_Hamberger_btn");
		Utilities.waitTime(3000);
		Utilities.JSClick(Manual_refresh_btn, "Manual_refresh_btn");
		// Utilities.JSClick(pgntion_Next, "pgntion_Next");
		Utilities.Wait(3000);
		// Utilities.JSClick(pgntion_previous, "pgntion_previous");
		// String ReferenceNumber1 = xcl.getExceldata(xlpath, "RefNumber", 4, 0);
		String ReferenceNumber1 = xcl.testData.get("ReferenceNo1");
		System.out.println(ReferenceNumber1);
		Utilities.type(App_reference_no, ReferenceNumber1, "AppReferenceNumber");
		logger.info("AppReferenceNumber is entered");
		ExtentReporter.extentLoggerPass("AppReferenceNumber", "AppReferenceNumber is entered");
		Utilities.JSClick(Cancel_btn, "cancel_btn");
		logger.info("Searching cancelled");
		Utilities.waitTime(3000);
		String ReferenceNumber2 = xcl.testData.get("ReferenceNo1");
		System.out.println(ReferenceNumber2);
		Utilities.type(App_reference_no, ReferenceNumber2, "AppReferenceNumber");
		Utilities.JSClick(search_btn, "search_btn");
		Utilities.waitTime(3000);
		String Searched_AgreementNumber = Utilities.getText(SearchedAgreementNumber);
		System.out.println(Searched_AgreementNumber);
		String ReferenceNumber3 = xcl.testData.get("ReferenceNo1");
		if (Searched_AgreementNumber.equals(ReferenceNumber3)) {
			Utilities.JSClick(Searched_pndng_dcmt, "Searched_pndng_dcmt");
		} else {
			ExtentReporter.extentLoggerFail("Agreement number", "Agreement number is not matched");
		}

	}

	public static void documentdetails() throws Exception {
		String ActualpendingDrawdownText = Utilities.getText(pendingDradownAgreementText);
		System.out.println(ActualpendingDrawdownText);
		softassert.assertEquals(ActualpendingDrawdownText, "PENDING PAYOUTS:");
		CustomerDetails("ReferenceNo1", Agreement_field, "Agreement ID");
		String First_Name = xcl.testData.get("First Name");
		String Last_Name = xcl.testData.get("Last Name");
		String Full_Name = First_Name + " " + Last_Name;
		System.out.println(Full_Name);

        //String Data = xcl.testData.get("ID Number");
        //System.out.println(Data);

		CustomerDetails2(Full_Name, Customer_Namefield, "CustomerName");
		// CustomerDetails(8, 7, Customer_Namefield, "CustomerName");
		CustomerDetails("ID Number", Customer_IDfield, "CustomerID");
		// CustomerDetails(10, 7, Entereddate_field, "EnteredDate");
		// CustomerDetails(11, 7, Descriptionf_vehicle_field, "Description of Vehicle");
		// CustomerDetails(12, 7, Lightstonecheck__field, "Lightstonecheck");
		CustomerDetails("Vehicle Chasis", ChassisNumber_field, "chassisNumber");
		CustomerDetails("EngineNumber", EngineNumber_field, "EngineNumber");
		ExtentReporter.extentLogger("Comment", "comment section");
		Utilities.waitTime(2000);
		Utilities.type(commentstext_field, "Comments", "comments text field");
		Utilities.click(Add_comment_button, "add comment_button");
		Utilities.waitTime(2000);
		Utilities.click(View_comment_button, "view_comment_button");
		Utilities.waitTime(2000);
		Utilities.click(View_comment_cnclbutton, "view_comment_cnclbutton");
	}

	public static void verifyDocuments() throws Exception {

		Utilities.ScrollToTheElement(Contract_doc_text);
		VerifyButtons(Contract_doc_view_b, "Contract_doc_view_b", "Contract_Doc", Contract_doc_v_b, "Contract_doc_v_b");
		VerifyButtons(StampedID_view_btn, "StampedID_view_btn", "StampedID_Doc", Stamped_id_v_b, "Stamped_id_v_b");
		VerifyButtons(release_notes_view_b, "release_notes_view_b", "ReleaseNotes_Doc", release_notes_v_b,
				"release_notes_v_b");
		VerifyButtons(Dealer_invoice_view_btn, "Dealer_invoice_view_btn", "DealerInvoice_Doc", dealer_invoice_v_b,
				"dealer_invoice_v_b");
		VerifyButtons(proofof_insurence_view_btn, "proofof_insurence_view_btn", "ProofofInsurence_Doc",
				proofof_insurance_v_b, "proofof_insurance_v_b");
		Utilities.ScrollToTheElement(Refresh_btn);
		Utilities.verifyElementExist(Refresh_btn, "Refresh_btn");
		Utilities.verifyElementExist(Raises__btn, "Raises__btn");
		Utilities.verifyElementExist(AcceptMicTask_btn, "AcceptMicTask_btn");
		Utilities.verifyElementExist(CloseMicTask_btn, "CloseMicTask_btn");
		Utilities.verifyElementExist(DeclineMicTask_btn__btn, "DeclineMicTask_btn__btn");
		Utilities.verifyElementExist(request_drawdown_btn, "request_drawdown_btn");
		Utilities.verifyElementPresentAndClick(request_drawdown_btn, "request_drawdown_btn");

	}

	/* Method for Generated Agreement */
	public static void generated() throws Exception {
		ExtentReporter.extentLogger("TC_031", "Verify the user is able to complete the deal");
		Utilities.ScrollToTheElement(back_button);
		Utilities.JSClick(back_button, "back_button");
		Utilities.JSClick(Drawdown_generatingtab, "Drawdown_generatingtab");
		String expectedGeneratedName = "MIC Queue - Drawdown Generated";
		String ActualGeneratedName = Utilities.getText(Drawdown_generatingtab);
		softassert.assertEquals(ActualGeneratedName, expectedGeneratedName);
		Utilities.JSClick(Manual_refresh_btn, "Manual_refresh_btn");
		Utilities.explicitWaitVisible(App_reference_no, 5);
		String ReferenceNumber11 = xcl.testData.get("ReferenceNo2");
		Utilities.type(App_reference_no, ReferenceNumber11, "AppReferenceNumber");
		Utilities.Wait(3000);
		// changed
		Utilities.JSClick(Cancel_btn, "cancel_btn");
		logger.info("Searching cancelled");
		// Changed
		Utilities.JSClick(Manual_refresh_btn, "Manual_refresh_btn");
		Utilities.explicitWaitVisible(App_reference_no, 5);

		String ReferenceNumber12 = xcl.testData.get("ReferenceNo2");
		Utilities.type(App_reference_no, ReferenceNumber12, "AppReferenceNumber");
		Utilities.Wait(3000);
		// changed

		Utilities.waitForElementAndClickIfPresent(search_btn, 5, "search_btn");
		Utilities.waitTime(3000);
		String Searched_AgreementNumber = Utilities.getText(SearchedAgreementNumber1);
		System.out.println(Searched_AgreementNumber);
		// String ReferenceNumber3 = xcl.getExceldata(xlpath, "RefNumber", 5, 0);
		String ReferenceNumber3 = xcl.testData.get("ReferenceNo2");
		if (Searched_AgreementNumber.equals(ReferenceNumber3)) {
			Utilities.JSClick(searched_gnrtd_dcmt, "searched_gnrtd_dcmt");
		} else {
			ExtentReporter.extentLoggerFail("Agreement number", "Agreement number is not matched");
		}
		String ActualDrawdownGeneratedText = Utilities.getText(DradownGeneratedAgreementText);
		System.out.println(ActualDrawdownGeneratedText);
		softassert.assertTrue(ActualDrawdownGeneratedText.equals("DRAWDOWN PAYOUTS:"),

				"DrawdownGeneratedAgreenment is displayed");
		softassert.assertAll();
		Utilities.ScrollToTheElement(Contract_doc_text);
		VerifyButtons(Contract_doc_view_b, "Contract_doc_view_b", "Contract_Doc", Contract_doc_v_b, "Contract_doc_v_b");
		VerifyButtons(StampedID_view_btn, "StampedID_view_btn", "StampedID_Doc", Stamped_id_v_b, "Stamped_id_v_b");
		VerifyButtons(release_notes_view_b, "release_notes_view_b", "ReleaseNotes_Doc", release_notes_v_b,
				"release_notes_v_b");
		VerifyButtons(Dealer_invoice_view_btn, "Dealer_invoice_view_btn", "DealerInvoice_Doc", dealer_invoice_v_b,
				"dealer_invoice_v_b");
		VerifyButtons(proofof_insurence_view_btn, "proofof_insurence_view_btn", "ProofofInsurence_Doc",
				proofof_insurance_v_b, "proofof_insurance_v_b");
		Utilities.ScrollToTheElement(AcceptMicTask_btn);
		Utilities.click(AcceptMicTask_btn, "AcceptMicTask_btn");
		Utilities.waitTime(6000);
		// here i remove the comment of click
		Utilities.click(ErrorCancelButton, "cancel icon");

	}

	/* Method for completed Agreement */
	public static void completed() throws Exception {
		// here i remove the comment of scroll and js click
		Utilities.ScrollToTheElement(back_button);
		Utilities.JSClick(back_button, "back_button");

		Utilities.JSClick(Completed_tab, "Completed_tab");
		Utilities.JSClick(Manual_refresh_btn, "Manual_refresh_btn");
		// String ReferenceNumber12 = xcl.getExceldata(xlpath, "RefNumber", 6, 0);
		String ReferenceNumber12 = xcl.testData.get("ReferenceNo3");
		Utilities.type(App_reference_no, ReferenceNumber12, "AppReferenceNumber");
		logger.info("AppReferenceNumber is entered");
		ExtentReporter.extentLoggerPass("AppReferenceNumber", "AppReferenceNumber is entered");
		Utilities.JSClick(search_btn, "search_btn");
		Utilities.waitTime(3000);
		String Searched_AgreementNumber = Utilities.getText(SearchedAgreementNumber2);
		System.out.println(Searched_AgreementNumber);
		// String ReferenceNumber3 = xcl.getExceldata(xlpath, "RefNumber", 6, 0);.
		String ReferenceNumber3 = xcl.testData.get("ReferenceNo3");
		if (Searched_AgreementNumber.equals(ReferenceNumber3)) {
			Utilities.JSClick(searched_completed_dcmt, "searched_completed_dcmt");
		} else {
			ExtentReporter.extentLoggerFail("Agreement number", "Agreement number is not matched");

		}
		String ActualCompletedText = Utilities.getText(CompletePayoutsText);
		System.out.println(ActualCompletedText);
		softassert.assertTrue(ActualCompletedText.equals("COMPLETE PAYOUTS:"),

				"Deal is paid");
		softassert.assertAll();

	}

	public static void pagination() throws Exception {
		ExtentReporter.extentLogger("TC_032", "Verify the functionality of the pagination buttons");
		Utilities.verifyElementDisplayed(pgntion_1);
		logger.info("pgntion_1 is displayed");

		Utilities.verifyElementPresentAndClick(pgntion_Next, "pgntion_Next");
		logger.info("next button is functional");

		Utilities.verifyElementPresentAndClick(pgntion_previous, "pgntion_previous");
		logger.info("previous button is functional");
	}

	/* Method for customer details */
	public static void CustomerDetails(String CustomerData, By bylocator, String validationText) throws Exception {
		String ActualData = xcl.testData.get(CustomerData);
		String ExpectedData = Utilities.getText(bylocator);
		if (ExpectedData == "") {
			logger.info(validationText + " " + "field is empty");
			ExtentReporter.extentLoggerPass("Check Matching", validationText + " " + "field is empty");
		} else if (ActualData.equals(ExpectedData)) {
			logger.info(validationText + " " + "is matched");
			ExtentReporter.extentLoggerPass("Check Matching", validationText + " " + "is matched");
		} else if (ActualData != ExpectedData) {
			logger.info(validationText + " " + " is not matched");
			ExtentReporter.extentLoggerPass("Check Matching", validationText + " " + "is not matched");
		}
	}

	/* Method for customer name */
	public static void CustomerDetails2(String Actual, By bylocator, String validationText) throws Exception {
		// String ActualData = xcl.getExceldata(xlpath, "TestData", rowNo, clmNo);
		String ActualData = Actual;
		String ExpectedData = Utilities.getText(bylocator);
		if (ExpectedData == "") {
			logger.info(validationText + " " + "field is empty");
			ExtentReporter.extentLoggerPass("Check Matching", validationText + " " + "field is empty");
		} else if (ActualData.equals(ExpectedData)) {
			logger.info(validationText + " " + "is matched");
			ExtentReporter.extentLoggerPass("Check Matching", validationText + " " + "is matched");
		} else if (ActualData != ExpectedData) {
			logger.info(validationText + " " + " is not matched");
			ExtentReporter.extentLoggerPass("Check Matching", validationText + " " + "is not matched");
		}
	}

	/* Method for verifying the documents */
	public static void VerifyButtons(By bylocator, String viewbtn, String DocumentName, By bylocator1, String verifybtn)
			throws Exception {

		if (Utilities.verifyElementExists(bylocator, viewbtn)) {
			logger.info(DocumentName + " " + "is verified");
			ExtentReporter.extentLoggerPass("DocumentName", DocumentName + " " + "is verified");
		} else if (Utilities.verifyElementPresent(bylocator1, verifybtn)) {

			Utilities.click(bylocator1, verifybtn);
			if (Utilities.verifyElementPresent(selecct_doc_aprv, "Please Select a Document to view")) {
				Utilities.verifyElementPresentAndClick(selecct_doc_aprv, "selected for approve");
				Utilities.waitTime(2000);
				Utilities.ScrollToTheElement(select_n_verify);
				Utilities.verifyElementPresentAndClick(select_n_verify, "select_n_verify");
				Utilities.waitTime(2000);
				String view = Utilities.getText(bylocator);
				System.out.println(view);
				softassert.assertEquals(view, "VIEW", DocumentName + " " + "is verified");
				logger.info(DocumentName + " " + "is verified");
				ExtentReporter.extentLoggerPass("DocumentName", DocumentName + " " + "is verified");

			} else {
				Utilities.waitForElementAndClickIfPresent(Arv_doc_cancl_btn, 10, "cancel button");

			}

		}
	}

}



