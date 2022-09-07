package BasicSelenium;

import java.awt.Desktop.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thanh\\OneDrive\\Desktop\\Nisum\\Nisum Training\\SeleniumPractice\\JavaSelenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");		
		String title = driver.getTitle();
		System.out.println("The title of the web page opened is: " + title);
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Draggable")).click();		
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/draggable/default.html']")));
		
		
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(drag, 100, 100).perform();
		Thread.sleep(1000);
		action.dragAndDropBy(drag, -30, -60).perform();
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(1000);
	}

}
