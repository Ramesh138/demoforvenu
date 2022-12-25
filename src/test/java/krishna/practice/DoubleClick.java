package krishna.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
		
		Thread.sleep(2000);
		WebElement link =driver.findElement(By.id("double-click"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		action.doubleClick(link).perform();
	
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		System.out.println("Alert Text\n" +alert.getText());
		
		Thread.sleep(2000);
		
		alert.accept();

		driver.quit();
	}

}
