package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assi1OnId {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/Login");
	//netflix
	Thread.sleep(2000);
	driver.findElement(By.id("id_userLoginId")).sendKeys("ad11");
	Thread.sleep(2000);
	driver.findElement(By.id("id_password")).sendKeys("pass");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
}
}
