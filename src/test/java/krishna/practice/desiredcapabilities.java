package krishna.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredcapabilities {
	
	 public static void main(String[] args) {
		
		 
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("browserName", "chrome");
	        capabilities.setCapability("version", "84.0");
	        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get any available one
	        capabilities.setCapability("name", "desiredcapabilities");
	        capabilities.setCapability("network", true); // To enable network logs
	        capabilities.setCapability("visual", true); // To enable step by step screenshot
	        capabilities.setCapability("video", true); // To enable video recording
	        capabilities.setCapability("console", true); // To capture console logs

	        capabilities.setCapability("selenium_version","4.0.0-alpha-2");
	         capabilities.setCapability("timezone","UTC+05:30");
	         capabilities.setCapability("geoLocation","IN");
	         capabilities.setCapability("chrome.driver","78.0");

	         System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.ie.driver", ".\\driver\\chromedriver.exe");
		   
		  //it is used to initialize the IE driver
		  WebDriver driver = new ChromeDriver(capabilities);
		   
		  driver.manage().window().maximize();

		  driver.get("http://gmail.com");
		   
		  driver.quit();
	}

}
