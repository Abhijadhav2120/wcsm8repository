package methodsOfWebDrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions c = new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");

		WebDriver dr=new ChromeDriver(c);
		dr.manage().window().maximize();

		
		dr.get("https://www.google.com/");
		dr.switchTo().activeElement().sendKeys("bluestar");
		
		Thread.sleep(4000);
		List<WebElement> Opt = dr.findElements(By.xpath("//div[@class='wM6W7d']"));
	    
		//for loop
	    //for (int i = 1; i < Opt.size(); i++) 
	    //{
		//	String bluestar = Opt.get(i).getText();
		//	System.out.println(bluestar);
		//	Thread.sleep(2000); 
		//}
	    
		//for each loop
		for(WebElement bluestar:Opt)
		{
			System.out.println(bluestar.getText());
			Thread.sleep(2000);
		}
		Thread.sleep(5000);
		dr.close();
}
}