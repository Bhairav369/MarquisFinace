package com.marquis.SanityScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.business.marquis.MarquisFinancierBusinessLogic;
import com.excel.ExcelFunctions;
import com.marquis.webPages.ClientDetailsPage;
import com.marquis.webPages.DigiSignInPage;
import com.marquis.webPages.MarquisFinanceTransactionPage;
import com.marquis.webPages.Ops_Login;
import com.marquis.webPages.SeritiCreateCustomerFormPage;
import com.marquis.webPages.SeritiLoginPage;
import com.marquis.webPages.financierWebPage;
import com.marquis.webPages.payouts;

public class marquisFinancierSanityScript {

	public  MarquisFinancierBusinessLogic MarquisFinancierBusinessLogic;
	public static String xlpath = "./XLSX/MarquisDataForm.xlsx";

	
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
	
	
	@Test(priority = 1)
   public void seritiApplicationE2Eflow() throws Exception {
		
		
		//Count = No. of Test Data rows created in excel
		//Starting with 2nd row in loop as the actual value is read from 2nd row.
		int rowCount = ExcelFunctions.getRowCount(xlpath,"TestData");
		SeritiLoginPage.login();
		for(int i=2; i<=rowCount;i++ ) {
	    	ExcelFunctions.getMapData(xlpath, "TestData",i);
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
		//   MarquisFinanceTransactionPage.RequestContract();

		  
		}
	}
	
	
   //@Test(priority = 1)
    public void financierApprovalSetup() throws Exception
    {
	   financierWebPage.financierLogin();
	   String referenceNumber = ExcelFunctions.getCellValue(xlpath,"RefNumber",1,0);
	   financierWebPage.searchCustomerReference(referenceNumber);
    }
    
  //  @Test(priority = 1)
    public void requestContractPin() throws Exception
    {
 		SeritiLoginPage.login();
 		String transactionNumber = ExcelFunctions.getCellValue(xlpath,"RefNumber",1,1); 		
 	    MarquisFinanceTransactionPage.searchAndGoToApplicationPage(transactionNumber);
 	    MarquisFinanceTransactionPage.RequestPin();
    }
    
    
  // @Test(priority = 1)
   public void digiSignIn() throws Exception
   {
		String IDnumber = ClientDetailsPage.idNumberForDigi;
	  //Working on Email fetch for pin 
	//	DigiSignInPage.digiSignLogin("6212275118086","8awtba");
   }
   
   
  

	@Test(priority = 1)
	public void Ops_Login1() throws Exception{
		
		
     Ops_Login.Login();
	payouts.pendingdocumentsearch();
	payouts.documentdetails();
	payouts.verifyDocuments();
	payouts.generated();
	payouts.completed();
		//DocVals.DocVals_Landing_PAge();
	}
	

	@AfterMethod
	public synchronized void tearDown() {
	MarquisFinancierBusinessLogic.tearDown();
	}
	
	
}