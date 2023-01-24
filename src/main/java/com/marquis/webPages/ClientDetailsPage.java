package com.marquis.webPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.excel.ExcelFunctions;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import com.utility.Utilities;

public class ClientDetailsPage {

	//ExcelFunctions xcl = new ExcelFunctions();
		static ExcelFunctions xcl = new ExcelFunctions();

		static LoggingUtils logger = new LoggingUtils();

		public static String xlpath = "./XLSX/MarquisDataForm.xlsx";

		//Add client header text
		public static By addClientHeader = By.id("ui-dialog-title-personClient_dlg");
		
		public static By addClientDetailsFrame = By.xpath("//*[@id='personClient_ifrm']");
		
		
		public static By physicalAddressFrame = By.xpath("//*[@id='addrPhysicalAddressId_ifrm']");
		
		public static By postalCodeFrame = By.xpath("//*[@id='conPCSearch_ifrm']");
		
		
		public static By addPostalAddressIframe = By.xpath("//*[@id='addrPostalAddressId_ifrm']");

		public static By sourceOfIncomeFrame = By.xpath("//*[@id='sourceOfIncome_ifrm']");
		
		public static By ifrm = By.xpath("//*[@id='ifrm']");
		
		public static By employerAddressFrame= By.xpath("//*[@id='addrEmp_ifrm']");
		
		
		public static By searchBankBranch = By.xpath("//*[@id='srchBankBranch_ifrm']");
		
		
		//Add client iFrame id
		public static By addClientFrame = By.id("personClient_ifrm");

		//Last name required field
		public static By addFirstName = By.id("txtLastName");

		//First name required field
		public static By addLastName = By.id("txtFirstName");

		//Title radio buttons
		public static By titleRadioButton(String title) {
	        return By.xpath("//*[@value='"+title+"']");
	    }

		//ID Type radio buttons
		public static By idTypeRadioButton(String idType) {
	        return By.xpath("//*[@value='"+idType+"']");
	    }
		

		//ID Number text field
		public static By idNumber = By.id("txtIDNumber");

		//Date of birth field
		public static By dateOfBirth = By.id("txtBirthDate");

		//Select citizenship/nationality field
		public static By citizenShipSelect = By.id("ddlCitizenshipCountryId");

		//Selected citizenship
		public static By selectedCitizenship = By.xpath("//*[@id=\"ddlCitizenshipCountryId\"]//*[text()=\"SOUTH AFRICA\"]");

		//Select country of birth field
		public static By countryBirthSelect = By.id("ddlCountryOfBirth");

		//Selected country of birth
		public static By selectedCountryBirth = By.xpath("//*[@id=\"ddlCountryOfBirth\"]//*[text()=\"SOUTH AFRICA\"]");

		//Public official yes/no radio buttons
		public static By publicOfficial_no = By.id("rbnProminentlyInfluentialPersonsInAuthority_1");

		//Associated with public official yes/no radio buttons
		public static By assocPublicOfficial_no = By.id("rbnAffiliatedToPIPInd_1");

		//Add client mobile number field
		public static By mobileNumber = By.id("txtMobileNumber");

		//Mobile contract type radio buttons
		public static By mobContractType = By.id("rblMobileContractType_1");

		//Home telephone number
		public static By telephoneCode = By.id("txtHomeTelephoneCode");
		public static By telephoneNumber = By.id("txtHomeTelephoneNumber");

		//Physical address add button
		public static By addPhysAddr = By.id("btnAdd");

		//Add address text
		public static By addAddrTxt = By.xpath("//*[text()=\"Add Address\"]");

		//Physical address frame id
		public static By addPhysicalAddrFrame = By.id("addrPhysicalAddressId_ifrm");

		//First line address
		public static By phyaddr_1 = By.id("txtAddress1");

		//Second line address
		public static By phyaddr_2 = By.id("txtAddress2");

		//Find postal code button
		public static By postalCodeBtn = By.id("btnSelect");

		//Find postal code header
		public static By findPostalCodeHdr = By.xpath("//*[text()=\"Find Postal Codes\"]");

		//physical address date since
		public static By physicalAddressDate = By.id("mthyPhysicalAddressDate_txtDate");

		//Find postal code button
		public static By findPostalCodeBtn = By.id("btnFind");

		//select populated postal code button
		public static By prePopPostalCodeSelectBtn = By.name("dgPostCodeSearchResults$ctl03$ctl00");

		//Save address button
		public static By saveAddressBtn = By.id("btnSaveInfo");

		//Postal address select button
		public static By postalAddrSelBtn = By.xpath("//*[text()=\"* Postal Address\"]/parent::td/following-sibling::td//*[@id=\"btnSelect\"]");

		//Postal address in frame select
		public static By postalAddrInFrameSelBtn = By.xpath("//td[@class='SelectItem']//input");

		//Residential status radio buttons
		public static By residentailStatus = By.id("rblResidentialStatus_1");

		//Educational level select
		public static By eduationalLevelSelect = By.id("ddlEducationLevel");

		//Selected education level text
		public static By selectedEducationLevel(String eduLevel) {
	        return By.xpath("//*[@id=\"ddlEducationLevel\"]//*[text()='"+eduLevel+"']");
	    }
		
		
		//Employment type radio buttons
		public static By employmentType = By.id("rblEmpEmploymentType_0");

		//Professionality check box
		public static By professionalityCheck = By.id("cbEmpProfessionalInd");

		//Occupation select
		public static By occupationSelect = By.id("ddlEmpOccupationId");

		//Selected occupation
		public static By selectedOccupation = By.xpath("//*[@id=\"ddlEmpOccupationId\"]//*[text()=\"ENGINEER\"]");

		//Occupational level select
		public static By occupationLevelSelect = By.id("ddlEmpOccupationLevel");

		//Selected occupation level
		public static By selectedOccupationLevel = By.xpath("//*[@id=\"ddlEmpOccupationLevel\"]//*[text()=\"JUNIOR POSITION\"]");

		//Type of industry
		public static By industryTypeSelect = By.id("ddlEmpIndustry");

		//Selected type of industry
		public static By selectedIndustryType = By.xpath("//*[@id=\"ddlEmpIndustry\"]//*[text()=\"INFORMATION TECHNOLOGY\"]");

		//Employer name text
		public static By employerName = By.id("txtEmpEmployerName");

		//Current employment start date
		public static By currEmploymentStartDate = By.id("mthyEmpCurrentEmploymentStartDate_txtDate");

		//salary day of the month select
		public static By salaryDay = By.id("ddlEmpSalaryDay");

		//selected salary day
		public static By selectedSalaryDay(String salaryDay) {
	        return By.xpath("//*[@id='ddlEmpSalaryDay']//*[text()='"+salaryDay+"']");
	    }

		//Gross month salary text
		public static By grossSalary = By.id("txtFinBasicSalary");

		//Nett salary text
		public static By netSalary = By.id("txtFinPayslipNettSalary");

		//Ethnic group radio buttons
		public static By ethnicGroup_Black = By.id("rblEthnicGroup_1");

		//Correspondence language select
		public static By corresLangSelect = By.id("ddlCorrespondenceLanguage");

		//Correspondence selected language
		public static By selectedCorresLang = By.xpath("//*[@id=\"ddlCorrespondenceLanguage\"]//*[text()=\"ENGLISH\"]");

		//Preferred contact method select
		public static By prefContactSelect = By.id("ddlContactMethod");

		//preferred selected contact
		public static By selectedprefContact = By.xpath("//*[@id=\"ddlContactMethod\"]//*[text()=\"MOBILE\"]");

		//Marital status radio buttons
		public static By maritalStatus = By.id("rblMaritalStatus_0");

		//Save client details button
		public static By saveClientDetailsBtn = By.id("btnSave");

		//add clients close button
		public static By modalCloseButton = By.xpath("(//*[@class=\"ui-dialog-titlebar-close ui-corner-all\"])[1]");

		//select client detail header
		public static By selectClientHeader = By.id("ui-dialog-title-personClient_dlg");

		//select client number 2
		public static By selectAddedClient = By.id("dlPersons_btnSelect_0");

		//select client number 1
		public static By selectAddedClient_Approved = By.id("dlPersons_btnSelect_0");

		//Selected client name 2
		public static By selectedClientName = By.xpath("//*[@id='dlPersons_btnSelect_0']/..//table//b");

		//Selected client name 1
		public static By selectedClientName_Approved = By.xpath("//tbody/tr[1]/td/b");


//Likhitha changes

	public static By selectSaveAndContinue = By.id("btnSaveContinue");
	public static By selectSourceOfIncome = By.id("sourceOfIncome_btnSelect");
	public static By selectSourceOfIncomeCheckBox = By.id("rptSourceOfIncome_cbIncomeSource_0");
	public static By selectSourceOfIncomeSave = By.id("rptSourceOfIncome_btnSave");
	public static By toGetSourceOfIncome = By.id("sourceOfIncome_divSourceOfIncome");
	
	public static By sourceOfIncome(String incomeType) {
        return By.xpath("//*[@id='trwSourceOfIncome']//label[.='"+incomeType+"']/..//input");
    }
	

	public static By selectBankAcc = By.xpath("//*[@id='btnAdd']//parent::div//input[@value='Add']");
	public static By selectAccountTypeRadio = By.xpath("//*[@value='SAVINGS']");
	public static By clickFindBankBranch = By.xpath("//*[@value='Find Bank Branch']");
	public static By selectBankDropDown = By.xpath("//*[@id='ddlBank']");
	public static By clickFindBranch = By.id("btnFind");
	public static By selectBranchName = By.xpath("//*[@id='dgBankBranchCodeSearchResults']//input[1]");
	public static By sendAccountNumber = By.id("txtAccountNumber");
	public static By saveBankAccount = By.xpath("//*[@id='btnSave']");

	public static By getBankDetails = By.xpath("//*[@id='ctlPolicyBankAccounts_dlAccounts']//div//div//div");



	public static By addEmployerAddressDetails = By.xpath("//*[.='Employer Address']/../..//input[2]");

	public static By clientEmail = By.id("txtEmailAddress");
	public static By fistDebitDate = By.id("txtFirstDebitDate");

		//Methods
		//---------------------------------------------------
		

		/**
		 * Method for adding new clients for existing customer
		 * 
		 * 
		 *
		 */
		
		public static void addClientDetails() throws Exception {
			
			ExtentReporter.HeaderChildNode(" TC012 & TC013 Verify user is able add the client details");
//			Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.applicationTab,10);
//			Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.applicationTab," Click Application Tab");

			String dashboardHeaderText = Utilities.getText(SeritiCreateCustomerFormPage.transactionHeader);
			Assert.assertEquals(dashboardHeaderText,"MARQUIS FINANCE APPLICATIONS");

			
			Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.clientDetailsEditButton,10);
			Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.clientDetailsEditButton,"  client details button clicked");
			Utilities.explicitWaitVisible(ClientDetailsPage.addClientHeader,10);
			String addClientHeaderText = Utilities.getText(ClientDetailsPage.addClientHeader);
			Assert.assertEquals(addClientHeaderText,"Edit Client");
			
			Utilities.explicitWaitVisible(ClientDetailsPage.addClientFrame,10);

			//Utilities.switchFrame_id("personClient_ifrm");
			Utilities.switchFrame_xpath(addClientDetailsFrame);
			
			logger.info("Switched to add client frame");
			ExtentReporter.extentLoggerPass("Add client frame", "Switched to add client frame modal");
			
			Utilities.explicitWaitVisible(ClientDetailsPage.addFirstName,10);
			String readFirstName = ExcelFunctions.getCellValue(xlpath,"TestData",2,0);
			Utilities.clearField(ClientDetailsPage.addFirstName, "Clear First Name Field ");

			Utilities.type(ClientDetailsPage.addFirstName,readFirstName, "Typed " + readFirstName +" in add client first name field");
		
			String firstNameValue = Utilities.getAttributValue("value",ClientDetailsPage.addFirstName);
			Assert.assertEquals(firstNameValue, readFirstName);
			logger.info("Add client first name");
			ExtentReporter.extentLoggerPass("Add client first name", "Typed " + readFirstName +" in add client first name field");
			
			String readLastName = ExcelFunctions.getCellValue(xlpath,"TestData",2,1);
			Utilities.clearField(ClientDetailsPage.addLastName, "Clear last Name Field ");
			Utilities.type(ClientDetailsPage.addLastName,readLastName, "Typed " +  readLastName+" in add client last name field");
			String lastNameValue = Utilities.getAttributValue("value",ClientDetailsPage.addLastName);
			Assert.assertEquals(lastNameValue, readLastName);
			logger.info("Add client last name");
			ExtentReporter.extentLoggerPass("Add client last name", "Typed " + readLastName+" in add client last name field");
			
			String readTitle = ExcelFunctions.getCellValue(xlpath,"TestData",2,2);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.titleRadioButton(readTitle),"Title radio button");
			logger.info("Client Title");
			ExtentReporter.extentLoggerPass("Client Title", "Client title"+ readTitle+" Clicked");
			
			String readIdType = ExcelFunctions.getCellValue(xlpath,"TestData",2,3);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.idTypeRadioButton(readIdType),"ID Type radio button");
			logger.info("ID Type");
			ExtentReporter.extentLoggerPass("ID Type", "ID Type "+ readIdType+" Clicked");
			
			String readIdNumber = ExcelFunctions.getCellValue(xlpath,"TestData",2,4);
			Utilities.type(ClientDetailsPage.idNumber,readIdNumber, "Typed "+readIdNumber+" in add client id number field");
			String idNumberValue = Utilities.getAttributValue("value",ClientDetailsPage.idNumber);
			Assert.assertEquals(idNumberValue, readIdNumber);
			logger.info("Add client id number");
			ExtentReporter.extentLoggerPass("Add client id number", "Typed " +readIdNumber+" in add client id number field");
			
			//DOB is by default read from RSA ID format itself. So not sending any
			String readDob = ExcelFunctions.getCellValue(xlpath,"TestData",2,5);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.dateOfBirth, "Click to bring focus back from RSA ID field");
			//Utilities.type(ClientDetailsPage.dateOfBirth,readDob, "Typed " +readDob+" in add dob field");
			logger.info("Add client date of birth");
			ExtentReporter.extentLoggerPass("Add client date of birth", "Typed " +readDob+" in add dob field");
			

			
			String readCitizenship = ExcelFunctions.getCellValue(xlpath,"TestData",2,6);
			Utilities.selectByVisibleTextByLocator(ClientDetailsPage.citizenShipSelect,readCitizenship);
			
//			String selecedCitizenshipText = getText(ClientDetailsPage.selectedCitizenship);
//			Assert.assertEquals(selecedCitizenshipText, readCitizenship);
			
			logger.info("Add client Citizenship ");

			try {
				String readCountryBirth = ExcelFunctions.getCellValue(xlpath,"TestData",2,7);
				Utilities.selectByVisibleTextByLocator(ClientDetailsPage.countryBirthSelect,readCountryBirth);
			String selectedCountryBirthText = Utilities.getText(ClientDetailsPage.selectedCountryBirth);
			Assert.assertEquals(selectedCountryBirthText, readCountryBirth);
			
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.publicOfficial_no,"Public official radio button");
			logger.info("Public offical radio button");
			ExtentReporter.extentLoggerPass("Public official radio button", "Radio button - No clicked");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.assocPublicOfficial_no,"Public official associativity radio button");
			logger.info("Public offical associavity radio button");
			ExtentReporter.extentLoggerPass("Public offical associavity radio button", "Radio button - No clicked");
			
			String readMobileNumber = ExcelFunctions.getCellValue(xlpath,"TestData",2,8);
			Utilities.type(ClientDetailsPage.mobileNumber,readMobileNumber,"Typed"+ readMobileNumber + " in mobile number text field");
			String mobileNumber = Utilities.getAttributValue("value",ClientDetailsPage.mobileNumber);
			Assert.assertEquals(mobileNumber, readMobileNumber);
			logger.info("Add client mobile number");
			ExtentReporter.extentLoggerPass("Add client mobile number", "Typed"+ readMobileNumber + " in mobile number text field");

			//Likihtha's Changes
			String readEmail = ExcelFunctions.getCellValue(xlpath,"TestData",2,9);
			Utilities.type(ClientDetailsPage.clientEmail, readEmail, "Client Email address");

			String email = Utilities.getAttributValue("value",ClientDetailsPage.clientEmail);
			Assert.assertEquals(email, readEmail);

			logger.info("Add client Email");
			ExtentReporter.extentLoggerPass("Add client Email", "Typed"+ email+ " in Email text field");

			//Likitha's changes ends here




			String readTelecode = ExcelFunctions.getCellValue(xlpath,"TestData",2,10);
			//System.out.println(readTelecode);
			//String readSplitTelecode = readTelecode.split(".")[0];
			//System.out.println(readSplitTelecode);
			Utilities.type(ClientDetailsPage.telephoneCode,readTelecode,"Typed"+ readTelecode +" in telephone code text field");
			String telephoneCode = Utilities.getAttributValue("value",ClientDetailsPage.telephoneCode);
			Assert.assertEquals(telephoneCode, readTelecode);
			logger.info("Add client telephone code");
			ExtentReporter.extentLoggerPass("Add client telephone code", "Typed"+ readTelecode +" in telephone code text field");
			
			String readTeleNumber = ExcelFunctions.getCellValue(xlpath,"TestData",2,11);
			Utilities.type(ClientDetailsPage.telephoneNumber,readTeleNumber,"Typed"+ readTeleNumber +" in telephone number text field");
			String telephoneNumber = Utilities.getAttributValue("value",ClientDetailsPage.telephoneNumber);
			Assert.assertEquals(telephoneNumber, readTeleNumber);
			logger.info("Add client telephone number");
			ExtentReporter.extentLoggerPass("Add client telephone number", "Typed"+ readTeleNumber +" in telephone number text field");
			
			String readMobContractType = ExcelFunctions.getCellValue(xlpath,"TestData",2,12);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.mobContractType,"Mobile contract type radio button");
			logger.info("Mobile contract type radio button");
			ExtentReporter.extentLoggerPass("Mobile contract type radio button", "Radio button - "+readMobContractType +" clicked");
			
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.addPhysAddr,"Add physical address button");
			Utilities.explicitWaitVisibility(ClientDetailsPage.addAddrTxt,10);
			String addAddrTxt = Utilities.getText(ClientDetailsPage.addAddrTxt);
			Assert.assertEquals(addAddrTxt, "Add Address");
			
		//	Utilities.switchFrame_id("addrPhysicalAddressId_ifrm");
			Utilities.switchFrame_xpath(physicalAddressFrame);

			
			String readAddrLine_1 = ExcelFunctions.getCellValue(xlpath,"TestData",2,13);
			String readAddrLine_2 = ExcelFunctions.getCellValue(xlpath,"TestData",2,14);
			Utilities.explicitWaitVisibility(ClientDetailsPage.phyaddr_1,10);
			Utilities.type(ClientDetailsPage.phyaddr_1,readAddrLine_1,"Address line 1");
			Utilities.type(ClientDetailsPage.phyaddr_2,"0"+readAddrLine_2,"Address line 2");
			Utilities.click(ClientDetailsPage.postalCodeBtn,"Postal code button");
			String findPostal = Utilities.getText(ClientDetailsPage.findPostalCodeHdr);
			Assert.assertEquals(findPostal, "Find Postal Codes");
			
			//Utilities.switchFrame_id("conPCSearch_ifrm");
			Utilities.switchFrame_xpath(postalCodeFrame);

			Utilities.verifyElementPresentAndClick(ClientDetailsPage.findPostalCodeBtn,"Find postal code button");
			Utilities.click(ClientDetailsPage.prePopPostalCodeSelectBtn,"Pre-populated select buttons");
			
			Utilities.switchFrame_parent();
			
			Utilities.explicitWaitVisibility(ClientDetailsPage.saveAddressBtn,15);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.saveAddressBtn,"Save address button");
			
			Utilities.switchFrame_parent();


			Utilities.explicitWaitVisibility(ClientDetailsPage.physicalAddressDate,10);
			Utilities.ScrollToTheElement(ClientDetailsPage.physicalAddressDate);
			Utilities.explicitWaitVisible(ClientDetailsPage.physicalAddressDate,10);
			String readPhyAddrDate = ExcelFunctions.getCellValue(xlpath,"TestData",2,15);
			Utilities.type(ClientDetailsPage.physicalAddressDate,readPhyAddrDate,"Physical address date since");
			logger.info("Physical address date since");
			ExtentReporter.extentLoggerPass("Physical address date since", "Typed"+ readPhyAddrDate+" in physical address date since text field");
			
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.postalAddrSelBtn,"Postal address select button");
			
			//Utilities.switchFrame_id("addrPostalAddressId_ifrm");
			Utilities.switchFrame_xpath(addPostalAddressIframe);

			Utilities.explicitWaitVisibility(ClientDetailsPage.postalAddrInFrameSelBtn,10);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.postalAddrInFrameSelBtn,"Selecting specific addres");
			Utilities.switchFrame_parent();
			
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.residentailStatus,"Residential status radio button");
			logger.info("Residential status radio button");
			ExtentReporter.extentLoggerPass("Mobile contract type radio button", "Radio button - Owner bond free clicked");
			
			
			String readEduLevel = ExcelFunctions.getCellValue(xlpath,"TestData",2,16);
			Utilities.selectByVisibleTextByLocator(ClientDetailsPage.eduationalLevelSelect,readEduLevel);
			String selectedEduQual = Utilities.getText(ClientDetailsPage.selectedEducationLevel(readEduLevel));
			Assert.assertEquals(selectedEduQual, readEduLevel);
			
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.employmentType,"Employment type radio button");
			logger.info("Employment type radio button");
			ExtentReporter.extentLoggerPass("Employment type radio button", "Radio button - Employed clicked");
			
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.professionalityCheck,"Are you professional checkbox");
			logger.info("Are you professional checkbox");
			ExtentReporter.extentLoggerPass("Are you professional checkbox", "Checkbox clicked");
			
			String readOccupation = ExcelFunctions.getCellValue(xlpath,"TestData",2,17);
			Utilities.selectByVisibleTextByLocator(ClientDetailsPage.occupationSelect,readOccupation);
			String selectedOccupationTxt = Utilities.getText(ClientDetailsPage.selectedOccupation);
			Assert.assertEquals(selectedOccupationTxt, readOccupation);
			
			String readOccupationLevel = ExcelFunctions.getCellValue(xlpath,"TestData",2,18);
			Utilities.selectByVisibleTextByLocator(ClientDetailsPage.occupationLevelSelect,readOccupationLevel);
			String occupationLevelTxt = Utilities.getText(ClientDetailsPage.selectedOccupationLevel);
			Assert.assertEquals(occupationLevelTxt, readOccupationLevel);
			
			String readIndustryType = ExcelFunctions.getCellValue(xlpath,"TestData",2,19);
			Utilities.selectByVisibleTextByLocator(ClientDetailsPage.industryTypeSelect,readIndustryType);
			String industryTypeTxt = Utilities.getText(ClientDetailsPage.selectedIndustryType);
			Assert.assertEquals(industryTypeTxt, readIndustryType);
			
			String readEmployer = ExcelFunctions.getCellValue(xlpath,"TestData",2,20);
			Utilities.type(ClientDetailsPage.employerName,readEmployer,"Typed"+ readEmployer+ " in employer name text field");
			String employerName = Utilities.getAttributValue("value",ClientDetailsPage.employerName);
			Assert.assertEquals(employerName, readEmployer);
			logger.info("Add client employer name");
			ExtentReporter.extentLoggerPass("Add client employer name", "Typed"+ readEmployer+ " in employer name text field");
			
			String readEmpStartDate = ExcelFunctions.getCellValue(xlpath,"TestData",2,21);
			Utilities.type(ClientDetailsPage.currEmploymentStartDate,readEmpStartDate,"Typed "+  readEmpStartDate+" in employment startdate field");
			logger.info("Add client employment start date");
			ExtentReporter.extentLoggerPass("Add client employment start date", "Typed "+  readEmpStartDate+" in employment startdate field");
			
			String readSalaryDay = ExcelFunctions.getCellValue(xlpath,"TestData",2,22);
			Utilities.selectByVisibleTextByLocator(ClientDetailsPage.salaryDay,readSalaryDay.substring(0,2));
			String salaryDayTxt = Utilities.getText(ClientDetailsPage.selectedSalaryDay(readSalaryDay));
			Assert.assertEquals(salaryDayTxt, readSalaryDay.substring(0, 2));
			
			String readGrossSalary = ExcelFunctions.getCellValue(xlpath,"TestData",2,23);
			Utilities.type(ClientDetailsPage.grossSalary,readGrossSalary,"Typed "+ readGrossSalary+" in gross salary text field");
			String grossSalary = Utilities.getAttributValue("value",ClientDetailsPage.grossSalary);
			Assert.assertEquals(grossSalary, readGrossSalary);
			logger.info("Add client gross salary");
			ExtentReporter.extentLoggerPass("Add client gross salary", "Typed "+ readGrossSalary+" in gross salary text field");
			
			String readNetSalary = ExcelFunctions.getCellValue(xlpath,"TestData",2,24);
			Utilities.ScrollToTheElement(ClientDetailsPage.netSalary);
			Utilities.explicitWaitVisible(ClientDetailsPage.netSalary,10);
			Utilities.type(ClientDetailsPage.netSalary,readNetSalary,"Typed "+ readNetSalary+" in net salary text field");
			String netSalary = Utilities.getAttributValue("value",ClientDetailsPage.netSalary);
			Assert.assertEquals(netSalary, readNetSalary);
			logger.info("Add client net salary");
			ExtentReporter.extentLoggerPass("Add client net salary", "Typed "+ readNetSalary+" in net salary text field");


			//********* Likitha's Changes Starts Here**********


			// #1 : Source of Income
			//Utilities.ScrollToTheElement(ClientDetailsPage.selectSaveAndContinue);

			//Utilities.verifyElementPresentAndClick(ClientDetailsPage.selectSaveAndContinue,"Save personal Details and Continue"); //

			Utilities.ScrollToTheElement(ClientDetailsPage.selectSourceOfIncome);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.selectSourceOfIncome,"Click Source of Income");

		//	Utilities.switchFrame_id("sourceOfIncome_ifrm");
			Utilities.switchFrame_xpath(sourceOfIncomeFrame);

			String incomeSource = ExcelFunctions.getCellValue(xlpath,"TestData",2,46);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.sourceOfIncome(incomeSource),"Source Salary ");
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.selectSourceOfIncomeSave,"Source of Income Saved");
			Utilities.switchFrame_parent();

			logger.info("Add Source of Income"); 
			
			String toGetSourceOfIncome =Utilities.getText(ClientDetailsPage.toGetSourceOfIncome);
			Assert.assertEquals(toGetSourceOfIncome, incomeSource);
			ExtentReporter.extentLoggerPass("Add Salary Income"," Source of Income Selected");


			// #2 : Bank Accounts
			//switchFrame_id("personClient_ifrm");

			Utilities.ScrollToTheElement(ClientDetailsPage.selectBankAcc);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.selectBankAcc,"Click add Bank Account");
			
			//Utilities.switchFrame_id("ifrm");
			Utilities.switchFrame_xpath(ifrm);

			Utilities.verifyElementPresentAndClick(ClientDetailsPage.selectAccountTypeRadio,"Select Account Type");

			Utilities.verifyElementPresentAndClick(ClientDetailsPage.clickFindBankBranch,"Find Bank Branch");

			//Utilities.switchFrame_id("srchBankBranch_ifrm");
			Utilities.switchFrame_xpath(searchBankBranch);


			Utilities.verifyElementPresentAndClick(ClientDetailsPage.selectBankDropDown,"Click Bank Names");
		
			String bankName = ExcelFunctions.getCellValue(xlpath,"TestData",2,40);

			Utilities.selectByVisibleTextByLocator(ClientDetailsPage.selectBankDropDown,bankName);
			ExtentReporter.extentLoggerPass("Select Bank "," Selected Bank name");


			Utilities.verifyElementPresentAndClick(ClientDetailsPage.
					clickFindBranch,"Find Selected branch of selected Bank");
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.selectBranchName,"Select One Branch");

			Utilities.switchFrame_parent();

			String accountNumber = ExcelFunctions.getCellValue(xlpath,"TestData",2,39);
			Utilities.type(ClientDetailsPage.sendAccountNumber,accountNumber, "Account Number");
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.saveBankAccount,"Save Bank Account add");

			Utilities.switchFrame_parent();

			String getBankDetails = Utilities.getText(ClientDetailsPage.getBankDetails);
			Assert.assertEquals(getBankDetails.contains(accountNumber), true);
			ExtentReporter.extentLoggerPass("Add Bank Details "," Added Bank deatils selected ");



			// #3: Add Employer Address Details

			Utilities.verifyElementPresentAndClick(ClientDetailsPage.addEmployerAddressDetails,"Add Employer Address button");
			
			//Utilities.switchFrame_id("addrEmp_ifrm");
			Utilities.switchFrame_xpath(employerAddressFrame);


			String readAddrLine_e1 = ExcelFunctions.getCellValue(xlpath,"TestData",2,13); 
			String readAddrLine_e2 = ExcelFunctions.getCellValue(xlpath,"TestData",2,14);
			Utilities.explicitWaitVisibility(ClientDetailsPage.phyaddr_1,10);
			Utilities.type(ClientDetailsPage.phyaddr_1,readAddrLine_1,"Address line 1");
			Utilities.type(ClientDetailsPage.phyaddr_2,"01"+readAddrLine_2,"Address line 2");
			Utilities.click(ClientDetailsPage.postalCodeBtn,"Postal code button"); String
					findPostale = Utilities.getText(ClientDetailsPage.findPostalCodeHdr);
			Assert.assertEquals(findPostale, "Find Postal Codes");
			
			//Utilities.switchFrame_id("conPCSearch_ifrm");
			Utilities.switchFrame_xpath(postalCodeFrame);

			Utilities.verifyElementPresentAndClick(ClientDetailsPage.findPostalCodeBtn,"Find postal code button");
			Utilities.click(ClientDetailsPage.prePopPostalCodeSelectBtn,"Pre-populated select buttons");

			Utilities.switchFrame_parent();

			Utilities.explicitWaitVisibility(ClientDetailsPage.saveAddressBtn,15);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.saveAddressBtn,"Save address button");

			Utilities.switchFrame_parent();



			//Likitha changes end here****************************



			Utilities.ScrollToTheElement(ClientDetailsPage.ethnicGroup_Black);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.ethnicGroup_Black,"Ethnic group black selected");
			logger.info("Add client ethnic group");
			ExtentReporter.extentLoggerPass("Add client ethnic group", "Ethnic group black selected");
			
			String readLang = ExcelFunctions.getCellValue(xlpath,"TestData",2,25);
			Utilities.selectByVisibleTextByLocator(ClientDetailsPage.corresLangSelect,readLang);
			String corresLangTxt = Utilities.getText(ClientDetailsPage.selectedCorresLang);
			Assert.assertEquals(corresLangTxt, readLang);
			
			String readPrefContact = ExcelFunctions.getCellValue(xlpath,"TestData",2,26);
			Utilities.selectByVisibleTextByLocator(ClientDetailsPage.prefContactSelect,readPrefContact);
			String prefContactTxt = Utilities.getText(ClientDetailsPage.selectedprefContact);
			Assert.assertEquals(prefContactTxt, readPrefContact);
			
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.maritalStatus,"Marital status radio buttons");
			logger.info("Marital status radio buttons");
			ExtentReporter.extentLoggerPass("Marital status radio buttons", "SINGLE marital status selected");
			
			Utilities.ScrollToTheElement(ClientDetailsPage.saveClientDetailsBtn);
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.saveClientDetailsBtn,"Save client details button");
			logger.info("Save client details button");
			ExtentReporter.extentLoggerPass("Save client details button", "Save client details button clicked");
			
			Utilities.switchFrame_parent();
			//explicitWaitVisible(ClientDetailsPage.modalCloseButton,10);
			//JSClick(ClientDetailsPage.modalCloseButton,"Modal close button");
			logger.info("Modal close button");
			ExtentReporter.extentLoggerPass("Modal close button", "Modal close button clicked");

			
		}
		/*Method for Selecting client Details
		 * This method will only select the already created Client
		 * and only Save (Not apply) the Marquis application form.
		 * 
		 * @throws Exception
		 * 
		 */
		public static void selectClientDetails() throws Exception {
			ExtentReporter.HeaderChildNode("TC_015: Verify if User is able to Select created Client details");

			logger.info("Back to Marquis Finance Transaction main page");
			Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.clientDetailsSelectButton,10);
			Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.clientDetailsSelectButton,"Select client detail button");
			logger.info("Select client detail button");
			ExtentReporter.extentLoggerPass("Select client detail button", "Select client detail button clicked");
			
			Utilities.explicitWaitVisible(ClientDetailsPage.selectClientHeader,10);
			String selectClientHeaderText = Utilities.getText(ClientDetailsPage.selectClientHeader);
			Assert.assertEquals(selectClientHeaderText,"Select Client");
			
			//Utilities.switchFrame_id("personClient_ifrm");
			Utilities.switchFrame_xpath(addClientDetailsFrame);

			Utilities.explicitWaitVisible(ClientDetailsPage.selectedClientName,10);
			String selectedName_modal = Utilities.getText(ClientDetailsPage.selectedClientName);
			
			Utilities.verifyElementPresentAndClick(ClientDetailsPage.selectAddedClient,"Select added client button");
			logger.info("Select added client button");
			ExtentReporter.extentLoggerPass("Select added client button", "Added client selected");
			
			Utilities.switchFrame_parent();
			
			Utilities.explicitWaitVisible(ClientDetailsPage.selectedClientName_Approved,10);
			String selectedName_main = Utilities.getText(ClientDetailsPage.selectedClientName_Approved);
			Assert.assertEquals(selectedName_modal, selectedName_main);

			
			/*
			 * Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.applyCheckButton);
			 * Utilities.JSClick(MarquisFinanceTransactionPage.
			 * applyCheckButton,"Apply check button"); logger.info("Apply check button");
			 * ExtentReporter.extentLoggerPass("Apply check button",
			 * "Apply check button clicked");
			 * 
			 * 
			 * Utilities.ScrollToTheElement(MarquisFinanceTransactionPage.saveFooterBtn);
			 * Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.
			 * saveFooterBtn,"Save client details footer button");
			 * logger.info("Save client details footer button");
			 * ExtentReporter.extentLoggerPass("Save client details footer button",
			 * "Save client details footer button clicked");
			 */	 			
			
		}

		
}
