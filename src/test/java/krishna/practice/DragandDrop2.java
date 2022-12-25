package krishna.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/draggable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		
		WebElement ele = driver.findElement(By.id("draggable"));
		Point p = ele.getLocation();
		
		System.out.println("X location is:"+p.getX()+" and y is :"+p.getY());
		driver.manage().window().maximize();
        
        Actions action = new Actions(driver);
        action.dragAndDropBy(ele,200,10).build().perform(); // Move by specific coordinate
        Thread.sleep(10000);
        
        
		
	
		driver.quit();
		
	}

}
