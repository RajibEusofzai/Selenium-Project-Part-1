package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



//import util.Xls_Reader;

public class AddContactPage extends BasePage {

	WebDriver driver;
	
	// Creating a constructor to initialize the driver

	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement NameField;
	@FindBy(how = How.XPATH, using = "//input[@id='company']") WebElement CompanyField;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement EmailField;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement PhoneField;
	@FindBy(how = How.XPATH, using = "//input[@id='address']") WebElement AddressField;
	@FindBy(how = How.XPATH, using = "//input[@id='city']") WebElement CityField;
	@FindBy(how = How.XPATH, using = "//input[@id='state']") WebElement State_RegionField;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']") WebElement ZipField;
	@FindBy(how = How.XPATH, using = "//select/option[@value='United States']") WebElement CountryField;
	@FindBy(how = How.XPATH, using = "//input[@type='search']") WebElement TagField;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']") WebElement SubmitButton;
	
	
	public void fillContactForm() {
		NameField.sendKeys("Rajib Eusofzai");
		CompanyField.sendKeys("GeekSquad");
		EmailField.sendKeys("reach2fatedad@gmail.com");
		PhoneField.sendKeys("9083048082");
		AddressField.sendKeys("5551 Aventine Lane");
		CityField.sendKeys("Keller");
		State_RegionField.sendKeys("Texas");
		ZipField.sendKeys("76248");
		CountryField.click();
		TagField.sendKeys("72542");
		SubmitButton.click();	
	}
}
