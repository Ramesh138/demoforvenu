package krishna.practice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTablee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


		//Implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Maximize the window
		driver.manage().window().maximize();

		//Launch the url
		driver.get("http://erail.in/");
		
		
		List<WebElement> headers= driver.findElements(By.xpath("//*[@id=\"myTable\"]/thead/tr/th"));
		
		System.out.println(headers.size());
		
		List<WebElement> trains= driver.findElements(By.xpath("//*[@id=\"myTable\"]/tbody/tr"));
		
		System.out.println(trains.size());
		
		ArrayList<String> al= new ArrayList<String>();
		
		for (int i = 1; i <= headers.size(); i++) {
			
			String header=driver.findElement(By.xpath("//*[@id=\"myTable\"]/thead/tr/th["+i+"]")).getText();
			
			al.add(header);
			
			
			
			/*
			 * for (int j = 1; j <= trains.size(); j++) {
			 * 
			 * String
			 * train=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr["+j+"]/td["+
			 * i+"]")).getText();
			 * 
			 * System.out.println(train);
			 * 
			 * }
			 */
			
		}
		
		
		System.out.println(al);
		
		
		String actual=al.get(0);
		Collections.sort(al);
		
		System.out.println(al);
		String expected=al.get(0);
		
		if(actual!=expected) {
			System.out.println("sorting done ");
		}else {
			System.out.println("sorting  not done ");
		}
		
		
		
		 
		driver.quit();
			
		
		
		
		
	}

}
