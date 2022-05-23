package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Wallace Study Desk (Wenge Finish)']")
	WebElement said1;

	@FindBy(xpath = "//*[@id='store-availability']/div/h2/text()")
	WebElement said2;

	@FindBy(xpath = "//*[@class='topnav_item studyunit']")
	WebElement said3;

	@FindBy(xpath = "//li[@class='subnav_item 13057']")
	WebElement said4;

	@FindBy(xpath = "//h2[@class='withsubtext']")
	WebElement said5;

	public WebElement study() {
		return said3;
	}

	public WebElement table() {
		return said1;
	}

	public WebElement officeTable() {
		return said4;
	}

	public WebElement visitOurStores() {
		return said2;
	}

	public WebElement studyVerify() {
		return said5;
	}
}