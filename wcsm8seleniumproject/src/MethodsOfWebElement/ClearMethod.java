package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();

	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	dr.get("http://laptop-agbvdu2t/login.do");

    WebElement usernameTB = dr.findElement(By.name("username"));
    WebElement passwordTB = dr.findElement(By.name("pwd"));
    
    usernameTB.sendKeys("admin");
    passwordTB.sendKeys("manager");
    
    Thread.sleep(2000);
    
    usernameTB.clear();
    Thread.sleep(2000);
    passwordTB.clear();
}
	
}
