package RediffPageObjectModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffPageTest {
	
	WebDriver driver;
	RediffPage rediffPage;
	
	String name = "Quan N";
	String email = "seleniumTesting01";
	String password = "passwd@123456";
	String confirmPassword = "passwd@123456";
	String altEmail = "seleniumTestingAltEmail@gmail.com";
	String phone = "7179193131";
	String dobDay = "17";
	String dobMonth = "APR";
	String dobYear = "1994";
	String country = "United States";
	
	@Test
	public void test() throws Exception {
		rediffPage = new RediffPage(driver);
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		rediffPage.accountCreating(name, email, password, confirmPassword, altEmail, phone, dobDay, dobMonth, dobYear, country);
		
		String msg = driver.switchTo().alert().getText();
		String expectedMsg = "Verification code field cannot be blank";
		
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
