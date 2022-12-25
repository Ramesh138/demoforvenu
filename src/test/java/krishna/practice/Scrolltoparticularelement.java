package krishna.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltoparticularelement {
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

			WebElement Element = driver.findElement(By.linkText("Redirect Link"));

			// This will scroll the page till the element is found
			js.executeScript("arguments[0].scrollIntoView();", Element);
			Thread.sleep(2000);
			
			String val=Element.getText();
			
			System.out.println(val);
			//js.executeScript("arguments[0].click();", Element);

			Thread.sleep(2000);
			driver.quit();

		} catch (Exception e) {

			System.out.println("error");
			driver.quit();
		}

	}

}
