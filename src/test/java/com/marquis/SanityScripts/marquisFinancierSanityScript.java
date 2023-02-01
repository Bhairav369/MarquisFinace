package com.marquis.SanityScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.business.marquis.MarquisFinancierBusinessLogic;
import com.marquis.webPages.ClientDetailsPage;
import com.marquis.webPages.MarquisFinanceTransactionPage;
import com.marquis.webPages.Ops_Login;
import com.marquis.webPages.SeritiCreateCustomerFormPage;
import com.marquis.webPages.SeritiLoginPage;
import com.marquis.webPages.payouts;

public class marquisFinancierSanityScript {

	public  MarquisFinancierBusinessLogic MarquisFinancierBusinessLogic;
	
	
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
	
	
	/*@Test(priority = 1)
	@Parameters({"UserName","Password"})
    public void seritiApplicationE2Eflow(String userName,String password) throws Exception {
		SeritiLoginPage.login(userName, password);
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
		
		  
		//Income Verification Underway
		//xpath: //*[@id='lblInformationApplyBottom']  
		//text= INCOME VERIFICATION UNDERWAY
		
		
		
	}*/
	

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
//	MarquisFinancierBusinessLogic.tearDown();
	}
	
	
}