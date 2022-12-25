package krishna.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Securelogin {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeOptions fo = new ChromeOptions();
		// accept the certificate
		//fo.setAcceptInsecureCerts(true);
		//open the browser
		driver = new ChromeDriver(fo);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cacert.org/");
	}

}
