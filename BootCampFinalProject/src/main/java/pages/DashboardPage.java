package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage {

	WebDriver driver;

	// Creating a constructor to initialize the driver

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard')]") WebElement PageTitle;
	public @FindBy(how = How.LINK_TEXT, using = "Add Deposit") WebElement AddDepositButton;
	public @FindBy(how = How.XPATH, using = "//span[contains(text(),'CRM')]") WebElement CRM;
	public @FindBy(how = How.LINK_TEXT, using = "Add Contact") WebElement AddContactButton;

	public void waitForPage() {
		waitForElement(PageTitle, driver);
	}

	public void validateDashboard(WebElement element) {
		String ValText = element.getText();
		if (ValText.equals("Dashboard")) {
			System.out.println("Web Driver currently on " + ValText + " Page");
		} else {
			System.out.println("Web Driver currently on Wrong Page");
		}
	}

	public void clickCRM(WebElement element) {
		element.click();
	}

	public void clickAddContactButton(WebElement element) {
		element.click();
	}

	public void clickAddDepositButton(WebElement element) {
		element.click();
	}
}
