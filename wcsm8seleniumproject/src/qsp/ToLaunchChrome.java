package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToLaunchChrome {
public static void main(String[] args) throws InterruptedException {

	//illegal state exception
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	//connection failed exceptions
    ChromeOptions co =new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	 \
	//launch chorme
	//ChromeDriver driver = new ChromeDriver(co);
	WebDriver driver=new ChromeDriver(co);
	

	//max
	driver.manage().window().maximize();
	
	//close
	Thread.sleep(2000); ///provide a delay
	
	driver.close(); //close the browser
}
}
