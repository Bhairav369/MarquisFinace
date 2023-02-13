package com.marquis.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

	static SoftAssert softassert = new SoftAssert();

	public SoftAssert softAssert = new SoftAssert();

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
	
	//Right Coarsely Button
	public static By RightCaroBtn=By.xpath("//div/a[contains(@id,'ribbonRight')]");
	
	//Upload Documents header menu
	public static By UpldDocHedrMnu=By.xpath("//div/a/span[contains(@class, 's-icon-doc-uploads')]");
	
	//Drop Down
	public static By upldDoc_Dropdown=By.xpath("//h4[normalize-space()='Uploaded Documents']//following::button[@data-id='AgreementDetailsSection_AgreementDocumentUploadDetails_DocumentTypeCode']");
	
	//Select File
	public static By SelectFileBtn=By.xpath("//h4[normalize-space()='Uploaded Documents']//following::input[@id='fileupload']");
	
	
	public static void Financier_Login() throws Exception
	{
		DriverInstance t=new DriverInstance("Chrome");
		DriverManager.getDriver().get("https://web.financier.uat-mqf.co.za/LogOn?ReturnUrl=%2fCustomer");
		
		//String USERID=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 0, 0);
		Utilities.clearField(UserID, "USER ID Field");
		Utilities.type(UserID, "bhairub", "USER ID Field");
		
		//String Password=ExcelFunctions.getCellValue(ExcelPath, "Sheet1", 0, 0);
		Utilities.clearField(PAssword, "Password Field");
		Utilities.type(PAssword, "Caravelle", "Password Field");
		
		Utilities.click(LoginBtn, "Login Button");
		
	}
	
	 public static void Financier_Search() throws Exception
	{
		
	
		Utilities.clearField(agreementRefFld, "Agreement Reference Field");
		Utilities.type(agreementRefFld, "2000007422", "Agreement Reference Filed");

		Utilities.click(SearchBtn, "Search Button");
		
		Utilities.waitTime(2000);
		Utilities.click(CustOmerRefIcn, "customer Reference Icon");
		
	}
	
	public static void Finacier_AML_Outcome() throws Exception
	{
		
		
		Utilities.ScrollToTheElement(Produ);
		
		
	
		Utilities.click(SelectAgreementNumber("2000007422"), "Aggrement No from the history");
		
		
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
		//Utilities.DoubleClick(RightCaroBtn, "Right Coarsely Button");
		//Utilities.click(RightCaroBtn, "Right Coarsely Button");
		//Utilities.click(RightCaroBtn, "Right Coarsely Button");
		
		Utilities.click(UpldDocHedrMnu, "Upload Documents header menu");
		
		Utilities.selectByVisibleTextByLocator(upldDoc_Dropdown, "DELIVERY NOTE");
		
		Utilities.click(SelectFileBtn, "Select File Option");
		Utilities.type(SelectFileBtn, "file:///C:/Users/User/Downloads/INVOICE.pdf", "DELIVERY NOTE");
		
		
		Utilities.selectByVisibleTextByLocator(upldDoc_Dropdown, "SIGNED CONTRACT PACK");
		Utilities.click(SelectFileBtn, "Select File Option");
		Utilities.type(SelectFileBtn, "file:///C:/Users/User/Downloads/INVOICE.pdf", "SIGNED CONTRACT PACK");
		
		
	}
}
