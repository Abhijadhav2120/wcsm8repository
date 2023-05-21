package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement button = dr.findElement(By.xpath("//button[text()=' Login ']"));
		
		Rectangle rect = button.getRect();
		
		//get the location of webelemnt
		int x = rect.getX();
		int y = rect.getY();
		System.out.println("  x axis  :"+x+"  y axis  :"+y);
		
		
		//get the height and width of the webelement
		int h = rect.getHeight();
		int w = rect.getWidth();
		System.out.println("height  :"+h+"  width  :"+w);
	}

}
