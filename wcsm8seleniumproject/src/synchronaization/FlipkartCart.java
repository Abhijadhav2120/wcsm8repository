package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver dr = new ChromeDriver(co);
		dr.manage().window().maximize();

		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		dr.get("https://www.flipkart.com/");

		dr.findElement(By.xpath("//button[.='✕']")).click();

		dr.findElement(By.xpath("//span[.='Cart']")).click();
		
		//dr.findElement(By.xpath("//span[.='Login']")).click();
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();

	}
}
