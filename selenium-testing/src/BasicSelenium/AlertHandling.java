package BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thanh\\OneDrive\\Desktop\\Nisum\\Nisum Training\\SeleniumPractice\\JavaSelenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=150.0_1");
		
		String title = driver.getTitle();
		System.out.println("The title of the web page opened is: " + title);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Click here to trigger JS alert']")).click();
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println("The text in the alert box is: " + alert.getText());
		
		alert.accept();
		Thread.sleep(1000);
		
//		WebElement searchTxtbox = driver.findElement(By.xpath("//input[starts-with(@name, 'name')]"));
	}

}
