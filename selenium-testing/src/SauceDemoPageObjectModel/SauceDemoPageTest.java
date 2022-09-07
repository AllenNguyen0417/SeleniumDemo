package SauceDemoPageObjectModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SauceDemoPageTest {
	
	WebDriver driver;
	SauceDemoPage sauceDemoPage;
	
	String username = "standard_user";
	String password = "secret_sauce";
	String firsName = "Quan";
	String lastName = "Nguyen";
	String postalCode = "91764";
	
	@Test
	public void test() throws Exception {
		sauceDemoPage = new SauceDemoPage(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		sauceDemoPage.accountCreating(username, password, firsName, lastName, postalCode);
		
		String msg = driver.findElement(By.tagName("h2")).getText();
		String expectedMsg = "THANK YOU FOR YOUR ORDER";
		
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
