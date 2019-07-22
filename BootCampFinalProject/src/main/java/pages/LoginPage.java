package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	//Creating a constructor to initialize the driver 

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.ID, using = "username")WebElement UserName;
	@FindBy(how = How.ID, using = "password")WebElement PassWord;
	@FindBy(how = How.NAME, using = "login")WebElement SignIn;
	
	
	//Methods
	public void login(String username, String password) {
		UserName.sendKeys(username);
		PassWord.sendKeys(password);
		SignIn.click();		
	}
}
