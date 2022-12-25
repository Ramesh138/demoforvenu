package krishna.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[11]/div/p/button")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(2000);
		
		alert.accept();
		
	//	alert.dismiss();
		
	//  alert.sendKeys(" i am In ");
		
		
		driver.quit();
		
	}

}
