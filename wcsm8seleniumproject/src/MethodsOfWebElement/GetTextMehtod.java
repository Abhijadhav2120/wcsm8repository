package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMehtod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();

	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	String button = dr.findElement(By.xpath("//button[text()=' Login ']")).getText();
	System.out.println(button);
	
	String link = dr.findElement(By.xpath("//p[contains(@class,'oxd-text oxd-text--p orangehrm-l')]")).getText();
	System.out.println(link);

}
}
