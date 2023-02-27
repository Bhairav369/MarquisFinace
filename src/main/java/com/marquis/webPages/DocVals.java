	package com.marquis.webPages;
	
	import java.util.Iterator;
	import java.util.List;
	
	import org.apache.poi.hssf.record.PageBreakRecord.Break;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.asserts.SoftAssert;
	import com.aventstack.extentreports.ExtentReporter;
	import com.aventstack.extentreports.ExtentReports;
	import com.driverInstance.DriverInstance;
	import com.driverInstance.DriverManager;
	import com.driverInstance.Drivertools;
	import com.excel.ExcelFunctions;
	import com.utility.LoggingUtils;
	import com.utility.Utilities;
	
	public class DocVals 
	{
		static LoggingUtils logger = new LoggingUtils();
		static ExcelFunctions xcl = new ExcelFunctions();
		public static String ExcelPath = "./XLSX/Operational PortalDataForm.xlsx";
		static SoftAssert softassert = new SoftAssert();
		
		public static String Seritixlpath = "./XLSX/MarquisDataForm.xlsx";
		public static String agremnt;
		public static String interst;
		public static String AMLSuccessApproved;
		public static String POIOutCmStatus;
	    public static boolean serchResult;
		
		
		    //Document Validations Side-Menu
			public static By DocValsSdMnu=By.xpath("(//b[normalize-space()='Document Validations'])[1]");
			//Doc Vals Page Header
			public static By DocValsPAgeHeader=By.xpath("(//div/b[text()='Document Validations'])");
			//Select Template field header
			public static By SelctTemplateFldHeader=By.xpath("//label[text()='Select Template ']");
			//MAnual Refresh Option
			public static By MAnualRefreshOption=By.xpath("//button[text()=' Manual Refresh ']");
			//Search Field
			public static By SearchFld=By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']//following::input[@id='App Reference Number']");
			//Search Icon
			public static By SearchIcons=By.xpath("//button[@type='submit']");
			//hamburger icon
			public static By hamburgericon=By.xpath("//div/button[contains(@class,'invisible-button ng-star-inserted')]");
	
			/*
			Table Column Name
			
			*/
			//SI No 
			public static By SINo=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[1]");
			//Agreement Number
			public static By AgrNo=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[2]");
			//Customer Name
			public static By custoName=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[3]");
			//ID Number
			public static By IDNo=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[4]");
			//DMS Status
			public static By DMSStatus=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[5]");
			//Dealer NAme
			public static By DlrNAme=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[6]");
			//FI Details
			public static By FiDetails=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[7]");
			//VAls Requested Date
			public static By ValsReqDate=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[8]");
			//Customer Type
			public static By CustoType=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[9]");
			//Risk Band
			public static By RiskBand=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[10]");
			//TEam Name
			public static By TeamName=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[11]");
			//Last Doc Uploaded
			public static By LAstDocUplded=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[12]");
			//Quote Date
			public static By QuoteDate=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[13]");
			//Locked By
			public static By LockedBy=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[14]");
			//Resubmit Count
			public static By ResubmitCunt=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[15]");
			//Bucket Name
			public static By BucketName=By.xpath("(//table[@class='ng-star-inserted']/child::thead/child::tr/child::th/child::div)[16]");
			//Previous Option
			public static By Prevus=By.xpath("(//span[@class='ng-star-inserted'])[1]");
			//Next Option
			public static By NxtPgnation=By.xpath("//a[@aria-label='Next page']");
			//Select Template
			public static By SelctTmplate=By.xpath("//select[@ng-reflect-name='filterBy']");
			//Search Icon
			public static By searchIcon=By.xpath("//button[@class='btn btn-primary ng-star-inserted']//i[@class='pi pi-search']");
			
			//Document validation Details
			public static By DocDetails=By.xpath("//b[normalize-space()=\"Document Validations Details\"]");
			//30-Day Payout check
			public static By thirtydaypaychk=By.xpath("//tr/td[text()='Process']/parent::tr/parent::thead/following-sibling::tbody/descendant::td[text()='30-day pay out check']");
			//30-Day Payout check- Approve Button 
			public static By thirtyDayApprove=By.xpath("//td[contains(text(),'30-day pay out check')]/following-sibling::td/descendant::button[contains(text(),'Approve')]");
			//30-Day Status
			public static By ThirtyStatus=By.xpath("(//td[contains(text(),'30-day pay out check')]/ancestor::tr/child::td[2]/small/b)[1]");
			//Kyc-Outcome Status
			public static By KycOutcomeStatus=By.xpath("(//td[contains(text(),'KYC Outcome')]/ancestor::tr/child::td[2]/small/b)[1]");
			//AVS Outcome Status
			public static By AVSOutcomeStatus=By.xpath("(//td[contains(text(),'AVS Outcome')]/ancestor::tr/child::td[2]/small/b)[1]");
			//POI Outcome Status
			public static By POIOutcomeStatus=By.xpath("(//td[contains(text(),'POI Outcome')]/ancestor::tr/child::td[2]/small/b)[1]");
			//POR Status
			public static By POROutcomeStatus=By.xpath("(//td[contains(text(),'POR Outcome')]/ancestor::tr/child::td[2]/small/b)[2]");
			//KYC Fraud Outcome Status
			public static By KycFraudStatus=By.xpath("(//td[contains(text(),'KYC Fraud Outcome')]/ancestor::tr/child::td[2]/small/b)[2]");
			//AML Outcome Status
			public static By AMLOutcomeStatus=By.xpath("(//td[contains(text(),'AML Outcome')]/ancestor::tr/child::td[2]/small/b)[2]");
			
			
			//status
			public static By Status=By.xpath("//button[contains(text(),'Approve')]/parent::td/preceding-sibling::td/descendant::b");
			
			
			
			
	
			//30-Day Payout check- Retry Button 
			public static By ThirtydayRetry=By.xpath("(//button[contains(text(),'Retry')])[1]");
			//Add option for the 30-Day Payout check- Retry Button 
			public static By Addthirtydaypaychk=By.xpath("(//td[text()='30-day pay out check']//parent::tr/child::td/child::i)[1]");
			//View option for the 30-Day Payout check- Retry Button
			public static By Viewthirtdaypayouchk=By.xpath("(//td[text()='30-day pay out check']//parent::tr/child::td/child::i)[2]");
			
			//KYC-Outcome Row name
			public static By Kycoucm=By.xpath("(//td[normalize-space()='KYC Outcome'])[1]");
			//Approve button for the KYC Outcome
			public static By KycoutmApprove=By.xpath("//td[normalize-space()='KYC Outcome']/..//button[contains(text(),'Approve')]");
			//Reject button for the KYC Outcome
			public static By KYCReject=By.xpath("(//button[contains(text(),'Reject')])[1]");
			//Popup- Reject button for the KYC Outcome
			public static By Kycpopupheader=By.xpath("//u[@class='ng-star-inserted']");
			//Resubmit checkbox
			public static By KycRejctResubmitcopychkbox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='10']");
			//Amend cust perId checkbox
			public static By KycRejectAmendcustCheckbox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='11']");
			//Resubmit back\front id Card
			public static By KycBackfronCheckbox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='12']");
			//Submit Marriage Cretificate
			public static By KycSubmtMarriageCheckBox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='13']");
			//Submit Affdivit checkbox
			public static By SumtAfdivitCheckBox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='14']");
			//Select Rejecttion result Save button 
			public static By KycoutRejectSavebtn=By.xpath("//u[@class='ng-star-inserted']//following::i[@class='pi pi-save pt-1']");
			//Select Rejection Cancel Button
			public static By KycoutRejectioCancelBtn=By.xpath("//u[@class='ng-star-inserted']//following::i[@class='pi pi-times-circle pt-1']");
			//Select Rejection Close Button
			public static By KycOutRejectCloseButton=By.xpath("//u[@class='ng-star-inserted']//preceding::span[@class='pi pi-times']");
			//Retry button for the KYC Outcome
			public static By KycRetry=By.xpath("//td[normalize-space()='KYC Outcome']/..//button[contains(text(),'Retry')]");
			//Add button for the KYC Outcome
			public static By KycAddbtn=By.xpath("(//td[text()='KYC Outcome']//parent::tr/child::td/child::i)[1]");
			//View button for the KYC Outcome
			public static By KycViewbtn=By.xpath("(//td[text()='KYC Outcome']//parent::tr/child::td/child::i)[2]");
			//Kyc Outcome Document View button
			public static By KycDocuMntViewBtn=By.xpath("(//button[contains(text(),'View')])[2]");
			//Kyc outcome Document page close button
			public static By KycDocCloseBtn=By.xpath("(//span[@class='pi pi-times'])[1]");
			//AVS-Outcome Row NAme
			public static By AVSouCmRwname=By.xpath("(//td[normalize-space()='AVS Outcome'])[1]");
			//Approve button for the AVS Outcome
			public static By AVSApprove=By.xpath("//td[normalize-space()='AVS Outcome']/..//button[contains(text(),'Approve')]");
			//Reject button for the AVS Outcome
			public static By AVSRejctbtn=By.xpath("//td[normalize-space()='AVS Outcome']/..//button[contains(text(),'Reject')]");
			
			//Select Reason option header for AVS Outcome
			public static By SlctResonAvsOutcmHeader=By.xpath("//u[@class='ng-star-inserted']");
			//Bank details must belong to customer
			public static By SlctReasonAVSBankDetailschkbox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='20']");
			//Amend Banking Details
			public static By SlctReasonAmendBnkChkbox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='21']");
			//Save Button 
			public static By SaveBtnreason=By.xpath("//u[@class='ng-star-inserted']//following::i[@class='pi pi-save pt-1']");
			//Cancel Button
			public static By CanclBtnsReason=By.xpath("//u[@class='ng-star-inserted']//following::i[@class='pi pi-times-circle pt-1']");
			//Retry button for the AVS Outcome
			public static By AVSRetryBtn=By.xpath("(//button[contains(text(),'Retry')])[3]");
			//Add button for the AVS Outcome
			public static By AVSAddbtn=By.xpath("(//td[text()='AVS Outcome']//parent::tr/child::td/child::i)[1]");
			//View button for the AVS Outcome
			public static By AVSViewbtn=By.xpath("(//td[text()='AVS Outcome']//parent::tr/child::td/child::i)[2]");
			//POI outcome Row NAme
			public static By PoIRowname=By.xpath("(//td[normalize-space()='POI Outcome'])[1]");
			//POI Outcome Approve button
			public static By PoiotcmApproveBtn=By.xpath("//td[normalize-space()='POI Outcome']/..//button[contains(text(),'Approve')]");
			//POI outcome Reject button
			public static By POIReject=By.xpath("//td[normalize-space()='POI Outcome']/..//button[contains(text(),'Reject')]");
			//POI outcome Document View Button
			public static By POIDocViewBtn=By.xpath("//td[normalize-space()='POI Outcome']/..//button[contains(text(),'View')]");
			//POI outcome Document Submit button
			public static By POIDocSubmtButton=By.xpath("//td[normalize-space()='POI Outcome']//following::button[normalize-space()='SUBMIT']");
			
			//POI Outcome-Select Rejection Reason popup Header
			public static By POIPopupheader=By.xpath("//u[@class='ng-star-inserted']");
			//Submit 3 month BS
			public static By POIsubmt3mntchkbox=By.xpath("//u[normalize-space()='POI Outcome']//following::label[contains(text(),'Submit 3 months’ BS')]");
			//Submit 3 month additional BS
			public static By POIAdd3mntChkBox=By.xpath("//u[normalize-space()='POI Outcome']//following::label[contains(text(),'Submit 3 additional months’ BS')]");
			//Submit Payslip chkbox
			public static By POISubmtpayslipChkBx=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='3']");
			//Submit ITA 34 chkbox
			public static By POIITA34ChkBx=By.xpath("//u[normalize-space()='POI Outcome']//following::label[contains(@for,'4')]");
			//Submit pension Letter chkbox
			public static By POIPensnltrChkBox=By.xpath("//u[normalize-space()='POI Outcome']//following::label[contains(@for,'5')]");
			//Submit increase letter
			public static By POISubmtInLtrChkBx=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='6']");
			//Submit latest CIPC Cert ChkBox
			public static By POISubmtCIPCChkBx=By.xpath("//u[normalize-space()='POI Outcome']//following::label[contains(@for,'7')]");
			//Submit latest audited Finsat ChkBx
			public static By POIFinsatChkBox=By.xpath("//u[normalize-space()='POI Outcome']//following::label[contains(@for,'8')]");
			//Amend income details&Resubmit ChkBx
			public static By POIDetResbmtChkBox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='9']");
			//Save Button POI outcome
			public static By POIRechkSaveButn=By.xpath("//u[@class='ng-star-inserted']//following::button[@class='btn btn-success btn-sm ']");
			//POI outcome Add button
			public static By POIAddbtn=By.xpath("//*[@id=\"ui-tabpanel-16\"]/process-agreement/div/table[1]/tbody/tr[4]/td[8]/i[1]");
			//POI outcome View button
			public static By POIViewBtn=By.xpath("//td[contains(text(),'POI Outcome')]/parent::tr/child::td/button[text()='View ']");
			//Salary as a Table Header
			public static By SalaryTH=By.xpath("//b[normalize-space()='Additional Income']//preceding::b[normalize-space()='Salary']");
			//Additional Income as a Table Header
			public static By AddIncomTH=By.xpath("//b[normalize-space()='Salary']//following::b[normalize-space()='Additional Income']");
			//Please Enter Numeric Values Only
			public static By Plzentrnumonly=By.xpath("//div/b[text()='Please enter numeric values only']");
			//Month 1 text place holder
			public static By Month1=By.xpath("//label[@for='Month 1 *']//span[@class='bg-white']");
			//Month 1 Required Icon 
			public static By Month1ReqIcn=By.xpath("//label[@for='Month 1 *']//i[@class='bg-white pointer pi pi-info-circle text-danger ng-star-inserted']");
			//Month 2 text place holder
			public static By month2=By.xpath("//label[@for='Month 2 *']//span[@class='bg-white']");
			//Month 2 Required Icon
			public static By Month2ReqIcn=By.xpath("//label[@for='Month 2 *']//i[@class='bg-white pointer pi pi-info-circle text-danger ng-star-inserted']");
			//Month 3 text place holder
			public static By month3=By.xpath("//label[@for='Month 3 *']//span[@class='bg-white']");
			//Month 3 Required Icon is 
			public static By Month3ReqIcn=By.xpath("//label[@for='Month 3 *']//i[@class='bg-white pointer pi pi-info-circle text-danger ng-star-inserted']");
			//Month4
			public static By Month4=By.xpath("//*[text()='Month 4']");
			//Month5
			public static By Month5=By.xpath("//*[text()='Month 5']");
			//Month6
			public static By Month6=By.xpath("//*[text()='Month 6']");
			//Average field title for the Income TAble
			public static By AverageIncmtable=By.xpath("//td[normalize-space()='Month 6']//following::td[normalize-space()='Average']");
			//Verified Monthly Income
			public static By VerMnthlyIncm=By.xpath("//td[normalize-space()='Average']//following::td[normalize-space()='Verified Monthly Income']");
			//Salary Date 
			public static By SalaryDateTitle=By.xpath("//td[normalize-space()='Verified Monthly Income']//following::td[normalize-space()='Salary Date']");
			//Please Click Save to Save Income Values Message
			public static By SaveIncmMsg=By.xpath("//b[text()='*Please Click Save to Save Income Values']");
			//Month1 Salary field
			public static By Month1slryFld=By.xpath("//input[@id='Month 1 *']");
			//Month2 Salary Field
			public static By Month2slryFld=By.xpath("//input[@id='Month 2 *']");
			//Month3 Salary Field
			public static By Month3SlryFld=By.xpath("//input[@id='Month 3 *']");
			//Month4 Salary Field
			public static By Month4SlryFld=By.xpath("//td[normalize-space()='Month 4']//following::input[@formcontrolname='salMonthFour']");
			//Month5 Salary Field
			public static By Month5SlryFld=By.xpath("//td[normalize-space()='Month 5']//following::input[@formcontrolname='salMonthFive']");
			//Month6 Salary Field
			public static By Month6SlryFld=By.xpath("//td[normalize-space()='Month 6']//following::input[@formcontrolname='salMonthSix']");
			//Monthly AVg Salary
			public static By MonthlyAverage=By.xpath("//input[@id='Average Salary']");
			//Salary Date
			public static By SalaryDate=By.xpath("//select[@ng-reflect-name='salaryDay']");
			//Save Button
			public static By SaveButton=By.xpath("//b[normalize-space()='*Please Click Save to Save Income Values']//following::button[@type='button'][normalize-space()='SAVE']");
			//Table-Checklist header title
			public static By Checklistheadertile=By.xpath("//div/h6/b[text()='Checklist']");
			//Pass column title
			public static By Passtile=By.xpath("//div/h6/b[text()='Checklist']/following::div/h6/b[text()='Pass']");
			//Fail Column title
			public static By Failtile=By.xpath("//div/h6/b[text()='Checklist']/following::div/h6/b[text()='Fail']");
			//N/A Column title
			public static By NAtile=By.xpath("//div/h6/b[text()='Checklist']/following::div/h6/b[text()='N/A']");
			//AML Response Approved checklist title
			public static By Amlchklst=By.xpath("//div/small[contains(text(),'AML response Approved')]");
			
			//Aml PAss
			public static By AMlpss=By.xpath("(//small[text()='AML response Approved']/parent::div)[1]/following-sibling::div/descendant::input");
			
			public static By AMlpss1=By.xpath("//*[@id=\"ui-tabpanel-16\"]/process-agreement/div/div[2]/div[2]/div[3]/div[2]/input");
			
			//Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri) checklist option
			public static By corectdocchklist=By.xpath("//div/small[contains(text(),'Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)')]");
			//Pass- Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri) checklist option
			public static By CrectDocPass=By.xpath("(//small[text()='Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)']/parent::div)[1]/following-sibling::div/descendant::input");
			//Bank Statements received match bank account details captured under additional details in Financier
			public static By BankSttmntChllst=By.xpath("//div/small[contains(text(),'Bank Statements received match bank account details captured under additional details in Financier')]");
			//Bank Statements received match bank account details captured under additional details in Financier checklist option
			public static By BankstaPass=By.xpath("(//small[text()='Bank Statements received match bank account details captured under additional details in Financier']/parent::div)[1]/following-sibling::div/descendant::input");
			//Name & Account number appear on statement 
			public static By NameaccuntNoChklst=By.xpath("//div/small[contains(text(),'Name & Account number appear on statement')]");
			//Name & Account number appear on statement checkbox
			public static By NAmeAccPAss=By.xpath("(//small[text()='Name & Account number appear on statement']/parent::div)[1]/following-sibling::div/descendant::input");
			//UIF correct & Tax reasonability checklist option name
			public static By UIFcrectchklst=By.xpath("//div/small[contains(text(),'UIF correct & Tax reasonability')]");
			//UIF correct & Tax reasonability checklist option name checklist
			public static By UIFChlstPass=By.xpath("(//small[text()='UIF correct & Tax reasonability']/parent::div)[1]/following-sibling::div/descendant::input");
			//Employment Acceptable
			public static By EmpAcptblechlst=By.xpath("//div/small[contains(text(),'Employment acceptable')]");
			//Employment Acceptable checklist pass/fail
			public static By EmpAccptChklstpass=By.xpath("(//small[text()='Employment acceptable']/parent::div)[1]/following-sibling::div/descendant::input");
			//Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail)
			public static By Garneshorderchllst=By.xpath("//div/small[contains(text(),'Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail)')]");
			//Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist pass
			public static By GarnecjklstPass=By.xpath("(//small[text()='Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail)']/parent::div)[1]/following-sibling::div/descendant::input");
			//Two or more unpaid  debit order(other than insurance/investment) checklist column name
			public static By twoormrchcklst=By.xpath("//div/small[contains(text(),'Two or more unpaid  debit order(other than insurance/investment)')]");
			//Two or more unpaid  debit order(other than insurance/investment) checklist pass/fail
			public static By TwoormrChkpass=By.xpath("(//small[text()='Two or more unpaid  debit order(other than insurance/investment)']/parent::div)[1]/following-sibling::div/descendant::input");
			//Multiple providers prepaid airtime
			public static By multiplchecklst=By.xpath("//div/small[contains(text(),'Multiple providers prepaid airtime')]");
			//Multiple providers prepaid airtime checklist pass/fail
			public static By MultpleprvdrChkPass=By.xpath("(//small[text()='Multiple providers prepaid airtime']/parent::div)[1]/following-sibling::div/descendant::input");
			//Profile Building
			public static By prfilbuildChklst=By.xpath("//div/small[contains(text(),'Profile Building')]");
			//Profile Building checklist pass/Fail
			public static By ProfilBuiChklstPass=By.xpath("(//small[text()='Profile Building']/parent::div)[1]/following-sibling::div/descendant::input");
			//Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary)
			public static By Fraudchklst=By.xpath("//div/small[contains(text(),'Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary):')]");
			//Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist pass/fail
			public static By FraudchklstPass=By.xpath("(//small[text()='Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary):']/parent::div)[1]/following-sibling::div/descendant::input");
			//No Debit Order, layout of bank statements
			public static By Nodebitordrchklst=By.xpath("//div/small[contains(text(),'No Debit Order, layout of bank statements')]");
			//No Debit Order, layout of bank statements checklist pass/fail
			public static By NodebiChklstPass=By.xpath("(//small[text()='No Debit Order, layout of bank statements']/parent::div)[1]/following-sibling::div/descendant::input");
			//Please Click Save to Save Checklist
			public static By plzclksavevalmsg=By.xpath("//div/small/b[contains(text(),'*Please Click Save to Save Checklist')]");
			//Activate Auto Refresh button
			public static By ActivateAutoRefreshBtn=By.xpath("//button[normalize-space()='ACTIVATE AUTO-REFRESH']");
			//Save Button
			public static By ChklstSaveBtn=By.xpath("//div/small/b[contains(text(),'*Please Click Save to Save Checklist')]/following::button[text()='SAVE']");
			//Validation Status
			public static By validationStatus = By.xpath("//strong[text()='Validations Statuses:']");
			//POR Outcome Approve btn
			public static By PorApprovebtn=By.xpath("(//button[contains(text(),'Approve')])[8]");
	
			//por outcome Reject btn
			public static By PorRejectBtn=By.xpath("(//button[contains(text(),'Reject')])[7]");
			//Submit Valid Proof of Address CheckBox
			public static By PORRejSubMtAdd=By.xpath("//u[normalize-space()='POR Outcome']//following::label[contains(@for,'41')]");
			//Submit POA Declaration Evidence CheckBox
			public static By PORDeclare=By.xpath("//u[normalize-space()='POR Outcome']//following::label[contains(@for,'42')]");
			//Save Button
			public static By PORSveBtn=By.xpath("//u[normalize-space()='POR Outcome']//following::i[contains(@class,'pi pi-save pt-1')]");
			//CAncel Button
			public static By CnClBtn=By.xpath("//u[normalize-space()='POR Outcome']//following::i[contains(@class,'pi pi-times-circle pt-1')]");
			//POR Outcome Retry btn
			public static By PORRetryBtn=By.xpath("(//button[contains(text(),'Retry')])[11]");
			//POR outcome add button
			public static By PORAddBtn=By.xpath("(//td[text()='POR Outcome']/parent::tr/child::td/child::i)[3]");
			//POR outcome View button
			public static By PORViewBtn=By.xpath("(//td[text()='POR Outcome']/parent::tr/child::td/child::i)[4]");
			//KYC Fraud Outcome Approve Button
			public static By KYCOutcomeApproveBtn=By.xpath("//td[normalize-space()='KYC Fraud Outcome']//following::button[contains(text(),'Approve')][4]");
			//KYC Fraud Outcome Reject Button
			public static By KYCOutcomeRejectbtn=By.xpath("//td[normalize-space()='KYC Fraud Outcome']//following::button[contains(text(),'Reject')][4]");
			//Resubmit ID Copy
			public static By KYCRejectResubMtIdCpy=By.xpath("//u[@class='ng-star-inserted']//following::label[@for='31']");
			//Amend Cust name per ID Doc
			public static By KYCRejectAmendCustperIdDoc=By.xpath("//u[@class='ng-star-inserted']//following::label[@for='32']");
			//Resubmit back front ID Card
			public static By KYCRejectResubmtBckFrntIDCrd=By.xpath("//u[@class='ng-star-inserted']//following::label[@for='33']");
			//Submit Marriage Certificate
			public static By KYCRejectSubMtMrgCertFct=By.xpath("//u[@class='ng-star-inserted']//following::label[@for='34']");
			//Submit Affidivit
			public static By KYCRejectSubMtAffidivit=By.xpath("//u[@class='ng-star-inserted']//following::label[@for='35']");
			//Save Button
			public static By KYCFraudRejectionSaveBtn=By.xpath("//u[@class='ng-star-inserted']//following::i[@class='pi pi-save pt-1']");
			//KYC Fraud Outcome Retry Button
			public static By KYCOutcomeRetryBtn=By.xpath("(//td[text()='KYC Fraud Outcome']/parent::tr/child::td/child::button[text()='Retry'])[2]");
			//KYC Fraud Outcome Add Button
			public static By KYCOutcomeAddbtn=By.xpath("(//td[text()='KYC Fraud Outcome']/parent::tr/child::td/child::i)[3]");
			//KYC Fraud Outcome View Button
			public static By KYCOutcomeViewbtn=By.xpath("(//td[text()='KYC Fraud Outcome']/parent::tr/child::td/child::i)[4]");
			
			//AML- Failed In Proc Status
			public static By AMLFailedInProc=By.xpath("//td[normalize-space()='AML Outcome']//following::b[normalize-space()='FAILED-In-Proc']");
			//AML- SUCCESS-In-Proc Status
			public static By AMLApprvedInProcess=By.xpath("//td[normalize-space()='AML Outcome']//following::b[normalize-space()='SUCCESS-In-Proc']");
			//AML- SUccess-IN-Approved Status
			public static By AMLSucessApproved=By.xpath("//*[@id=\"ui-tabpanel-16\"]/process-agreement/div/table[2]/tbody/tr[7]/td[2]");
			//AML Outcome ADD Button
			public static By AMLOutcomeAddBtn=By.xpath("(//td[text()='AML Outcome']/parent::tr/child::td/child::i)[3]");
			//AML Outcome View Button
			public static By AMLOutcomeViewBtn=By.xpath("(//td[text()='AML Outcome']/parent::tr/child::td/child::i)[4]");
			//AML Retry Button
			public static By AMLRetryButton=By.xpath("//td[normalize-space()='AML Outcome']//following::button[contains(text(),'Retry')][8]");
			//Approve Vals Button
			public static By ApproveValsBtn=By.xpath("//span[contains(text(),'APPROVE VALS')]");
			//Approve Vals-Comment Box
			public static By ApproveValsCommentBox=By.xpath("//textarea[@placeholder='Capture comment']");
			//Save Button
			public static By ApproveCmentSaveBtn=By.xpath("//span[contains(text(),'CONFIRMATION')]/parent::div/following-sibling::div//child::i[@class='pi pi-save pt-1']");
			//Reject Vals Button
			public static By RejectValsBtn=By.xpath("//button[contains(text(),'REJECT VALS')]");
			//Reject VAls-Comment Field
			public static By RejectVAlsCommentBox=By.xpath("//div/div[2]/textarea[@class='form-control ng-untouched ng-pristine ng-valid']");
			//Save Button
			public static By RejectValsSaveBtn=By.xpath("//p-footer/button/i[@class='pi pi-save pt-1']");
			
			//There are no record for page : 1
			public static By ThereNoRecrd=By.xpath("//div/div/b[contains(text(),'There are no record for page : 1')]");
			//Interest Rate
			public static By interestRate=By.xpath("//table/thead/tr/td[contains(text(),'Interest Rate')][1]");
			//Doc Vals Deal in search result
			public static By DocValsDelSerch=By.xpath("(//table[@class='ng-star-inserted']/child::thead/following-sibling::tbody)[1]");
			//Search Result Table
			public static By SrchTable=By.xpath("//div[@class='ui-tabview-panels']/descendant::p-tabpanel/child::div");
			
			
			
			/*
			On the Operationl Portal,
			 Doc Vals Details Screen
			
			*/
	
			public static void DocVals_Landing_PAge() throws Exception
			{
				com.utility.ExtentReporter.HeaderChildNode("TC_008" + "  " + "Verify the UI of the Document Validation Page" + "  " + "TC_009" + "  " + "Verify the functionality of the Document Validation Page" + "  " + "TC_010" + "  "+ "Verify the UI And Functionality of the Document Validation Details Page" + "  " + "TC_011" + "  "+ "Verify the UI of the Validation Status Table" + "  "+ "TC_012" + "  "+ "Verify the functionality of the Validation Status Table" + "  " + "TC_013" + "  " + "Verify the UI of the Salary Details Page" + "  " + "TC_014" + "  " + "Verify the functionality of the salary Details Table" + "  " + "TC_015" + "  "+ "Verify the UI of the Checklist Table" + "  " +"TC_016" + "  "+ "Verify the functionality of the Pass CheckBox in the CheckList Table" + "  " + "TC_017" + "  " + "Verify the functionality of the Fail CheckBox in the CheckList Table" + "  " + "TC_018" + "  " + "Verify the functionality of the N/A CheckBox in the CheckList Table" + "  " + "TC_019" + "  " + "Verify the UI of the POR And KYC Outcome Table" + "  "+ "TC_020" + " " + "Verify the Functionality of the POR And KYC Outcome Table");
				Utilities.JSClick(DocValsSdMnu, "Document Validations Side-Menu");
				Utilities.fullScreen();
				Utilities.verifyElementPresent(SelctTemplateFldHeader, "Select Template field header");
				Utilities.verifyElementPresent(MAnualRefreshOption, "Manual Refresh Option");
				Utilities.click(hamburgericon, "Hamburger Icon");
				Utilities.verifyElementPresent(SINo, "SI No Column Name");
				Utilities.verifyElementPresent(AgrNo, "Agreement No Column name");
				Utilities.verifyElementPresent(custoName, "Customer NAme Column name");
				Utilities.verifyElementPresent(IDNo, "ID Number Column Name");
				Utilities.verifyElementPresent(DMSStatus, "DMS Status Column Name");
				Utilities.verifyElementPresent(DlrNAme, "Dealer NAme as a Column Name");
				
				
				Utilities.verifyElementPresent(FiDetails, "FI Details as a Column Name");
				Utilities.verifyElementPresent(ValsReqDate, "Vals Requested Date as a Column Name");
				Utilities.verifyElementPresent(CustoType, "Customer Type as a Column Name");
				Utilities.verifyElementPresent(RiskBand, "Risk BAnd as a Column Name");
				Utilities.verifyElementPresent(TeamName, "Team Name as a Column NAme");
				Utilities.verifyElementPresent(LAstDocUplded, "LAst Doc Uploaded as a Column Name");
				Utilities.verifyElementPresent(QuoteDate, "Quote Date as a Column Name");
				Utilities.verifyElementPresent(LockedBy, "Locked By as a Column Name");
				Utilities.verifyElementPresent(ResubmitCunt, "Resubmit Count as a Column NAme");
				Utilities.verifyElementPresent(BucketName, "Bucket Name as a Column Name");
			
				Utilities.verifyElementPresent(searchIcon, "Search Icon");

				int retrysearch=30;
				for(int i=1;i<=retrysearch;i++)
				{
					Utilities.clearField(SearchFld, "Search Bar");
					Utilities.type(SearchFld, "2000007606", "Search Bar");
					Utilities.JSClick(SearchIcons, "Search Icon");
					
					 Utilities.waitTime(10000);
					 
					//List<WebElement> FullTable = Utilities.findElements(SrchTable);
					String FullTable= Utilities.getText(SrchTable);
					//System.out.println("The list of elements are "+FullTable);
					
					if (FullTable.contains("There are no record for page : 1"))
					{
						Utilities.clearField(SearchFld, "Search Bar");
						 Utilities.type(SearchFld, "2000007606", "Search Bar");
						 Utilities.JSClick(SearchIcons, "Search Icon");
						 logger.info("The Deal Not Found");
						
					}
					else
					{
						logger.info("The Deal found");
						 Utilities.click(DocValsDelSerch, "Deal from the Search Result");
						 break; 
					}
						
					}
					 
					/* try
					 {
						 Utilities.findElement(TotalRecords).isDisplayed();
							 logger.info("The Deal found");
							 Utilities.click(DocValsDelSerch, "Deal from the Search Result");
							 break;
						 
					}
					 catch (Exception e) 
					 {
						 Utilities.clearField(SearchFld, "Search Bar");
						 Utilities.type(SearchFld, "2000007617", "Search Bar");
						 Utilities.JSClick(SearchIcons, "Search Icon");
						 logger.info("The Deal Not Found");
					 }
					}*/
					 
					 
					
						/* agremnt=Utilities.getTextb(ThereNoRecrd);
		            if (agremnt.equalsIgnoreCase("There are no record for page : 1"))
					 {
						 Utilities.clearField(SearchFld, "Search Bar");
						 Utilities.type(SearchFld, "2000007603", "Search Bar");
						 Utilities.JSClick(SearchIcons, "Search Icon");
						 logger.info("The Deal Not Found");
						
					 }
					 else
					 {
						 Utilities.click(DocValsDelSerch, "Deal from the Search Result");
						 interst=Utilities.getTextb(interestRate);
						 System.out.println(interst.equalsIgnoreCase("Interest Rate"));
						 logger.info("The Deal found");
						 break;
					 }*/
				

			   
				Utilities.waitTime(2000);
				Utilities.ScrollToTheElement(POIAddbtn);		
				Utilities.verifyElementPresent(SalaryTH, "Salary as a Table Header");			
				Utilities.verifyElementPresent(AddIncomTH, "Additional Income as a Table Header");			
				Utilities.verifyElementPresent(Plzentrnumonly, "Please Enter Numeric Values Only text message");
				Utilities.waitTime(1000);
				Utilities.clearField(Month1slryFld, "Month1 text place holder");
				Utilities.verifyElementPresent(Month1, "Month1 text place holder");			
				//Utilities.verifyElementPresent(Month1ReqIcn, "Month 1 Star Required Icon ");
				Utilities.waitTime(1000);
				Utilities.clearField(Month2slryFld, "Month2 text place holder");
				Utilities.verifyElementPresent(month2, "Month 2 text place holder");			
				//Utilities.verifyElementPresent(Month2ReqIcn, "Month 2 Star Required Icon ");
				Utilities.waitTime(1000);
				Utilities.clearField(Month3SlryFld, "Month3 text place holder");
				Utilities.verifyElementPresent(month3, "Month 3 text place holder");		
				//Utilities.verifyElementPresent(Month3ReqIcn, "Month 3 Star Required Icon ");				
					
				Utilities.waitTime(2000);		
				String netSalary=ExcelFunctions.getCellValue(Seritixlpath, "TestDataOLD", 2, 30);
				Integer net=Integer.valueOf(netSalary);
				System.out.println(net);
				int monthsalary=net/12;
				System.out.println("THe Monthly Salary IS" +monthsalary);
				logger.info("THe Monthly Salary IS"+monthsalary);
				String monthlysalry=String.valueOf(monthsalary);
				com.utility.ExtentReporter.extentLoggerPass(monthlysalry, "Monthly Salary");
				Utilities.JSClick(Month1slryFld, "Month1 Salary Field");
				Utilities.clearField(Month1slryFld, "Month1 Salary Field");
				Utilities.type(Month1slryFld, monthlysalry, "Month1 Salary Field");	
				Utilities.clearField(Month2slryFld, "Month2 Salary Field");
				Utilities.JSClick(Month2slryFld, "Month2 Salary Field");
				Utilities.type(Month2slryFld, monthlysalry, "Month2 Salary Field");	
				
				Utilities.clearField(Month3SlryFld, "Month3 Salary Field");
				Utilities.JSClick(Month3SlryFld, "Month3 Salary Field");
				Utilities.type(Month3SlryFld, monthlysalry, "Month3 Salary Field");	
				String MonthlyavgSly=Utilities.getText(MonthlyAverage);
				logger.info(MonthlyavgSly);
				Utilities.extentLoggerPass("The Average of the Monthly Salary is", MonthlyavgSly);
				Utilities.click(SalaryDate, "Salary Date");
				Utilities.selectByValue(SalaryDate, "3");
				Utilities.click(SalaryDate, "Salary Date");
				
				Utilities.waitTime(2000);
				Utilities.JSClick(SaveButton, "Save Button");
				
				
				/*
				Checklist Table
				*/
				
				Utilities.waitTime(2000);
				CheckList_Table_Pass();
				
				
				/*
				AVS and POI outcome Table
				*/
				
				AVSandPOI_Outcome();
			
				//Salary table save button
				//Utilities.ScrollToTheElement(SaveButton);
				//Utilities.JSClick(SaveButton, "Salary Table Save Button");
				
				//Checklist Table Save button
				//Utilities.JSClick(ChklstSaveBtn, "CheckList Save Button");
				
				/*
				 * //POR and KYC Outcome TAble
				 */	
				Utilities.waitTime(3000);
				Utilities.ScrollToTheElement(SaveButton);
				PORandKYCOutcome_TAble();		
			}
		
			/*
			
			The Checklist Table in the Doc Vals Details Screen.
			
			*/
			public static void CheckList_Table_Pass() throws Exception
			{			
				Utilities.waitTime(2000);
				Utilities.verifyElementPresent(Checklistheadertile, "Checklist table header");			
				Utilities.verifyElementPresent(Passtile, "THe Pass as a column name in the checklist table");			
				Utilities.verifyElementPresent(Failtile, "THe Fail as a column name in the checklist table");			
				Utilities.verifyElementPresent(NAtile, "THe N/A as a column name in the checklist table");		
				Utilities.verifyElementPresent(Amlchklst, "AML Response Approved checklist column option");			
				Utilities.verifyElementPresent(corectdocchklist, "Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option");			
				Utilities.verifyElementPresent(BankSttmntChllst, "Bank Statements received match bank account details captured under additional details in Financier Checklist column option");		
				Utilities.verifyElementPresent(NameaccuntNoChklst, "Name & Account number appear on statement checklist column option ");		
				Utilities.verifyElementPresent(UIFcrectchklst, "UIF correct & Tax reasonability checklist column option");	
				Utilities.verifyElementPresent(EmpAcptblechlst, "Employment Acceptable column option");		
				Utilities.verifyElementPresent(Garneshorderchllst, "Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option");	
				Utilities.verifyElementPresent(twoormrchcklst, "Two or more unpaid  debit order(other than insurance/investment) checklist column name");
				Utilities.verifyElementPresent(multiplchecklst, "Multiple providers prepaid airtime checklist column option");	
				Utilities.verifyElementPresent(prfilbuildChklst, "Profile Building checklist column option");			
				Utilities.verifyElementPresent(Fraudchklst, "Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option");			
				Utilities.verifyElementPresent(Nodebitordrchklst, "No Debit Order, layout of bank statements checklsit column option");			
				Utilities.verifyElementPresent(plzclksavevalmsg, "Please Click Save to Save Checklist validation message");			
				Utilities.verifyElementPresent(ChklstSaveBtn, "Save Button on the Checklist Table");
				
				String CheckList=ExcelFunctions.testData.get("AML response Approved");
				System.out.println("The Reader IS"+ CheckList);
				Utilities.waitTime(2000);
				if (CheckList.equalsIgnoreCase("Pass")) {
				//List<WebElement> ele = Utilities.staleexception_Click(AMlpss);
					
					Utilities.waitForElementInVisible(AMlpss, 10, "pass");
					
					List<WebElement> AMLChk = Utilities.findElements(AMlpss);
					AMLChk.get(0).click();
		
					//Utilities.click(AMlpss1, "Pass checkbox");
					logger.info("Clicked on the AML Response Approved pass Checkbox");
					  com.utility.ExtentReporter.extentLoggerPass("AML Response Approved",  "Clicked on the AML Response Approved Pass CheckBox");									
					}
				else if (CheckList.equalsIgnoreCase("Fail")) 
				{
					Utilities.waitForElementInVisible(AMlpss, 10, "Fail");
					List<WebElement> AMLChk = Utilities.findElements(AMlpss);
					AMLChk.get(1).click();
					
					//Utilities.click(AMlpss, "Fail Checkbox");
					logger.info("Clicked on the AML Response Approved Fail Checkbox");
					  com.utility.ExtentReporter.extentLoggerPass("AML Response Approved",  "Clicked on the AML Response Approved Fail CheckBox");				
				}
				else if (CheckList.equalsIgnoreCase("N/A")) {
					Utilities.waitForElementInVisible(AMlpss, 10, "NA");
					List<WebElement> AMLChk = Utilities.findElements(AMlpss);
					AMLChk.get(2).click();
					//Utilities.click(AMlpss, "N/A Checkbox");
					logger.info("Clicked on the AML Response Approved N/A Checkbox");
					  com.utility.ExtentReporter.extentLoggerPass("AML Response Approved",  "Clicked on the AML Response Approved N/A CheckBox");
				}	 
				String CorrectDocCheckList=ExcelFunctions.testData.get("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)");
				if (CorrectDocCheckList.equalsIgnoreCase("Pass"))
				{
					List<WebElement> cred = Utilities.findElements(CrectDocPass);
					cred.get(0).click();
					logger.
					  info("Clicked on the Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option pass Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option"
					  , "Clicked on the Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri) Pass CheckBox");	
				}
				else if (CorrectDocCheckList.equalsIgnoreCase("Fail")) {
					List<WebElement> cred = Utilities.findElements(CrectDocPass);
					cred.get(1).click();				
					logger.
					  info("Clicked on the Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option Fail Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option"
					  , "Clicked on the Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri) Fail CheckBox");
				}			
				else if (CorrectDocCheckList.equalsIgnoreCase("N/A")) {
					List<WebElement> cred = Utilities.findElements(CrectDocPass);
					cred.get(2).click();				
					logger.
					  info("Clicked on the Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option N/A Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option"
					  , "Clicked on the Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri) N/A CheckBox");
				}
				String Bankstarecived=ExcelFunctions.testData.get("Bank Statements received match bank account details captured under additional details in Financier");
	
				if (Bankstarecived.equalsIgnoreCase("pass")) {
					List<WebElement> bnk = Utilities.findElements(BankstaPass);
					bnk.get(0).click();
					 logger.
					  info("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Pass Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Pass Checkbox"
					  , "Clicked on the Bank Statements received match bank account details captured under additional details in Financier Pass CheckBox");				
				}
				else if (Bankstarecived.equalsIgnoreCase("Fail")) {
					List<WebElement> bnk = Utilities.findElements(BankstaPass);
					bnk.get(1).click();				
					 logger.
					  info("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Fail Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Pass Checkbox"
					  , "Clicked on the Bank Statements received match bank account details captured under additional details in Financier Fail CheckBox");
				}
				else if (Bankstarecived.equalsIgnoreCase("N/A")) {
					List<WebElement> bnk = Utilities.findElements(BankstaPass);
					bnk.get(2).click();				
					 logger.
					  info("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option N/A Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option N/A Checkbox"
					  , "Clicked on the Bank Statements received match bank account details captured under additional details in Financier N/A CheckBox");
				}
				
				String NAmeandAccunts=ExcelFunctions.testData.get("Name & Account number appear on statement");
				if (NAmeandAccunts.equalsIgnoreCase("pass")) {
					List<WebElement> bnk = Utilities.findElements(NAmeAccPAss);
					bnk.get(0).click();
					logger.
					  info("Clicked on the Name & Account number appear on statement checklist column option Pass Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Pass Checkbox"
					  , "Clicked on the Name & Account number appear on statement Pass CheckBox");
				}
				else if (NAmeandAccunts.equalsIgnoreCase("Fail")) {
					List<WebElement> bnk = Utilities.findElements(NAmeAccPAss);
					bnk.get(1).click();				
					logger.
					  info("Clicked on the Name & Account number appear on statement checklist column option Fail Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Fail Checkbox"
					  , "Clicked on the Name & Account number appear on statement Fail CheckBox");
				}
				else if (NAmeandAccunts.equalsIgnoreCase("N/A")) {
					List<WebElement> bnk = Utilities.findElements(NAmeAccPAss);
					bnk.get(2).click();				
					logger.
					  info("Clicked on the Name & Account number appear on statement checklist column option N/A Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Pass Checkbox"
					  , "Clicked on the Name & Account number appear on statement N/A CheckBox");
				}	
				String UIFCrect=ExcelFunctions.testData.get("UIF correct & Tax reasonability");
				
				if (UIFCrect.equalsIgnoreCase("pass")) {
					List<WebElement> bnk = Utilities.findElements(UIFChlstPass);
					bnk.get(0).click();				
					logger.
					  info("Clicked on the UIF correct & Tax reasonability checklist column option Pass Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Pass Checkbox"
					  , "Clicked on the Name & Account number appear on statement Pass CheckBox");				
				}
				else if (NAmeandAccunts.equalsIgnoreCase("Fail")) {
					List<WebElement> bnk = Utilities.findElements(UIFChlstPass);
					bnk.get(1).click();				
					logger.
					  info("Clicked on the UIF correct & Tax reasonability checklist column option Fail Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Fail Checkbox"
					  , "Clicked on the Name & Account number appear on statement Fail CheckBox");
				}
				else if (NAmeandAccunts.equalsIgnoreCase("N/A")) {
					List<WebElement> bnk = Utilities.findElements(UIFChlstPass);
					bnk.get(2).click();
					
					logger.
					  info("Clicked on the UIF correct & Tax reasonability checklist column option N/A Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option N/A Checkbox"
					  , "Clicked on the the Name & Account number appear on statement N/A CheckBox");
				}
				
				String garneshing=ExcelFunctions.testData.get("Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail)");
				
				if (garneshing.equalsIgnoreCase("pass")) {
					List<WebElement> bnk = Utilities.findElements(GarnecjklstPass);
					bnk.get(0).click();				
					logger.
					  info("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Pass Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Pass Checkbox"
					  , "Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) Pass CheckBox");
				}
				else if (garneshing.equalsIgnoreCase("Fail")) {
					List<WebElement> bnk = Utilities.findElements(GarnecjklstPass);
					bnk.get(1).click();
					
					logger.
					  info("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Fail Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Fail Checkbox"
					  , "Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) Fail CheckBox");
				}
				else if (garneshing.equalsIgnoreCase("N/A")) {
					List<WebElement> bnk = Utilities.findElements(GarnecjklstPass);
					bnk.get(2).click();				
					logger.
					  info("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option N/A Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option N/A Checkbox"
					  , "Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) N/A CheckBox");
				}			
				String EmpAcctble=ExcelFunctions.testData.get("Employment acceptable");
					
					if (EmpAcctble.equalsIgnoreCase("pass")) {
						List<WebElement> bnk = Utilities.findElements(EmpAccptChklstpass);
						bnk.get(0).click();
						
						logger.
						  info("Clicked on the Employment Acceptable checklist column option Pass Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Employment Acceptable checklist column option Pass Checkbox"
						  , "Clicked on the Employment Acceptable Pass CheckBox");
					}
					else if (EmpAcctble.equalsIgnoreCase("Fail")) {
						List<WebElement> bnk = Utilities.findElements(EmpAccptChklstpass);
						bnk.get(1).click();
					logger.
						  info("Clicked on the Employment Acceptable checklist column option Fail Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Employment Acceptable checklist column option Fail Checkbox"
						  , "Clicked on the Employment Acceptable Fail CheckBox");
					}
					else if (EmpAcctble.equalsIgnoreCase("N/A")) {
						List<WebElement> bnk = Utilities.findElements(EmpAccptChklstpass);
						bnk.get(2).click();
						logger.
						  info("Clicked on the Employment Acceptable checklist column option NA Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Employment Acceptable checklist column option NA Checkbox"
						  , "Clicked on the the Employment Acceptable NA CheckBox");
					}
				
					String TwoorMr=ExcelFunctions.testData.get("Two or more unpaid  debit order(other than insurance/investment)");
						
						if (TwoorMr.equalsIgnoreCase("pass")) {
							List<WebElement> bnk = Utilities.findElements(TwoormrChkpass);
							bnk.get(0).click();						
							logger.
							  info("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Pass Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Pass Checkbox"
							  , "Clicked on the Two or more unpaid  debit order(other than insurance/investment) Pass CheckBox");
						}
						else if (TwoorMr.equalsIgnoreCase("Fail")) {
							List<WebElement> bnk = Utilities.findElements(TwoormrChkpass);
							bnk.get(1).click();						
							logger.
							  info("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Fail Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Fail Checkbox"
							  , "Clicked on the Two or more unpaid  debit order(other than insurance/investment) Fail CheckBox");
						}
						else if (TwoorMr.equalsIgnoreCase("N/A")) {
							List<WebElement> bnk = Utilities.findElements(TwoormrChkpass);
							bnk.get(2).click();					
							logger.
							  info("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option N/A Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option N/A Checkbox"
							  , "Clicked on the the Two or more unpaid  debit order(other than insurance/investment) N/A CheckBox");
						}					
						String Multiprvdr=ExcelFunctions.testData.get("Multiple providers prepaid airtime");
						
						if (Multiprvdr.equalsIgnoreCase("pass")) {
							List<WebElement> bnk = Utilities.findElements(MultpleprvdrChkPass);
							bnk.get(0).click();						
							logger.
							  info("Clicked on the Multiple providers prepaid airtime checklist column option Pass Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Multiple providers prepaid airtime checklist column option Pass Checkbox"
							  , "Clicked on the Multiple providers prepaid airtime Pass CheckBox");
						}
						else if (Multiprvdr.equalsIgnoreCase("Fail")) {
							List<WebElement> bnk = Utilities.findElements(MultpleprvdrChkPass);
							bnk.get(1).click();
							logger.
							  info("Clicked on the Multiple providers prepaid airtime checklist column option Fail Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Multiple providers prepaid airtime checklist column option Fail Checkbox"
							  , "Clicked on the Multiple providers prepaid airtime Fail CheckBox");
						}
						else if (Multiprvdr.equalsIgnoreCase("N/A")) {
							List<WebElement> bnk = Utilities.findElements(MultpleprvdrChkPass);
							bnk.get(2).click();
							logger.
							  info("Clicked on the Multiple providers prepaid airtime checklist column option N/A Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Multiple providers prepaid airtime checklist column option N/A Checkbox"
							  , "Clicked on the Multiple providers prepaid airtime N/A CheckBox");
						}						
						String prflebuldng=ExcelFunctions.testData.get("Profile Building");
	
						if (prflebuldng.equalsIgnoreCase("pass")) {
							List<WebElement> bnk = Utilities.findElements(ProfilBuiChklstPass);
							bnk.get(0).click();						
							logger.
							  info("Clicked on the Profile Building checklist column option Pass Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Profile Building checklist column option Pass Checkbox"
							  , "Clicked on the Profile Building checklist Pass CheckBox");
						}
						else if (prflebuldng.equalsIgnoreCase("Fail")) {
							List<WebElement> bnk = Utilities.findElements(ProfilBuiChklstPass);
							bnk.get(1).click();						
							logger.
							  info("Clicked on the Profile Building checklist column option Fail Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Profile Building checklist column option Fail Checkbox"
							  , "Clicked on the Profile Building checklist Fail CheckBox");
						}
						else if (prflebuldng.equalsIgnoreCase("N/A")) {
							List<WebElement> bnk = Utilities.findElements(ProfilBuiChklstPass);
							bnk.get(2).click();						
							logger.
							  info("Clicked on the Profile Building checklist column option N/A Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Profile Building checklist column option N/A Checkbox"
							  , "Clicked on the Profile Building checklist N/A CheckBox");
						}			
						String FrudChk=ExcelFunctions.testData.get("Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary):");
	
							if (FrudChk.equalsIgnoreCase("pass")) {
								List<WebElement> bnk = Utilities.findElements(FraudchklstPass);
								bnk.get(0).click();							
								logger.
								  info("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Pass Checkbox"
								  ); com.utility.ExtentReporter.
								  extentLoggerPass("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Pass Checkbox"
								  , "Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) Pass CheckBox");
							}
							else if (FrudChk.equalsIgnoreCase("Fail")) {
								List<WebElement> bnk = Utilities.findElements(FraudchklstPass);
								bnk.get(1).click();
								
								logger.
								  info("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Fail Checkbox"
								  ); com.utility.ExtentReporter.
								  extentLoggerPass("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Fail Checkbox"
								  , "Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) Fail CheckBox");
							}
							else if (FrudChk.equalsIgnoreCase("N/A")) {
								List<WebElement> bnk = Utilities.findElements(FraudchklstPass);
								bnk.get(2).click();							
								logger.
								  info("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option N/A Checkbox"
								  ); com.utility.ExtentReporter.
								  extentLoggerPass("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option N/A Checkbox"
								  , "Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) N/A CheckBox");
							}	
							String Nodebtodr=ExcelFunctions.testData.get("No Debit Order, layout of bank statements");
	
							if (Nodebtodr.equalsIgnoreCase("pass")) {
								List<WebElement> bnk = Utilities.findElements(NodebiChklstPass);
								bnk.get(0).click();							
								logger.
								  info("Clicked on the No Debit Order, layout of bank statements checklist column option Pass Checkbox"
								  ); com.utility.ExtentReporter.
								  extentLoggerPass("Clicked on the No Debit Order, layout of bank statements checklist column option Pass Checkbox"
								  , "Clicked on the No Debit Order, layout of bank statements checklist Pass CheckBox");
							}
							else if (Nodebtodr.equalsIgnoreCase("Fail")) {
								List<WebElement> bnk = Utilities.findElements(NodebiChklstPass);
								bnk.get(1).click();							
								logger.
								  info("Clicked on the No Debit Order, layout of bank statements checklist column option Fail Checkbox"
								  ); com.utility.ExtentReporter.
								  extentLoggerPass("Clicked on the No Debit Order, layout of bank statements checklist column option Fail Checkbox"
								  , "Clicked on the No Debit Order, layout of bank statements Fail CheckBox");
							}
							else if (Nodebtodr.equalsIgnoreCase("N/A")) {
								List<WebElement> bnk = Utilities.findElements(NodebiChklstPass);
								bnk.get(2).click();							
								logger.info("Clicked on the No Debit Order, layout of bank statements checklist column option N/A Checkbox"
								  ); com.utility.ExtentReporter.
								  extentLoggerPass("Clicked on the No Debit Order, layout of bank statements checklist column option N/A Checkbox"
								  , "Clicked on the No Debit Order, layout of bank statements checklist column option N/A Checkbox N/A CheckBox");
							}	
							Utilities.waitTime(2000);
							Utilities.JSClick(ChklstSaveBtn, "CheckList Save Button");
							
	}
	
	           /*
	
	            The Proof of Residence(POR) and the KYC Fraud outcome,
	
	               */
			
			public static void PORandKYCOutcome_TAble() throws Exception
			{
				Utilities.verifyElementPresent(PorApprovebtn, "POR Outcome Approve Button");
				softassert.assertEquals(PorApprovebtn, "APPROVE", "POR Outcome Approve Button is verified");
				
				Utilities.verifyElementPresent(PorRejectBtn, "POR Outcome Reject Button");
				softassert.assertEquals(PorRejectBtn, "REJECT", "POR Outcome Reject Button is verified");
				
				Utilities.verifyElementPresent(PORRetryBtn, "POR Outcome Retry Button");
				softassert.assertEquals(PORRetryBtn, "RETRY", "POR Outcome RETRY Button is verified");
				
				Utilities.verifyElementPresent(PORViewBtn, "POR Outcome View Button");			
				Utilities.verifyElementPresent(KYCOutcomeApproveBtn, "KYC Fraud Outcome Approve Button");			
				Utilities.verifyElementPresent(KYCOutcomeRetryBtn, "KYC Fraud Outcome Retry Button");			
				Utilities.verifyElementPresent(KYCOutcomeRejectbtn, "KYC Fraud Outcome Reject Button");			
				Utilities.verifyElementPresent(KYCOutcomeAddbtn, "KYC Fraud Outcome Add Button");			
				Utilities.verifyElementPresent(KYCOutcomeViewbtn, "KYC Fraud Outcome View Button");			
				Utilities.verifyElementPresent(AMLRetryButton, "AML Outcome Retry Button");			
				Utilities.verifyElementPresent(AMLOutcomeAddBtn, "AML Outcome Add Button");			
				Utilities.verifyElementPresent(AMLOutcomeViewBtn, "AML Outcome View Button");
				Utilities.verifyElementPresent(PORAddBtn, "POR Outcome Add Button");
				Utilities.verifyElementPresent(PORViewBtn, "POR Outcome View Button");
							
				Utilities.verifyElementPresent(ApproveValsBtn, "Approve Vals Button");			
				Utilities.verifyElementPresent(RejectValsBtn, "Reject Vals Button");	
				
				
				String POROutCmTabl=ExcelFunctions.testData.get("POR Outcome");
				if (POROutCmTabl.equalsIgnoreCase("Approve")) 
				{
					Utilities.JSClick(PorApprovebtn, "POR Outcome Approve button");
				String	porOuStatus=Utilities.getText(POROutcomeStatus);
				logger.info("POR Outcome Status is"+ "  " +porOuStatus);
				com.utility.ExtentReporter.extentLogger("The POR Outcome Status is", porOuStatus);
				softassert.assertEquals(porOuStatus, "SUCCESS");
					
				}
				else if (POROutCmTabl.equalsIgnoreCase("Reject")) 
				{
					Utilities.JSClick(PorRejectBtn, "por outcome Reject btn");
					
					String PorRejCtRsn=ExcelFunctions.testData.get("Submit valid proof of address");
					if (PorRejCtRsn.equalsIgnoreCase("Click"))
					{
						Utilities.click(PORRejSubMtAdd, "Submit Valid Proof of Address CheckBox");					
					}
					String PorRejDclr=ExcelFunctions.testData.get("Submit POA declarationEvidence");
					if (PorRejDclr.equalsIgnoreCase("Click")) 
					{
						Utilities.click(PORDeclare, "Submit POA Declaration Evidence CheckBox");
						
					}
					
					Utilities.JSClick(PORSveBtn, "POR OUTcome Rejection Reason option screen Save Button");
					String porOuStatus=Utilities.getText(POROutcomeStatus);
					logger.info("POR Outcome Status is"+ "" +porOuStatus);
					com.utility.ExtentReporter.extentLogger("The POR Outcome Status is", porOuStatus);
					softassert.assertEquals(porOuStatus, "FAILED");
					
				}
				else if (POROutCmTabl.equalsIgnoreCase("Retry"))
				{
					Utilities.JSClick(PORRetryBtn, "POR Outcome Retry Button");
					String	porOuStatus=Utilities.getText(POROutcomeStatus);
					logger.info("POR Outcome Status is"+ "" +porOuStatus);
					com.utility.ExtentReporter.extentLogger("The POR Outcome Status is", porOuStatus);
					
				}

				String KycFraudOutCm=ExcelFunctions.testData.get("KYC Fraud Outcome");
				if (KycFraudOutCm.equalsIgnoreCase("Approve")) 
				{
					Utilities.JSClick(KYCOutcomeApproveBtn, "KYC Fraud Outcome Approve Button");
					String	KYCFrudOutCmStatus=Utilities.getText(KycFraudStatus);
					logger.info("KYC Fraud Outcome Status is"+ "" +KYCFrudOutCmStatus);
					com.utility.ExtentReporter.extentLogger("The KYC Fraud Outcome Status is", KYCFrudOutCmStatus);
					softassert.assertEquals(KYCFrudOutCmStatus, "SUCCESS");
				}
				/*else if (KycFraudOutCm.equalsIgnoreCase("Reject")) 
					{
						Utilities.JSClick(KYCOutcomeRejectbtn, "KYC Fraud Outcome Reject Button");
						String ResubmitIDCPy=ExcelFunctions.testData.get("Resubmit ID Copy");
						if (ResubmitIDCPy.equalsIgnoreCase("click")) 
							{
								Utilities.JSClick(KYCRejectResubMtIdCpy, "Resubmit ID Copy CheckBox");
							}
						
						String AmendCustPrID=ExcelFunctions.testData.get("Amend cust name per ID doc");
						if (AmendCustPrID.equalsIgnoreCase("click")) 
							{
								Utilities.JSClick(KYCRejectAmendCustperIdDoc, "Amend Cust name per ID Doc CheckBox");
							}
						
						String ResubMtBckFrntIDCrd=ExcelFunctions.testData.get("Resubmit back/front of ID Card");
						if (ResubMtBckFrntIDCrd.equalsIgnoreCase("click")) 
							{
								Utilities.JSClick(KYCRejectResubmtBckFrntIDCrd, "Resubmit back front ID Card CheckBox");
							}
						
						String SubMtMrgCertiFicate=ExcelFunctions.testData.get("Submit marriage certificate");
						if (SubMtMrgCertiFicate.equalsIgnoreCase("click")) 
							{
								Utilities.JSClick(KYCRejectSubMtMrgCertFct, "Submit Marriage Certificate CheckBox");
							}
						
						String SubMtAffidavit=ExcelFunctions.testData.get("Submit affidavit - tempID/PPT");
						if (SubMtAffidavit.equalsIgnoreCase("click")) 
							{
								Utilities.JSClick(KYCRejectSubMtAffidivit, "Submit Affidavit CheckBox");
							}
						
						Utilities.JSClick(KYCFraudRejectionSaveBtn, "Save Button");
						
						String	KYCFrudOutCmStatus=Utilities.getText(KycFraudStatus);
						logger.info("POR Outcome Status is"+ "" +KYCFrudOutCmStatus);
						com.utility.ExtentReporter.extentLogger("The KYC Fraud Outcome Status is", KYCFrudOutCmStatus);
					}*/
				
				else if (KycFraudOutCm.equalsIgnoreCase("Retry")) 
					{
						Utilities.JSClick(KYCOutcomeRetryBtn, "KYC OUTCOME Retry Button");
						String	KYCFrudOutCmStatus=Utilities.getText(KycFraudStatus);
						logger.info("POR Outcome Status is"+ "  " +KYCFrudOutCmStatus);
						com.utility.ExtentReporter.extentLogger("The KYC Fraud Outcome Status is", KYCFrudOutCmStatus);
						
					}
				/*
				
				AML Outcome- Financier Portal to hack the process.
				
				*/
				/*Utilities.robotNewTab();
				Thread.sleep(7000);
				Utilities.switch_To_Child_Tab("https://web.financier.uat-mqf.co.za/LogOn?ReturnUrl=%2fCustomer");
				
			Utilities.window_Set_size();
				Financier.Financier_Login();
				Financier.Financier_Search();
				Financier.Finacier_AML_Outcome();  
		
				Utilities.switch_To_Parent_Tab();
				
				Utilities.ScrollToTheElement(ApproveValsBtn);
				
				System.out.println("Again Controls come to the doc Vals Page");
				int ClickRetryBtn=10;
				for(int i=1;i<=ClickRetryBtn;i++)
					{
						AMLSuccessApproved=Utilities.getText(AMLOutcomeStatus);
						System.out.println("The AML Outcome Present Status Is "+AMLSuccessApproved);
						
							if (AMLSuccessApproved.equals("SUCCESS-APPROVED"))
							{
								break;
							}
					
						     else	
						     {
						    	 Utilities.waitTime(30000);
									Utilities.click(AMLRetryButton, "AML Retry Button");	
								
							 }
					}*/
				
						String FinalApprove_ApproveVals=ExcelFunctions.testData.get("Approve Vals");
						if (FinalApprove_ApproveVals.equalsIgnoreCase("Click"))
								{
							   
							Utilities.NewTabToChild();
							Utilities.switch_To_Child_Tab("https://web.financier.uat-mqf.co.za/LogOn?ReturnUrl=%2fCustomer");
							
						    Utilities.window_Set_size();
							Financier.Financier_Login();
							Financier.Financier_Search();
							Financier.Finacier_AML_Outcome();  
					
							Utilities.ChildTabToParent();
							
							Utilities.ScrollToTheElement(ApproveValsBtn);
							
							
							int ClickRetryBtn=30;
							for(int i=1;i<=ClickRetryBtn;i++)
								{
									AMLSuccessApproved=Utilities.getText(AMLOutcomeStatus);
									System.out.println("The AML Outcome Present Status Is "+AMLSuccessApproved);
									
										if (AMLSuccessApproved.equals("SUCCESS-APPROVED"))
										{
											break;
										}
								
									     else	
									     {
									    	 Utilities.waitTime(10000);
												Utilities.click(AMLRetryButton, "AML Retry Button");	
											
										 }
								}
					
							
									Utilities.JSClick(ApproveValsBtn, "Approve Vals Button");
									Utilities.type(ApproveValsCommentBox, "Successfully Validate all the Docs", "Approve Vals Comment Field");
									Utilities.click(ApproveCmentSaveBtn, "Save Button");
									
								}
						
						
						String FinalApprove_RejectVals=ExcelFunctions.testData.get("Reject Vals");
						if (FinalApprove_RejectVals.equalsIgnoreCase("Click")) 
						{
							Utilities.JSClick(RejectValsBtn, "Reject Vals Button");
							Utilities.type(RejectVAlsCommentBox, "Operational Team Rejected the Deal", "Reject VAls Comment Box");
							Utilities.click(RejectValsSaveBtn, "Save Button");
						}   
						
					}
				
			
				/*
				 * 
				 * AVS and POI Outcome from the Validation Statuses Table
				 * 
				 * 
				 */		
			
			public static void AVSandPOI_Outcome() throws Exception
			{
				
				 Utilities.waitTime(10000);
				 Utilities.ScrollToTheElement(ActivateAutoRefreshBtn);
					
					
					Utilities.verifyElementPresent(thirtydaypaychk, "30-Day Payout Check row name");
					Utilities.verifyElementPresent(thirtyDayApprove, "30-Day Payout check- Approve Button ");
					Utilities.verifyElementPresent(ThirtydayRetry, "30-Day Payout check- Retry Button ");
					Utilities.verifyElementPresent(Addthirtydaypaychk, "Add option for the 30-Day Payout check- Retry Button ");
					Utilities.verifyElementPresent(Viewthirtdaypayouchk, "View option for the 30-Day Payout check- Retry Button");
					Utilities.verifyElementPresent(Kycoucm, "KYC-Outcome Row name");
					Utilities.verifyElementPresent(KycoutmApprove, "Approve button for the KYC Outcome");
					Utilities.verifyElementPresent(KYCReject, "Reject button for the KYC Outcome");
					Utilities.verifyElementPresent(KycRetry, "Retry button for the KYC Outcome");
					Utilities.verifyElementPresent(KycAddbtn, "Add button for the KYC Outcome");
					Utilities.verifyElementPresent(KycViewbtn, "View button for the KYC Outcome");
					Utilities.verifyElementPresent(AVSouCmRwname, "AVS-Outcome Row NAme");
					Utilities.verifyElementPresent(AVSApprove, "Approve button for the AVS Outcome");
					Utilities.verifyElementPresent(AVSRejctbtn, "Reject button for the AVS Outcome");
					Utilities.verifyElementPresent(AVSRetryBtn, "Retry button for the AVS Outcome");
					Utilities.verifyElementPresent(AVSAddbtn, "Add button for the AVS Outcome");
					Utilities.verifyElementPresent(AVSViewbtn, "View button for the AVS Outcome");
					Utilities.verifyElementPresent(PoIRowname, "POI outcome Row NAme");
					Utilities.verifyElementPresent(PoiotcmApproveBtn, "POI Outcome Approve button");
					Utilities.verifyElementPresent(POIReject, "POI outcome Reject button");
					Utilities.verifyElementPresent(POIAddbtn, "POI outcome Add button");			
					Utilities.verifyElementPresent(POIViewBtn, "POI outcome View button");
								
	
				//Utilities.ScrollToTheElement(validationStatus);
				String ThirtyDayPayoutChkApprove=ExcelFunctions.testData.get("30- Day Pay Out Check");
				if (ThirtyDayPayoutChkApprove.equalsIgnoreCase("Approve"))
				{
			
					Utilities.JSClick(thirtyDayApprove, "30-Day PAy Out Check Approve Button");
					Utilities.waitTime(3000);
					
					
					String Thirtystatus=Utilities.getText(ThirtyStatus);
					
					
					logger.info("The Thiry Day Payout Check Status is"+Thirtystatus);
					com.utility.ExtentReporter.extentLogger("The Satus Column status IS", Thirtystatus);
					softassert.assertEquals(Thirtystatus, "SUCCESS");
				}
				else if (ThirtyDayPayoutChkApprove.equalsIgnoreCase("Retry"))
				{
					Utilities.JSClick(ThirtydayRetry, "Thirty Day Pay Out Check Retry Button");
					String Thirtystatus=Utilities.getText(ThirtyStatus);
					logger.info("The Thiry Day Payout Check Status is"+Thirtystatus);
					com.utility.ExtentReporter.extentLogger("The Satus Column status IS", Thirtystatus);
					}
				
				String KYCOutcomeTabl=ExcelFunctions.testData.get("KYC Outcome");
				System.out.println(KYCOutcomeTabl);
				if (KYCOutcomeTabl.equalsIgnoreCase("Approve"))
					{
						//Utilities.JSClick(KycoutmApprove, "KYC Outcome Approve Button");
						Utilities.JSClick(KycDocuMntViewBtn, "KYC Outcome Document View Button");
						Utilities.waitTime(2000);
						Utilities.JSClick(KycDocCloseBtn, "Kyc Outcome Document Close button");
						Utilities.waitForElementAndClickIfPresent(KycoutmApprove, 10, "KYC Outcome Approve Button");
						
					String KycOutcm=Utilities.getText(KycOutcomeStatus);
					logger.info("KYC OUTCOME The Status is"+KycOutcm);
					com.utility.ExtentReporter.extentLoggerPass("KYC OUTCOME The Status is", KycOutcm);
					softassert.assertEquals(KycOutcm, "SUCCESS");
					
					}
				    else if (KYCOutcomeTabl.equalsIgnoreCase("Reject"))
				      {	
					Utilities.JSClick(KYCReject, "KYC Outcome Reject Button");
					
					String KycoutRejctReasons_ResubmitID=ExcelFunctions.testData.get("Resubmit ID Copy-k");
					if (KycoutRejctReasons_ResubmitID.equalsIgnoreCase("Click"))
						{
							Utilities.JSClick(KycRejctResubmitcopychkbox, "Resubmit ID Copy CheckBox");
							
						}
					String KycouAmendcustiddc=ExcelFunctions.testData.get("Amend cust name per ID doc-k");
					if (KycouAmendcustiddc.equalsIgnoreCase("Click"))
						{
							Utilities.JSClick(KycRejectAmendcustCheckbox, "Amend cust name per ID doc CheckBox");
							
						}
					String KycResubmtBckfrnt=ExcelFunctions.testData.get("Resubmit back/front of ID Card-k");
					if (KycResubmtBckfrnt.equalsIgnoreCase("Click"))
						{
							Utilities.JSClick(KycBackfronCheckbox, "Resubmit back/front of ID Card CheckBox");
							
						}
					String KycSubMarriage=ExcelFunctions.testData.get("Submit marriage certificate-k");
					if (KycSubMarriage.equalsIgnoreCase("Click"))
						{
							Utilities.JSClick(KycSubmtMarriageCheckBox, "Submit marriage certificate CheckBox");
							
						}
					String SubmtIdtmp=ExcelFunctions.testData.get("Submit affidavit - tempID/PPT-k");
					if (SubmtIdtmp.equalsIgnoreCase("Click"))
						{
							Utilities.JSClick(SumtAfdivitCheckBox, "Submit affidavit - tempID/PPT CheckBox");
							
						}
					Utilities.JSClick(KycoutRejectSavebtn, "Kyc Oucome Select Rejecttion result Save button");
					Utilities.waitTime(3000);
					String KycOutcm=Utilities.getText(KycOutcomeStatus);
				
					logger.info("The KYC Outcome Status is"+KycOutcm);
					com.utility.ExtentReporter.extentLoggerPass("KYC OUTCOME The Status is", KycOutcm);
							softassert.assertEquals(KycOutcm, "FAILED");
				}
				else if (KYCOutcomeTabl.equalsIgnoreCase("Retry"))
					{
						Utilities.JSClick(KycRetry, "KYC Outcome Retry Button");
						Utilities.waitTime(3000);
						String KycOutcm=Utilities.getText(KycOutcomeStatus);
						logger.info("The Thiry Day Payout Check Status is"+KycOutcm);
						com.utility.ExtentReporter.extentLoggerPass("KYC OUTCOME The Status is", KycOutcm);
						
					}
	
				
	
		String AVsoucmTabl=ExcelFunctions.testData.get("AVS Outcome");
		if (AVsoucmTabl.equalsIgnoreCase("Approve"))
		{
			Utilities.waitTime(2000);
			//Utilities.JSClick(AVSApprove, "AVS Approve Button");
			Utilities.waitForElementAndClick(AVSApprove, 10, "AVS Approve Button");
			Utilities.waitTime(2000);
			String AVSOutCMStaus=Utilities.getText(AVSOutcomeStatus);
			
			logger.info("The AVSOutocme Status is"+AVSOutCMStaus);
			com.utility.ExtentReporter.extentLoggerPass("The AVS OUTCOME The Status is", AVSOutCMStaus);
			softassert.assertEquals(AVSOutCMStaus, "SUCCESS");
		}
		else if (AVsoucmTabl.equalsIgnoreCase("Reject"))
		{
			Utilities.waitTime(2000);
			Utilities.waitForElementAndClick(AVSRejctbtn, 10, "Reject button for the AVS Outcome");
			Utilities.JSClick(AVSRejctbtn, "Reject button for the AVS Outcome");
			Utilities.waitTime(2000);
			//Utilities.JSClick(AvsRejectBtnSec, "Reject button for the AVS Outcome");
			
			String AVSBankdetBlngToCust=ExcelFunctions.testData.get("BankDetails must belong toCust");
			if (AVSBankdetBlngToCust.equalsIgnoreCase("Click"))
			{
				Utilities.JSClick(SlctReasonAVSBankDetailschkbox, "Bank details must belong to customer CheckBox");
				
			}
			
			String AVSAmendBnkChk=ExcelFunctions.testData.get("Amend banking details");
			if (AVSAmendBnkChk.equalsIgnoreCase("Click"))
			{
				Utilities.JSClick(SlctReasonAmendBnkChkbox, "Amend Banking Details CheckBox");
			}
			
	        Utilities.JSClick(SaveBtnreason, "AVS Oucome Select Rejecttion result Save button");
			Utilities.waitTime(3000);
			String AVSOutCMStaus=Utilities.getText(AVSOutcomeStatus);
		
			logger.info("The AVSOutocme Status is"+AVSOutCMStaus);
			com.utility.ExtentReporter.extentLoggerPass("The AVS OUTCOME The Status is", AVSOutCMStaus);
			softassert.assertEquals(AVSOutCMStaus, "FAILED");
		}
		else if (AVsoucmTabl.equalsIgnoreCase("Retry")) 
		{
			Utilities.JSClick(AVSRetryBtn, "Retry button for the AVS Outcome");
			Utilities.waitTime(3000);
			String AVSOutCMStaus=Utilities.getText(AVSOutcomeStatus);
			logger.info("The AVSOutocme Status is"+AVSOutCMStaus);
			com.utility.ExtentReporter.extentLoggerPass("The AVS OUTCOME The Status is", AVSOutCMStaus);
		}
		
		String POIOutCmTable=ExcelFunctions.testData.get("POI Outcome");
		if (POIOutCmTable.equalsIgnoreCase("Approve"))
		{
			POIOutCmStatus=Utilities.getText(POIOutcomeStatus);
			int Retrysuccess=10;
			for(int i=1;i<=Retrysuccess;i++)
				{
					if(POIOutCmStatus.equals("SUCCESS"))
					{
						break;
					}
					else
					{
						Utilities.waitTime(3000);
						Utilities.JSClick(PoiotcmApproveBtn, "POI Outcome Approve Button");
					}
				}
			
			logger.info("The POI Outocme Status is"+POIOutCmStatus);
			com.utility.ExtentReporter.extentLoggerPass("The POI OUTCOME The Status is", POIOutCmStatus);
			softassert.assertEquals(POIOutCmStatus, "SUCCESS");
			
		}
		else if (POIOutCmTable.equalsIgnoreCase("Reject"))
		{
			Utilities.JSClick(POIReject, "POI Outcome Reject button");
			Utilities.waitTime(3000);
			//Utilities.waitForElementAndClickIfPresent(POIReject, 10, "POI Outcome Reject button");
			
			String SubMt3Mnt=ExcelFunctions.testData.get("Submit 3 months’ BS");
			if (SubMt3Mnt.equalsIgnoreCase("Click"))
				{
					Utilities.click(POIsubmt3mntchkbox, "Submit 3 months’ BS CheckBox");
					Utilities.waitTime(1000);
					
				}
			String SubMt3AddChkBx=ExcelFunctions.testData.get("Submit 3 additional months’ BS");
			if (SubMt3AddChkBx.equalsIgnoreCase("Click"))
				{
					Utilities.click(POIAdd3mntChkBox, " Submit 3 additional months’ BS");
					Utilities.waitTime(1000);
				}
			String SuMtPAySlp=ExcelFunctions.testData.get("Submit payslip");
			if (SuMtPAySlp.equalsIgnoreCase("Click"))
				{
					Utilities.click(POISubmtpayslipChkBx, " Submit payslip CheckBox");
					Utilities.waitTime(1000);
				}
			
			String ITA34ChBx=ExcelFunctions.testData.get("Submit ITA34");
			if (ITA34ChBx.equalsIgnoreCase("Click"))
				{
					Utilities.click(POIITA34ChkBx, "Submit ITA34 CheckBox");
					Utilities.waitTime(1000);
				}
			
			String SubMtPensionLtr=ExcelFunctions.testData.get("Submit pension letter");
			if (SubMtPensionLtr.equalsIgnoreCase("Click"))
				{
					Utilities.click(POIPensnltrChkBox, "Submit pension letter CheckBox");
					Utilities.waitTime(1000);
				}
			String SuMtIncrLt=ExcelFunctions.testData.get("Submit increase letter");
			if (SuMtIncrLt.equalsIgnoreCase("Click"))
				{
					Utilities.click(POISubmtInLtrChkBx, "Submit increase letter CheckBox");
					Utilities.waitTime(1000);
				}
			String SubCIPC=ExcelFunctions.testData.get("Submit latest CIPC cert.");
			if (SubCIPC.equalsIgnoreCase("Click"))
				{
					Utilities.click(POISubmtCIPCChkBx, " Submit latest CIPC cert. CheckBox");
					Utilities.waitTime(1000);
				}
			String AuditDFinSat=ExcelFunctions.testData.get("Submit latest audited FinStat.");
			if (AuditDFinSat.equalsIgnoreCase("Click"))
				{
					Utilities.click(POIFinsatChkBox, "Submit latest audited FinStat. CheckBox");
				}
			String AmeNdIcmDe=ExcelFunctions.testData.get("Amend income details &resubmit");
			if (AmeNdIcmDe.equalsIgnoreCase("Click"))
				{
					Utilities.JSClick(POIDetResbmtChkBox, " Amend income details &resubmit CheckBox");					
				}
			Utilities.waitTime(5000);
			Utilities.JSClick(POIRechkSaveButn, "POI Oucome Select Rejecttion result Save button");
			Utilities.waitTime(3000);
			String POIOutCmStatus=Utilities.getText(POIOutcomeStatus);
		
			logger.info("The POI Outocme Status is"+POIOutCmStatus);
			com.utility.ExtentReporter.extentLoggerPass("The POI OUTCOME The Status is", POIOutCmStatus);
			softassert.assertEquals(POIOutCmStatus, "FAILED");
			softassert.assertAll();
			
		     }
		
			}
			}
			
			
			
	
	
