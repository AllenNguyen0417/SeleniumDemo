package HandsOnAssignment0816;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class UseCase3 {

	WebDriver driver;
	
	@Test
	public void test() throws Exception{
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		driver.findElement(By.className("login")).click();
		Thread.sleep(1000);	
		driver.findElement(By.id("email")).sendKeys("tqn.test@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("passwd")).sendKeys("123456testing");
		Thread.sleep(1000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(1000);
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
