package com.marquis.SanityScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.business.marquis.MarquisFinancierBusinessLogic;
import com.emailReport.GmailInbox;
import com.excel.ExcelFunctions;
import com.marquis.webPages.ClientDetailsPage;
import com.marquis.webPages.DigiSignInPage;
import com.marquis.webPages.DocVals;
import com.marquis.webPages.Financier;
//import com.marquis.webPages.DigiSignInPage;
import com.marquis.webPages.MarquisFinanceTransactionPage;
import com.marquis.webPages.Ops_LandingPAge;
import com.marquis.webPages.Ops_Login;
import com.marquis.webPages.SeritiCreateCustomerFormPage;
import com.marquis.webPages.SeritiLoginPage;
import com.marquis.webPages.financierWebPage;
//import com.marquis.webPages.financierWebPage;
import com.marquis.webPages.payouts;

public class marquisFinancierSanityScript {

	public  MarquisFinancierBusinessLogic MarquisFinancierBusinessLogic;
	public static String xlpath = "./XLSX/MarquisDataForm.xlsx";
	public static String ExcelPath = "./XLSX/Operational PortalDataForm.xlsx";
	public static int rowIterate = 0;

	
	@BeforeMethod(groups = { "All" })
	public void beforemethodcode() throws Exception {
		MarquisFinancierBusinessLogic = new MarquisFinancierBusinessLogic("Chrome");	
	}

	
//	@Test(priority = 1)
//    @Parameters({"UserName","Password"})
//    public void loginMark(String userName,String password) throws Exception {
//    	
//		SeritiLoginPage.login(userName, password);
//		MarquisFinanceTransactionPage.marquisFinancePageForm();
//    }
/*	
	@Test(priority = 1)
	@Parameters({"UserName","Password"})
    public void createCustomer(String userName,String password) throws Exception {
		SeritiLoginPage.login(userName, password);
		SeritiCreateCustomerFormPage.createCustomerTransactionForm();
    }  
	*/
	
	
   //@Test(priority = 1)
   public void seritiApplicationE2Eflow() throws Exception {
		
		
		//Count = No. of Test Data rows created in excel
				//Starting with 2nd row in loop as the actual value is read from 2nd row.
				
				int rowCount = ExcelFunctions.getRowCount(xlpath,"TestData");
				SeritiLoginPage.login();
				for(int i=2; i<=rowCount;i++ ) {
			    	ExcelFunctions.getMapData(xlpath, "TestData",i);			
			    	rowIterate = i;
			        SeritiCreateCustomerFormPage.createCustomerTransactionForm();
				    MarquisFinanceTransactionPage.marquisFinancePageForm();
				    ClientDetailsPage.addClientDetails();
			        MarquisFinanceTransactionPage.enterMandatoryTransactionMarquisFinancePage();
				    MarquisFinanceTransactionPage.saveTransaction();
				   //ClientDetailsPage.selectClientDetails();	
				    MarquisFinanceTransactionPage.addValueAddedProducts();		
		  	        MarquisFinanceTransactionPage.verifyApplicationStatus();
				    MarquisFinanceTransactionPage.documentUpload();
				    MarquisFinanceTransactionPage.sendDocuments();
				    
		          //Docs Vals Approval needed
				   MarquisFinanceTransactionPage.RequestContract();

			
				}
	}
	
//	
   //@Test(priority = 1)
    public void financierApprovalSetup() throws Exception
    {
    	//For police verification
	   financierWebPage.financierLogin();
	   String referenceNumber = ExcelFunctions.getCellValue(xlpath,"RefNumber",1,0);
	   financierWebPage.searchCustomerReference(referenceNumber);
    }
    
    
//    
   // @Test(priority = 1)
    public void requestContractPin() throws Exception
    {
 		SeritiLoginPage.login();
 		String transactionNumber = ExcelFunctions.getCellValue(xlpath,"RefNumber",2,1); 		
 	    MarquisFinanceTransactionPage.searchAndGoToApplicationPage(transactionNumber);
	    MarquisFinanceTransactionPage.RequestPin();
    }
//    
//    
  //@Test(priority = 1)
   public void digiSignIn() throws Exception
   {
		String IDnumber = ExcelFunctions.getCellValue(xlpath,"RefNumber",2,2); 
		System.out.println(" ID number "+IDnumber);
	  //Working on Email fetch for pin 
	String passwordDigi= GmailInbox.readEmail("FW: Digi-Contract for Session");
	DigiSignInPage.digiSignLogin(IDnumber,passwordDigi);
	
	String secondOtp = GmailInbox.readEmailOtp("FW: Digi-Contract for Session");
	DigiSignInPage.secondLevelAuthentication(secondOtp);
   }
   
   
   
   
	//@Test(priority = 1)
	public void Doc_Vals() throws Exception{
		ExcelFunctions.getMapData(ExcelPath, "DocVals", 2);
		Ops_Login.Login();
		Ops_LandingPAge.OPs_LandPage();
		DocVals.DocVals_Landing_PAge();
		Financier.Financier_Login();
		Financier.Financier_Search();
		Financier.Finacier_AML_Outcome();
	}
	
/*	@Test(priority = 1)
	public void Ops_Login1() throws Exception{
		
		
     Ops_Login.Login();
     //i added excel function method
    ExcelFunctions.getMapData(xlpath, "TestData",2);
	payouts.pendingdocumentsearch();
	payouts.documentdetails();
	payouts.verifyDocuments();
	payouts.generated();
	payouts.completed();
		//DocVals.DocVals_Landing_PAge();
	}
	*/
	

	@Test(priority = 1)
	 public void seritiPaidStatusVerify() throws Exception
	    {
	 		SeritiLoginPage.login();
	 		String transactionNumber = ExcelFunctions.getCellValue(xlpath,"RefNumber",2,1); 		
	 	    MarquisFinanceTransactionPage.searchAndGoToApplicationPage(transactionNumber);
		    MarquisFinanceTransactionPage.verifyPaidStatus();
	    }
	
	@AfterMethod
	public synchronized void tearDown() {
//	MarquisFinancierBusinessLogic.tearDown();
	}
	
	
}