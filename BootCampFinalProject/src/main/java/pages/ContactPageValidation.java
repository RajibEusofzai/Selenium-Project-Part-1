package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactPageValidation extends BasePage {

	WebDriver driver;
	

	// Creating a constructor to initialize the driver

	public ContactPageValidation(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h5[text()='Rajib Eusofzai']") WebElement NameField;
		
	public void SubmitValidation() {
		String valText = NameField.getText();
		
		if(valText.equals("Rajib Eusofzai"))
		{System.out.println("Contact Submitted Successfully");}
		else
		{System.out.println("Something Sent Wrong!");}
	}
	
	
}
