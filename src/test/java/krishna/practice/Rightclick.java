package krishna.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	
	static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span"));
		
		Actions action = new Actions(driver);
		
		Thread.sleep(1000);
		
		action.contextClick(ele).moveToElement(ele1).click().build().perform();
		
		Thread.sleep(1000);
		
		Alert ale= driver.switchTo().alert();
		
		ale.accept();
		
		driver.quit();
		
		

		
		
	}
}
