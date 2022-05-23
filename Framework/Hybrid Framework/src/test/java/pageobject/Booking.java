package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import reuseability.HelperClass;

public class Booking {
	WebDriver driver;

	public Booking(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//span[@itemprop='name']")
	WebElement booking;

	public void booking() throws InterruptedException {

		booking.click();
		Thread.sleep(2000);
		driver.navigate().back();
		HelperClass.captureScreenshots(driver);
		Thread.sleep(2000);
	}
}