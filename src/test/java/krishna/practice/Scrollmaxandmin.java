package krishna.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollmaxandmin {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://the-internet.herokuapp.com/");


		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
			 
			Thread.sleep(2000);
			
		//	js.executeScript("return window.scrollMaxY");

			// get the maximum scroll distance Vertically
			Object verticalScrollBar = js.executeScript("return window.scrollMaxY");
			
			// get the maximum scroll distance Horizontally
			Object horizontalScrollBar = js.executeScript("return window.scrollMaxX");

			
			Thread.sleep(2000);
			driver.quit();

		} catch (Exception e) {
			
			System.out.println("error");
			driver.quit();
		}

	}

}
