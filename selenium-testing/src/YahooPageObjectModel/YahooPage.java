package YahooPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YahooPage {
	WebDriver driver;
	
	public YahooPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "usernamereg-firstName")
	WebElement firstName;
	
	@FindBy(how = How.ID, using = "usernamereg-lastName")
	WebElement lastName;

	@FindBy(how = How.ID, using = "usernamereg-userId")
	WebElement userID;
	
	@FindBy(how = How.ID, using = "usernamereg-password")
	WebElement password;
	
	@FindBy(how = How.ID, using = "usernamereg-birthYear")
	WebElement birthYear;
	
	@FindBy(how = How.ID, using = "reg-submit-button")
	WebElement submitButton;
	
	public void accountCreating(String firstName, String lastName, String userID, String password, String birthYear) throws InterruptedException {
		this.firstName.sendKeys(firstName);
		Thread.sleep(1000);
		this.lastName.sendKeys(lastName);
		Thread.sleep(1000);
		this.userID.sendKeys(userID);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		this.birthYear.sendKeys(birthYear);
		Thread.sleep(1000);		
		this.submitButton.click();
		Thread.sleep(1000);
	}
	
	
}
