package AccountCreateTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SauceDemoAccount {

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
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("first-name")).sendKeys("Quan");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("Nguyen");
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("97318");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(1000);
		assertTrue(driver.getPageSource().contains("THANK YOU FOR YOUR ORDER"));
	}

}
