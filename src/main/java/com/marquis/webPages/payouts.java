package com.marquis.webPages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.excel.ExcelFunctions;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import com.utility.Utilities;

public class payouts {
	static LoggingUtils logger = new LoggingUtils();
	public static String ReferenceNumber="2000006031";
	public static String ReferenceNumber1="2000006843";
	 public static String xlpath = "./XLSX/MarquisDataForm.xlsx";
	 static ExcelFunctions xcl = new ExcelFunctions();
	// payoutab
	public static By payoutTab = By.xpath("//*[contains(text(),'Payouts')]");

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
			.xpath("//div[@class='col-2 pt-2 ng-star-inserted']/button[@class='btn btn-primary']/child::i");

	// payouts cancel btn
	public static By Cancel_btn = By
			.xpath("//div[@class='col-2 pt-2 ng-star-inserted']/button[@class='btn btn-danger']");

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

	//generating contract document(searched result)
	public static By searched_gnrtd_dcmt=By.xpath("(//*[@class='table-router ng-star-inserted'])[2]");


	// lock icon
	public static By lock_icon = By
			.xpath("//button[@class='btn btn-success ng-star-inserted']/i[@class='pi pi-lock-open']");

	// Back button
	public static By back_button = By
			.xpath("//button[@class='btn btn-primary ']/i[@class='pi pi-chevron-circle-left pt-1']");
	
	//contract document text
	public static By Contract_doc_text=By.xpath("//b[text()='Contract Document']");

	// contract document verify button
	public static By Contract_doc_v_b = By
			.xpath("//b[text()='Contract Document']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");

	// contract document view button
	public static By Contract_doc_view_b = By
			.xpath("//b[text()='Contract Document']/ancestor::div[@class='col-12']/descendant::button/child::b[text()='View']");

	// stamped id verify button
	public static By Stamped_id_v_b = By
			.xpath("//b[text()='Stamped ID']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");

	//Stamped id view btn
	public static By StampedID_view_btn=By.xpath("//b[text()='Stamped ID']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@ptooltip='Click to un-verify']");

	// release notes verify button
	public static By release_notes_v_b = By
			.xpath("//b[text()='Release Notes']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");

	//release notes view button 
	public static By release_notes_view_b = By.xpath("//b[text()='Release Notes']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-success ng-star-inserted']");

	// Dealer invoice verify button
	public static By dealer_invoice_v_b = By
			.xpath("//b[text()='Dealer Invoice']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");

	//Dealer invoice view button
	public static By Dealer_invoice_view_btn=By.xpath("//b[text()='Dealer Invoice']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-success ng-star-inserted']");


	// proof of insurence verify button
	public static By proofof_insurance_v_b = By.xpath("//b[text()='Proof Of Insurance']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");

	//proof of insurence view button
	public static By proofof_insurence_view_btn=By.xpath("//b[text()='Proof Of Insurance']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-success ng-star-inserted']");
	//Natice element
	public static By Natice_element=By.xpath("//b[text()='Natis Document']");

	// Natice document verify verify button
	public static By Natice_doc_v_b = By.xpath("//b[text()='Natis Document']/ancestor::div[@class='col-12']/child::div[@class='row align-content-center bottom-line gotham ng-star-inserted']/descendant::button[@class='btn btn-block px-0 text-white btn-warning ng-star-inserted']");


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
	public static By Arv_doc_cancl_btn = By.xpath("//*[@class='pi pi-times']");

	//pagination
	//pagination 1
	public static By pgntion_1=By.xpath("(//li[@class='current ng-star-inserted']/descendant::span[text()='1'])[1]");

	//pagination next 
	public static By pgntion_Next=By.xpath("(//a[text()=' Next '])[1]");

	//pagination previous
	public static By pgntion_previous=By.xpath("(//pagination-controls/descendant::span[text()=' Previous '])[1]");

	//searched result agreement number
	public static By SearchedAgreementNumber=By.xpath("(//th[text()='Agreement Number']/parent::tr/parent::thead/following-sibling::tbody/descendant::td)[2]");

	//documents
	// Agreement text field
	public static By Agreement_field = By.xpath("//b[text()='Agreement:']/parent::div/following-sibling::div/descendant::b");

	// Customer full name
	public static By Customer_Namefield = By.xpath("//b[text()='Customer Full Name:']/parent::div/following-sibling::div/descendant::b");

	// Customer ID
	public static By Customer_IDfield = By.xpath("//b[text()='Customer ID:']/parent::div/following-sibling::div/descendant::b");

	// Entered date
	public static By Entereddate_field = By.xpath("//b[text()='Entered Into Date:']/parent::div/following-sibling::div/descendant::b");

	// Description of vehicle
	public static By Descriptionf_vehicle_field = By.xpath("//b[text()='Description of Vehicle:']/parent::div/following-sibling::div/descendant::b");

	// Lightstone check
	public static By Lightstonecheck__field = By.xpath("//b[text()='Lightstone Check:']/parent::div/following-sibling::div/descendant::b");

	// Chassis number field
	public static By ChassisNumber_field = By.xpath("//b[text()='Chassis Number:']/parent::div/following-sibling::div/descendant::b");
	
	//Engine number field
	public static By EngineNumber_field=By.xpath("//b[text()='Engine Number:']/parent::div/following-sibling::div/descendant::b");
	
	//police interest indicator field
	public static By Police_itrst_indicator_field=By.xpath("//b[text()='Police Interest Indicator:']/parent::div/following-sibling::div/descendant::b");
	
	//Status field 
	public static By Status_field=By.xpath("//b[text()='Status:']/parent::div/following-sibling::div/descendant::b");
	
	//comments
	//comments field
	public static By commentstext_field=By.xpath("//b[text()='Comments:']/parent::div/following-sibling::div/descendant::textarea");
	
	//add comment buttonn 
	public static By Add_comment_button=By.xpath("//b[text()='Add Comment']");
	
	//view commwent
	public static By View_comment_button=By.xpath("//b[text()='View Comments']");
	
	//View comments cncel button
	public static By View_comment_cnclbutton=By.xpath("//a[@role='button']/child::span");

	
	/**
	 * Verify user is able to search the drawdown pending documnet
	 * 
	 * @param ReferenceNumber
	 * @throws Exception
	 */
	public static void pendingdocumentsearch() throws Exception {

		ExtentReporter.extentLogger("TC_019_TC_022_TC_023", "Verify the UI of the Payouts page");
		ExtentReporter.HeaderChildNode("Payouts");
		Utilities.waitTime(2000);
		Utilities.JSClick(payoutTab, "payoutTab");
		Utilities.click(payout_Hamberger_btn, "payout_Hamberger_btn");
		logger.info("payout_Hamberger_btn is clicked");
		ExtentReporter.extentLoggerPass("Click onpayout_Hamberger_btn", "payout_Hamberger_btn is clicked");
		Utilities.verifyElementPresentAndClick(Marquis_icon, "Marquis_icon");
		Utilities.waitTime(2000);
		Utilities.click(payout_Hamberger_btn, "payout_Hamberger_btn");
		Utilities.JSClick(payoutTab, "payoutTab");
		Utilities.verifyElementExist(Drawdown_pendingtab, "Drawdown_pendingtab");
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
		//Utilities.JSClick(pgntion_1, "pgntion_1");
		Utilities.JSClick(pgntion_Next, "pgntion_Next");
		Utilities.Wait(3000);
		Utilities.JSClick(pgntion_previous, "pgntion_previous");
		Utilities.type(App_reference_no, ReferenceNumber, "AppReferenceNumber");
		logger.info("AppReferenceNumber is entered");
		ExtentReporter.extentLoggerPass("AppReferenceNumber", "AppReferenceNumber is entered");
		Utilities.JSClick(Cancel_btn, "cancel_btn");
		logger.info("Searching cancelled");
		Utilities.waitTime(3000);
		Utilities.type(App_reference_no, ReferenceNumber, "AppReferenceNumber");
		Utilities.explicitWaitVisible(search_btn, 10);
		Utilities.waitTime(4000);
		Utilities.JSClick(search_btn, "search_btn");
		Utilities.Wait(3000);
		/*String Searched_AgreementNumber = Utilities.getText(SearchedAgreementNumber);
		System.out.println(Searched_AgreementNumber);
		if(Searched_AgreementNumber.equals(ReferenceNumber)){
			Utilities.verifyElementPresentAndClick(Searched_pndng_dcmt, "Searched_pndng_dcmt");
		}
		else
		{
			ExtentReporter.extentLoggerFail("Agreement number","Agreement number is not matched");
		}*/
		Utilities.explicitWaitVisible(Searched_pndng_dcmt, 10);
		Utilities.verifyElementPresentAndClick(Searched_pndng_dcmt, "Searched_pndng_dcmt");
	}
	
	public static void document() throws Exception, IOException
	{
		String Actl_AgreementID = xcl.getExceldata(xlpath, "Sheet1", 11, 2);
		String Exptd_AgreementID = Utilities.getText(Agreement_field);
		if(Exptd_AgreementID=="")
		{
			logger.info("Agreement id field is empty");
			ExtentReporter.extentLoggerPass("AgreementID", "Agreement id field is empty");
		}
		
		else if(Actl_AgreementID.equals(Exptd_AgreementID))
		{
			logger.info("Agreement id is matched");
			ExtentReporter.extentLoggerPass("AgreementID", "Agreement id is matched");
		}
		else if(Actl_AgreementID!=Exptd_AgreementID)
		{
			logger.info("Agreement id is not  matched");
			ExtentReporter.extentLoggerFail("AgreementID", "Agreement id is not matched");
		}
		
		String Actl_Customer_Name = xcl.getExceldata(xlpath, "Sheet1", 7, 7);
		String Exptd_Customer_Name = Utilities.getText(Customer_Namefield);
		if(Exptd_Customer_Name=="")
		{
			logger.info("Customer_Name field is empty");
			ExtentReporter.extentLoggerPass("Customer_Name", "Customer_Name field is empty");
		}
		
		else if(Actl_Customer_Name.equals(Exptd_Customer_Name))
		{
			logger.info("Customer_Name is matched");
			ExtentReporter.extentLoggerPass("Customer_Name", "Customer_Name is matched");
		}
		else if(Actl_Customer_Name!=Exptd_Customer_Name)
		{
			logger.info("Customer_Name is not  matched");
			ExtentReporter.extentLoggerFail("Customer_Name", "Customer_Name is not matched");
		}
		
		String Actl_Customer_ID = xcl.getExceldata(xlpath, "Sheet1", 7, 7);
		String Exptd_Customer_ID = Utilities.getText(Customer_IDfield);
		if(Exptd_Customer_ID=="")
		{
			logger.info("Customer_ID field is empty");
			ExtentReporter.extentLoggerPass("Customer_ID", "Customer_ID field is empty");
		}
		
		else if(Actl_Customer_ID.equals(Exptd_Customer_ID))
		{
			logger.info("Customer_ID is matched");
			ExtentReporter.extentLoggerPass("Customer_ID", "Customer_ID is matched");
		}
		else if(Actl_Customer_ID!=Exptd_Customer_ID)
		{
			logger.info("Customer_ID is not  matched");
			ExtentReporter.extentLoggerFail("Customer_ID", "Customer_ID is not matched");
		}
		
		String Actl_Entereddate = xcl.getExceldata(xlpath, "Sheet1", 7, 7);
		String Exptd_Entereddate = Utilities.getText(Entereddate_field);
		if(Exptd_Entereddate=="")
		{
			logger.info("Entereddate field is empty");
			ExtentReporter.extentLoggerPass("Entereddate", "Entereddate field is empty");
		}
		
		else if(Actl_Entereddate.equals(Exptd_Entereddate))
		{
			logger.info("Entereddate is matched");
			ExtentReporter.extentLoggerPass("Entereddate", "Entereddate is matched");
		}
		else if(Actl_Entereddate!=Exptd_Entereddate)
		{
			logger.info("Entereddate is not  matched");
			ExtentReporter.extentLoggerFail("Entereddate", "Entereddate is not matched");
		}
		
		String Actl_Descriptionf_vehicle = xcl.getExceldata(xlpath, "Sheet1", 7, 7);
		String Exptd_Descriptionf_vehicle = Utilities.getText(Descriptionf_vehicle_field);
		if(Exptd_Descriptionf_vehicle=="")
		{
			logger.info("Descriptionf_vehicle field is empty");
			ExtentReporter.extentLoggerPass("Descriptionf_vehicle", "Descriptionf_vehicle field is empty");
		}
		
		else if(Actl_Descriptionf_vehicle.equals(Exptd_Descriptionf_vehicle))
		{
			logger.info("Descriptionf_vehicle is matched");
			ExtentReporter.extentLoggerPass("Descriptionf_vehicle", "Descriptionf_vehicle is matched");
		}
		else if(Actl_Descriptionf_vehicle!=Exptd_Descriptionf_vehicle)
		{
			logger.info("Descriptionf_vehicle is not  matched");
			ExtentReporter.extentLoggerFail("Descriptionf_vehicle", "Descriptionf_vehicle is not matched");
		}
		
		String Actl_Lightstonecheck = xcl.getExceldata(xlpath, "Sheet1", 7, 7);
		String Exptd_Lightstonecheck = Utilities.getText(Lightstonecheck__field);
		if(Exptd_Lightstonecheck=="")
		{
			logger.info("Lightstonecheck field is empty");
			ExtentReporter.extentLoggerPass("Lightstonecheck", "Lightstonecheck field is empty");
		}
		
		else if(Actl_Lightstonecheck.equals(Exptd_Lightstonecheck))
		{
			logger.info("Lightstonecheck is matched");
			ExtentReporter.extentLoggerPass("Lightstonecheck", "Lightstonecheck is matched");
		}
		else if(Actl_Lightstonecheck!=Exptd_Lightstonecheck)
		{
			logger.info("Lightstonecheck is not  matched");
			ExtentReporter.extentLoggerFail("Lightstonecheck", "Lightstonecheck is not matched");
		}
		
		String Actl_ChassisNumber = xcl.getExceldata(xlpath, "Sheet1", 7, 7);
		String Exptd_ChassisNumber = Utilities.getText(ChassisNumber_field);
		if(Exptd_ChassisNumber=="")
		{
			logger.info("ChassisNumber field is empty");
			ExtentReporter.extentLoggerPass("ChassisNumber", "ChassisNumber field is empty");
		}
		
		else if(Actl_ChassisNumber.equals(Exptd_ChassisNumber))
		{
			logger.info("ChassisNumber is matched");
			ExtentReporter.extentLoggerPass("ChassisNumber", "ChassisNumber is matched");
		}
		else if(Actl_ChassisNumber!=Exptd_ChassisNumber)
		{
			logger.info("ChassisNumber is not  matched");
			ExtentReporter.extentLoggerFail("ChassisNumber", "ChassisNumber is not matched");
		}
		
		String Actl_EngineNumber = xcl.getExceldata(xlpath, "Sheet1", 7, 7);
		String Exptd_EngineNumber = Utilities.getText(EngineNumber_field);
		if(Exptd_EngineNumber=="")
		{
			logger.info("EngineNumber field is empty");
			ExtentReporter.extentLoggerPass("EngineNumber", "EngineNumber field is empty");
		}
		
		else if(Actl_EngineNumber.equals(Exptd_EngineNumber))
		{
			logger.info("EngineNumber is matched");
			ExtentReporter.extentLoggerPass("EngineNumber", "EngineNumber is matched");
		}
		else if(Actl_EngineNumber!=Exptd_EngineNumber)
		{
			logger.info("EngineNumber is not  matched");
			ExtentReporter.extentLoggerFail("EngineNumber", "EngineNumber is not matched");
		}
		
		ExtentReporter.extentLogger("Comment", "comment section");
		Utilities.waitTime(3000);
		Utilities.type(commentstext_field, "Comments", "comments text field");
		
		
		Utilities.click(Add_comment_button, "add comment button is clicked");
		
		Utilities.waitTime(3000);
		Utilities.click(View_comment_button, "view_comment_button is clicked");
		
		
		Utilities.waitTime(3000);
		Utilities.click(View_comment_cnclbutton, "view_comment_cnclbutton is clicked");	
		
	}

	public static void Drawdownpending() throws Exception {
		ExtentReporter.extentLogger("TC_029_TC_030_TC_023", "Verify the UI of the pending Drawdown pending Agreement page");

		
		Utilities.ScrollToTheElement(Contract_doc_text);
		Utilities.waitTime(2000);
	
		Utilities.JSClick(Contract_doc_v_b, "Contract_doc_v_b");


		if (Utilities.verifyElementPresent(selecct_doc_aprv, "Please Select a Document to view")) {
			Utilities.verifyElementPresentAndClick(selecct_doc_aprv, "Contract_doc");
			Utilities.ScrollToTheElement(select_n_verify);
			Utilities.verifyElementPresentAndClick(select_n_verify, "select_n_verify");
		} 
		else {
			Utilities.verifyElementPresentAndClick(Arv_doc_cancl_btn, "There is no Documents for this process.");
		}
		
		
		
		
		Utilities.explicitWaitVisible(Stamped_id_v_b, 10);
		Utilities.JSClick(Stamped_id_v_b, "Stamped_id_v_b");
		if (Utilities.verifyElementPresent(selecct_doc_aprv, "Please Select a Document to view")) {
			Utilities.verifyElementPresentAndClick(selecct_doc_aprv, "Stamped_id");
			Utilities.ScrollToTheElement(select_n_verify);
			Utilities.verifyElementPresentAndClick(select_n_verify, "select_n_verify");
		} 
		else {
			Utilities.verifyElementPresentAndClick(Arv_doc_cancl_btn, "There is no Documents for this process.");
		}
		Utilities.waitTime(2000);
		Utilities.JSClick(release_notes_v_b, "release_notes_v_b");
		if (Utilities.verifyElementPresent(selecct_doc_aprv, "Please Select a Document to view")) {
			Utilities.verifyElementPresentAndClick(selecct_doc_aprv, "release_notes");
			Utilities.ScrollToTheElement(select_n_verify);
			Utilities.verifyElementPresentAndClick(select_n_verify, "select_n_verify");
		} else {
			Utilities.verifyElementPresentAndClick(Arv_doc_cancl_btn, "There is no Documents for this process.");
			ExtentReporter.extentLoggerFail("clicked on Arv_doc_cancl_btn ", "There is no document in this process");
		}
		Utilities.waitTime(2000);
		Utilities.verifyElementPresentAndClick(dealer_invoice_v_b, "dealer_invoice_v_b");
		if (Utilities.verifyElementPresent(selecct_doc_aprv, "Please Select a Document to view")) {

			Utilities.verifyElementPresentAndClick(selecct_doc_aprv, "dealer_invoice");
			Utilities.ScrollToTheElement(select_n_verify);
			Utilities.verifyElementPresentAndClick(select_n_verify, "select_n_verify");
		} else {
			Utilities.verifyElementPresentAndClick(Arv_doc_cancl_btn, "There is no Documents for this process.");
			ExtentReporter.extentLoggerFail("Arv_doc_cancl_btn", "There is no document in this process");
		}
		Utilities.waitTime(2000);
		Utilities.JSClick(proofof_insurance_v_b, "proofof_insurance_v_b");
		if (Utilities.verifyElementPresent(selecct_doc_aprv, "Please Select a Document to view")) {
			Utilities.verifyElementPresentAndClick(selecct_doc_aprv, "proofof_insurance");
			Utilities.ScrollToTheElement(select_n_verify);
			Utilities.verifyElementPresentAndClick(select_n_verify, "select_n_verify");
		} else {
			Utilities.verifyElementPresentAndClick(Arv_doc_cancl_btn, "There is no Documents for this process.");
			ExtentReporter.extentLoggerFail("There is no proof of insurence document", "There is no document in this process");
		}

		Utilities.ScrollToTheElement(Refresh_btn);
		Utilities.verifyElementExist(Refresh_btn, "Refresh_btn");
		Utilities.verifyElementExist(Raises__btn, "Raises__btn");
		Utilities.verifyElementExist(AcceptMicTask_btn, "AcceptMicTask_btn");
		Utilities.verifyElementExist(CloseMicTask_btn, "CloseMicTask_btn");
		Utilities.verifyElementExist(DeclineMicTask_btn__btn, "DeclineMicTask_btn__btn");
		Utilities.verifyElementExist(request_drawdown_btn, "request_drawdown_btn");
		if(Utilities.verifyElementExist(Natice_element, "Natice_element"))
		{
			Utilities.explicitWaitVisible(Natice_doc_v_b, 10);
			Utilities.verifyElementPresentAndClick(Natice_doc_v_b, "Natice_doc_v_b");
			if (Utilities.verifyElementPresent(selecct_doc_aprv, "Please Select a Document to view")) {

				Utilities.verifyElementPresentAndClick(selecct_doc_aprv, "Natice_doc");
				Utilities.ScrollToTheElement(select_n_verify);
				Utilities.verifyElementPresentAndClick(select_n_verify, "select_n_verify");
			} else {
				Utilities.verifyElementPresentAndClick(Arv_doc_cancl_btn, "There is no Documents for this process.");
			}
		}
		else
		{
			Utilities.verifyElementPresentAndClick(request_drawdown_btn, "request_drawdown_btn");
		}




	}


	public static void pagination() throws Exception
	{
		ExtentReporter.extentLogger("TC_032", "Verify the functionality of the pagination buttons");
		Utilities.verifyElementDisplayed(pgntion_1);
		logger.info("pgntion_1 is displayed");

		Utilities.verifyElementPresentAndClick(pgntion_Next, "pgntion_Next");
		logger.info("next button is functional");

		Utilities.verifyElementPresentAndClick(pgntion_previous, "pgntion_previous");
		logger.info("previous button is functional");
	}
	public static void generated() throws Exception
	{   

		/*ExtentReporter.extentLogger("TC_031", "Verify the user is able to complete the deal");
		Utilities.JSClick(payoutTab, "payoutTab");
		System.out.println("clicked tab");
		Utilities.click(payout_Hamberger_btn, "payout_Hamberger_btn");*/
		 Utilities.ScrollToTheElement(back_button);
		Utilities.JSClick(back_button, "back_button");
	
		Utilities.JSClick(Drawdown_generatingtab, "Drawdown_generatingtab");

		Utilities.JSClick(Manual_refresh_btn, "Manual_refresh_btn");
     	Utilities.explicitWaitVisible(App_reference_no, 5);
		Utilities.type(App_reference_no, ReferenceNumber1, "AppReferenceNumber");
		Utilities.Wait(3000);
		Utilities.JSClick(search_btn, "search_btn");
		Utilities.Wait(3000);
		Utilities.JSClick(searched_gnrtd_dcmt, "searched_gnrtd_dcmt");
		Utilities.ScrollToTheElement(AcceptMicTask_btn);
		Utilities.click(AcceptMicTask_btn, "AcceptMicTask_btn");

	}

	public static void completed() throws Exception
	{
		ReferenceNumber = Utilities.getParameterFromXML("ReferenceNumber");
		System.out.println(ReferenceNumber);

		Utilities.JSClick(payoutTab, "payoutTab");
		System.out.println("clicked tab");
		Utilities.click(payout_Hamberger_btn, "payout_Hamberger_btn");
		Utilities.JSClick(Completed_tab, "Completed_tab");
		logger.info("Completed_tab is clicked");
		ExtentReporter.extentLoggerPass("Completed_tab", "Completed_tab is clicked");

		Utilities.verifyElementPresentAndClick(Manual_refresh_btn, "Manual_refresh_btn");
		logger.info("Manual_refresh_btn is clicked");
		ExtentReporter.extentLoggerPass("Manual_refresh_btn", "Manual_refresh_btn is clicked");

		Utilities.type(App_reference_no, ReferenceNumber, "AppReferenceNumber");
		logger.info("AppReferenceNumber is entered");
		ExtentReporter.extentLoggerPass("AppReferenceNumber", "AppReferenceNumber is entered");
		Thread.sleep(3000);
		Utilities.verifyElementPresentAndClick(search_btn, "search_btn");
		logger.info("search_btn is clicked");
		ExtentReporter.extentLoggerPass("search_btn", "search_btn is clicked and completed detail is displayed");
	}
	
	
}



