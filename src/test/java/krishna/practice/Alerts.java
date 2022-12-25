package krishna.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("prompt")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,null);
		
		//Wait for the alert to be displayed and store it in a variable
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		//Type your message
		alert.sendKeys("Selenium");

		//Press the OK button
		alert.accept();
		
		Thread.sleep(2000);
		
		
		
		
		
	
		driver.quit();
		
	}

}
