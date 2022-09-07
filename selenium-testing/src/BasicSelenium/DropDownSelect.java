//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class DropDownSelect {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thanh\\OneDrive\\Desktop\\Nisum\\Nisum Training\\SeleniumPractice\\JavaSelenium\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
//		
//		String title = driver.getTitle();
//		System.out.println("The title of the web page opened is: " + title);
//		Thread.sleep(1000);
//		
//		WebElement searchTxtbox = driver.findElement(By.xpath("//input[starts-with(@name, 'name')]"));
//		searchTxtbox.sendKeys("John Smith");
//		Thread.sleep(1000);
//				
//		
//		WebElement dropdown = driver.findElement(By.id("country"));
//		dropdown.sendKeys("Argentina");
//		Thread.sleep(1000);
//		Select select = new Select(dropdown);
//		
//		// List<WebElement> allCountries = select.getOptions();
//		// System.out.println("Total countries in the dropdown list: " + allCountries.size());
//		
//		// select.selectByIndex(19);
//		// Thread.sleep(1000);
//		// select.selectByVisibleText("Bangladesh");
//		// Thread.sleep(1000);
//		
//		// for(int i = 0; i < allCountries.size(); i++) {
//		// 	System.out.println(allCountries.get(i));
//		// }
//	}
//
//}
