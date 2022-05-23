package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
	WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='no-bullet']/li[3]")
	WebElement varable;

	public WebElement aboutVerify() {
		return varable;
	}

	@FindBy(linkText = "TV Units")
	WebElement unit;

	public WebElement tvunits() {
		return unit;
	}
}