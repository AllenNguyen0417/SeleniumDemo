package RediffPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RediffPage {
	WebDriver driver;
	
	public RediffPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[starts-with(@name, 'name')]")
	WebElement name;
	
	@FindBy(how = How.XPATH, using = "//input[starts-with(@name, 'login')]")
	WebElement email;
	
	@FindBy(how = How.XPATH, using = "//input[starts-with(@name, 'passwd')]")
	WebElement password;
	
	@FindBy(how = How.XPATH, using = "//input[starts-with(@name, 'confirm_passwd')]")
	WebElement confirmPassword;
	
	@FindBy(how = How.XPATH, using = "//input[starts-with(@name, 'altemail')]")
	WebElement altEmail;
	
	@FindBy(how = How.ID, using = "mobno")
	WebElement phone;
	
	@FindBy(how = How.XPATH, using = "//select[starts-with(@name, 'DOB_Day')]")
	WebElement dobDay;
	
	@FindBy(how = How.XPATH, using = "//select[starts-with(@name, 'DOB_Month')]")
	WebElement dobMonth;
	
	@FindBy(how = How.XPATH, using = "//select[starts-with(@name, 'DOB_Year')]")
	WebElement dobYear;
	
	@FindBy(how = How.XPATH, using = "//select[starts-with(@name, 'country')]")
	WebElement country;
	
	@FindBy(how = How.ID, using = "Register")
	WebElement submitButton;
	
	
	public void accountCreating(String name, String email, String password, String confirmPassword, String altEmail, String phone,
			String dobDay, String dobMonth, String dobYear, String country) throws InterruptedException {
		
		this.name.sendKeys(name);
		Thread.sleep(1000);
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		this.confirmPassword.sendKeys(confirmPassword);
		Thread.sleep(1000);
		this.altEmail.sendKeys(altEmail);
		Thread.sleep(1000);
		this.phone.sendKeys(phone);
		Thread.sleep(1000);
		
		Select select_dobDay = new Select(this.dobDay); 
		select_dobDay.selectByVisibleText(dobDay);
		Thread.sleep(1000);
		
		Select select_dobMonth = new Select(this.dobMonth); 
		select_dobMonth.selectByVisibleText(dobMonth);
		Thread.sleep(1000);
		
		Select select_dobYear = new Select(this.dobYear); 
		select_dobYear.selectByVisibleText(dobYear);
		Thread.sleep(1000);

		Select select_country = new Select(this.country); 
		select_country.selectByVisibleText(country);
		Thread.sleep(1000);
		
		this.submitButton.click();
	}
}

