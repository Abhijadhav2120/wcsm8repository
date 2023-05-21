package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BMWImplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver dr = new ChromeDriver(co);
		dr.manage().window().maximize();

		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

		dr.get("https://www.bmw.in/en/index.html");

		dr.findElement(By.xpath("//span[@class='ds2-label']//ancestor::a[@class='ds2-font-clickable ds2-navigation-link']")).click();
		dr.findElement(By.xpath("//button[.='M']")).click();
		dr.findElement(By.xpath("(//span[.='THE FIRST-EVER X3 M40i'])[2]")).click();

		
		
		dr.findElement(By.xpath("//span[.='Services']/ancestor::div[@class='ds2-navigation-item']"));

	}
}
