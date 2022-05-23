package runner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobject.AboutPage;
import pageobject.CoffeeSideTables;
import pageobject.Coffee;
import pageobject.Booking;
import pageobject.GaminggChair;
import pageobject.LoginPage;
import pageobject.MyOrders;
import pageobject.SearchPage;
import pageobject.Signup;
import pageobject.StudyPage;
import utility.BaseClass;

public class Testcase1 extends BaseClass {
	@Test(priority = 1)
	public void loginDetails() throws InterruptedException

	{
		LoginPage a = PageFactory.initElements(driver, LoginPage.class);
		a.loginPageDetails();
	}

	@Test(priority = 2)
	public void signUpDetails() throws InterruptedException

	{
		Signup b = PageFactory.initElements(driver, Signup.class);
		b.signPage("naganaveenkypu112233@gmail.com", "Naveen@1234");

	}

	@Test(priority = 3)

	public void searchPageDetails() throws InterruptedException

	{
		SearchPage c = PageFactory.initElements(driver, SearchPage.class);
		c.searchDetails("laptop table");

	}

	@Test(priority = 4)

	public void coffeePage() throws InterruptedException

	{
		Coffee d = PageFactory.initElements(driver, Coffee.class);
		d.coffeeDetails();

	}

	@Test(priority = 5)

	public void bookingDetails() throws InterruptedException

	{
		Booking e = PageFactory.initElements(driver, Booking.class);
		e.booking();

	}

	@Test(priority = 6)

	public void coffeeTableList() throws InterruptedException

	{
		CoffeeSideTables f = PageFactory.initElements(driver, CoffeeSideTables.class);
		f.coffeeAndSideTables();

	}

	@Test(priority = 7)

	public void gamingChair() throws InterruptedException

	{
		GaminggChair g = PageFactory.initElements(driver, GaminggChair.class);
		g.gammingList();

	}

	@Test(priority = 8)

	public void studyListDetails() throws InterruptedException

	{
		StudyPage h = PageFactory.initElements(driver, StudyPage.class);
		h.studyList();

	}

	@Test(priority = 9)

	public void aboutPageDetails() throws InterruptedException

	{
		AboutPage i = PageFactory.initElements(driver, AboutPage.class);
		i.about();

	}

	@Test(priority = 10)
	public void myOrderListDetails() throws InterruptedException

	{
		MyOrders j = PageFactory.initElements(driver, MyOrders.class);
		j.myOrderList();

	}
}
