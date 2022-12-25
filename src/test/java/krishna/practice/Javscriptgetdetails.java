package krishna.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javscriptgetdetails {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://the-internet.herokuapp.com/");

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;

		Object obj1=js.executeScript("return document.domain");
		
		
		
		System.out.println(obj1);
			// js.executeScript("window.location = 'http://demo.guru99.com/'");
		
			/*
			 * Object obj=js.executeScript("return document.readyState");
			 * 
			 * System.out.println(obj);
			 */
			
			/*
			 * Object value=js.executeScript("return document.title");
			 * 
			 * System.out.println(value);
			 */
			
			
			Thread.sleep(2000);
			driver.quit();

		} catch (Exception e) {

			System.out.println("error");
			driver.quit();
		}

	}

}
