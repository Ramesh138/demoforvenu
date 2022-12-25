package krishna.practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TakeSnap {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		// Create FF instance
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();

		// Implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Maximize the window
		driver.manage().window().maximize();

		// Launch the url
		driver.get("http://google.com");

		// Snapshot
		// Case the driver to TakesScreenshot
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Copy the snapshot taken to physical dir
		FileUtils.copyFile(file, new File(".\\driver\\google.png"));
		
		

		driver.quit();

		
		
		
		
		
		
		
		
		
		
		
	}
}
