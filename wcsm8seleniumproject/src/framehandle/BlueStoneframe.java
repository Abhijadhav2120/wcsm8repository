package framehandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneframe {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		dr.get("https://www.bluestone.com/");
		dr.findElement(By.id("denyBtn")).click();   //to handle popup
		
		Thread.sleep(2000);
		//WebElement frameelement= dr.findElement(By.xpath("//iframe"))   ...covered in 29th line
		
		// switch the control to frame for click on chat box
		Thread.sleep(2000);
		dr.switchTo().frame("fc_widget");

		WebElement chatbox = dr.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster eager-load    ']"));

		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chatbox)).click();
		//switch the controls to default web page
		dr.switchTo().defaultContent();
		
		//insert the inputs for textbox 
		dr.findElement(By.id("chat-fc-name")).sendKeys("abhinit");
		dr.findElement(By.id("chat-fc-email")).sendKeys("abhinit122@gmail.com");
		dr.findElement(By.id("chat-fc-phone")).sendKeys("123456789@1");
		
		
		

	}
}
