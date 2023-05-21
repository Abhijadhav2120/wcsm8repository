package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTestCase {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	dr.get("http://laptop-agbvdu2t/login.do");
	
	if (dr.getTitle().equals("actiTIME - Login"))
	{
		System.out.println("Login page title is matched !!, test case passed!!"));
		dr.findElement(By.name("username")).sendKeys("admin");
		dr.findElement(By.name("pwd")).sendKeys("manager");
		dr.findElement(By.id("loginButton")).click();
	}
	else
	{
		System.out.println("Login page title is matched !!, test case failed!!");
	}
	
	if(dr.getTitle().equals(""))
	{
		
	}
	else
	{
		
	}
}
}
