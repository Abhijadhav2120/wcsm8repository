package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		dr.get(" http://laptop-agbvdu2t/login.do");

		WebElement usernameTB = dr.findElement(By.name("username"));
		usernameTB.sendKeys("admin");

		WebElement pwdTB = dr.findElement(By.name("pwd"));
		pwdTB.sendKeys("manager");

		//WebElement loginButton = dr.findElement(By.id("loginButton"));
		//loginButton.click();

		dr.navigate().refresh();

		Thread.sleep(2000);
		usernameTB.clear();
		usernameTB.sendKeys("admin");

	}
}
