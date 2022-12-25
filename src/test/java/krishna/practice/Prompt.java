package krishna.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("prompt")).click();
		Alert ale = driver.switchTo().alert();
		Thread.sleep(2000);
		ale.sendKeys("chercher.tech");
		Thread.sleep(2000);
		ale.dismiss();
		
		driver.quit();
		
	}

}
