package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinktextLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/wcsm8/LinkWebElement.html");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("FlipkartLink")).click();
	    
	    
	}
}
//not working 