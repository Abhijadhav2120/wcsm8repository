package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
public static void main(String[] args) throws InterruptedException {
     
	        //to avoid IllegalStatException
			//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			
			// to launch Firefox Browser
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.close();
}
}
///check drivers