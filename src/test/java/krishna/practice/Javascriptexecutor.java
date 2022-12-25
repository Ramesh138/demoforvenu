package krishna.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		Thread.sleep(1000);
		
		//Verticle scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");   //Scroll down 
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000)");  // Scroll up
		Thread.sleep(1000);
		/*
		 * js.executeScript("window.scrollByPages(2)");
		 * 
		 * 
		 * Thread.sleep(1000); js.executeScript("window.scrollByPages(-2)");
		 * 
		 * Thread.sleep(1000);
		 */
		
		
		//Horizontal scroll
		
		js.executeScript("window.scrollBy(1000,0)");   //Scroll down 
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(-1000,0)");  // Scroll up
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}

}
