package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class GaminggChair {
	WebDriver driver;

	public GaminggChair(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(xpath = "//div//li[@class='topnav_item livingunit']")
	WebElement gamming1;
	@FindBy(xpath = "//li[@class='subnav_item 14508'] ")
	WebElement gamming2;

	public void gammingList() throws InterruptedException {
		gamming1.click();
		String str = gamming1.getText();
		System.out.println(str);
		Assert.assertEquals("Living", str);

		gamming2.click();
		Thread.sleep(2000);

	}
}