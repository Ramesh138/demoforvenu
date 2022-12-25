package krishna.practice;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpload {

public static void main(String[] args) throws InterruptedException, AWTException {
	


	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

// maximize browser
driver.manage().window().maximize();
   
 // Specify the file location with extension
StringSelection sel = new StringSelection("D:\\Public\\Sample.txt");

 // Copy to clipboard
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
System.out.println("selection" +sel);


// Open Monster.com
driver.get("http://my.monsterindia.com/create_account.html");
Thread.sleep(2000);

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("scroll(0,350)");

Thread.sleep(5000);

driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[4]/div[2]/div[1]/div/label/span")).click();



System.out.println("Browse button clicked");

// Create object of Robot class
Robot robot = new Robot();
Thread.sleep(1000);
  
 // Press Enter
robot.keyPress(KeyEvent.VK_ENTER);

// Release Enter
robot.keyRelease(KeyEvent.VK_ENTER);

 // Press CTRL+V
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);

// Release CTRL+V
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_V);

Thread.sleep(1000);

robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);

Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);


driver.quit();

}

}
