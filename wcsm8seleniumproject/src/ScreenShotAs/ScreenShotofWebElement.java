package ScreenShotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotofWebElement {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	dr.navigate().to("https://www.facebook.com/");
	WebElement button = dr.findElement(By.xpath("//a[.='Create new account']"));
	
	if (button.isEnabled())
	{
		System.out.println("we can do the login!!");
		File ss=button.getScreenshotAs(OutputType.FILE);
		File Dest=new File("./screenshots/webelement.jpg");
		
		Files.copy(ss,Dest);
	}

	
}
}
