package methodsOfWebDrivers;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetPositionBrowser {
	// by using manage method...
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			
			Dimension targetSize = new Dimension(350,450);

			Thread.sleep(2000);
			driver.manage().window().setSize(targetSize);
			
			Point targetPosition = new Point(450,350);
			Thread.sleep(2000);
			driver.manage().window().setPosition(targetPosition);
		}

}// not working
