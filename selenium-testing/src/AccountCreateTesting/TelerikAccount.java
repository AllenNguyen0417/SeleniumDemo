package AccountCreateTesting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import YahooPageObjectModel.YahooPageTest;

public class TelerikAccount {
	
	WebDriver driver;
	private static Logger log = LogManager.getLogger(YahooPageTest.class);
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thanh\\OneDrive\\Desktop\\Nisum\\Nisum_QE\\jarFile\\chromedriver_win32\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown() throws Exception {
		log.info("Information message");
		log.error("Error message");
		log.warn("Warning message");
		log.fatal("Fatal message");
//		driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://www.telerik.com/login/v2/telerik#register");
		driver.findElement(By.id("Email-1")).sendKeys("seleniumTesting06123@gmail.com");
//		Thread.sleep(1000);
		driver.findElement(By.id("Textbox-1")).sendKeys("Quan");
//		Thread.sleep(1000);
		driver.findElement(By.id("Textbox-2")).sendKeys("Nguyen");
//		Thread.sleep(1000);
		driver.findElement(By.id("Textbox-3")).sendKeys("Nisum");
//		Thread.sleep(1000);
		driver.findElement(By.id("Country-1")).sendKeys("USA");
//		Thread.sleep(1000);
		driver.findElement(By.id("State-1")).sendKeys("California");
//		Thread.sleep(1000);
		driver.findElement(By.id("Textbox-4")).sendKeys("7179799797");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div[@class='sf-fieldWrp']/button")).click();		
		Thread.sleep(2000);
		
		
//		boolean expectedValue = driver.getPageSource().contains("This email already has an account");
//		System.out.println(expectedValue);
//		
//		if (expectedValue == false) {
//			assertTrue(driver.getPageSource().contains("Thank you for creating a Telerik account"));	
//		}
//		else {
//			assertTrue(true);
//		}	
	}
}
