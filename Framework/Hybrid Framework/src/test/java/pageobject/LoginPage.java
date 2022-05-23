package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import reuseability.HelperClass;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//li//span[@class='header-icon-link user-profile-icon']")
	WebElement login;

	public void loginPageDetails() throws InterruptedException {
		Thread.sleep(2000);
		login.click();

		Thread.sleep(2000);
		HelperClass.captureScreenshots(driver);

	}
}
