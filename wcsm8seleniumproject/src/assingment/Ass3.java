package assingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Ass3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new EdgeDriver(eo);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("q")).sendKeys("headphones");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   
	   List<WebElement> opt = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
	    
	   allopt-driver.findElements(By.xpath());
	   
	   //for
	    
	}

	

}
