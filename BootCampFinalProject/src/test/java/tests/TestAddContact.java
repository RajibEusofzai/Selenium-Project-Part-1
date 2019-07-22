package tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.AddContactPage;
import pages.ContactPageValidation;
import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class TestAddContact {

	@Test

	public void loginTest() {
		
		String User = "techfiosdemo@gmail.com";
		String Pwd = "abc123";
		
		WebDriver driver = BrowserFactory.openBrowser("http://techfios.com/test/billing/?ng=login/");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		ContactPageValidation contactPageValidation = PageFactory.initElements(driver, ContactPageValidation.class);

		loginPage.login(User, Pwd);
		dashboardPage.waitForPage();
		dashboardPage.validateDashboard(dashboardPage.PageTitle);
		dashboardPage.waitForPage();
		
		dashboardPage.clickCRM(dashboardPage.CRM);
		dashboardPage.clickAddContactButton(dashboardPage.AddContactButton);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		addContactPage.fillContactForm();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		contactPageValidation.SubmitValidation();
		
		BrowserFactory.closeAndQuit();
	}

}
