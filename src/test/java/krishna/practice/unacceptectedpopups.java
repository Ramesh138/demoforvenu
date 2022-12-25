package krishna.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class unacceptectedpopups {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeOptions fo = new ChromeOptions();
		// set the behaviuor of the alert
	//	fo.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		// create object to firefox driver, register options class
		 driver = new ChromeDriver(fo);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
			driver.get("https://chercher.tech/java/index-selenium-webdriver");
		
	
		
	}

}
