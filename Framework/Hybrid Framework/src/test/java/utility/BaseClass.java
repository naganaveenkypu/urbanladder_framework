package utility;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import reuseability.ParentClass;

public class BaseClass {
	public WebDriver driver;
	public ConfigClass config;

	@BeforeSuite
	public void setupsuite() throws FileNotFoundException {
		config = new ConfigClass();
	}

	@BeforeClass
	public void voidsetup() {

		driver = ParentClass.startApplication(driver, config.getBrowser(), config.getStagingurl());

	}

	@AfterClass
	public void teardown() {
		ParentClass.quitBrowser(driver);

	}
}
