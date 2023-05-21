package WebBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		dr.get("file:///C:/Users/abhin/OneDrive/Desktop/selenium/confirmation.html");

		dr.findElement(By.xpath("//input[@type='submit']")).click();

		Alert alt = dr.switchTo().alert();

		Thread.sleep(2000);
		alt.accept();

		String text = alt.getText();
		System.out.println(text);
	}
}
