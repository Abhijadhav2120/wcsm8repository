package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWait {
public static void main(String[] args) {
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	
	//apply the implicitly wait to  appear the web element
	
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	dr.get("https://www.instagram.com/");
	
	dr.findElement(By.name("username")).sendKeys("abixx");
	dr.findElement(By.name("password")).sendKeys("y@12hfewhj");
	//dr.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	dr.findElement(By.xpath("//button[.='Log in']")).click();
	//dr.findElement(By.xpath("//div[text()='Log in']")).click();
}
}
