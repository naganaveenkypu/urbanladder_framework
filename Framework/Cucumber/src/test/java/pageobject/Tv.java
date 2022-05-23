package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tv {
	WebDriver driver;

	public Tv(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[@data-taxon-name='TV Units']")
	WebElement variable;

	public WebElement tvUnitVerify() {
		return variable;

	}
}