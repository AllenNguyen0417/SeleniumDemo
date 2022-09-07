package YahooPageObjectModel;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPageTest {
	WebDriver driver;
	YahooPage yahooPage;
	String firstName = "Quan";
	String lastName = "Nguyen";
	String userID = "quannguyenSeleniumTesting";
	String password = "passwordabc@123";
	String birthYear = "1994";
	
	@Test
	public void test() throws Exception {
		yahooPage = new YahooPage(driver);		
		driver.get("https://login.yahoo.com/account/create");
		yahooPage.accountCreating(firstName, lastName, userID, password, birthYear);
		
		String msg = driver.findElement(By.tagName("h2")).getText();
		String expectedMsg = "Secure your account";
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
		driver.quit();
	}
	
}
