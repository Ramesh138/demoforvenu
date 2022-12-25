package krishna.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		WebElement ele= driver.findElement(By.className("demo-frame"));

		driver.switchTo().frame(ele);

		WebElement xloc = driver.findElement(By.id("draggable"));
		

		WebElement yloc = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
	
		
		action.clickAndHold(xloc).moveToElement(yloc).release().build().perform();
		Thread.sleep(10000);

		driver.quit();

	}

}
