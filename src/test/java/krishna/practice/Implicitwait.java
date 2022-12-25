package krishna.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	static WebDriver driver; // Global variable

	public static void main(String[] args) {
		Implicitwait iw = new Implicitwait();
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com");

		driver.manage().window().maximize();

		iw.clickdropdown();
		
		iw.clickdropdown1();

		driver.quit();
	}

	public void clickdropdown() {
		
		driver.findElement(By.linkText("Dropdown")).click();
	}
	
	public void clickdropdown1() {
		
		driver.findElement(By.linkText("Dropdown1")).click();
	}
}
