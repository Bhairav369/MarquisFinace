package com.marquis.SanityScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.business.marquis.MarquisFinancierBusinessLogic;
import com.marquis.webPages.ClientDetailsPage;
import com.marquis.webPages.MarquisFinanceTransactionPage;
import com.marquis.webPages.SeritiCreateCustomerFormPage;
import com.marquis.webPages.SeritiLoginPage;

public class marquisFinancierSanityScript {

	private  MarquisFinancierBusinessLogic MarquisFinancierBusinessLogic;
	
	
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
	@Parameters({"UserName","Password"})
    public void clientDetails(String userName,String password) throws Exception {
		SeritiLoginPage.login(userName, password);
		SeritiCreateCustomerFormPage.createCustomerTransactionForm();
		MarquisFinanceTransactionPage.marquisFinancePageForm();
		ClientDetailsPage.addClientDetails();
		MarquisFinanceTransactionPage.enterMandatoryTransactionMarquisFinancePage();
		ClientDetailsPage.selectClientDetails();
		
		//TODO: In-progress to Refresh Applciation Status and Read Agreement number and Document Upload
		//MarquisFinanceTransactionPage.verifyApplicationStatus();

		
	}
	

	@Test(priority = 1)
	public void Ops_Login() throws Exception{
		Ops_Login.Login();
		Ops_LandingPAge.OPs_LandPage();
	}
	

	@AfterMethod
	public synchronized void tearDown() {
	//	MarquisFinancierBusinessLogic.tearDown();
	}
	
	
}