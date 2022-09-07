package TelerikPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TelerikPage {
	
	WebDriver driver;
	
	public TelerikPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "Email-1")
	WebElement email;

	@FindBy(how = How.ID, using = "Textbox-1")
	WebElement firstName;
	
	@FindBy(how = How.ID, using = "Textbox-2")
	WebElement lastName;
	
	@FindBy(how = How.ID, using = "Textbox-3")
	WebElement company;
	
	@FindBy(how = How.ID, using = "Country-1")
	WebElement country;
	
	@FindBy(how = How.ID, using = "State-1")
	WebElement state;
	
	@FindBy(how = How.ID, using = "Textbox-4")
	WebElement phone;
	
	@FindBy(how = How.XPATH, using = "//div/div[@class='sf-fieldWrp']/button")
	WebElement submitButton;
	
	public void accountCreating(String email, String firstName, String lastName, String company, String country, String state, String phone) throws InterruptedException {
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.firstName.sendKeys(firstName);
		Thread.sleep(1000);
		this.lastName.sendKeys(lastName);
		Thread.sleep(1000);
		this.company.sendKeys(company);
		Thread.sleep(1000);
		this.country.sendKeys(country);
		Thread.sleep(1000);
		this.state.sendKeys(state);
		Thread.sleep(1000);
		this.phone.sendKeys(phone);
		Thread.sleep(1000);
		this.submitButton.click();
	}
	
}
