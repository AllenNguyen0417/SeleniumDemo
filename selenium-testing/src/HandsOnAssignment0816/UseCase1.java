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

public class UseCase1 {

	WebDriver driver;
	
	@Test
	public void test() throws Exception{
		driver.get("https://www.google.com");
		String searchTxt = "selenium webdriver";
		driver.findElement(By.name("q")).sendKeys(searchTxt);
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		String txtBoxValue = driver.findElement(By.name("q")).getAttribute("value");
		System.out.println("The value entered on search text box: " + txtBoxValue);
		System.out.println("The value appeared on the search text box after successfully displayed the search result on next page : " + txtBoxValue);
		String title = driver.getTitle();		
		Boolean check = driver.findElement(By.partialLinkText("WebDriver - Selenium")).isDisplayed();		
		Assert.assertTrue(check);
		Assert.assertTrue(title.contains(txtBoxValue));
		
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
