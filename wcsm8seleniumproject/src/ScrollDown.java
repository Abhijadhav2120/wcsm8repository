import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver dr = new ChromeDriver();

	//dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	
	dr.get("https://dashboards.handmadeinteractive.com/");
	
	//to perform scrolling operations..
	
	JavascriptExecutor jse = (JavascriptExecutor)dr;
	Thread.sleep(2000);	
	jse.executeScript("window.scrollBy(0,350)");

	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,-350)");

	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(500,0)");

	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(-500,0)");

}
}
