package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class yooPuma {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notification");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[.='Men']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h3[contains(text(),'Rebound Future Evo Core Unisex Sneakers')]")).click();
		Thread.sleep(4000);
		driver.quit();

	}
}
