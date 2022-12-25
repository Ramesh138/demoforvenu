package krishna.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptclick {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.navigate().to("http://demo.guru99.com/V4/");


		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;

			
	        WebElement button =driver.findElement(By.name("btnLogin"));			
	        		
	        //Login to Guru99 		
	        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
	        driver.findElement(By.name("password")).sendKeys("amUpenu");					
	        		
			/*
			 * js.executeScript("return document.getElementById('btnLogin').click();");
			 * 
			 * js.executeScript("return document.getElementByName('uid').sendKeys(\"mngr34926\");"
			 * );
			 */
	        
	        //Perform Click on LOGIN button using JavascriptExecutor		
	        js.executeScript("arguments[0].click();", button);
	        
	        
			Thread.sleep(1000);
			driver.quit();

		} catch (Exception e) {
			
			System.out.println("error");
			driver.quit();
		}

	}

}
