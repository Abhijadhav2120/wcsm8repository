package framehandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		dr.get("file:///C:/Users/abhin/OneDrive/Desktop/selenium/ifame.html");
		
		
		Thread.sleep(2000);
		//WebElement frameElement = dr.findElement(By.name("frame"));
		
		
		// switch the control to frame 
		dr.findElement(By.id("i2")).sendKeys("abhi");
		
		dr.switchTo().frame("frname");                     //for switch to frame
		
		dr.findElement(By.name("pwd")).sendKeys("1234568");
		
		dr.findElement(By.name("pwd")).clear();
		
		dr.switchTo().parentFrame();
		
		dr.findElement(By.id("i2")).clear();
	}

}
