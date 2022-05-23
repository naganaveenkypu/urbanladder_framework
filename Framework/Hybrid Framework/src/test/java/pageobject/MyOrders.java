package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import reuseability.HelperClass;

public class MyOrders {
	WebDriver driver;

	public MyOrders(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//a[@title='Track Order']")
	WebElement order;

	public void myOrderList() throws InterruptedException {
		order.click();
		Thread.sleep(2000);
		System.out.println(order.getText());
		HelperClass.captureScreenshots(driver);
		Thread.sleep(2000);
	}
}
