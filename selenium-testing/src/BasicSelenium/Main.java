package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thanh\\OneDrive\\Desktop\\Nisum\\Nisum Training\\SeleniumPractice\\JavaSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		System.out.println("The title of the web page opened is: " + title);
		
		WebElement searchTxtBox = driver.findElement(By.id("sb_form_q"));
		searchTxtBox.sendKeys("Nisum");
		searchTxtBox.submit();
		Thread.sleep(1000);
		
		driver.findElement(By.id("id_sc")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("hbsettings")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("adlt_set_strict")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("adlt_set_moderate")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("adlt_set_off")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("adlt_set")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Still seeing inappropriate content?"));
		Thread.sleep(1000);
		
		WebElement chkbox = driver.findElement(By.id("vsread"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		js.executeScript("arguments[0].scrollIntoView();", chkbox);
		Thread.sleep(1000);
		
		chkbox.click();
		Thread.sleep(1000);
		
//		driver.findElement(By.id("vsread")).click();
//		Thread.sleep(1000);
		
		driver.findElement(By.id("rpp")).sendKeys("30");
		Thread.sleep(1000);
//		
//		driver.findElement(By.id("cancel_changes_button")).click();
//		Thread.sleep(1000);
		
//		driver.findElement(By.id("id_sc")).click();
//		Thread.sleep(3000);
		
		
//		driver.quit();
	}

}


