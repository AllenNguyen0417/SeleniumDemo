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

class RedDiffAccount {

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
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//input[starts-with(@name, 'name')]")).sendKeys("Quan Nguyen");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name, 'login')]")).sendKeys("seleniumTesting01");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name, 'btnchk')]")).click();
		Thread.sleep(5000);
		boolean expected = driver.getPageSource().contains("Sorry, the ID that you are looking for is taken");
		String s = "17";
		if (expected == true) {
			driver.quit();
		}
		else {
			driver.findElement(By.xpath("//input[starts-with(@name, 'passwd')]")).sendKeys("passwd@123456");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[starts-with(@name, 'confirm_passwd')]")).sendKeys("passwd@123456");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[starts-with(@name, 'altemail')]")).sendKeys("seleniumTestingAltEmail@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.id("mobno")).sendKeys("7179193131");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Day')]/option[@value='17']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Month')]/option[@value='04']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Year')]/option[@value='1994']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//select[starts-with(@name, 'country')]/option[@value='222']")).click();
			
			driver.findElement(By.id("Register")).click();
		}
	}

}
