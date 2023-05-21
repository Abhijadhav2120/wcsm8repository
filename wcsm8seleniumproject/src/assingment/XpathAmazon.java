package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");


		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Sony DualSense Wireless Controller for PlayStation 5 (White)']")).click();
		Thread.sleep(2000);


	}
}