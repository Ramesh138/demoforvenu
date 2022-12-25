package krishna.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	
	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/draggable/");
		
		driver.navigate().to("http://google.com");
		
		//Switch to frame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
		
		//Comeout of the frame
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
		//CLick on droppable link
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.close();
	
	
	
	}
	
}

		

