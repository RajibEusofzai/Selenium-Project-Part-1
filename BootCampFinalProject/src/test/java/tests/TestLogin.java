package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class TestLogin {

	@Test

	public void loginTest() {

		String User = "techfiosdemo@gmail.com";
		String Pwd = "abc123";
		WebDriver driver = BrowserFactory.openBrowser("http://techfios.com/test/billing/?ng=login/");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

		loginPage.login(User, Pwd);
		dashboardPage.waitForPage();
		dashboardPage.validateDashboard(dashboardPage.PageTitle);
		DashboardPage.waitForElement(dashboardPage.PageTitle, driver);
		dashboardPage.clickAddDepositButton(dashboardPage.AddDepositButton);
		
		
		BrowserFactory.closeAndQuit();
	}

}
