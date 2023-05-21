package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();

	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	dr.get("http://laptop-agbvdu2t/login.do");


	dr.findElement(By.name("username")).sendKeys("admin");

	dr.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	dr.findElement(By.id("loginButton")).click();

}
}
