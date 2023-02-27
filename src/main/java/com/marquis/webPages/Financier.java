package com.marquis.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import com.driverInstance.DriverInstance;
import com.driverInstance.DriverManager;
import com.excel.ExcelFunctions;
import com.utility.LoggingUtils;
import com.utility.Utilities;

public class Financier 
{
	
	static LoggingUtils logger = new LoggingUtils();

	static ExcelFunctions xcl = new ExcelFunctions();

	public static String ExcelPath = "./XLSX/Operational PortalDataForm.xlsx";

	public static SoftAssert softassert = new SoftAssert();

	public static String xlpath = "Marquis/XLSX/Operational PortalDataForm.xlsx";
	
	
	//Username
	public static By UserID=By.xpath("//form/dl/dt/label[@class='required label-right']//following::input[@id='UserId']");
	
	//Password
	public static By PAssword=By.xpath("//form/dl/dt/label[@class='required label-right']//following::input[@id='Password']");
	
	//Login Button
	public static By LoginBtn=By.id("btn-login");
	
	//Agreement Reference field
	public static By agreementRefFld=By.xpath("//div/dl/dd[2]/input[contains(@id,'AgreementReference')]");
	
	//Search Button
	public static By SearchBtn=By.xpath("//div/input[contains(@id,'btn-customersearch')]");
	
	//Customer-Reference Icon
	public static By CustOmerRefIcn=By.xpath("//td/a/i[contains(@class,'icon-user')]");
	
	//Agreement Reference number
	public static By AggRefNumber=By.xpath("//div/div/table/tbody/tr/td/a[contains(@class,'editproposal')]");
	
	
	public static By SelectAgreementNumber(String AgreementNo)
	{
		return By.xpath("//parent::td/parent::tr/descendant::a[text()='"+AgreementNo+" ']");
	}
	
	
	//Product Column Name
	public static By Produ=By.xpath("//h4[contains(text(),'Agreements')]//ancestor::div[2]/following-sibling::div/child::div[@class='fulltableContent singleTable']/child::div[2]/descendant::th[text()='Product']");
	
	//Additional Details Header menu
	public static By AdditionalhedrMnu=By.xpath("//div/div[1]/a[contains(@class,'unlockagreementonproposal')]");
	
	//Edit Additional Details option
	public static By EditAdditionalDetoption=By.xpath("//div/a[contains(@class,'btn btn-edit btn-primary editAgreementAdditionalLink')]");
	
	//AML Response field title
	public static By AMLRespoFldTitle=By.xpath("//label[@for='AgreementDetailsSection_AgreementAdditionalDetails_187__AML_Response']");
	
	//AML Response field
	public static By AMLRespoFld=By.xpath("//label[@for='AgreementDetailsSection_AgreementAdditionalDetails_187__AML_Response']//following::input[@id='AgreementDetailsSection_AgreementAdditionalDetails_187__FieldValue']");
	
	//Save Button
	public static By SaveBtns=By.xpath("//input[@id='btn-save-adddet']");

	
	//Upload Documents header menu
	public static By UpldDocHedrMnu=By.xpath("//div[@class='ribbon-outerdiv']/child::div[@id='ribbon-Documents']");
	
	//Drop down click
	public static By Finadropdownclick=By.xpath("//dt[text()='Upload a document']/parent::dl/child::dd/div/child::button[@type='button']");

	//Select File
	public static By SelectFileBtn=By.xpath("//span[@class='btn btn-primary btn-edit btn-attach-doc']");
	//URL Field
	public static By URLFld=By.id("AgreementDetailsSection_AgreementDocumentUploadDetails_documentUrl");
	//Save Button
	public static By URlSaveBtns=By.xpath("//div[@class='modal-footer']//child::button[text()='Save']");
	//Cancel button
	public static By CancelBtn=By.xpath("//button[@class='close close-library-modal']");
	//Invoice
	public static By Invoice=By.xpath("//*[@id=\"CreateAgreementPage\"]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/dl/dd[1]/div/div/ul/li[13]/a/span");
	//Signed option
	public static By sig=By.xpath("//*[@id=\"CreateAgreementPage\"]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/dl/dd[1]/div/div/ul/li[24]/a/span");
	//Signed Contract PAck
	public static By SignedContractPck=By.xpath("//*[@id=\"CreateAgreementPage\"]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/dl/dd[1]/div/div/ul/li[25]/a/span");
	
	
	
	public static void Financier_Login() throws Exception
		{
			
			DriverManager.getDriver().get("https://web.financier.uat-mqf.co.za/LogOn?ReturnUrl=%2fCustomer");//
	
			Utilities.clearField(UserID, "USER ID Field");
			Utilities.type(UserID, "bhairub", "USER ID Field");
	
			Utilities.clearField(PAssword, "Password Field");
			Utilities.type(PAssword, "Caravelle", "Password Field");
			
			Utilities.click(LoginBtn, "Login Button");
			
		}
	
	public static void Financier_Search() throws Exception
		{
			
		
			Utilities.clearField(agreementRefFld, "Agreement Reference Field");
			Utilities.type(agreementRefFld, "2000007606", "Agreement Reference Filed");
	
			Utilities.click(SearchBtn, "Search Button");
			
			Utilities.waitTime(2000);
			Utilities.click(CustOmerRefIcn, "customer Reference Icon");
			
		}
	
	public static void Finacier_AML_Outcome() throws Exception
		{
			
			/*Financier_Login();
			Financier_Search();*/
			Utilities.ScrollToTheElement(Produ);
			
			
		
			Utilities.click(SelectAgreementNumber("2000007606"), "Aggrement No from the history");
			
			Payout_DocUpload();
			
		Utilities.click(AdditionalhedrMnu, "Additional Details Header menu");
			
			Utilities.click(EditAdditionalDetoption, "Edit Additional Details option");
			
			Utilities.ScrollToTheElement(AMLRespoFldTitle);
			
			Utilities.clearField(AMLRespoFld, "AML Response field");
			
			Utilities.type(AMLRespoFld, "APPROVED", "AML Response field");
			
			Utilities.ScrollToTheElement(SaveBtns);
			
			Utilities.click(SaveBtns, "Save Button");
			
			//Utilities.BrowsertearDown();
			
		}
	
	public static void Payout_DocUpload() throws Exception
		{
			
				Utilities.waitTime(2000);
				Utilities.click(UpldDocHedrMnu,"Upload Documents header menu");
			
				/*
				     Invoice
				*/
				
				Utilities.waitTime(3000);
				Utilities.click(Finadropdownclick, "Acquisiton Validation drop down");
				Utilities.click(Invoice, "Invoice Option");
				Utilities.click(SelectFileBtn, "Attch From URL Option");
				Utilities.type(URLFld, "C:\\Users\\User\\Marquis\\Daily Automation\\from MAster\\Documents\\INVOICE.pdf", "URL Field");
				Utilities.click(URlSaveBtns, "Save Button");
				Utilities.waitTime(1000);
				Utilities.click(CancelBtn, "Cancel Button");
				
			/*
			   Signed Contract PAck
			*/
			
				Utilities.waitTime(2000);
				Utilities.click(Finadropdownclick, "Acquisiton Validation drop down");
				Utilities.ScrollToTheElement(sig);
				Utilities.click(SignedContractPck, "Signed Contract Pack Option");
				Utilities.click(SelectFileBtn, "Attch From URL Option");
				Utilities.type(URLFld, "C:\\Users\\User\\Marquis\\Daily Automation\\from MAster\\Documents\\Signed Contract Pack.pdf", "URL Field");
				Utilities.click(URlSaveBtns, "Save Button");
				Utilities.waitTime(1000);
				Utilities.click(CancelBtn, "Cancel Button");
				
         }
}
