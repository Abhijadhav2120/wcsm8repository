package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hotstar {

	public static void main(String[] args) {
		
WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		driver.findElement(By.xpath(""));
		
		

	}

}
