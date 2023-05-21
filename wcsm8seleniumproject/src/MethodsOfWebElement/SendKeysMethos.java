package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethos {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	dr.get("http://laptop-agbvdu2t/login.do");
	
	//1st way
	//dr.findElement(By.name("username")).sendKeys("admin123");
	
	//2nd way
	WebElement userNameTB =dr.findElement(By.name("username"));
	userNameTB.sendKeys("admin123");
	
	dr.findElement(By.name("pwd")).sendKeys("manager");
	dr.navigate().refresh();
	
}

}
