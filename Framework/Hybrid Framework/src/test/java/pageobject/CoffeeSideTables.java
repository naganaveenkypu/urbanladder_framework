package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import reuseability.HelperClass;

public class CoffeeSideTables {
	WebDriver driver;

	public CoffeeSideTables(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//li[@class='topnav_item topdealsunit']")
	WebElement cst1;

	@FindBy(xpath = "//li[@class='subnav_item 15047']")
	WebElement cst2;
	@FindBy(xpath = "//div[@class='Fabric Sofa Sets']")
	WebElement cst3;

	public void coffeeAndSideTables() throws InterruptedException {
		cst1.click();
		cst2.click();
		HelperClass.captureScreenshots(driver);
	}
}
