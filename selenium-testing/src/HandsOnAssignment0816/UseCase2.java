package HandsOnAssignment0816;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class UseCase2 {

	WebDriver driver;
	
	@Test
	public void test() throws Exception{
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		driver.findElement(By.className("login")).click();
		Thread.sleep(1000);		
		driver.findElement(By.id("email_create")).sendKeys("tqn.test1@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
        driver.findElement(By.id("uniform-id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Thanh");
		Thread.sleep(1000);
		driver.findElement(By.id("customer_lastname")).sendKeys("Ng");
		Thread.sleep(1000);
		driver.findElement(By.id("passwd")).sendKeys("123456testing");
		Thread.sleep(1000);		
		driver.findElement(By.id("days")).sendKeys("15");
		Thread.sleep(1000);	
		driver.findElement(By.id("months")).sendKeys("March");
		Thread.sleep(1000);
		driver.findElement(By.id("years")).sendKeys("1995");
		Thread.sleep(1000);
		driver.findElement(By.id("company")).sendKeys("Nisum");
		Thread.sleep(1000);
		driver.findElement(By.id("address1")).sendKeys("1234 Main Street");
		Thread.sleep(1000);
		driver.findElement(By.id("address1")).sendKeys("Apt. B");
		Thread.sleep(1000);
		driver.findElement(By.id("city")).sendKeys("Los Angeles");
		Thread.sleep(1000);
		driver.findElement(By.id("id_state")).sendKeys("California");
		Thread.sleep(1000);
		driver.findElement(By.id("postcode")).sendKeys("91536");
		Thread.sleep(1000);
		driver.findElement(By.id("other")).sendKeys("Create an account testing");
		Thread.sleep(1000);
		driver.findElement(By.id("phone_mobile")).sendKeys("7176367913");
		Thread.sleep(1000);
		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(5000);
	}
	
	@Before
	public  void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thanh\\OneDrive\\Desktop\\Nisum\\Nisum Training\\jarFile\\chromedriver_win32\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
}
