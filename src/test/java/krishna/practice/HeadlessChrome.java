package krishna.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessChrome {

	
	public static void main(String[] args) throws InterruptedException {

		// Launch 
		WebDriver driver = new HtmlUnitDriver();
		
		// load the url
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("alert")).click();
		
		
		System.out.println(driver.getTitle());
		
	
		
	}
}
