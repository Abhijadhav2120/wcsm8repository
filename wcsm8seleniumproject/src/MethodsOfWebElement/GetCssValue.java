package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		dr.get("orengehrm");
		webelement button = dr.findElement(By.xpath("loginbutton")).click();

		Stirng value = button.getCssvalue("colour");
		System.out.println(value);
	}
}
