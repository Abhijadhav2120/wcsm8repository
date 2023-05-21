package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver dr = new ChromeDriver();

	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement button = dr.findElement(By.xpath("//button[text()=' Login ']"));

	Point loc = button.getLocation();
	int xaxis = loc.getX();
	int yaxis = loc.getY();
	System.out.println("x axis"+xaxis+"  y axis"+yaxis);
}
}
