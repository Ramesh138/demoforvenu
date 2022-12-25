package krishna.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		

		driver.manage().window().maximize();
	
		driver.get("https://chercher.tech/practice/frames");
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
	
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("/html/body/input")).sendKeys("Ramesh");
		
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		
		driver.switchTo().frame(frame3);
	
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		if(! checkbox.isSelected()){
			checkbox.click();
		}
	}
}

