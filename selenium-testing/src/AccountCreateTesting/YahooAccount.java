package AccountCreateTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class YahooAccount {
	
	WebDriver driver;
		
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thanh\\OneDrive\\Desktop\\Nisum\\Nisum_QE\\jarFile\\chromedriver_win32\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://login.yahoo.com/account/create");
		Thread.sleep(1000);
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Quan");
		Thread.sleep(1000);
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Nguyen");
		Thread.sleep(1000);
		driver.findElement(By.id("usernamereg-userId")).sendKeys("quannguyenSeleniumTesting");
		Thread.sleep(1000);
		driver.findElement(By.id("usernamereg-password")).sendKeys("passwordabc@123");
		Thread.sleep(1000);
		driver.findElement(By.id("usernamereg-birthYear")).sendKeys("1994");
		Thread.sleep(1000);
		driver.findElement(By.id("reg-submit-button")).click();
		Thread.sleep(1000);
		assertTrue(driver.getPageSource().contains("Recovery mobile"));		
		
	}

}
