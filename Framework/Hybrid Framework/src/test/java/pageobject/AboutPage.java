package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import reuseability.HelperClass;

public class AboutPage {
	WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = " //ul[@class='col-md-6 no-padding bodytext']")
	WebElement abouttext;

	public void about() throws InterruptedException {
		System.out.println(abouttext.getLocation());
		HelperClass.captureScreenshots(driver);
		Thread.sleep(2000);
	}
}