package synchronaization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	
	dr.get("https://www.instagram.com/");
	
	Thread.sleep(2000);                     //it will stop the execution of the script for 2sec
	
	dr.findElement(By.name("username")).sendKeys("abix");
	dr.findElement(By.name("password")).sendKeys("yuu@addu");
	
	//dr.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	//dr.findElement(By.xpath("//button[.='Log in']")).click();
	
	dr.findElement(By.xpath("//div[.='Log in']")).click();
	
}
}
