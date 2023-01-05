package com.marquis.webPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.excel.ExcelFunctions;
import com.utility.LoggingUtils;
import com.utility.Utilities;

public class DocVals 
{
	
	static LoggingUtils logger = new LoggingUtils();

	static ExcelFunctions xcl = new ExcelFunctions();

	public static String ExcelPath = "./XLSX/Operational PortalDataForm.xlsx";

	static SoftAssert softassert = new SoftAssert();

	public SoftAssert softAssert = new SoftAssert();

	public static String xlpath = "Marquis/XLSX/Operational PortalDataForm.xlsx";
	
	public static String Seritixlpath = "./XLSX/MarquisDataForm.xlsx";
	
	
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

		/*
		Table Column Name
		
		*/
		
		//SI No 
		public static By SINo=By.xpath("//th[1]//div[1]//div[1]");
		
		//Agreement Number
		public static By AgrNo=By.xpath("//th[2]//div[1]//div[1]");
		
		
		//Customer Name
		public static By custoName=By.xpath("//th[3]//div[1]//div[1]");
		
		
		//ID Number
		public static By IDNo=By.xpath("//th[4]//div[1]//div[1]");
		
		
		//DMS Status
		public static By DMSStatus=By.xpath("//th[5]//div[1]//div[1]");
		
		//Dealer NAme
		public static By DlrNAme=By.xpath("//th[6]//div[1]//div[1]");
		
		//FI NAme
		public static By FIName=By.xpath("//th[7]//div[1]//div[1]");
		
		//FI Email
		public static By FIEmail=By.xpath("//th[8]//div[1]//div[1]");
		
		//FI Number
		public static By FiNumber=By.xpath("//th[9]//div[1]//div[1]");
		
		//VAls Requested Date
		public static By ValsReqDate=By.xpath("//th[10]//div[1]//div[1]");
		
		//Customer Type
		public static By CustoType=By.xpath("//th[11]//div[1]//div[1]");
		
		//Risk Band
		public static By RiskBand=By.xpath("//th[12]//div[1]//div[1]");
		
		//TEam Name
		public static By TeamName=By.xpath("//th[13]//div[1]//div[1]");
		
		//Last Doc Uploaded
		public static By LAstDocUplded=By.xpath("//th[14]//div[1]//div[1]");
		
		//Quote Date
		public static By QuoteDate=By.xpath("//th[15]//div[1]//div[1]");
		
		//Locked By
		public static By LockedBy=By.xpath("//th[16]//div[1]//div[1]");
		
		//Resubmit Count
		public static By ResubmitCunt=By.xpath("//th[17]//div[1]//div[1]");
		
		//Bucket Name
		public static By BucketName=By.xpath("//th[18]//div[1]//div[1]");
		
		
		//Previous Option
		public static By Prevus=By.xpath("(//span[@class='ng-star-inserted'])[1]");
		
		//Next Option
		public static By NxtPgnation=By.xpath("//a[@aria-label='Next page']");
		
		//Select Template
		public static By SelctTmplate=By.xpath("//select[@ng-reflect-name='filterBy']");
		
		//Search Icon
		public static By searchIcon=By.xpath("//button[@class='btn btn-primary ng-star-inserted']//i[@class='pi pi-search']");
		
		//Esther ID number
		public static By EstherIDno=By.xpath("//td[normalize-space()='7001045002087']");
		
		//Document validation Details
		public static By DocDetails=By.xpath("//b[normalize-space()=\"Document Validations Details\"]");
		
		//30-Day Payout check
		public static By thirtydaypaychk=By.xpath("//td[text()=\" 30-day pay out check \"]");
		
		//30-Day Payout check- Approve Button 
		public static By thirtyDayApprove=By.xpath("//td[normalize-space()='30-day pay out check']/..//button[contains(text(),'Approve')]");
		
		public static By thirtdayapprovebtn=By.xpath("//button[contains(text(),'Approve')]");
		
		//status
		public static By Status=By.xpath("//button[contains(text(),'Approve')]/parent::td/preceding-sibling::td/descendant::b");
		
		//30-Day Payout check- Retry Button 
		public static By ThirtydayRetry=By.xpath("//td[normalize-space()='30-day pay out check']/..//button[contains(text(),'Retry')]");
		
		//Add option for the 30-Day Payout check- Retry Button 
		public static By Addthirtydaypaychk=By.xpath("//td[normalize-space()='30-day pay out check']/..//u[contains(text(),'Add')]");
		
		//View option for the 30-Day Payout check- Retry Button
		public static By Viewthirtdaypayouchk=By.xpath("//td[normalize-space()='30-day pay out check']/..//u[contains(text(),'View')]");
		
		//KYC-Outcome Row name
		public static By Kycoucm=By.xpath("(//td[normalize-space()='KYC Outcome'])[1]");
		
		
		//Approve button for the KYC Outcome
		public static By KycoutmApprove=By.xpath("//td[normalize-space()='KYC Outcome']/..//button[contains(text(),'Approve')]");
		
		//Reject button for the KYC Outcome
		public static By KYCReject=By.xpath("//td[normalize-space()='KYC Outcome']/..//button[contains(text(),'Reject')]");
		
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
		public static By KycAddbtn=By.xpath("//td[normalize-space()='KYC Outcome']/..//u[contains(text(),'Add')]");
		
		//View button for the KYC Outcome
		public static By KycViewbtn=By.xpath("(//u[contains(text(),'View')])[2]");
		
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
		public static By AVSRetryBtn=By.xpath("//td[normalize-space()='AVS Outcome']/..//button[contains(text(),'Retry')]");
		
		//Add button for the AVS Outcome
		public static By AVSAddbtn=By.xpath("//td[normalize-space()='AVS Outcome']/..//u[contains(text(),'Add')]");
		
		//View button for the AVS Outcome
		public static By AVSViewbtn=By.xpath("(//u[contains(text(),'View')])[4]");
		
		//POI outcome Row NAme
		public static By PoIRowname=By.xpath("(//td[normalize-space()='POI Outcome'])[1]");
		
		//POI Outcome Approve button
		public static By PoiotcmApproveBtn=By.xpath("//td[normalize-space()='POI Outcome']/..//button[contains(text(),'Approve')]");
		
		//POI outcome Reject button
		public static By POIReject=By.xpath("//td[normalize-space()='POI Outcome']/..//button[contains(text(),'Reject')]");
		
		//POI Outcome-Select Rejection Reason popup Header
		public static By POIPopupheader=By.xpath("//u[@class='ng-star-inserted']");
		
		//Submit 3 month BS
		public static By POIsubmt3mntchkbox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='1']");
		
		//Submit 3 month additional BS
		public static By POIAdd3mntChkBox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='2']");
		
		//Submit Payslip chkbox
		public static By POISubmtpayslipChkBx=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='3']");
		
		//Submit ITA 34 chkbox
		public static By POIITA34ChkBx=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='4']");
		
		//Submit pension Letter chkbox
		public static By POIPensnltrChkBox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='5']");
		
		//Submit increase letter
		public static By POISubmtInLtrChkBx=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='6']");
		
		//Submit latest CIPC Cert ChkBox
		public static By POISubmtCIPCChkBx=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='7']");
		
		//Submit latest audited Finsat ChkBx
		public static By POIFinsatChkBox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='8']");
		
		//Amend income details&Resubmit ChkBx
		public static By POIDetResbmtChkBox=By.xpath("//u[@class='ng-star-inserted']//following::input[@id='9']");
		
		//Save Button POI outcome
		public static By POIRechkSaveButn=By.xpath("//u[@class='ng-star-inserted']//following::button[@class='btn btn-success btn-sm ']");
		
		
		//POI outcome Add button
		public static By POIAddbtn=By.xpath("//td[normalize-space()='POI Outcome']/..//u[contains(text(),'Add')]");
		
		//POI outcome View button
		public static By POIViewBtn=By.xpath("(//u[contains(text(),'View')])[6]");
		
		//Salary as a Table Header
		public static By SalaryTH=By.xpath("//th[normalize-space()='Additional Income']//preceding::th[normalize-space()='Salary']");
		
		//Additional Income as a Table Header
		public static By AddIncomTH=By.xpath("//th[normalize-space()='Salary']//following::th[normalize-space()='Additional Income']");
		
		//Please Enter Numeric Values Only
		public static By Plzentrnumonly=By.xpath("//tr/td[text()=' Please enter numeric values only ']");
		
		//Month 1 field title
		public static By Month1=By.xpath("//*[text()=' Month 1 ']");
		
		//Month 1 Star Required Icon 
		public static By Month1ReqIcn=By.xpath("(//label[contains(text(),'*')])[1]");
		
		//Month 2 
		public static By month2=By.xpath("//*[text()='Month 2 ']");
		
		//Month 2 Star Required Icon
		public static By Month2ReqIcn=By.xpath("(//label[contains(text(),'*')])[2]");
		
		//Month 3
		public static By month3=By.xpath("//*[text()='Month 3 ']");
		
		//Month 3 Star Required Icon is 
		public static By Month3ReqIcn=By.xpath("(//label[contains(text(),'*')])[3]");
		
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
		public static By Month1slryFld=By.xpath("//*[text()=' Month 1 ']/following-sibling::td/descendant::input[@formcontrolname='salMonthOne']");
		
		//Month2 Salary Field
		public static By Month2slryFld=By.xpath("//*[text()='Month 2 ']/following-sibling::td/descendant::input[@formcontrolname='salMonthTwo']");
		
		//Month3 Salary Field
		public static By Month3SlryFld=By.xpath("//*[text()='Month 3 ']/following-sibling::td/descendant::input[@formcontrolname='salMonthThree']");
		
		//Month4 Salary Field
		public static By Month4SlryFld=By.xpath("//td[normalize-space()='Month 4']//following::input[@formcontrolname='salMonthFour']");
		
		//Month5 Salary Field
		public static By Month5SlryFld=By.xpath("//td[normalize-space()='Month 5']//following::input[@formcontrolname='salMonthFive']");
		
		//Month6 Salary Field
		public static By Month6SlryFld=By.xpath("//td[normalize-space()='Month 6']//following::input[@formcontrolname='salMonthSix']");
		
		
		//Monthly AVg Salary
		public static By MonthlyAverage=By.xpath("//td[text()=' Average ']/following-sibling::td/descendant::span");
		
		//Salary Date
		public static By SalaryDate=By.xpath("//td[text()=' Salary Date ']/following-sibling::td/descendant::input[@formcontrolname='salaryDay']");
		
		//Save Button
		public static By SaveButton=By.xpath("//b[normalize-space()='*Please Click Save to Save Income Values']//following::button[@type='button'][normalize-space()='SAVE']");
		
		//Table-Checklist header title
		public static By Checklistheadertile=By.xpath("//table/thead/tr/th[text()='Checklist']");
		
		//Pass column title
		public static By Passtile=By.xpath("//table/thead/tr/th[text()='Checklist']/following-sibling::th[text()='Pass']");
		
		//Fail Column title
		public static By Failtile=By.xpath("//table/thead/tr/th[text()='Checklist']/following-sibling::th[text()='Fail']");
		
		//N/A Column title
		public static By NAtile=By.xpath("//table/thead/tr/th[text()='Checklist']/following-sibling::th[text()='N/A']");
		
		//AML Response Approved checklist title
		public static By Amlchklst=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'AML')]");
		
		//AML Response Approved Pass
		public static By AMLPass=By.xpath("//span[text()='AML response Approved']/parent::td/following-sibling::td/descendant::input");
		
		//Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri) checklist option
		public static By corectdocchklist=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)')]");
		
		//Pass- Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri) checklist option
		public static By CrectDocPass=By.xpath("//span[text()='Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)']/parent::td/following-sibling::td/descendant::input");
		
		//Bank Statements received match bank account details captured under additional details in Financier
		public static By BankSttmntChllst=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'Bank Statements received match bank account details captured under additional details in Financier')]");
		
		//Bank Statements received match bank account details captured under additional details in Financier checklist option
		public static By BankstaPass=By.xpath("//span[text()='Bank Statements received match bank account details captured under additional details in Financier']/parent::td/following-sibling::td/descendant::input");
		
		//Name & Account number appear on statement 
		public static By NameaccuntNoChklst=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'Name & Account number appear on statement')]");
		
		//Name & Account number appear on statement checkbox
		public static By NAmeAccPAss=By.xpath("//span[text()='Name & Account number appear on statement']/parent::td/following-sibling::td/descendant::input");
		
		//UIF correct & Tax reasonability checklist option name
		public static By UIFcrectchklst=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'UIF correct & Tax reasonability')]");
		
		//UIF correct & Tax reasonability checklist option name checklist
		public static By UIFChlstPass=By.xpath("//span[text()='UIF correct & Tax reasonability']/parent::td/following-sibling::td/descendant::input");
		
		//Employment Acceptable
		public static By EmpAcptblechlst=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'Employment acceptable')]");
		
		//Employment Acceptable checklist pass/fail
		public static By EmpAccptChklstpass=By.xpath("//span[text()='Employment acceptable']/parent::td/following-sibling::td/descendant::input");
		
		//Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail)
		public static By Garneshorderchllst=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail)')]");
		
		//Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist pass
		public static By GarnecjklstPass=By.xpath("//span[text()='Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail)']/parent::td/following-sibling::td/descendant::input");
		
		//Two or more unpaid  debit order(other than insurance/investment) checklist column name
		public static By twoormrchcklst=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'Two or more unpaid  debit order(other than insurance/investment)')]");
		
		//Two or more unpaid  debit order(other than insurance/investment) checklist pass/fail
		public static By TwoormrChkpass=By.xpath("//span[text()='Two or more unpaid  debit order(other than insurance/investment)']/parent::td/following-sibling::td/descendant::input");
		
		//Multiple providers prepaid airtime
		public static By multiplchecklst=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'Multiple providers prepaid airtime')]");
		
		//Multiple providers prepaid airtime checklist pass/fail
		public static By MultpleprvdrChkPass=By.xpath("//span[text()='Multiple providers prepaid airtime']/parent::td/following-sibling::td/descendant::input");
		
		//Profile Building
		public static By prfilbuildChklst=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'Profile Building')]");
		
		//Profile Building checklist pass/Fail
		public static By ProfilBuiChklstPass=By.xpath("//span[text()='Profile Building']/parent::td/following-sibling::td/descendant::input");
		
		//Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary)
		public static By Fraudchklst=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary):')]");
		
		//Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist pass/fail
		public static By FraudchklstPass=By.xpath("//span[text()='Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary):']/parent::td/following-sibling::td/descendant::input");
		
		//No Debit Order, layout of bank statements
		public static By Nodebitordrchklst=By.xpath("//table/thead/tr/th[text()='Checklist']/ancestor::thead/following-sibling::tbody/descendant::span[contains(text(),'No Debit Order, layout of bank statements')]");
		
		//No Debit Order, layout of bank statements checklist pass/fail
		public static By NodebiChklstPass=By.xpath("//span[text()='No Debit Order, layout of bank statements']/parent::td/following-sibling::td/descendant::input");
		
		//Please Click Save to Save Checklist
		public static By plzclksavevalmsg=By.xpath("//div/small/b[contains(text(),'*Please Click Save to Save Checklist')]");
		
		//Save Button
		public static By ChklstSaveBtn=By.xpath("//div/small/b[contains(text(),'*Please Click Save to Save Checklist')]/following::button[text()='SAVE']");
		
		//Validation Status
		public static By validationStatus = By.xpath("//strong[text()='Validations Statuses:']");
		
		
		
		//POR Outcome Approve btn
		public static By PorApprovebtn=By.xpath("//td[normalize-space()='POR Outcome']/..//button[contains(text(),'Approve')]");
		
		//por outcome Reject btn
		public static By PorRejectBtn=By.xpath("//td[normalize-space()='POR Outcome']/..//button[contains(text(),'Reject')]");
		
		//POR Outcome Retry btn
		public static By PORRetryBtn=By.xpath("//td[normalize-space()='POR Outcome']/..//button[contains(text(),'Retry')]");
		
		//POR outcome add button
		public static By PORAddBtn=By.xpath("//td[normalize-space()='POR Outcome']/..//u[contains(text(),'Add')]");
		
		//POR outcome View button
		public static By PORViewBtn=By.xpath("//td[normalize-space()='POR Outcome']/..//u[contains(text(),'View')]");
		
		//KYC Fraud Outcome Approve Button
		public static By KYCOutcomeApproveBtn=By.xpath("//td[normalize-space()='KYC Fraud Outcome']//following::button[contains(text(),'Approve')]");
		
		//KYC Fraud Outcome Reject Button
		public static By KYCOutcomeRejectbtn=By.xpath("//td[normalize-space()='KYC Fraud Outcome']//following::button[contains(text(),'Reject')]");
		
		//KYC Fraud Outcome Retry Button
		public static By KYCOutcomeRetryBtn=By.xpath("//td[normalize-space()='KYC Fraud Outcome']/..//button[contains(text(),'Retry')]");
		
		//KYC Fraud Outcome Add Button
		public static By KYCOutcomeAddbtn=By.xpath("//td[normalize-space()='KYC Fraud Outcome']/..//u[contains(text(),'Add')]");
		
		//KYC Fraud Outcome View Button
		public static By KYCOutcomeViewbtn=By.xpath("//td[normalize-space()='KYC Fraud Outcome']/..//u[contains(text(),'View')][1]");
		
		
		//AML Outcome Retry Button
		public static By AMLOutcomeRetryBtn=By.xpath("//td[normalize-space()='AML Outcome']//following::button[contains(text(),'Retry')]");
		
		//AML Outcome ADD Button
		public static By AMLOutcomeAddBtn=By.xpath("//td[normalize-space()='AML Outcome']//following::u[contains(text(),'Add')]");
		
		//AML Outcome View Button
		public static By AMLOutcomeViewBtn=By.xpath("//td[normalize-space()='AML Outcome']/..//u[contains(text(),'View')]");
		
		//View Others Documents hyperlink
		public static By ViewOthrDocmnthyprlnk=By.xpath("//span[@ptooltip='You need to have all processes approved and need to make sure all check list items are complete. Inorder to see this button enable.']//preceding::a[normalize-space()='View Other documents']");
		
		//You need to have all processes approved and need to make sure all check list items are complete suggestion message
		public static By FinalSubmissionMSG=By.xpath("//span[@ptooltip='You need to have all processes approved and need to make sure all check list items are complete. Inorder to see this button enable.']//preceding::th[@class='text-center text-danger']");
		
		//Approve Vals Button
		public static By ApproveValsBtn=By.xpath("//button[normalize-space()='REJECT VALS']//preceding::span[contains(@ptooltip,'You need to have all processes approved and need to make sure all check list items are complete. Inorder to see this button enable.')]");
		
		//Reject Vals Button
		public static By RejectValsBtn=By.xpath("//span[@ptooltip='You need to have all processes approved and need to make sure all check list items are complete. Inorder to see this button enable.']//following::button[normalize-space()='REJECT VALS']");
		
		/*
		Doc Vals Details PAge
		
		*/
		
		
		public static void DocVals_Landing_PAge() throws Exception
		{
		
			com.utility.ExtentReporter.HeaderChildNode("Document Validation: TC_008");
			Utilities.JSClick(DocValsSdMnu, "Document Validations Side-Menu");
			Utilities.verifyElementPresent(SelctTemplateFldHeader, "Select Template field header");
			
			Utilities.verifyElementPresent(MAnualRefreshOption, "Manual Refresh Option");
			
			Utilities.verifyElementPresent(SINo, "SI No Column Name");
			
			Utilities.verifyElementPresent(AgrNo, "Agreement No Column name");
			
			Utilities.verifyElementPresent(custoName, "Customer NAme Column name");
			
			Utilities.verifyElementPresent(IDNo, "ID Number Column Name");
			
			Utilities.verifyElementPresent(DMSStatus, "DMS Status Column Name");
			
			Utilities.verifyElementPresent(DlrNAme, "Dealer NAme as a Column Name");
			
			Utilities.verifyElementPresent(FIName, "FI NAme As a Column Name");
			
			Utilities.verifyElementPresent(FIEmail, "FI Email as a Column Name");
			
			Utilities.verifyElementPresent(FiNumber, "FI Number as a Column Name");
			
			Utilities.verifyElementPresent(ValsReqDate, "Vals Requested Date as a Column Name");
			
			Utilities.verifyElementPresent(CustoType, "Customer Type as a Column Name");
			
			Utilities.verifyElementPresent(RiskBand, "Risk BAnd as a Column Name");
			
			Utilities.verifyElementPresent(TeamName, "Team Name as a Column NAme");
			
			Utilities.verifyElementPresent(LAstDocUplded, "LAst Doc Uploaded as a Column Name");
			
			Utilities.verifyElementPresent(QuoteDate, "Quote Date as a Column Name");
			
			Utilities.verifyElementPresent(LockedBy, "Locked By as a Column Name");
			
			Utilities.verifyElementPresent(ResubmitCunt, "Resubmit Count as a Column NAme");
			
			Utilities.verifyElementPresent(BucketName, "Bucket Name as a Column Name");
			
			
			Utilities.verifyElementPresent(Prevus, "Previous Pagination Option");
			
			Utilities.verifyElementPresent(NxtPgnation, "Next Option in Pagination");
			
			//Utilities.JSClick(SelctTmplate, "Select Template");
			//Utilities.selectByVisibleTextByLocator(SelctTmplate, "agreementNumber");
			
			Utilities.verifyElementPresent(searchIcon, "Search Icon");
			
			Utilities.type(SearchFld, "2000007234", "Search Bar");
			Utilities.click(SearchIcons, "Search Icon");
			
		Utilities.waitTime(2000);
			Utilities.JSClick(EstherIDno, "Esther ID No");
			
			
			Utilities.verifyElementPresent(DocDetails, "Document validation Details Page Header");
			
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
			
			
			
			String Validation_Status_Table=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 2, 12);
			
			if(Validation_Status_Table.equalsIgnoreCase("Approve"))
			{
				validationstatustable_Approve();
			}
			else if (Validation_Status_Table.equalsIgnoreCase("Reject"))
			{
				
				Validation_Satatus_Table_Reject();
			}
			else if (Validation_Status_Table.equalsIgnoreCase("Retry"))
			{
				Validation_Satatus_Table_Retry();
				
			}
		
			
			Utilities.waitTime(2000);
			Utilities.ScrollToTheElement(POIAddbtn);
			
			Utilities.verifyElementPresent(SalaryTH, "Salary as a Table Header");
			
			Utilities.verifyElementPresent(AddIncomTH, "Additional Income as a Table Header");
			
			Utilities.verifyElementPresent(Plzentrnumonly, "Please Enter Numeric Values Only text message");
			
			Utilities.verifyElementPresent(Month1, "Month1 field title");
			
			Utilities.verifyElementPresent(Month1ReqIcn, "Month 1 Star Required Icon ");
			
			Utilities.verifyElementPresent(month2, "Month 2 field title");
			
			Utilities.verifyElementPresent(Month2ReqIcn, "Month 2 Star Required Icon ");
			
			Utilities.verifyElementPresent(month3, "Month 3 field title");
			
			Utilities.verifyElementPresent(Month3ReqIcn, "Month 3 Star Required Icon ");
			
			Utilities.verifyElementPresent(Month4, "Month 4 field title");
			
			Utilities.verifyElementPresent(Month5, "Month 5 field title");
			
			Utilities.verifyElementPresent(Month6, "Month 6 field title");
			
			Utilities.verifyElementPresent(AverageIncmtable, "In the Income TAble the Average field title");
			
			Utilities.verifyElementPresent(VerMnthlyIncm, "In the Income TAble the Verified Monthly Income field Title");
			
			Utilities.verifyElementPresent(SalaryDateTitle, "In the Income Table the Salary Date field title ");
			
			Utilities.verifyElementPresent(SaveIncmMsg, "Please Click Save to Save Income Values Message");
			
			Utilities.waitTime(2000);
			
			String netSalary=ExcelFunctions.getCellValue(Seritixlpath, "Sheet1", 24, 12);
			Integer net=Integer.valueOf(netSalary);
			System.out.println(net);
			int monthsalary=net/12;
			System.out.println("THe Monthly Salary IS" +monthsalary);
			logger.info("THe Monthly Salary IS"+monthsalary);
			String monthlysalry=String.valueOf(monthsalary);
			com.utility.ExtentReporter.extentLoggerPass(monthlysalry, "Monthly Salary");
			
			
			Utilities.click(Month1slryFld, "Month1 Salary Field");
			Utilities.clearField(Month1slryFld, "Month1 Salary Field");
			Utilities.type(Month1slryFld, monthlysalry, "Month1 Salary Field");
			
			Utilities.clearField(Month2slryFld, "Month2 Salary Field");
			Utilities.click(month2, "Month2 Salary Field");
			Utilities.type(Month2slryFld, monthlysalry, "Month2 Salary Field");
			
			Utilities.clearField(Month3SlryFld, "Month2 Salary Field");
			Utilities.click(month3, "Month3 Salary Field");
			Utilities.type(Month3SlryFld, monthlysalry, "Month3 Salary Field");
			
			Utilities.click(Month4SlryFld, "Month3 Salary Field");
			
			Utilities.click(Month5SlryFld, "Month5 Salary Field");
			
			Utilities.click(Month6SlryFld, "Month3 Salary Field");
			
			List<WebElement> MonthlyavgSly = Utilities.findElements(MonthlyAverage);
			for(int i=0;i<MonthlyavgSly.size();i++) {
				String monthSalary = MonthlyavgSly.get(0).getText();
				logger.info(monthSalary);
				Utilities.extentLoggerPass("The Average of the Monthly Salary is", monthSalary);
			}
			
			Utilities.clearField(SalaryDate, "Salary Date");
			Utilities.type(SalaryDate, "1", "Salary Date");
			
			Utilities.click(SaveButton, "Save Button");
			
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
			
			/*
			 * String ChecklistTable=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 3, 9);
			 * System.out.println(ChecklistTable);
			 * 
			 * 
			 * if(ChecklistTable.equalsIgnoreCase("pass")) { CheckList_Table_Pass(); } else
			 * if ( ChecklistTable.equalsIgnoreCase("fail")) { CheckList_Table_Fail(); }
			 * else if ( ChecklistTable.equalsIgnoreCase("na")) { CheckList_Table_NA(); }
			 */
			 
			
				/*
				 * if(ChecklistTable=="pass") { CheckList_Table_Pass(); }else {
				 * CheckList_Table_NA(); }
				 */
			
			
			/*
			 * switch (ChecklistTable) { case "pass":
			 * 
			 * CheckList_Table_Pass(); break;
			 * 
			 * case "fail": CheckList_Table_Fail();
			 * 
			 * break;
			 * 
			 * case"na": CheckList_Table_NA(); default: break; }
			 */
			
			
			
			/*
			 * //POR and KYC Outcome TAble
			 */	
			
			Utilities.ScrollToTheElement(SaveButton);
			PORandKYCOutcome_TAble();	
				
		}
			
		public static void validationstatustable_Approve() throws Exception
		{
			/*
			 * List<WebElement> thirtapprovbtn = Utilities.findElements(thirtdayapprovebtn);
			 * for (WebElement approvebtn : thirtapprovbtn) { String btnname =
			 * approvebtn.getText(); if(btnname.equals("Approve")) {
			 * Utilities.verifyElementPresentAndClick(thirtdayapprovebtn,
			 * "Approve button ");
			 * 
			 * Utilities.verifyElementPresent(Status, Utilities.getText(Status)); } }
			 */
			
			Utilities.JSClick(thirtyDayApprove, "Approve Button");
			Utilities.waitTime(3000);
		String statuscolumn=Utilities.getText(Status);
		System.out.println("The Satus Column status IS"+statuscolumn);
		logger.info("The Satus Column status IS" +statuscolumn);
		com.utility.ExtentReporter.extentLogger("The Satus Column status IS", statuscolumn);
		
		
		Utilities.JSClick(KycoutmApprove, "KYC Outcome Approve Button");
		Utilities.waitTime(3000);
		String Kyc_statuscolumn=Utilities.getText(Status);
		System.out.println("The Satus Column status IS"+Kyc_statuscolumn);
		logger.info("The Satus Column status IS" +Kyc_statuscolumn);
		com.utility.ExtentReporter.extentLogger("The Satus Column status IS", Kyc_statuscolumn);
		
		Utilities.JSClick(AVSApprove, "AVS Outcome Approve Button");
		Utilities.waitTime(3000);
		String AVS_statuscolumn=Utilities.getText(Status);
		System.out.println("The Satus Column status IS"+AVS_statuscolumn);
		logger.info("The Satus Column status IS" +AVS_statuscolumn);
		com.utility.ExtentReporter.extentLogger("The Satus Column status IS", AVS_statuscolumn);
		
		Utilities.JSClick(PoiotcmApproveBtn, "POI Outcome Approve Button");
		Utilities.waitTime(3000);
		String POI_statuscolumn=Utilities.getText(Status);
		System.out.println("The Satus Column status IS"+POI_statuscolumn);
		logger.info("The Satus Column status IS" +POI_statuscolumn);
		com.utility.ExtentReporter.extentLogger("The Satus Column status IS", POI_statuscolumn);
		
		
			
		}
		
		
		public static void Validation_Satatus_Table_Reject() throws Exception
		{
			
			Utilities.JSClick(KYCReject, "KYC Outcome REject Button");
			Utilities.waitTime(3000);
			Utilities.verifyElementPresent(Kycpopupheader, "Kyc Outcome Reject popup header");
			/*
			 * Utilities.clearField(KycRejctResubmitcopychkbox,
			 * "Resubmit ID Copy Checkbox");
			 * Utilities.clearField(KycRejectAmendcustCheckbox,
			 * "Amend cust name ID per Doc"); Utilities.clearField(KycBackfronCheckbox,
			 * "Resubmit of Back/front ID Card");
			 * Utilities.clearField(KycSubmtMarriageCheckBox,
			 * "Submit Marriage Certificate"); Utilities.clearField(SumtAfdivitCheckBox,
			 * "Submit affidavit -tempID/PPT");
			 * Utilities.verifyElementPresent(KycoutRejectSavebtn,
			 * "KYC Outcome Rejection Popup Save Button");
			 * Utilities.verifyElementPresent(KycoutRejectioCancelBtn,
			 * "KYC Outcome Rejection Popup Cancel Button");
			 * Utilities.verifyElementPresent(KycOutRejectCloseButton,
			 * "KYC Outcome Rejection Popup Close Button");
			 */
			
			String KycOutcmRejectReasons=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 4, 18);
			System.out.println("The Reject Reasons"+KycOutcmRejectReasons);
			if (KycOutcmRejectReasons.equalsIgnoreCase("Resubmit ID Copy"))
			{
				Utilities.click(KycRejctResubmitcopychkbox, "Resubmit ID Copy Checkbox");
			}
			else if (KycOutcmRejectReasons.equalsIgnoreCase("Amend cust name per ID doc"))
			{
				Utilities.click(KycRejectAmendcustCheckbox, "Amend cust name ID per Doc");
			}
			else if (KycOutcmRejectReasons.equalsIgnoreCase("Resubmit back/front of ID Card"))
			{
				Utilities.click(KycBackfronCheckbox, "Resubmit of Back/front ID Card");
			}
			else if (KycOutcmRejectReasons.equalsIgnoreCase("Submit marriage certificate")) 
			{
				Utilities.click(KycSubmtMarriageCheckBox, "Submit Marriage Certificate");
			}
			else if (KycOutcmRejectReasons.equalsIgnoreCase("Submit affidavit - tempID/PPT"))
			{
				Utilities.click(SumtAfdivitCheckBox, "Submit affidavit -tempID/PPT");
			}
			else
			{
				Utilities.click(KycRejctResubmitcopychkbox, "Resubmit ID Copy Checkbox");
				Utilities.click(KycRejectAmendcustCheckbox, "Amend cust name ID per Doc");
				Utilities.click(KycBackfronCheckbox, "Resubmit of Back/front ID Card");
				Utilities.click(KycSubmtMarriageCheckBox, "Submit Marriage Certificate");
				Utilities.click(SumtAfdivitCheckBox, "Submit affidavit -tempID/PPT");
				
			}
			
			Utilities.click(KycoutRejectSavebtn, "KYC Outcome Rejection Popup Save Button");
			Utilities.waitTime(3000);
			
			String KYCou_statuscolumn=Utilities.getText(Status);
			System.out.println("The Satus Column status IS"+KYCou_statuscolumn);
			logger.info("The Satus Column status IS" +KYCou_statuscolumn);
			com.utility.ExtentReporter.extentLogger("The Satus Column status IS", KYCou_statuscolumn);
			
			
			
			Utilities.JSClick(AVSRejctbtn, "AVS Outcome REject Button");
			Utilities.waitTime(3000);
			
			Utilities.verifyElementPresent(SlctResonAvsOutcmHeader, "AVS Outcome Reject Popup Header");
			
			String AVSoutcmRejctonReason=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 4, 19);
			if(AVSoutcmRejctonReason.equalsIgnoreCase("  BankDetails must belong toCust"))
			{
				Utilities.click(SlctReasonAVSBankDetailschkbox, "Bank details must belong to customer CheckBox");
			}
			else if (AVSoutcmRejctonReason.equalsIgnoreCase("Amend banking details"))
			{
				Utilities.click(SlctReasonAmendBnkChkbox, "Amend Banking Details CheckBox");
			}
			else
			{
				Utilities.click(SlctReasonAVSBankDetailschkbox, "Bank details must belong to customer CheckBox");
				Utilities.click(SlctReasonAmendBnkChkbox, "Amend Banking Details CheckBox");
			}
			
			Utilities.click(SaveBtnreason, "Save Button");
			
			String AVSou_statuscolumn=Utilities.getText(Status);
			System.out.println("The Satus Column status IS"+AVSou_statuscolumn);
			logger.info("The Satus Column status IS" +AVSou_statuscolumn);
			com.utility.ExtentReporter.extentLogger("The Satus Column status IS", AVSou_statuscolumn);
			
			
			
			
			
			Utilities.JSClick(POIReject, "POI Outcome REject Button");
			Utilities.waitTime(3000);
			Utilities.verifyElementPresent(POIPopupheader, "POI Outcome-Select Rejection Reason popup Header");
			
			String POIOutcmRejectionsPOPUp=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 4, 20);
			if (POIOutcmRejectionsPOPUp.equalsIgnoreCase("Submit 3 months’ BS")) 
			{
				Utilities.click(POIsubmt3mntchkbox, "Submit 3 month BS CheckBox");
			}
			else if (POIOutcmRejectionsPOPUp.equalsIgnoreCase("Submit 3 additional months’ BS"))
			{
				Utilities.click(POIAdd3mntChkBox, "Submit 3 additional months’ BS CheckBox");	
			}
			else if (POIOutcmRejectionsPOPUp.equalsIgnoreCase("Submit payslip")) 
			{
				Utilities.click(POISubmtpayslipChkBx, "Submit payslip CheckBox");	
			}
			else if (POIOutcmRejectionsPOPUp.equalsIgnoreCase("Submit ITA34"))
			{
				Utilities.click(POIITA34ChkBx, "Submit ITA34 CheckBox");		
			}
			else if (POIOutcmRejectionsPOPUp.equalsIgnoreCase("Submit pension letter")) {
				Utilities.click(POIPensnltrChkBox, "Submit pension letter CheckBox");
			}
			else if (POIOutcmRejectionsPOPUp.equalsIgnoreCase("Submit increase letter")) {
				Utilities.click(POISubmtInLtrChkBx, "Submit increase letter");
			}
			else if (POIOutcmRejectionsPOPUp.equalsIgnoreCase("Submit latest CIPC cert.")) {
				Utilities.click(POISubmtCIPCChkBx, "Submit latest CIPC cert.");
			}
			else if (POIOutcmRejectionsPOPUp.equalsIgnoreCase("Submit latest audited FinStat.")) {
				Utilities.click(POIFinsatChkBox, "Submit latest audited FinStat. CheckBox");
			}
			else if (POIOutcmRejectionsPOPUp.equalsIgnoreCase("Amend income details &resubmit")) {
				Utilities.click(POIDetResbmtChkBox, "Amend income details &resubmit CheckBox");
			}
			else {
				Utilities.click(POIsubmt3mntchkbox, "Submit 3 month BS CheckBox");
				Utilities.click(POIAdd3mntChkBox, "Submit 3 additional months’ BS CheckBox");
				Utilities.click(POISubmtpayslipChkBx, "Submit payslip CheckBox");
				Utilities.click(POIITA34ChkBx, "Submit ITA34 CheckBox");
				Utilities.click(POIPensnltrChkBox, "Submit pension letter CheckBox");
				Utilities.click(POISubmtInLtrChkBx, "Submit increase letter");
				Utilities.click(POISubmtCIPCChkBx, "Submit latest CIPC cert.");
				Utilities.click(POIFinsatChkBox, "Submit latest audited FinStat. CheckBox");
				Utilities.click(POIDetResbmtChkBox, "Amend income details &resubmit CheckBox");
			}
			
			Utilities.JSClick(POIRechkSaveButn, "POI Outcome Rejection PopUp Save Button");
			Utilities.waitTime(3000);
			String POIou_statuscolumn=Utilities.getText(Status);
			System.out.println("The Satus Column status IS"+POIou_statuscolumn);
			logger.info("The Satus Column status IS" +POIou_statuscolumn);
			com.utility.ExtentReporter.extentLogger("The Satus Column status IS", POIou_statuscolumn);	
			
		}
		
		public static void Validation_Satatus_Table_Retry() throws Exception
		{
			
			Utilities.JSClick(ThirtydayRetry, "POI Outcome Retry Button");
			Utilities.waitTime(3000);
			String thirtyret_statuscolumn=Utilities.getText(Status);
			System.out.println("The Satus Column status IS"+thirtyret_statuscolumn);
			logger.info("The Satus Column status IS" +thirtyret_statuscolumn);
			com.utility.ExtentReporter.extentLogger("The Satus Column status IS", thirtyret_statuscolumn);
			
			Utilities.JSClick(KycRetry, "KYC Outcome Retry Button");
			Utilities.waitTime(3000);
			String KYCrtyret_statuscolumn=Utilities.getText(Status);
			System.out.println("The Satus Column status IS"+KYCrtyret_statuscolumn);
			logger.info("The Satus Column status IS" +KYCrtyret_statuscolumn);
			com.utility.ExtentReporter.extentLogger("The Satus Column status IS", KYCrtyret_statuscolumn);
			
			Utilities.JSClick(AVSRetryBtn, "AVS Outcome Retry Button");
			Utilities.waitTime(3000);
			String AVSrtyret_statuscolumn=Utilities.getText(Status);
			System.out.println("The Satus Column status IS"+AVSrtyret_statuscolumn);
			logger.info("The Satus Column status IS" +AVSrtyret_statuscolumn);
			com.utility.ExtentReporter.extentLogger("The Satus Column status IS", AVSrtyret_statuscolumn);
			
			
		}
		
		
		
		
		
		public static void CheckList_Table_Pass()
		{
			
			
			
			String CheckList=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 1, 1);
			if (CheckList.equalsIgnoreCase("Pass")) {
				List<WebElement> AMLChk = Utilities.findElements(AMLPass);
				AMLChk.get(0).click();
				
				}
			else if (CheckList.equalsIgnoreCase("Fail")) 
			{
				List<WebElement> AMLChk = Utilities.findElements(AMLPass);
				AMLChk.get(1).click();
				
			}
			else if (CheckList.equalsIgnoreCase("N/A")) {
				List<WebElement> AMLChk = Utilities.findElements(AMLPass);
				AMLChk.get(2).click();
				
			}
			 
			String CorrectDocCheckList=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 2, 1);
			
			if (CorrectDocCheckList.equalsIgnoreCase("Pass"))
			{
				List<WebElement> cred = Utilities.findElements(CrectDocPass);
				cred.get(0).click();
				
			}
			else if (CorrectDocCheckList.equalsIgnoreCase("Fail")) {
				List<WebElement> cred = Utilities.findElements(CrectDocPass);
				cred.get(1).click();
			}
			
			else if (CorrectDocCheckList.equalsIgnoreCase("NA")) {
				List<WebElement> cred = Utilities.findElements(CrectDocPass);
				cred.get(1).click();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			 * List<WebElement> amlpass = Utilities.findElements(AMLPass);
			 * Utilities.waitTime(3000); amlpass.get(0).click();
			 * logger.info("Clicked on the AML Response Approved pass Checkbox");
			 * com.utility.ExtentReporter.extentLoggerPass("AML Response Approved",
			 * "Pass CheckBox");
			 * 
			 * List<WebElement> credocpass = Utilities.findElements(CrectDocPass); //for(int
			 * i=0;i<credocpass.size();i++) //{ credocpass.get(0).click(); logger.
			 * info("Clicked on the Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option pass Checkbox"
			 * ); com.utility.ExtentReporter.
			 * extentLoggerPass("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option"
			 * , "Pass CheckBox"); //}
			 * 
			 * List<WebElement> Bankstachklst = Utilities.findElements(BankstaPass);
			 * Bankstachklst.get(0).click(); logger.
			 * info("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Pass Checkbox"
			 * ); com.utility.ExtentReporter.
			 * extentLoggerPass("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Pass Checkbox"
			 * , "Pass CheckBox");
			 * 
			 * List<WebElement> NameAccchlst = Utilities.findElements(NAmeAccPAss);
			 * NameAccchlst.get(0).click(); logger.
			 * info("Clicked on the Name & Account number appear on statement checklist column option Pass Checkbox"
			 * ); com.utility.ExtentReporter.
			 * extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Pass Checkbox"
			 * , "Pass CheckBox");
			 * 
			 * List<WebElement> UifChlstPass = Utilities.findElements(UIFChlstPass);
			 * UifChlstPass.get(0).click(); logger.
			 * info("Clicked on the UIF correct & Tax reasonability checklist column option Pass Checkbox"
			 * ); com.utility.ExtentReporter.
			 * extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Pass Checkbox"
			 * , "Pass CheckBox");
			 * 
			 * List<WebElement> garneshpass = Utilities.findElements(GarnecjklstPass);
			 * garneshpass.get(0).click(); logger.
			 * info("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Pass Checkbox"
			 * ); com.utility.ExtentReporter.
			 * extentLoggerPass("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Pass Checkbox"
			 * , "Pass CheckBox");
			 * 
			 * List<WebElement> Empchkpass = Utilities.findElements(EmpAccptChklstpass);
			 * Empchkpass.get(0).click(); logger.
			 * info("Clicked on the Employment Acceptable checklist column option Pass Checkbox"
			 * ); com.utility.ExtentReporter.
			 * extentLoggerPass("Clicked on the Employment Acceptable checklist column option Pass Checkbox"
			 * , "Pass CheckBox");
			 * 
			 * List<WebElement> twomrchkpass = Utilities.findElements(TwoormrChkpass);
			 * twomrchkpass.get(0).click(); logger.
			 * info("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Pass Checkbox"
			 * ); com.utility.ExtentReporter.
			 * extentLoggerPass("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Pass Checkbox"
			 * , "Pass CheckBox");
			 * 
			 * List<WebElement> multchkpass = Utilities.findElements(MultpleprvdrChkPass);
			 * multchkpass.get(0).click(); logger.
			 * info("Clicked on the Multiple providers prepaid airtime checklist column option Pass Checkbox"
			 * ); com.utility.ExtentReporter.
			 * extentLoggerPass("Clicked on the Multiple providers prepaid airtime checklist column option Pass Checkbox"
			 * , "Pass CheckBox");
			 * 
			 * List<WebElement> profchklstpass =
			 * Utilities.findElements(ProfilBuiChklstPass); profchklstpass.get(0).click();
			 * logger.
			 * info("Clicked on the Profile Building checklist column option Pass Checkbox"
			 * ); com.utility.ExtentReporter.
			 * extentLoggerPass("Clicked on the Profile Building checklist column option Pass Checkbox"
			 * , "Pass CheckBox");
			 * 
			 * List<WebElement> Fraudchklstpass = Utilities.findElements(FraudchklstPass);
			 * Fraudchklstpass.get(0).click(); logger.
			 * info("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Pass Checkbox"
			 * ); com.utility.ExtentReporter.
			 * extentLoggerPass("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Pass Checkbox"
			 * , "Pass CheckBox");
			 * 
			 * 
			 * List<WebElement> Nodebitchlstpass = Utilities.findElements(NodebiChklstPass);
			 * Nodebitchlstpass.get(0).click(); logger.
			 * info("Clicked on the No Debit Order, layout of bank statements checklist column option Pass Checkbox"
			 * ); com.utility.ExtentReporter.
			 * extentLoggerPass("Clicked on the No Debit Order, layout of bank statements checklist column option Pass Checkbox"
			 * , "Pass CheckBox");
			 * 
			 */		
}
		
		public static void CheckList_Table_Fail()
		{
			List<WebElement> amlpass = Utilities.findElements(AMLPass);
			Utilities.waitTime(3000);
			amlpass.get(1).click();
			logger.info("Clicked on the AML Response Approved pass Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("AML Response Approved", "Pass CheckBox");
			
			List<WebElement> credocpass = Utilities.findElements(CrectDocPass);
			credocpass.get(1).click();
			logger.info("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option Pass Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option", "Fail CheckBox");
			
			List<WebElement> Bankstachklst = Utilities.findElements(BankstaPass);
			Bankstachklst.get(1).click();
			logger.info("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Fail Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Fail Checkbox", "Pass CheckBox");	
	
			List<WebElement> NameAccchlst = Utilities.findElements(NAmeAccPAss);
			NameAccchlst.get(1).click();
			logger.info("Clicked on the Name & Account number appear on statement checklist column option Fail Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Fail Checkbox", "Fail CheckBox");	
	
			List<WebElement> UifChlstPass = Utilities.findElements(UIFChlstPass);
			UifChlstPass.get(1).click();
			logger.info("Clicked on the UIF correct & Tax reasonability checklist column option Fail Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Fail Checkbox", "Fail CheckBox");	
	
			List<WebElement> garneshpass = Utilities.findElements(GarnecjklstPass);
			garneshpass.get(1).click();
			logger.info("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Fail Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Fail Checkbox", "Fail CheckBox");	
	
			List<WebElement> Empchkpass = Utilities.findElements(EmpAccptChklstpass);
			Empchkpass.get(1).click();
			logger.info("Clicked on the Employment Acceptable checklist column option Fail Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Employment Acceptable checklist column option Fail Checkbox", "Fail CheckBox");	
	
			List<WebElement> twomrchkpass = Utilities.findElements(TwoormrChkpass);
			twomrchkpass.get(1).click();
			logger.info("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Fail Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Fail Checkbox", "Fail CheckBox");	
	
			List<WebElement> multchkpass = Utilities.findElements(MultpleprvdrChkPass);
			multchkpass.get(1).click();
			logger.info("Clicked on the Multiple providers prepaid airtime checklist column option Fail Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Multiple providers prepaid airtime checklist column option Fail Checkbox", "Fail CheckBox");	
	
			List<WebElement> profchklstpass = Utilities.findElements(ProfilBuiChklstPass);
			profchklstpass.get(1).click();
			logger.info("Clicked on the Profile Building checklist column option Fail Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Profile Building checklist column option Fail Checkbox", "Fail CheckBox");	
	
			List<WebElement> Fraudchklstpass = Utilities.findElements(FraudchklstPass);
			Fraudchklstpass.get(1).click();
			logger.info("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Fail Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Fail Checkbox", "Fail CheckBox");	
	
			List<WebElement> Nodebitchlstpass = Utilities.findElements(NodebiChklstPass);
			Nodebitchlstpass.get(1).click();
			logger.info("Clicked on the No Debit Order, layout of bank statements checklist column option Fail Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the No Debit Order, layout of bank statements checklist column option Fail Checkbox", "Fail CheckBox");	
	
			
			
		}
		
		public static void CheckList_Table_NA()
		{
			
			List<WebElement> amlpass = Utilities.findElements(AMLPass);
			Utilities.waitTime(3000);
			amlpass.get(2).click();
			logger.info("Clicked on the AML Response Approved N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("AML Response Approved", "N/A CheckBox");
			
			List<WebElement> credocpass = Utilities.findElements(CrectDocPass);
			credocpass.get(2).click();
			logger.info("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option", "N/A CheckBox");
			
			List<WebElement> Bankstachklst = Utilities.findElements(BankstaPass);
			Bankstachklst.get(2).click();
			logger.info("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option N/A Checkbox", "N/A CheckBox");	
	
			List<WebElement> NameAccchlst = Utilities.findElements(NAmeAccPAss);
			NameAccchlst.get(2).click();
			logger.info("Clicked on the Name & Account number appear on statement checklist column option N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option N/A Checkbox", "N/A CheckBox");	
	
			List<WebElement> UifChlstPass = Utilities.findElements(UIFChlstPass);
			UifChlstPass.get(2).click();
			logger.info("Clicked on the UIF correct & Tax reasonability checklist column option N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option N/A Checkbox", "N/A CheckBox");	
	
			List<WebElement> garneshpass = Utilities.findElements(GarnecjklstPass);
			garneshpass.get(2).click();
			logger.info("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option N/A Checkbox", "N/A CheckBox");	
	
			List<WebElement> Empchkpass = Utilities.findElements(EmpAccptChklstpass);
			Empchkpass.get(2).click();
			logger.info("Clicked on the Employment Acceptable checklist column option N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Employment Acceptable checklist column option N/A Checkbox", "N/A CheckBox");	
	
			List<WebElement> twomrchkpass = Utilities.findElements(TwoormrChkpass);
			twomrchkpass.get(2).click();
			logger.info("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option N/A Checkbox", "N/A CheckBox");	
	
			List<WebElement> multchkpass = Utilities.findElements(MultpleprvdrChkPass);
			multchkpass.get(2).click();
			logger.info("Clicked on the Multiple providers prepaid airtime checklist column option N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Multiple providers prepaid airtime checklist column option N/A Checkbox", "N/A CheckBox");	
	
			List<WebElement> profchklstpass = Utilities.findElements(ProfilBuiChklstPass);
			profchklstpass.get(2).click();
			logger.info("Clicked on the Profile Building checklist column option N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Profile Building checklist column option N/A Checkbox", "N/A CheckBox");	
	
			List<WebElement> Fraudchklstpass = Utilities.findElements(FraudchklstPass);
			Fraudchklstpass.get(2).click();
			logger.info("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option N/A Checkbox", "N/A CheckBox");	
	
			List<WebElement> Nodebitchlstpass = Utilities.findElements(NodebiChklstPass);
			Nodebitchlstpass.get(2).click();
			logger.info("Clicked on the No Debit Order, layout of bank statements checklist column option N/A Checkbox");
			com.utility.ExtentReporter.extentLoggerPass("Clicked on the No Debit Order, layout of bank statements checklist column option N/A Checkbox", "N/A CheckBox");	
			
		}
		
		public static void PORandKYCOutcome_TAble() throws Exception
		{
			Utilities.verifyElementPresent(PorApprovebtn, "POR Outcome Approve Button");
			
			Utilities.verifyElementPresent(PorRejectBtn, "POR Outcome Reject Button");
			
			Utilities.verifyElementPresent(PORRetryBtn, "POR Outcome Retry Button");
			
			Utilities.verifyElementPresent(PORAddBtn, "POR Outcome Add Button");
			
			Utilities.verifyElementPresent(PORViewBtn, "POR Outcome View Button");
			
			Utilities.verifyElementPresent(KYCOutcomeApproveBtn, "KYC Fraud Outcome Approve Button");
			
			Utilities.verifyElementPresent(KYCOutcomeRetryBtn, "KYC Fraud Outcome Retry Button");
			
			Utilities.verifyElementPresent(KYCOutcomeRejectbtn, "KYC Fraud Outcome Reject Button");
			
			Utilities.verifyElementPresent(KYCOutcomeAddbtn, "KYC Fraud Outcome Add Button");
			
			Utilities.verifyElementPresent(KYCOutcomeViewbtn, "KYC Fraud Outcome View Button");
			
			Utilities.verifyElementPresent(AMLOutcomeRetryBtn, "AML Outcome Retry Button");
			
			Utilities.verifyElementPresent(AMLOutcomeAddBtn, "AML Outcome Add Button");
			
			Utilities.verifyElementPresent(AMLOutcomeViewBtn, "AML Outcome View Button");
			
			Utilities.verifyElementPresent(ViewOthrDocmnthyprlnk, "View Other Documents Hyperlink");
			
			Utilities.verifyElementPresent(FinalSubmissionMSG, "Final Submission MSG ");
			
			Utilities.verifyElementPresent(ApproveValsBtn, "Approve Vals Button");
			
			Utilities.verifyElementPresent(RejectValsBtn, "Reject Vals Button");
		
			
		}
		
		
		
					
			
		
		
		
		}
		
		


