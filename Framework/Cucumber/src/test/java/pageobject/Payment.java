package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	WebDriver driver;

	public Payment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@id='page_content']/p[5]/strong")
	WebElement find;

	public WebElement FAPVerify() {
		return find;
	}

	@FindBy(linkText = "Gift Cards")
	WebElement gift;

	public WebElement giftCards() {
		return gift;
	}
}