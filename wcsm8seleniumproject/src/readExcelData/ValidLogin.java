package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class ValidLogin {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://laptop-knl22f4g/login.do");
		
		// read the valid username from ActiTimeTestData excel sheet
		
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
		String validUsername = cell.getStringCellValue();
		
		// read the valid Password from ActiTimeTestData excel sheet
				FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
				Workbook wb2 = WorkbookFactory.create(fis2);
				org.apache.poi.ss.usermodel.Sheet sheet2 = wb.getSheet("validcreds");
				Row row2 = sheet2.getRow(1);
				org.apache.poi.ss.usermodel.Cell cell2 = row2.getCell(1);
				String validPassword = cell2.getStringCellValue();
				
				Thread.sleep(2000);
				driver.findElement(By.name("username")).sendKeys(validUsername);
				Thread.sleep(2000);
				driver.findElement(By.name("pwd")).sendKeys(validPassword);
				Thread.sleep(2000);
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				
				driver.quit();
		
	}
}