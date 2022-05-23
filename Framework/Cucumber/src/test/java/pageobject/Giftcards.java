package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftcards {
	WebDriver driver;

	public Giftcards(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//section[@class='_14QEd']/h2")
	WebElement variable;

	public WebElement gcVerify() {
		return variable;
	}

	@FindBy(linkText = "About Us")
	WebElement about;

	public WebElement aboutUs() {
		return about;
	}
}