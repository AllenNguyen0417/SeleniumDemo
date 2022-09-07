package TelerikPageObjectModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelerikPageTest {
	
	WebDriver driver;
	TelerikPage telerikPage;
	
	String email = "seleniumTesting123@gmail.com";
	String firsName = "Quan";
	String lastName = "Nguyen";
	String company = "Nisum";
	String country = "USA";
	String state = "California";
	String phone = "7179799797";
	
	@Test
	public void test() throws Exception {
		telerikPage = new TelerikPage(driver);
		
		driver.get("https://www.telerik.com/login/v2/telerik#register");
		
		telerikPage.accountCreating(email, lastName, lastName, company, country, state, phone);
		
		String msg = driver.findElement(By.tagName("h1")).getText();
		String expectedMsg = "Thank you for creating a Telerik account";
		
		assertEquals(msg, expectedMsg);
	}	
	
	@BeforeEach
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thanh\\OneDrive\\Desktop\\Nisum\\Nisum_QE\\jarFile\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterEach
	public void tearDown() throws Exception {
//		driver.quit();
	}
	
}
