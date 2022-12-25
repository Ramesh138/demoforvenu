package krishna.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class BasicCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

        System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
       // driver.get("http://demo.guru99.com/");
		driver.navigate().to("http://demo.guru99.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("Page Title: " +title);

		String current = driver.getCurrentUrl();

		System.out.println(current);

	driver.findElement(By.linkText("Insurance Project")).click();
		Thread.sleep(2000);
	driver.navigate().back();

	Thread.sleep(2000);

	driver.navigate().forward();

	Thread.sleep(2000);

	driver.navigate().refresh();

		Thread.sleep(1000);

		driver.quit();

		 }

}
