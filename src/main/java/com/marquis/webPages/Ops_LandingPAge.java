package com.marquis.webPages;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.excel.ExcelFunctions;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import com.utility.Utilities;

import ch.qos.logback.classic.pattern.Util;

public class Ops_LandingPAge 
{
static LoggingUtils logger=new LoggingUtils();
	
	static ExcelFunctions xcl=new ExcelFunctions();
	
	public static String ExcelPath="./XLSX/Operational PortalDataForm.xlsx";
	
	static SoftAssert softassert=new SoftAssert();
	
	public SoftAssert softAssert=new SoftAssert();
	
	public static String xlpath = "Marquis/XLSX/Operational PortalDataForm.xlsx";
	
	
	
	//MQ Logo
	public static By MqLogos=By.xpath("//div[@class='col-4 align-items-center']/..//img[@class='img-fluid-logo']");
	
	//HAmburger Button
	public static By HamburgrBtn=By.xpath("(//i[@class='pi pi-bars '])[1]");
	
	//Logout Button
	public static By LogoutBtn=By.xpath("//i[@class='pi pi-sign-out p-2'][1]");
	
	//Dealerships Request MEnu
	public static By DealerShpReqMnu=By.xpath("//b[normalize-space()='Dealerships Requests']");
	
	//Car Icon for the Dealerships Requests side menu
	public static By CarIconfrDelrShpReq=By.xpath("//i[@class='pt-2 pi pi-car'][1]");
	
	//Dealer Maintenance Verification Queue
	public static By DlrMaintnVerQu=By.xpath("(//b[normalize-space()='Dealer Maintenance Verification Queue'])[1]");
	
	//Pencil Icon for the Dealer Maintenance Verification Queue side menu
	public static By Pencil=By.xpath("(//i[@class='pt-2 pi pi-pencil'])[1]");
	
	//Dealer Group Profile Requests Side menu
	public static By DlrGrupProReq=By.xpath("(//b[normalize-space()='Dealer Group Profile Requests'])[1]");
	
	//Icon for the Dealer Group Profile Requests Side menu
	public static By DlrGrupProReqIcon=By.xpath("(//i[@class='pt-2 pi pi-list'])[1]");
	
	//Cancel Agreement Side-Menu
	public static By CanclAgremnt=By.xpath("(//b[normalize-space()='Cancel Agreement'])[1]");
	
	//Cancel Agreement Side-Menu Icon
	public static By CanclAgrmntIcon=By.xpath("(//i[@class='pt-2 pi pi-times-circle'])[1]");
	
	//Agreements Comments Side-Menu
	public static By AgreemntCmnts=By.xpath("(//b[normalize-space()='Agreement Comments'])[1]");
	
	//Agreements Comments Side-Menu Icon
	public static By AgreemntCmntsIcon=By.xpath("(//i[@class='pt-2 pi pi-comments'])[1]");
	
	//Email Correspondence Side Menu
	public static By EmlCrspnds=By.xpath("(//b[normalize-space()='Email Correspondence'])[1]");
	
	//Email Correspondence Side Menu Icon
	public static By EmlCrspndsIcon=By.xpath("(//i[@class='pt-2 pi pi-envelope'])[1]");
	
	//Document Validations Side-Menu
	public static By DocValsSdMnu=By.xpath("(//b[normalize-space()='Document Validations'])[1]");
	
	//Document Validations Side-Menu Icon
	public static By DocValsSdMnuIcon=By.xpath("(//i[@class='pt-2 pi pi-sitemap'])[1]");
	
	//Payouts Side-Menu
	public static By PayoutsSdMnu=By.xpath("(//b[normalize-space()='Payouts'])[1]");
	
	//Payouts Side-Menu Icon
	public static By PayoutSidMnuIcon=By.xpath("(//i[@class='pt-2 pi pi-money-bill'])[1]");
	
	//Admin WorkFlow Side-Menu
	public static By AdmnWrkflw=By.xpath("(//b[normalize-space()='Admin Workflow'])[1]");
	
	//Admin WorkFlow Side-Menu Icon
	public static By AdmnWrkIcon=By.xpath("(//i[@class='pt-2 pi pi-cog'])[1]");
	
	//Sales Admin Workflow Side-Menu
	public static By SalesAdmnWrkFlw=By.xpath("(//b[normalize-space()='Sales Admin Workflow'])[1]");
	
	//Sales Admin Workflow Side-Menu Icon
	public static By SalesAdminIcon=By.xpath("(//i[@class='pt-2 pi pi-chart-bar'])[1]");
	
	//Financial Interest Checks Side-Menu
	public static By FinancialIntrstChks=By.xpath("(//b[normalize-space()='Financial Interest Checks'])[1]");
	
	//Financial Interest Checks Side-Menu Icon
	public static By FinancialIntstIcon=By.xpath("(//i[@class='pt-2 pi pi-history'])[1]");
	
	//Templates side-Menu
	public static By Templates=By.xpath("(//b[normalize-space()='Templates'])[1]");
	
	//Templates side-Menu Icon
	public static By TemplatesIcon=By.xpath("(//i[@class='pt-2 pi pi-share-alt'])[1]");
	
	//Dealer list header
	public static By Deallsthedr=By.xpath("(//div[@class='card-header gotham'])[1]");
	
	//Dealerships maintenance Queue header
	public static By DealrshpQueheader=By.xpath("(//div[@class='card-header gotham'])[1]");
	
	
	//Dealer Group Profile List
	public static By dealergruplstheader=By.xpath("//*[text()='Dealer Group Profiles List']");
	
	
	//Cancel Agreement page header
	public static By CanclAgheader=By.xpath("(//div[@class='card-header gotham'])[1]");
	
	//Agreements Comments page header
	public static By AgreemntsHeader=By.xpath("(//div[@class='card-header gotham'])");
	
	
	//Email Corresponds page header
	public static By EmalCrspndsHeader=By.xpath("(//div[text()=' Email Correspondence '])");
	
	//Doc Vals Page Header
	public static By DocValsPAgeHeader=By.xpath("(//div/b[text()='Document Validations'])");
	
	//PAyouts PAge header
	public static By PAyouPgHeader=By.xpath("//*[text()=' Payouts ']");
	
	//Admin Workflow PAge HEader
	public static By AdminwrkflwPgHeader=By.xpath("//div[@class='card-header gotham'][1]");
	
	//Sales Admin WorkFlow PAge Header
	public static By SalsAdminWrkFlwPGHeader=By.xpath("(//div[@class='col-8 gotham'])");
	
	//Financial Interest Checks PAge HEader
	public static By FinacialPageHeader=By.xpath("//div[text()=' Financial Interest Checks ']");
	
	//Templates Page Header
	public static By TemplatesPGHeader=By.xpath("//div[@class='card-header gotham']");
	
	
	public static void OPs_LandPage() throws Exception
	{
		ExtentReporter.HeaderChildNode("TC_006" + "  " + "Verify the UI of the Operational Portal Landing Page" + "  " + "TC_007" + "  " + "Verify the functionality of the Operational Portal Landing Page");
		//Utilities.pageloadtimeout(5000);
		Utilities.getTitle("Marquis Finance");
		
		String ActualURl=Utilities.getBrowserCurrentUrl();
		String ExpectedUrl="https://www.operations.uat-mqf.co.za/dealerships";
		softassert.assertEquals(ActualURl, ExpectedUrl);
		logger.info("The Url Is Matched");
		ExtentReporter.extentLogger(ActualURl, ExpectedUrl);
		
		
		Utilities.verifyElementPresent(Ops_LandingPAge.MqLogos, "MQ Logo");
		//Utilities.imageVerification(Ops_LandingPAge.MqLogos, "Marquis Finance Logo");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.HamburgrBtn, "Hamburger Button");
		
		
		Utilities.verifyIsElementDisplayed(Ops_LandingPAge.LogoutBtn, "Logout Button");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.DealerShpReqMnu, "Dealerships Requests side-menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.CarIconfrDelrShpReq, "Car Icon for the Dealerships Requests side-menu");
		
		
		Utilities.verifyElementPresent(Ops_LandingPAge.DlrMaintnVerQu, "Dealer Maintenance Verification Queue Side-Menu");
		
	
		Utilities.verifyElementPresent(Ops_LandingPAge.Pencil, "Pencil Icon for the Dealer Maintenance Verification Queue Side-Menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.DlrGrupProReq, "Dealer Group Profile Requests Side menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.DlrGrupProReqIcon, "The Dealer Group Profile Requests Side menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.CanclAgremnt, "CAncel Agreement");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.CanclAgrmntIcon, "Cancel Agreement Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.AgreemntCmnts, "Agreements Comments Side-Menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.AgreemntCmntsIcon, "Agreements Comments Side-Menu ICon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.EmlCrspnds, "Email Correspondence Side Menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.EmlCrspndsIcon, "Email Correspondence Side Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.DocValsSdMnu, "Document Validations Side-Menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.DocValsSdMnuIcon, "Document Validations Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.PayoutsSdMnu, "PayOuts Side-Menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.PayoutSidMnuIcon, "Payouts Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.AdmnWrkflw, "Admin WorkFlow Side-Menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.AdmnWrkIcon, "Admin WorkFlow Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.SalesAdmnWrkFlw, "Sales Admin Workflow Side-Menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.SalesAdminIcon, "Sales Admin Workflow Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.FinancialIntrstChks, "Financial Interest Checks Side-Menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.FinancialIntstIcon, "Financial Interest Checks Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.Templates, "Templates side-Menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.TemplatesIcon, "Templates side-Menu Icon");
		
		/*
		 * Functional
		 * 
		 */
		
		Utilities.implicitWait(3000);
		Utilities.click(Ops_LandingPAge.MqLogos, "MQ Logo");
		Utilities.verifyElementPresent(Ops_LandingPAge.Deallsthedr, "Dealers List page header");
		
		Utilities.click(Ops_LandingPAge.HamburgrBtn, "HAmburger Button");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.CarIconfrDelrShpReq, "Car Icon for the Dealerships Requests side-menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.Pencil, "Pencil Icon for the Dealer Maintenance Verification Queue Side-Menu");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.DlrGrupProReqIcon, "The Dealer Group Profile Requests Side menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.CanclAgrmntIcon, "Cancel Agreement Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.AgreemntCmntsIcon, "Agreements Comments Side-Menu ICon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.EmlCrspndsIcon, "Email Correspondence Side Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.DocValsSdMnuIcon, "Document Validations Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.PayoutSidMnuIcon, "Payouts Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.AdmnWrkIcon, "Admin WorkFlow Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.SalesAdminIcon, "Sales Admin Workflow Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.FinancialIntstIcon, "Financial Interest Checks Side-Menu Icon");
		
		Utilities.verifyElementPresent(Ops_LandingPAge.FinancialIntstIcon, "Financial Interest Checks Side-Menu Icon");
		
		
		Utilities.click(Ops_LandingPAge.HamburgrBtn, "Hamburger Button");
		Utilities.implicitWait(3000);
		Utilities.JSClick(Ops_LandingPAge.DealerShpReqMnu, "DealerShip Request Menu");
		Utilities.implicitWait(3000);
		Utilities.verifyElementPresent(Ops_LandingPAge.Deallsthedr, "Dealers List page header");
		
		//Utilities.implicitWait(5000);
		Utilities.JSClick(Ops_LandingPAge.DlrMaintnVerQu, "Dealership maintainance Queue");
		Utilities.verifyElementPresent(Ops_LandingPAge.DealrshpQueheader, "Dealership maintainance Queue List page header");
		
		Utilities.JSClick(Ops_LandingPAge.DlrGrupProReq, "Dealer Group Profile Requests Side menu");
		//Utilities.implicitWait(5000);
		Utilities.verifyElementPresent(Ops_LandingPAge.dealergruplstheader, "Dealer Group Profile List page header");
		
		//Utilities.implicitWait(5000);
		Utilities.JSClick(Ops_LandingPAge.CanclAgremnt, "CAncel Agreement side-menu");
		Utilities.verifyElementPresent(Ops_LandingPAge.CanclAgheader, "Cancel Agreement page header");
		
		//Utilities.implicitWait(5000);
		Utilities.JSClick(Ops_LandingPAge.AgreemntCmnts, "Agreements Side Menu");
		Utilities.verifyElementPresent(Ops_LandingPAge.AgreemntsHeader, "Agreements Comments page header");
		
		//Utilities.implicitWait(5000);
		Utilities.JSClick(Ops_LandingPAge.EmlCrspnds, "Email Corresponds side-menu");
		Utilities.verifyElementPresent(Ops_LandingPAge.EmalCrspndsHeader, "Email Corresponds page header");
		
		//Utilities.implicitWait(5000);
		Utilities.JSClick(Ops_LandingPAge.DocValsSdMnu , "Document Validation Side-Menu");
		Utilities.verifyElementPresent(Ops_LandingPAge.DocValsPAgeHeader, "Doc Vals Page Header");
		
		Utilities.JSClick(Ops_LandingPAge.PayoutsSdMnu, "Pay out Side menu");
		Utilities.verifyElementPresent(Ops_LandingPAge.PAyouPgHeader, "Payouts Page Header");
		
		Utilities.JSClick(Ops_LandingPAge.AdmnWrkIcon, "Admin Workflow Side Menu");
		Utilities.verifyElementPresent(Ops_LandingPAge.AdminwrkflwPgHeader, "Admin Workflow PAge HEader");
		
		Utilities.JSClick(Ops_LandingPAge.SalesAdmnWrkFlw, "Sales Admin WorkFlow Side MEnu");
		Utilities.verifyElementPresent(Ops_LandingPAge.SalsAdminWrkFlwPGHeader, "Sales Admin WorkFlow PAge Header");
		
		Utilities.JSClick(Ops_LandingPAge.FinancialIntrstChks, "Financial Interest Checks Side Menu");
		Utilities.verifyElementPresent(Ops_LandingPAge.FinacialPageHeader, "Financial Interest Checks PAge Header");
		
		Utilities.JSClick(Ops_LandingPAge.Templates, "TEmplates Side Menu");
		Utilities.verifyElementPresent(Ops_LandingPAge.TemplatesPGHeader, "TEmplates PAge Header");
	}
	
	
	

}
