package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import reuseability.HelperClass;

public class Coffee {
	WebDriver driver;

	public Coffee(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//li[@class='topnav_item topdealsunit']")
	WebElement cff;
	@FindBy(xpath = "//li[@class='subnav_item 15047']")
	WebElement cee;

	public void coffeeDetails() throws InterruptedException {
		Thread.sleep(2000);
		cff.click();
		System.out.println(cff.getText());
		cee.click();
		HelperClass.captureScreenshots(driver);
		Thread.sleep(2000);
	}
}
