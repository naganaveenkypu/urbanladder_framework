package utilities;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import pageobject.AboutPage;
import pageobject.Payment;
import pageobject.Giftcards;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.SearchPage;
import pageobject.Shipping;
import pageobject.SofaPage;
import pageobject.StudyPage;
import reuseability.HelperClass;

public class BaseClass {
	public WebDriver driver;
	public ConfigClass co;
	public ExtentReports report;
	public ExtentTest log;
	public ExcelClass ex;
	public HomePage HP;
	public LoginPage LP;
	public SearchPage SP;
	public StudyPage SC;
	public Payment FP;
	public SofaPage SB;
	public Giftcards GC;
	public AboutPage AU;
	public Shipping SH;

	@BeforeSuite
	public void start() throws Exception {
		ex = new ExcelClass();
		co = new ConfigClass();
		ExtentSparkReporter extent = new ExtentSparkReporter(new File(
				System.getProperty("user.dir") + "/Reports/Urban_" + HelperClass.getCurrentDateTime() + ".html"));
		report = new ExtentReports();
		report.attachReporter(extent);

	}

	/*
	 * @BeforeClass public WebDriver setup() { return driver =
	 * DriverClass.Application(driver, co.getBrowser(), co.getURL()); }
	 * 
	 * @AfterClass public void close() { DriverClass.quitBrowser(driver); }
	 */
	@AfterMethod
	public void ssMethod(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			log.fail("Test Failed",
					MediaEntityBuilder.createScreenCaptureFromPath(HelperClass.captureScreenshot(driver)).build());
			log.fail("Oops! The TestCase failed");
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			log.pass("Test Passed",
					MediaEntityBuilder.createScreenCaptureFromPath(HelperClass.captureScreenshot(driver)).build());
			log.pass("Hey! The Testcase is Passed");
		}
		report.flush();
	}
}