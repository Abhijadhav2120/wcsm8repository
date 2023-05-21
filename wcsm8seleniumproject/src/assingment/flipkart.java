package assingment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chormedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow--origins=*");
		
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.flipkart.com/");
		
	}
}
