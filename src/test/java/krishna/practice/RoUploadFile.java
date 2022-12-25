package krishna.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RoUploadFile {

		
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\OpenTaps\\driver\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://my.naukri.com/manager/createacc2.php?othersrcp=5421&wExp=N");
		
		//driver.switchTo().frame(driver.findElement(By.id("frmUpload")));
		//driver.findElement(By.name("BROWSECV")).click();
		Thread.sleep(20000);
		
		StringSelection stringSelection = new StringSelection("C:\\test.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		   
		//native key stroke for CTRL, V and ENTER keys
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
