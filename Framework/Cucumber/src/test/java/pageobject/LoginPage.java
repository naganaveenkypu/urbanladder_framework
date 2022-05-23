package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@autofocus='autofocus']")
	WebElement element;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pass;

	@FindBy(xpath = "//input[@class='button primary']")
	WebElement sub;

	public WebElement eMailID() {
		return element;
	}

	public WebElement password() {
		return pass;
	}

	public WebElement enter() {
		return sub;
	}
}