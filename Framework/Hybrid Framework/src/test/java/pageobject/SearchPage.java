package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@id='search']")
	WebElement search1;
	@FindBy(xpath = "//a[@data-id='8718']")
	WebElement search2;

	public void searchDetails(String accessories) throws InterruptedException {

		search1.sendKeys(accessories);
		search1.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		search2.click();
		driver.navigate().back();

		Thread.sleep(500);

	}
}
