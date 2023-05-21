package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	dr.get("file:///C:/Users/abhin/OneDrive/Desktop/selenium/alert.html");
	
	// Generate alert popup
	Thread.sleep(3000);
	dr.findElement(By.xpath("//button[.='Click me!']")).click();
	
	//handle alert
	Thread.sleep(3000);
	Alert alt = dr.switchTo().alert();
	
	//alt.accept();
	System.out.println(alt.getText());
	alt.dismiss();
	
	
	
	
}
}
