package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='header-icon-link user-profile-icon']")
	WebElement a;

	@FindBy(linkText = "Log In")
	WebElement b;

	@FindBy(xpath = "//input[@id='search']")
	WebElement c;

	@FindBy(xpath = "//*[@class='search-icon icofont-search']")
	WebElement d;

	By pop = By.xpath("//a[@class='close-reveal-modal hide-mobile']");

	public WebElement icon() {
		return a;
	}

	public WebElement Login() {
		return b;
	}

	public WebElement search() {
		return c;
	}

	public WebElement searchIcon() {
		return d;
	}

	public List<WebElement> popUpsize() {
		return driver.findElements(pop);
	}

	public WebElement popUp() {
		return driver.findElement(pop);
	}
}