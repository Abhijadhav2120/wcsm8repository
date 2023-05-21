package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NIkeText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.nike.com/in/w/mens-shoes-nik1zy7ok");

		//driver.get("https://www.nike.com/in/t/air-max-97-shoes-EBZrb8/921826-101");

		Thread.sleep(2000);


		driver.findElement(By.xpath("//a[.='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[.text()='Nike Invincible 3']")).click();
	}

}