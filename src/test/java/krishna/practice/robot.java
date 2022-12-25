package krishna.practice;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class robot {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\OpenTaps\\driver\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://my.naukri.com/manager/createacc2.php?othersrcp=5421&wExp=N");
		
		
		Thread.sleep(20000);
		
		StringSelection stringSelection = new StringSelection("Ramesh");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

}
