package com.marquis.SanityScripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.business.marquis.MarquisFinancierBusinessLogic;
import com.driverInstance.DriverManager;
import com.global.TestGroup;
import com.marquis.webPages.*;
import com.utility.CustomSoftAssert;
import com.utility.Utilities;

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
	
	
	@Test(priority = 1)
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
		  
	}
	

//	@Test(priority = 1)
//	public void Ops_Login() throws Exception{
//		Ops_Login.Login();
//		Ops_LandingPAge.OPs_LandPage();
//		DocVals.DocVals_Landing_PAge();
//	}
	

	@AfterMethod
	public synchronized void tearDown() {
//	MarquisFinancierBusinessLogic.tearDown();
	}
	
	
}