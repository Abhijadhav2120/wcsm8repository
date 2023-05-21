package methodsOfWebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleMethod {

	//is use to get the title of current Web page

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();           //to handle the properties of chrome browser
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		String loginpage1Title = driver.getTitle();
		System.out.println(loginPageTitle);
		//System.out.println(driver.getTitle());



	}
}
//not working