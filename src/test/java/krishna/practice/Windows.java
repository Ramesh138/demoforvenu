package krishna.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/windows");
		
		//get the parent window
		String parentWindow = driver.getWindowHandle();
		
		// it will parent session id
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		//Get the window handles
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println("THe windows opened are: "+windows.size());
		Thread.sleep(1000);
		//For each
		for (String win : windows){
			System.out.println("The current win handle is: "+win);
			driver.switchTo().window(win);
		}
		Thread.sleep(1000);
		// print the title of second window
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		// go back to parent window
		driver.switchTo().window(parentWindow);
		Thread.sleep(1000);
		String value=driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
		Thread.sleep(1000);
		System.out.println(value);
		
		driver.quit();
	}

}
