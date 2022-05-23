package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import reuseability.HelperClass;

public class StudyPage {

	WebDriver driver;

	public StudyPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//li[@class='topnav_item studyunit']")
	WebElement findtext;
	@FindBy(xpath = "//li[@class=\"subnav_item 1600\"]")
	WebElement findstu;

	public void studyList() throws InterruptedException {
		findtext.click();
		System.out.println("this is text from study");
		String str2 = findtext.getText();
		System.out.println(str2);

		HelperClass.captureScreenshots(driver);
		findstu.click();

	}
}
