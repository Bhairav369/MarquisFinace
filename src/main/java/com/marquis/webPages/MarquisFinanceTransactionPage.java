package com.marquis.webPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.driverInstance.DriverManager;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import com.utility.Utilities;

public class MarquisFinanceTransactionPage {
	
	static LoggingUtils logger = new LoggingUtils();

	//Green finance house button
		public static By financeHouseButton = By.xpath("(//button[@title=\"Finance Companies\"])[1]");
		
		//Applications header text
		public static By applicationHeader = By.xpath("//div/span[text()=\"Applications\"]");
		
		//Marquis finance house
		public static By marquisFinanceLinkLocator = By.xpath("(//img[@class='company-logo'])[1]");
		//public static WebElement marquisFinanceLink = getWebDriver().findElement(By.xpath("//span[text()=\"MARQUIS FINANCE \"]"));
		
		//Main header finance page
		public static By mainHeader = By.id("mainHeader");
		
		//Client Details (Select, Add, Edit) buttons
		public static By clientDetailsAddButton = By.id("personClient_btnAdd");
		
		//Select client details button
		public static By clientDetailsSelectButton = By.id("personClient_btnSelect");
		
		/*//Agreement type radio buttons (Installment sale, Lease, Rental)
		public static By leaseRadioButton = By.xpath("//*[@value=\"LEASE\"]");
		
		//Preferred Interest type text field
		public static By preferredInterest = By.id("txtFinPreferredInterestRate");
		
		//Interest rate type radio buttons (Fixed, Linked)
		public static By linkedRadioButton = By.xpath("//*[@value=\"LINKED\"]");
		
		//Finance term (months) radio buttons
		public static By term_96_radioButton = By.xpath("//*[@value=\"60\" and @type=\"radio\"]");
		
		//Payment frequency radio buttons
		public static By monthlyRadioButton = By.xpath("//*[@value=\"MONTHLY\"]");
		
		//Vehicle usage radio buttons
		public static By privateRadioButton = By.xpath("//*[@value=\"PRIVATE\"]");
		
		//Vehicle Search buttons
		public static By searchVehicleButton = By.id("btnSelect");
		
		//Is the vehicle new radio buttons
		public static By usedRadioButton = By.xpath("//*[@value=\"USED\"]");
		
		//First registration date field
		public static By firstRegistrationDate = By.id("txtFirstRegistrationDate");
		
		//Vehicle selling price
		public static By sellingPrice = By.id("txtRetailPrice");
		
		//Personal info sharing consent radio buttons
		public static By personalInfoConsent_yes = By.id("rbnOtherCompanyConsentInd_0");
		
		//Market info receiving consent radio buttons
		public static By marketInfoConsent_yes = By.id("rbnExternalMarketingConsentInd_0");*/
		
		//Apply check button
		public static By applyCheckButton = By.id("btnApplyCheck");
		
		//Transaction pass checked text
		public static By transactionPassMsg = By.id("lblInformationBottom");
		
		//Transaction fail message
		public static By transactionFailMsg = By.xpath("//*[text()=\"The application could not be made: \"]");
		
		//Save footer Button
		public static By saveFooterBtn = By.id("btnSaveInfo");
		
		//Apply button
		public static By applyFooterBtn = By.xpath("//*[@type=\"submit\" and @value=\"Apply\"]");
		
		//Approved finance message
		public static By approvedMsg = By.id("lblInformationApplyBottom");
		
		//Methods
		//--------------
		
		/**
		 * Method for Marquis Finance main page
		 * 
		 * 
		 *
		 */
		
		public static void marquisFinancePageForm() throws Exception {
			ExtentReporter.HeaderChildNode("Marquis Finance Page Form");
			Utilities.explicitWaitVisible(SeritiCreateCustomerFormPage.dashBoardHeader,10);
			String dashboardHeaderText = Utilities.getText(SeritiCreateCustomerFormPage.dashBoardHeader);
			Assert.assertEquals(dashboardHeaderText,"MY DASHBOARD");
			
			Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.financeHouseButton,10);
			System.out.println("Finance button is found");
			Utilities.JSClick(MarquisFinanceTransactionPage.financeHouseButton,"Finance House Button");
			logger.info("Finance House Button");
			ExtentReporter.extentLoggerPass("Finance House Button", "Finance House Button is clicked");
			
			Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.applicationHeader,10);
			String applicationsHeaderText = Utilities.getText(MarquisFinanceTransactionPage.applicationHeader);
			Assert.assertEquals(applicationsHeaderText,"APPLICATIONS");
			
			Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.marquisFinanceLinkLocator,10);
			Utilities.verifyElementPresentAndClick(MarquisFinanceTransactionPage.marquisFinanceLinkLocator,"Marquis finance link");
			logger.info("Marquis Finance Link");
			ExtentReporter.extentLoggerPass("Marquis Finance Link", "Marquis Finance link is clicked");
			
			Utilities.explicitWaitVisible(MarquisFinanceTransactionPage.mainHeader,15);
			String mainHeaderText = Utilities.getText(MarquisFinanceTransactionPage.mainHeader);
			Assert.assertEquals(mainHeaderText,"MARQUIS FINANCE APPLICATIONS");
			
			/*modalScrollDown();
			explicitWaitVisible(MarquisFinanceTransactionPage.applyCheckButton,10);
			JSClick(MarquisFinanceTransactionPage.applyCheckButton,"Apply check button");
			logger.info("Apply check button");
			extent.extentLoggerPass("Apply check button", "Apply check button is clicked");

			explicitWaitVisible(MarquisFinanceTransactionPage.transactionPassMsg,10);
			String transactionPassText = getText(MarquisFinanceTransactionPage.transactionPassMsg);
			Assert.assertEquals(transactionPassText, "Transaction has passed all Apply checks.");*/	
		}
}
