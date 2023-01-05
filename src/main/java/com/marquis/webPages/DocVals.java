package com.marquis.webPages;

import org.openqa.selenium.By;
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
	
	
	
	
	    //Document Validations Side-Menu
		public static By DocValsSdMnu=By.xpath("(//b[normalize-space()='Document Validations'])[1]");
		
		
		//Doc Vals Page Header
		public static By DocValsPAgeHeader=By.xpath("(//div/b[text()='Document Validations'])");
		
		//Select Template field header
		public static By SelctTemplateFldHeader=By.xpath("//label[text()='Select Template ']");
		
		//MAnual Refresh Option
		public static By MAnualRefreshOption=By.xpath("//button[text()=' Manual Refresh ']");

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
		public static By SelctTmplate=By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']");
		
		//Search Icon
		public static By searchIcon=By.xpath("//button[@class='btn btn-primary ng-star-inserted']//i[@class='pi pi-search']");
		
		
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
			
			Utilities.click(SelctTmplate, "Select Template");
			Utilities.selectByVisibleTextByLocator(SelctTmplate, "agreementNumber");
			
			Utilities.verifyElementPresent(searchIcon, "Search Icon");
			
			
			
			
			
			
			
			
			
		}

}
