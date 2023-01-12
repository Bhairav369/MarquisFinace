package com.marquis.webPages;

import java.util.Iterator;
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
		//public static By thirtdayapprovebtn=By.xpath("//button[contains(text(),'Approve')]");
		//status
		public static By Status=By.xpath("//button[contains(text(),'Approve')]/parent::td/preceding-sibling::td/descendant::b");
		//30-day payoutcheck Status column
		public static By ThrtyStatus=By.xpath("//td[normalize-space()='30-day pay out check']//following::b[normalize-space()='SUCCESS']");
		//KYC Outcome Status column
		public static By KycStatusCl=By.xpath("//td[normalize-space()='KYC Outcome']/..//b[contains(text(),'FAILED')]");
		
		
		//Status for all option
		public static By AllstatusColumn=By.xpath("//th[text()='Status']/ancestor::thead/following-sibling::tbody/descendant::b");
		
		
		
		//AVS Outcome Status Column
		public static By AVSOutCmStatusCl=By.xpath("//td[normalize-space()='AVS Outcome']/..//b[contains(text(),'FAILED')]");
		//POI Outcome Status Column
		public static By POIOutcmStatusCl=By.xpath("//td[normalize-space()='POI Outcome']/..//b[contains(text(),'FAILED')]");
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
		public static By AvsRejectBtnSec=By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[2]/div[1]/app-process-agreement[1]/div[1]/div[1]/div[1]/div[2]/table[8]/tbody[3]/tr[1]/td[6]/button[1]");
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
		public static By AMLPass=By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[2]/div[1]/app-process-agreement[1]/div[1]/div[1]/div[1]/div[2]/table[9]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/..//input[@name='1']");
		//Aml PAss
		public static By AMlpss=By.xpath("/html/body/app-root/div/div/div[2]/div/app-process-agreement/div/div/div/div[2]/table[9]/tr/td[2]/table/tbody[1]/tr/td[2]/input");
		//Aml fail
		public static By AMlfailss=By.xpath("/html/body/app-root/div/div/div[2]/div/app-process-agreement/div/div/div/div[2]/table[9]/tr/td[2]/table/tbody[1]/tr/td[3]/input");
		//Aaml NA
		public static By AMlNAss=By.xpath("/html/body/app-root/div/div/div[2]/div/app-process-agreement/div/div/div/div[2]/table[9]/tr/td[2]/table/tbody[1]/tr/td[4]/input");
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
		//Activate Auto Refresh button
		public static By ActivateAutoRefreshBtn=By.xpath("//button[normalize-space()='MANUAL REFRESH']//following::button[normalize-space()='ACTIVATE AUTO-REFRESH']");
		//Save Button
		public static By ChklstSaveBtn=By.xpath("//div/small/b[contains(text(),'*Please Click Save to Save Checklist')]/following::button[text()='SAVE']");
		//Validation Status
		public static By validationStatus = By.xpath("//strong[text()='Validations Statuses:']");
		//POR Outcome Approve btn
		public static By PorApprovebtn=By.xpath("//td[normalize-space()='POR Outcome']/..//button[contains(text(),'Approve')]");
		//POR Outcome Status
		public static By POROutCmStatus=By.xpath("//td[normalize-space()='POR Outcome']/..//b[contains(text(),'FAILED')]");
		//KYC Fraud Outcome Status
		public static By KYCFrudStatus=By.xpath("//td[normalize-space()='KYC Fraud Outcome']//following::b[normalize-space()='ERROR']");
		//AML Outcome Status
		public static By AMLOutcmStatus=By.xpath("//td[normalize-space()='AML Outcome']//following::b[normalize-space()='FAILED-In-Proc']");
		//por outcome Reject btn
		public static By PorRejectBtn=By.xpath("//td[normalize-space()='POR Outcome']/..//button[contains(text(),'Reject')]");
		//Submit Valid Proof of Address CheckBox
		public static By PORRejSubMtAdd=By.xpath("//u[normalize-space()='POR Outcome']//following::label[contains(@for,'41')]");
		//Submit POA Declaration Evidence CheckBox
		public static By PORDeclare=By.xpath("//u[normalize-space()='POR Outcome']//following::label[contains(@for,'42')]");
		//Save Button
		public static By PORSveBtn=By.xpath("//u[normalize-space()='POR Outcome']//following::i[contains(@class,'pi pi-save pt-1')]");
		//CAncel Button
		public static By CnClBtn=By.xpath("//u[normalize-space()='POR Outcome']//following::i[contains(@class,'pi pi-times-circle pt-1')]");
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
		//
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
			com.utility.ExtentReporter.HeaderChildNode("TC_008" + "  " + "Verify the UI of the Document Validation Page" + "  " + "TC_009" + "  " + "Verify the functionality of the Document Validation Page" + "  " + "TC_010" + "  "+ "Verify the UI And Functionality of the Document Validation Details Page" + "  " + "TC_011" + "  "+ "Verify the UI of the Validation Status Table" + "  "+ "TC_012" + "  "+ "Verify the functionality of the Validation Status Table" + "  " + "TC_013" + "  " + "Verify the UI of the Salary Details Page" + "  " + "TC_014" + "  " + "Verify the functionality of the salary Details Table" + "  " + "TC_015" + "  "+ "Verify the UI of the Checklist Table" + "  " +"TC_016" + "  "+ "Verify the functionality of the Pass CheckBox in the CheckList Table" + "  " + "TC_017" + "  " + "Verify the functionality of the Fail CheckBox in the CheckList Table" + "  " + "TC_018" + "  " + "Verify the functionality of the N/A CheckBox in the CheckList Table" + "  " + "TC_019" + "  " + "Verify the UI of the POR And KYC Outcome Table" + "  "+ "TC_020" + " " + "Verify the Functionality of the POR And KYC Outcome Table");
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
			Utilities.verifyElementPresent(searchIcon, "Search Icon");
			Utilities.type(SearchFld, "2000007234", "Search Bar");
			Utilities.JSClick(SearchIcons, "Search Icon");
		   
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
			Utilities.JSClick(Month1slryFld, "Month1 Salary Field");
			Utilities.clearField(Month1slryFld, "Month1 Salary Field");
			Utilities.type(Month1slryFld, monthlysalry, "Month1 Salary Field");	
			Utilities.clearField(Month2slryFld, "Month2 Salary Field");
			Utilities.JSClick(Month2slryFld, "Month2 Salary Field");
			Utilities.type(Month2slryFld, monthlysalry, "Month2 Salary Field");	
			Utilities.clearField(Month3SlryFld, "Month3 Salary Field");
			Utilities.clearField(Month3SlryFld, "Month3 Salary Field");
			Utilities.JSClick(Month3SlryFld, "Month3 Salary Field");
			Utilities.type(Month3SlryFld, monthlysalry, "Month3 Salary Field");	
			Utilities.JSClick(Month4SlryFld, "Month3 Salary Field");	
			Utilities.JSClick(Month5SlryFld, "Month5 Salary Field");
			Utilities.JSClick(Month6SlryFld, "Month3 Salary Field");
			List<WebElement> MonthlyavgSly = Utilities.findElements(MonthlyAverage);
			for(int i=0;i<MonthlyavgSly.size();i++) {
				String monthSalary = MonthlyavgSly.get(0).getText();
				logger.info(monthSalary);
				Utilities.extentLoggerPass("The Average of the Monthly Salary is", monthSalary);
			}		
			Utilities.clearField(SalaryDate, "Salary Date");
			Utilities.type(SalaryDate, "1", "Salary Date");	
			//Salary Table Save Button
			Utilities.waitTime(2000);
			Utilities.JSClick(SaveButton, "Save Button");			
			
			Utilities.waitTime(2000);
			CheckList_Table_Pass();
			
			AVSandPOI_Outcome();
		
			
			/*
			 * //POR and KYC Outcome TAble
			 */	
			
			Utilities.ScrollToTheElement(SaveButton);
			PORandKYCOutcome_TAble();		
		}
	
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
			
			String CheckList=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 1, 3);
			System.out.println("The Reader IS"+ CheckList);
			Utilities.waitTime(2000);
			if (CheckList.equalsIgnoreCase("Pass")) {
								//List<WebElement> AMLChk = Utilities.findElements(AMlpss);
				Utilities.click(AMlpss, "Pass checkbox");
				logger.info("Clicked on the AML Response Approved pass Checkbox");
				  com.utility.ExtentReporter.extentLoggerPass("AML Response Approved",  "Pass CheckBox");					
				//	AMLChk.get(0).click();				
				}
			else if (CheckList.equalsIgnoreCase("Fail")) 
			{
				List<WebElement> AMLChk = Utilities.findElements(AMLPass);
				AMLChk.get(1).click();
				
				Utilities.click(AMlpss, "Fail checkbox");
				logger.info("Clicked on the AML Response Approved Fail Checkbox");
				  com.utility.ExtentReporter.extentLoggerPass("AML Response Approved",  "Fail CheckBox");				
			}
			else if (CheckList.equalsIgnoreCase("N/A")) {
				List<WebElement> AMLChk = Utilities.findElements(AMLPass);
				AMLChk.get(2).click();
				Utilities.click(AMlpss, "N/A checkbox");
				logger.info("Clicked on the AML Response Approved N/A Checkbox");
				  com.utility.ExtentReporter.extentLoggerPass("AML Response Approved",  "N/A CheckBox");
			}	 
			String CorrectDocCheckList=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 2, 3);			
			if (CorrectDocCheckList.equalsIgnoreCase("Pass"))
			{
				List<WebElement> cred = Utilities.findElements(CrectDocPass);
				cred.get(0).click();
				logger.
				  info("Clicked on the Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option pass Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option"
				  , "Pass CheckBox");	
			}
			else if (CorrectDocCheckList.equalsIgnoreCase("Fail")) {
				List<WebElement> cred = Utilities.findElements(CrectDocPass);
				cred.get(1).click();				
				logger.
				  info("Clicked on the Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option Fail Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option"
				  , "Fail CheckBox");
			}			
			else if (CorrectDocCheckList.equalsIgnoreCase("N/A")) {
				List<WebElement> cred = Utilities.findElements(CrectDocPass);
				cred.get(2).click();				
				logger.
				  info("Clicked on the Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option N/A Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Correct Documentation submitted(refer to requirements under Salaried/Sole Prop/Agri)checklist column option"
				  , "N/A CheckBox");
			}
			String Bankstarecived=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 3, 3);			
			if (Bankstarecived.equalsIgnoreCase("pass")) {
				List<WebElement> bnk = Utilities.findElements(BankstaPass);
				bnk.get(0).click();
				 logger.
				  info("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Pass Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Pass Checkbox"
				  , "Pass CheckBox");				
			}
			else if (Bankstarecived.equalsIgnoreCase("Fail")) {
				List<WebElement> bnk = Utilities.findElements(BankstaPass);
				bnk.get(1).click();				
				 logger.
				  info("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Fail Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option Pass Checkbox"
				  , "Fail CheckBox");
			}
			else if (Bankstarecived.equalsIgnoreCase("N/A")) {
				List<WebElement> bnk = Utilities.findElements(BankstaPass);
				bnk.get(2).click();				
				 logger.
				  info("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option N/A Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Bank Statements received match bank account details captured under additional details in Financier checklist column option N/A Checkbox"
				  , "N/A CheckBox");
			}		
          String NAmeandAccunts=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 4, 3);			
			if (NAmeandAccunts.equalsIgnoreCase("pass")) {
				List<WebElement> bnk = Utilities.findElements(NAmeAccPAss);
				bnk.get(0).click();
				logger.
				  info("Clicked on the Name & Account number appear on statement checklist column option Pass Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Pass Checkbox"
				  , "Pass CheckBox");
			}
			else if (NAmeandAccunts.equalsIgnoreCase("Fail")) {
				List<WebElement> bnk = Utilities.findElements(NAmeAccPAss);
				bnk.get(1).click();				
				logger.
				  info("Clicked on the Name & Account number appear on statement checklist column option Fail Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Fail Checkbox"
				  , "Fail CheckBox");
			}
			else if (NAmeandAccunts.equalsIgnoreCase("N/A")) {
				List<WebElement> bnk = Utilities.findElements(NAmeAccPAss);
				bnk.get(2).click();				
				logger.
				  info("Clicked on the Name & Account number appear on statement checklist column option N/A Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Pass Checkbox"
				  , "N/A CheckBox");
			}	
         String UIFCrect=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 5, 3);
			
			if (UIFCrect.equalsIgnoreCase("pass")) {
				List<WebElement> bnk = Utilities.findElements(UIFChlstPass);
				bnk.get(0).click();				
				logger.
				  info("Clicked on the UIF correct & Tax reasonability checklist column option Pass Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Pass Checkbox"
				  , "Pass CheckBox");				
			}
			else if (NAmeandAccunts.equalsIgnoreCase("Fail")) {
				List<WebElement> bnk = Utilities.findElements(UIFChlstPass);
				bnk.get(1).click();				
				logger.
				  info("Clicked on the UIF correct & Tax reasonability checklist column option Fail Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option Fail Checkbox"
				  , "Fail CheckBox");
			}
			else if (NAmeandAccunts.equalsIgnoreCase("N/A")) {
				List<WebElement> bnk = Utilities.findElements(UIFChlstPass);
				bnk.get(2).click();
				
				logger.
				  info("Clicked on the UIF correct & Tax reasonability checklist column option N/A Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Name & Account number appear on statement checklist column option N/A Checkbox"
				  , "N/A CheckBox");
			}
			
         String garneshing=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 6, 3);
			
			if (garneshing.equalsIgnoreCase("pass")) {
				List<WebElement> bnk = Utilities.findElements(GarnecjklstPass);
				bnk.get(0).click();				
				logger.
				  info("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Pass Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Pass Checkbox"
				  , "Pass CheckBox");
			}
			else if (garneshing.equalsIgnoreCase("Fail")) {
				List<WebElement> bnk = Utilities.findElements(GarnecjklstPass);
				bnk.get(1).click();
				
				logger.
				  info("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Fail Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option Fail Checkbox"
				  , "Fail CheckBox");
			}
			else if (garneshing.equalsIgnoreCase("N/A")) {
				List<WebElement> bnk = Utilities.findElements(GarnecjklstPass);
				bnk.get(2).click();				
				logger.
				  info("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option N/A Checkbox"
				  ); com.utility.ExtentReporter.
				  extentLoggerPass("Clicked on the Garnishing order(Under R300/N/A -Pass)/(Over R300 -Fail) checklist column option N/A Checkbox"
				  , "N/A CheckBox");
			}			
			 String EmpAcctble=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 7, 3);
				
				if (EmpAcctble.equalsIgnoreCase("pass")) {
					List<WebElement> bnk = Utilities.findElements(EmpAccptChklstpass);
					bnk.get(0).click();
					
					logger.
					  info("Clicked on the Employment Acceptable checklist column option Pass Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Employment Acceptable checklist column option Pass Checkbox"
					  , "Pass CheckBox");
				}
				else if (EmpAcctble.equalsIgnoreCase("Fail")) {
					List<WebElement> bnk = Utilities.findElements(EmpAccptChklstpass);
					bnk.get(1).click();
				logger.
					  info("Clicked on the Employment Acceptable checklist column option Fail Checkbox"
					  ); com.utility.ExtentReporter.
					  extentLoggerPass("Clicked on the Employment Acceptable checklist column option Fail Checkbox"
					  , "Fail CheckBox");
				}
				else if (EmpAcctble.equalsIgnoreCase("N/A")) {
					List<WebElement> bnk = Utilities.findElements(EmpAccptChklstpass);
					bnk.get(2).click();
				}
			
				 String TwoorMr=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 8, 3);
					
					if (TwoorMr.equalsIgnoreCase("pass")) {
						List<WebElement> bnk = Utilities.findElements(TwoormrChkpass);
						bnk.get(0).click();						
						logger.
						  info("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Pass Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Pass Checkbox"
						  , "Pass CheckBox");
					}
					else if (TwoorMr.equalsIgnoreCase("Fail")) {
						List<WebElement> bnk = Utilities.findElements(TwoormrChkpass);
						bnk.get(1).click();						
						logger.
						  info("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Fail Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option Fail Checkbox"
						  , "Fail CheckBox");
					}
					else if (TwoorMr.equalsIgnoreCase("N/A")) {
						List<WebElement> bnk = Utilities.findElements(TwoormrChkpass);
						bnk.get(2).click();					
						logger.
						  info("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option N/A Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Two or more unpaid  debit order(other than insurance/investment) checklist column option N/A Checkbox"
						  , "N/A CheckBox");
					}					
                 String Multiprvdr=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 9, 3);
					
					if (Multiprvdr.equalsIgnoreCase("pass")) {
						List<WebElement> bnk = Utilities.findElements(MultpleprvdrChkPass);
						bnk.get(0).click();						
						logger.
						  info("Clicked on the Multiple providers prepaid airtime checklist column option Pass Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Multiple providers prepaid airtime checklist column option Pass Checkbox"
						  , "Pass CheckBox");
					}
					else if (Multiprvdr.equalsIgnoreCase("Fail")) {
						List<WebElement> bnk = Utilities.findElements(MultpleprvdrChkPass);
						bnk.get(1).click();
						logger.
						  info("Clicked on the Multiple providers prepaid airtime checklist column option Fail Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Multiple providers prepaid airtime checklist column option Fail Checkbox"
						  , "Fail CheckBox");
					}
					else if (Multiprvdr.equalsIgnoreCase("N/A")) {
						List<WebElement> bnk = Utilities.findElements(MultpleprvdrChkPass);
						bnk.get(2).click();
						logger.
						  info("Clicked on the Multiple providers prepaid airtime checklist column option N/A Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Multiple providers prepaid airtime checklist column option N/A Checkbox"
						  , "N/A CheckBox");
					}						
                String prflebuldng=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 10, 3);
					
					if (prflebuldng.equalsIgnoreCase("pass")) {
						List<WebElement> bnk = Utilities.findElements(ProfilBuiChklstPass);
						bnk.get(0).click();						
						logger.
						  info("Clicked on the Profile Building checklist column option Pass Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Profile Building checklist column option Pass Checkbox"
						  , "Pass CheckBox");
					}
					else if (prflebuldng.equalsIgnoreCase("Fail")) {
						List<WebElement> bnk = Utilities.findElements(ProfilBuiChklstPass);
						bnk.get(1).click();						
						logger.
						  info("Clicked on the Profile Building checklist column option Fail Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Profile Building checklist column option Fail Checkbox"
						  , "Fail CheckBox");
					}
					else if (prflebuldng.equalsIgnoreCase("N/A")) {
						List<WebElement> bnk = Utilities.findElements(ProfilBuiChklstPass);
						bnk.get(2).click();						
						logger.
						  info("Clicked on the Profile Building checklist column option N/A Checkbox"
						  ); com.utility.ExtentReporter.
						  extentLoggerPass("Clicked on the Profile Building checklist column option N/A Checkbox"
						  , "N/A CheckBox");
					}					
					 String FrudChk=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 11, 3);						
						if (FrudChk.equalsIgnoreCase("pass")) {
							List<WebElement> bnk = Utilities.findElements(FraudchklstPass);
							bnk.get(0).click();							
							logger.
							  info("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Pass Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Pass Checkbox"
							  , "Pass CheckBox");
						}
						else if (FrudChk.equalsIgnoreCase("Fail")) {
							List<WebElement> bnk = Utilities.findElements(FraudchklstPass);
							bnk.get(1).click();
							
							logger.
							  info("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Fail Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option Fail Checkbox"
							  , "Fail CheckBox");
						}
						else if (FrudChk.equalsIgnoreCase("N/A")) {
							List<WebElement> bnk = Utilities.findElements(FraudchklstPass);
							bnk.get(2).click();							
							logger.
							  info("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option N/A Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the Fraud Checks - Multiple cash withdrawals after payday: round amounts: Capitec accounts(be weary) checklist column option N/A Checkbox"
							  , "N/A CheckBox");
						}						
                   String Nodebtodr=ExcelFunctions.getCellValue(ExcelPath, "sheet1", 11, 3);						
						if (Nodebtodr.equalsIgnoreCase("pass")) {
							List<WebElement> bnk = Utilities.findElements(NodebiChklstPass);
							bnk.get(0).click();							
							logger.
							  info("Clicked on the No Debit Order, layout of bank statements checklist column option Pass Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the No Debit Order, layout of bank statements checklist column option Pass Checkbox"
							  , "Pass CheckBox");
						}
						else if (Nodebtodr.equalsIgnoreCase("Fail")) {
							List<WebElement> bnk = Utilities.findElements(NodebiChklstPass);
							bnk.get(1).click();							
							logger.
							  info("Clicked on the No Debit Order, layout of bank statements checklist column option Fail Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the No Debit Order, layout of bank statements checklist column option Fail Checkbox"
							  , "Fail CheckBox");
						}
						else if (Nodebtodr.equalsIgnoreCase("N/A")) {
							List<WebElement> bnk = Utilities.findElements(NodebiChklstPass);
							bnk.get(2).click();							
							logger.info("Clicked on the No Debit Order, layout of bank statements checklist column option N/A Checkbox"
							  ); com.utility.ExtentReporter.
							  extentLoggerPass("Clicked on the No Debit Order, layout of bank statements checklist column option N/A Checkbox"
							  , "N/A CheckBox");
						}	
						Utilities.waitTime(2000);
						Utilities.JSClick(ChklstSaveBtn, "CheckList Save Button");
						
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
		String FinalSubmissionMsg=	Utilities.getText(FinalSubmissionMSG);
		logger.info("The Final Submission Message is displayed as a "+ "" +FinalSubmissionMsg);
		com.utility.ExtentReporter.extentLoggerPass(FinalSubmissionMsg, "The Final Submission Message is displayed as a ");
			Utilities.verifyElementPresent(ApproveValsBtn, "Approve Vals Button");			
			Utilities.verifyElementPresent(RejectValsBtn, "Reject Vals Button");	
			
			
			String POROutCmTabl=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 2, 16);
			if (POROutCmTabl.equalsIgnoreCase("Approve")) 
			{
				Utilities.JSClick(PorApprovebtn, "POR Outcome Approve button");
			String	porOuStatus=Utilities.getText(POROutCmStatus);
			logger.info("POR Outcome Status is"+ "" +porOuStatus);
			com.utility.ExtentReporter.extentLogger("The POR Outcome Status is", porOuStatus);
				
			}
			else if (POROutCmTabl.equalsIgnoreCase("Reject")) 
			{
				Utilities.JSClick(PorRejectBtn, "por outcome Reject btn");
				
				String PorRejCtRsn=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 10, 16);
				if (PorRejCtRsn.equalsIgnoreCase("Click"))
				{
					Utilities.click(PORRejSubMtAdd, "Submit Valid Proof of Address CheckBox");					
				}
				String PorRejDclr=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 11, 16);
				if (PorRejDclr.equalsIgnoreCase("Click")) 
				{
					Utilities.click(PORDeclare, "Submit POA Declaration Evidence CheckBox");
					
				}
				
				Utilities.JSClick(PORSveBtn, "POR OUTcome Rejection Reason option screen Save Button");
				String	porOuStatus=Utilities.getText(POROutCmStatus);
				logger.info("POR Outcome Status is"+ "" +porOuStatus);
				com.utility.ExtentReporter.extentLogger("The POR Outcome Status is", porOuStatus);
				
				
			}
			else if (POROutCmTabl.equalsIgnoreCase("Retry"))
			{
				Utilities.JSClick(PORRetryBtn, "POR Outcome Retry Button");
				String	porOuStatus=Utilities.getText(POROutCmStatus);
				logger.info("POR Outcome Status is"+ "" +porOuStatus);
				com.utility.ExtentReporter.extentLogger("The POR Outcome Status is", porOuStatus);
				
			}
			
			Utilities.verifyElementPresent(PORAddBtn, "POR Outcome Add Button");
			Utilities.verifyElementPresent(PORViewBtn, "POR Outcome View Button");
			
			String KycFraudOutCm=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 3, 16);
			if (KycFraudOutCm.equalsIgnoreCase("Approve")) 
			{
				Utilities.JSClick(KYCOutcomeApproveBtn, "KYC Fraud Outcome Approve Button");
				String	KYCFrudOutCmStatus=Utilities.getText(KYCFrudStatus);
				logger.info("POR Outcome Status is"+ "" +KYCFrudOutCmStatus);
				com.utility.ExtentReporter.extentLogger("The POR Outcome Status is", KYCFrudOutCmStatus);
				
			}
			else if (KycFraudOutCm.equalsIgnoreCase("Reject")) 
			{
				Utilities.JSClick(KYCOutcomeRejectbtn, "KYC Fraud Outcome Reject Button");
				String KycFrudRejResons=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 0, 0);
				if (KycFrudRejResons.equalsIgnoreCase("click")) 
				{
					
					
				}
				
				
				
				String	KYCFrudOutCmStatus=Utilities.getText(KYCFrudStatus);
				logger.info("POR Outcome Status is"+ "" +KYCFrudOutCmStatus);
				com.utility.ExtentReporter.extentLogger("The POR Outcome Status is", KYCFrudOutCmStatus);
			}
			
			else if (KycFraudOutCm.equalsIgnoreCase("Retry")) 
			{
				Utilities.JSClick(KYCOutcomeRetryBtn, "KYC OUTCOME Retry Button");
				String	KYCFrudOutCmStatus=Utilities.getText(KYCFrudStatus);
				logger.info("POR Outcome Status is"+ "" +KYCFrudOutCmStatus);
				com.utility.ExtentReporter.extentLogger("The POR Outcome Status is", KYCFrudOutCmStatus);
			}
			
			String AMLOutComeTabl=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 4, 16);
			if (AMLOutComeTabl.equalsIgnoreCase("Retry"))
			{
				Utilities.JSClick(AMLOutcomeRetryBtn, "AML Outcome Retry Button");
				String	AMLOutCmStatus=Utilities.getText(AMLOutcmStatus);
				logger.info("POR Outcome Status is"+ "" +AMLOutCmStatus);
				com.utility.ExtentReporter.extentLogger("The POR Outcome Status is", AMLOutCmStatus);
				
			}
			
			String FinalApprove_ApproveVals=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 1, 19);
			if (FinalApprove_ApproveVals.equalsIgnoreCase("Click"))
			{
				Utilities.JSClick(ApproveValsBtn, "Approve Vals Button");
				
			}
			String FinalApprove_RejectVals=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 2, 19);
			if (FinalApprove_RejectVals.equalsIgnoreCase("Reject")) 
			{
				Utilities.JSClick(RejectValsBtn, "Reject Vals Button");
				
			}
				
			}
		//AVS and POI Outcome from the Validation Statuses Table
		public static void AVSandPOI_Outcome() throws Exception
		{
			
			 Utilities.waitTime(10000);
			 Utilities.ScrollToTheElement(ActivateAutoRefreshBtn);
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
							

			Utilities.ScrollToTheElement(validationStatus);
			String ThirtyDayPayoutChkApprove=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 2, 10);
			if (ThirtyDayPayoutChkApprove.equalsIgnoreCase("Approve"))
			{
		
				Utilities.JSClick(thirtyDayApprove, "30-Day PAy Out Check Approve Button");
				Utilities.waitTime(3000);
				String Thirtystatus=Utilities.getText(AllstatusColumn);
				logger.info("The Thiry Day Payout Check Status is"+Thirtystatus);
				com.utility.ExtentReporter.extentLogger("The Satus Column status IS", Thirtystatus);
			}
			else if (ThirtyDayPayoutChkApprove.equalsIgnoreCase("Retry"))
			{
				Utilities.JSClick(ThirtydayRetry, "Thirty Day Pay Out Check Retry Button");
				String Thirtystatus=Utilities.getText(AllstatusColumn);
				logger.info("The Thiry Day Payout Check Status is"+Thirtystatus);
				com.utility.ExtentReporter.extentLogger("The Satus Column status IS", Thirtystatus);
				}
			
			String KYCOutcomeTabl=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 3, 10);
			System.out.println(KYCOutcomeTabl);
			if (KYCOutcomeTabl.equalsIgnoreCase("Approve"))
			{
				//Utilities.JSClick(KycoutmApprove, "KYC Outcome Approve Button");
				Utilities.waitForElementAndClickIfPresent(KycoutmApprove, 10, "KYC Outcome Approve Button");
			String KycOutcm=Utilities.getText(AllstatusColumn);
			logger.info("KYC OUTCOME The Status is"+KycOutcm);
			com.utility.ExtentReporter.extentLoggerPass("KYC OUTCOME The Status is", KycOutcm);
				
			}else if (KYCOutcomeTabl.equalsIgnoreCase("Reject"))
			{
				Utilities.waitForElementAndClick(KYCReject, 10, "KYC Outcome Reject Button");
				Utilities.JSClick(KYCReject, "KYC Outcome Reject Button");
				
				String KycoutRejctReasons_ResubmitID=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 1, 13);
				if (KycoutRejctReasons_ResubmitID.equalsIgnoreCase("Click"))
				{
					Utilities.JSClick(KycRejctResubmitcopychkbox, "Resubmit ID Copy CheckBox");
					
				}
				String KycouAmendcustiddc=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 2, 13);
				if (KycouAmendcustiddc.equalsIgnoreCase("Click"))
				{
					Utilities.JSClick(KycRejectAmendcustCheckbox, "Amend cust name per ID doc CheckBox");
					
				}
				String KycResubmtBckfrnt=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 3, 13);
				if (KycResubmtBckfrnt.equalsIgnoreCase("Click"))
				{
					Utilities.JSClick(KycBackfronCheckbox, "Resubmit back/front of ID Card CheckBox");
					
				}
				String KycSubMarriage=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 4, 13);
				if (KycSubMarriage.equalsIgnoreCase("Click"))
				{
					Utilities.JSClick(KycSubmtMarriageCheckBox, "Submit marriage certificate CheckBox");
					
				}
				String SubmtIdtmp=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 5, 13);
				if (SubmtIdtmp.equalsIgnoreCase("Click"))
				{
					Utilities.JSClick(SumtAfdivitCheckBox, "Submit affidavit - tempID/PPT CheckBox");
					
				}
				Utilities.JSClick(KycoutRejectSavebtn, "Kyc Oucome Select Rejecttion result Save button");
				String KycOutcm=Utilities.getText(AllstatusColumn);
				logger.info("The KYC Outcome Status is"+KycOutcm);
				com.utility.ExtentReporter.extentLoggerPass("KYC OUTCOME The Status is", KycOutcm);
						
			}
			else if (KYCOutcomeTabl.equalsIgnoreCase("Retry"))
			{
				Utilities.JSClick(KycRetry, "KYC Outcome Retry Button");
				Utilities.waitTime(3000);
				String KycOutcm=Utilities.getText(AllstatusColumn);
				logger.info("The Thiry Day Payout Check Status is"+KycOutcm);
				com.utility.ExtentReporter.extentLoggerPass("KYC OUTCOME The Status is", KycOutcm);
				
			}

			

	String AVsoucmTabl=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 4, 10);
	if (AVsoucmTabl.equalsIgnoreCase("Approve"))
	{
		Utilities.waitTime(2000);
		//Utilities.JSClick(AVSApprove, "AVS Approve Button");
		Utilities.waitForElementAndClick(AVSApprove, 10, "AVS Approve Button");
		Utilities.waitTime(2000);
		String AVSOutCMStaus=Utilities.getText(AllstatusColumn);
		logger.info("The AVSOutocme Status is"+AVSOutCMStaus);
		com.utility.ExtentReporter.extentLoggerPass("The AVS OUTCOME The Status is", AVSOutCMStaus);
	}
	else if (AVsoucmTabl.equalsIgnoreCase("Reject"))
	{
		Utilities.waitTime(2000);
		Utilities.waitForElementAndClick(AVSRejctbtn, 10, "Reject button for the AVS Outcome");
		Utilities.JSClick(AVSRejctbtn, "Reject button for the AVS Outcome");
		Utilities.waitTime(2000);
		Utilities.JSClick(AvsRejectBtnSec, "Reject button for the AVS Outcome");
		
		String AVSBankdetBlngToCust=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 8, 13);
		if (AVSBankdetBlngToCust.equalsIgnoreCase("Click"))
		{
			Utilities.JSClick(SlctReasonAVSBankDetailschkbox, "Bank details must belong to customer CheckBox");
			
		}
		String AVSAmendBnkChk=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 9, 13);
		
		
		if (AVSAmendBnkChk.equalsIgnoreCase("Click"))
		{
			Utilities.JSClick(SlctReasonAmendBnkChkbox, "Amend Banking Details CheckBox");
		}
		
        Utilities.JSClick(SaveBtnreason, "AVS Oucome Select Rejecttion result Save button");
		Utilities.waitTime(3000);
		String AVSOutCMStaus=Utilities.getText(AllstatusColumn);
		logger.info("The AVSOutocme Status is"+AVSOutCMStaus);
		com.utility.ExtentReporter.extentLoggerPass("The AVS OUTCOME The Status is", AVSOutCMStaus);
		
	}
	else if (AVsoucmTabl.equalsIgnoreCase("Retry")) 
	{
		Utilities.JSClick(AVSRetryBtn, "Retry button for the AVS Outcome");
		Utilities.waitTime(3000);
		String AVSOutCMStaus=Utilities.getText(AllstatusColumn);
		logger.info("The AVSOutocme Status is"+AVSOutCMStaus);
		com.utility.ExtentReporter.extentLoggerPass("The AVS OUTCOME The Status is", AVSOutCMStaus);
	}
	
	String POIOutCmTable=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 5, 10);
	if (POIOutCmTable.equalsIgnoreCase("Approve"))
	{
		Utilities.waitForElementAndClick(PoiotcmApproveBtn, 10, "POI Outcome Approve button");
		Utilities.JSClick(PoiotcmApproveBtn, "POI Outcome Approve button");
		Utilities.waitTime(3000);
		String POIOutCmStatus=Utilities.getText(AllstatusColumn);
		logger.info("The POI Outocme Status is"+POIOutCmStatus);
		com.utility.ExtentReporter.extentLoggerPass("The POI OUTCOME The Status is", POIOutCmStatus);
		
	}
	else if (POIOutCmTable.equalsIgnoreCase("Reject"))
	{
		Utilities.JSClick(POIReject, "POI Outcome Reject button");
		Utilities.waitTime(3000);
		//Utilities.verifyElementPresentAndClick(POIReject, "POI Outcome Reject button");
		Utilities.waitForElementAndClickIfPresent(POIReject, 10, "POI Outcome Reject button");
		
		String SubMt3Mnt=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 6, 6);
		if (SubMt3Mnt.equalsIgnoreCase("Click"))
		{
			Utilities.click(POIsubmt3mntchkbox, "Submit 3 months’ BS CheckBox");
			Utilities.waitTime(1000);
			
		}
		String SubMt3AddChkBx=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 7, 6);
		if (SubMt3AddChkBx.equalsIgnoreCase("Click"))
		{
			Utilities.click(POIAdd3mntChkBox, " Submit 3 additional months’ BS");
			Utilities.waitTime(1000);
		}
		String SuMtPAySlp=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 8, 6);
		if (SuMtPAySlp.equalsIgnoreCase("Click"))
		{
			Utilities.click(POISubmtpayslipChkBx, " Submit payslip CheckBox");
			Utilities.waitTime(1000);
		}
		
		String ITA34ChBx=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 9, 6);
		if (ITA34ChBx.equalsIgnoreCase("Click"))
		{
			Utilities.click(POIITA34ChkBx, "Submit ITA34 CheckBox");
			Utilities.waitTime(1000);
		}
		
		String SubMtPensionLtr=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 10, 6);
		if (SubMtPensionLtr.equalsIgnoreCase("Click"))
		{
			Utilities.click(POIPensnltrChkBox, "Submit pension letter CheckBox");
			Utilities.waitTime(1000);
		}
		String SuMtIncrLt=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 11, 6);
		if (SuMtIncrLt.equalsIgnoreCase("Click"))
		{
			Utilities.click(POISubmtInLtrChkBx, "Submit increase letter CheckBox");
			Utilities.waitTime(1000);
		}
		String SubCIPC=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 12, 6);
		if (SubCIPC.equalsIgnoreCase("Click"))
		{
			Utilities.click(POISubmtCIPCChkBx, " Submit latest CIPC cert. CheckBox");
			Utilities.waitTime(1000);
		}
		String AuditDFinSat=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 13, 6);
		if (AuditDFinSat.equalsIgnoreCase("Click"))
		{
			Utilities.click(POIFinsatChkBox, "Submit latest audited FinStat. CheckBox");
		}
		String AmeNdIcmDe=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 14, 6);
		if (AmeNdIcmDe.equalsIgnoreCase("Click"))
		{
			Utilities.JSClick(POIDetResbmtChkBox, " Amend income details &resubmit CheckBox");					
		}
		Utilities.waitTime(5000);
		Utilities.JSClick(POIRechkSaveButn, "POI Oucome Select Rejecttion result Save button");
		Utilities.waitTime(3000);
		String POIOutCmStatus=Utilities.getText(POIOutcmStatusCl);
		logger.info("The POI Outocme Status is"+POIOutCmStatus);
		com.utility.ExtentReporter.extentLoggerPass("The POI OUTCOME The Status is", POIOutCmStatus);
	}
			
			
		}
		}
		
		
		


