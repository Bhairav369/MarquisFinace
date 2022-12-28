
package com.business.marquis;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.driverInstance.CommandBase;
import com.driverInstance.DriverManager;
import com.propertyfilereader.PropertyFileReader;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import com.utility.Utilities;


public class MarquisFinancierBusinessLogic{
	
	static LoggingUtils logger = new LoggingUtils();
	private int timeout;
	private int retryCount;

	public MarquisFinancierBusinessLogic(String Application) throws InterruptedException {
		new CommandBase(Application);
		init();
	}
	
	public void init() {
		PropertyFileReader handler = new PropertyFileReader("properties/Execution.properties");
		setTimeout(Integer.parseInt(handler.getproperty("TIMEOUT")));
		setRetryCount(Integer.parseInt(handler.getproperty("RETRY_COUNT")));
		logger.info("Loaded the following properties" + " TimeOut :" + getTimeout() + " RetryCount :" + getRetryCount());
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;
	}
	
	public void tearDown() {		
		logger.info("Session ID: "+((RemoteWebDriver) DriverManager.getDriver()).getSessionId());
		ExtentReporter.extentLogger("","Session ID: "+((RemoteWebDriver) DriverManager.getDriver()).getSessionId());
		logger.info("Session is quit");
		ExtentReporter.extentLogger("","Session is quit");
		Utilities.setScreenshotSource();
		DriverManager.getDriver().quit();
	}
}