package krishna.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desiredcapabilities1 {
	
	 public static void main(String[] args) {
		
		 
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("ignoreProtectedModeSettings", true);

	         System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.ie.driver", ".\\driver\\chromedriver.exe");
		   
		  //it is used to initialize the IE driver
		  WebDriver driver = new ChromeDriver(capabilities);
		   
		  driver.manage().window().maximize();

		  driver.get("http://gmail.com");
		   
		  driver.quit();
	}

}
