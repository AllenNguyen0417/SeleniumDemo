package SauceDemoPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPage {
	
	WebDriver driver;
	
	public SauceDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "user-name")
	WebElement username;

	@FindBy(how = How.ID, using = "password")
	WebElement password;
	
	@FindBy(how = How.ID, using = "login-button")
	WebElement loginButton;
	
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	WebElement itemAddToCartButton;
	
	@FindBy(how = How.CLASS_NAME, using = "shopping_cart_link")
	WebElement cartButton;
	
	@FindBy(how = How.ID, using = "checkout")
	WebElement checkoutButton;
	
	@FindBy(how = How.ID, using = "first-name")
	WebElement firstName;
	
	@FindBy(how = How.ID, using = "last-name")
	WebElement lastName;
	
	@FindBy(how = How.ID, using = "postal-code")
	WebElement postalCode;
	
	@FindBy(how = How.ID, using = "continue")
	WebElement continueButton;
	
	@FindBy(how = How.ID, using = "finish")
	WebElement finishButton;
	
	public void accountCreating(String username, String password, String firstName, String lastName, String postalCode) throws InterruptedException {
		this.username.sendKeys(username);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		this.loginButton.click();
		Thread.sleep(1000);
		this.itemAddToCartButton.click();
		Thread.sleep(1000);
		this.cartButton.click();
		Thread.sleep(1000);
		this.checkoutButton.click();
		Thread.sleep(1000);
		this.firstName.sendKeys(firstName);
		Thread.sleep(1000);
		this.lastName.sendKeys(lastName);
		Thread.sleep(1000);
		this.postalCode.sendKeys(postalCode);
		Thread.sleep(1000);
		this.continueButton.click();
		Thread.sleep(1000);
		this.finishButton.click();
		Thread.sleep(1000);
	}
}
