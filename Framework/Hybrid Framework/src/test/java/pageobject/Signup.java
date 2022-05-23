package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signup {

	WebDriver driver;

	public Signup(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//a[text()='Log In']")
	WebElement signup;
	@FindBy(xpath = "//form//div//input[@id='spree_user_email']")
	WebElement email1;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password1;
	@FindBy(xpath = "//input[@class='button primary']")
	WebElement submit_click;

	public void signPage(String emailApp, String passwordApp) throws InterruptedException {
		signup.click();
		email1.sendKeys(emailApp);
		password1.sendKeys(passwordApp);
		submit_click.click();
		Thread.sleep(2000);
	}
}
