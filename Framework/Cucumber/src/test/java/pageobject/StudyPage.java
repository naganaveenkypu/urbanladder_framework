package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudyPage {
	WebDriver driver;

	public StudyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[@class='withsubtext']")
	WebElement variable;

	public WebElement tableVerify() {
		return variable;
	}

	@FindBy(xpath = "//li[@class='topnav_item saleunit']")
	WebElement said;

	public WebElement sales() {
		return said;
	}

	@FindBy(xpath = "//li[@class='subnav_item 15040']")
	WebElement said1;

	public WebElement sofaBeds() {
		return said1;
	}
}
//driver.findElements(By.xpath("");