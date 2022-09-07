package ReadDataFromExcel;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AccountCreatingTesting {

	private WebDriver driver;
	private static File myFile;
	private static FileInputStream file;
	private static XSSFWorkbook myWorkBook;
	private static XSSFSheet yahooSheet;
	private static XSSFSheet telerikSheet;
	private static XSSFSheet RediffSheet;	
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		myFile = new File("src\\ReadDataFromExcel\\Data.xlsx");		
		file = new FileInputStream(myFile);
		myWorkBook = new XSSFWorkbook(file);
	}
	
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
	
	@Disabled
	@Test()
	void YahooCreateAccountTest() throws Exception {
		yahooSheet = myWorkBook.getSheetAt(0);
		
		String firstName = yahooSheet.getRow(1).getCell(0).toString();
		String lastName = yahooSheet.getRow(1).getCell(1).toString();
		String username = yahooSheet.getRow(1).getCell(2).toString();
		String password = yahooSheet.getRow(1).getCell(3).toString();
		String birthYear = yahooSheet.getRow(1).getCell(4).toString();
		
	
		driver.get("https://login.yahoo.com/account/create");
		driver.findElement(By.id("usernamereg-firstName")).sendKeys(firstName);
		driver.findElement(By.id("usernamereg-lastName")).sendKeys(lastName);
		driver.findElement(By.id("usernamereg-userId")).sendKeys(username);
		driver.findElement(By.id("usernamereg-password")).sendKeys(password);
		driver.findElement(By.id("usernamereg-birthYear")).sendKeys(birthYear);
		driver.findElement(By.id("reg-submit-button")).click();
		
		String message = driver.findElement(By.tagName("h2")).getText();
		Cell actualMessageCell = yahooSheet.getRow(1).getCell(6);
		actualMessageCell.setCellType(CellType.STRING);
		actualMessageCell.setCellValue(message);
		
		Cell resultCell = yahooSheet.getRow(1).getCell(7);
		resultCell.setCellType(CellType.STRING);

		if (actualMessageCell.toString().equals(message)) {
			resultCell.setCellValue("pass");		
		}
		else {
			resultCell.setCellValue("fail");		
		}
				
		
		FileOutputStream fileOut = new FileOutputStream("src\\ReadDataFromExcel\\Data.xlsx");
		myWorkBook.write(fileOut);
		fileOut.close();
		myWorkBook.close();
		
	}
	
	
	@Test
	void TelerikCreateAccountTest() throws Exception {
		telerikSheet = myWorkBook.getSheetAt(1);
		
		String email = telerikSheet.getRow(1).getCell(0).toString();
		String firstName = telerikSheet.getRow(1).getCell(1).toString();
		String lastName = telerikSheet.getRow(1).getCell(2).toString();
		String company = telerikSheet.getRow(1).getCell(3).toString();
		String country = telerikSheet.getRow(1).getCell(4).toString();
		String state = telerikSheet.getRow(1).getCell(5).toString();
		String phone = telerikSheet.getRow(1).getCell(6).toString();

		driver.get("https://www.telerik.com/login/v2/telerik#register");
		Thread.sleep(1000);
		driver.findElement(By.id("Email-1")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("Textbox-1")).sendKeys(firstName);
		
		driver.findElement(By.id("Textbox-2")).sendKeys(lastName);
		
		driver.findElement(By.id("Textbox-3")).sendKeys(company);
		
		driver.findElement(By.id("Country-1")).sendKeys(country);
		
		driver.findElement(By.id("State-1")).sendKeys(state);
		
		driver.findElement(By.id("Textbox-4")).sendKeys(phone);
		
		driver.findElement(By.xpath("//div/div[@class='sf-fieldWrp']/button")).click();		
		Thread.sleep(3000);
		
		String message = driver.findElement(By.tagName("h1")).getText();
		Cell actualMessageCell = telerikSheet.getRow(1).getCell(8);		
		System.out.println(actualMessageCell);
		actualMessageCell.setCellType(CellType.STRING);
		actualMessageCell.setCellValue(message);
		
		Cell resultCell = telerikSheet.getRow(1).getCell(9);
		resultCell.setCellType(CellType.STRING);
		
		if (actualMessageCell.toString().equals(message)) {
			resultCell.setCellValue("pass");		
		}
		else {
			resultCell.setCellValue("fail");		
		}		

		FileOutputStream fileOut = new FileOutputStream("src\\ReadDataFromExcel\\Data.xlsx");
		myWorkBook.write(fileOut);
		fileOut.close();
		myWorkBook.close();
		
	}
	
	@Disabled
	@Test
	void RediffCreateAccountTest() throws Exception {
		RediffSheet = myWorkBook.getSheetAt(2);
		
		String name = RediffSheet.getRow(1).getCell(0).toString();
		String email = RediffSheet.getRow(1).getCell(1).toString();
		String password = RediffSheet.getRow(1).getCell(2).toString();
		String confirmPassword = RediffSheet.getRow(1).getCell(3).toString();
		String altEmail = RediffSheet.getRow(1).getCell(4).toString();
		String phone = RediffSheet.getRow(1).getCell(5).toString();
		String DOB_Day = RediffSheet.getRow(1).getCell(6).toString();
		String DOB_Month = RediffSheet.getRow(1).getCell(7).toString();
		String DOB_Year = RediffSheet.getRow(1).getCell(8).toString();
		String country = RediffSheet.getRow(1).getCell(9).toString();

		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//input[starts-with(@name, 'name')]")).sendKeys(name);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name, 'login')]")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name, 'passwd')]")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name, 'confirm_passwd')]")).sendKeys(confirmPassword);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@name, 'altemail')]")).sendKeys(altEmail);
		Thread.sleep(1000);
		driver.findElement(By.id("mobno")).sendKeys(phone);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Day')]")).sendKeys(DOB_Day);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Month')]")).sendKeys(DOB_Month);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Year')]")).sendKeys(DOB_Year);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[starts-with(@name, 'country')]")).sendKeys(country);
		driver.findElement(By.id("Register")).click();
	
		
		String message = driver.switchTo().alert().getText();
		Cell actualMessageCell = RediffSheet.getRow(1).getCell(11);				
		actualMessageCell.setCellType(CellType.STRING);
		actualMessageCell.setCellValue(message);
		
		Cell resultCell = RediffSheet.getRow(1).getCell(12);
		resultCell.setCellType(CellType.STRING);
		
		if (actualMessageCell.toString().equals(message)) {
			resultCell.setCellValue("pass");		
		}
		else {
			resultCell.setCellValue("fail");		
		}		

		FileOutputStream fileOut = new FileOutputStream("src\\ReadDataFromExcel\\Data.xlsx");
		myWorkBook.write(fileOut);
		fileOut.close();
		myWorkBook.close();
		
	}

}


