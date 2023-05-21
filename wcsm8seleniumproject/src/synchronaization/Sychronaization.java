package synchronaization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sychronaization {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	
	dr.get("https://www.instagram.com/");
	
	dr.findElement(By.name("username")).sendKeys("abix");
	dr.findElement(By.name("password")).sendKeys("yooo");
	dr.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	
	
}
}
