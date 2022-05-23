package reuseability;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentClass {
	public static WebDriver startApplication(WebDriver driver, String browserName, String URL) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.getProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet360\\eclipse-workspace\\CA2\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equals("Firefox"))

		{
			System.out.println("Firefox");
		} else {
			System.out.println("Browser not support");
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
