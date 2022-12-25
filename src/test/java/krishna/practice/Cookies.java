package krishna.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies extends ByButtonText {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// set chrome driver exe path
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://newtours.demoaut.com/ ");

		// set the name and value for the cookie
		Cookie coo = new Cookie("pradeephnk@gmail.com", "Hansika2010");

		// set the name and value for the cookie
		Cookie ren = new Cookie("newtours.demoaut.com", "Renamed to mercury");

		// add the cookies
		/*
		 * driver.manage().addCookie(coo); driver.manage().addCookie(ren);
		 */
		
		ByButtonText bb= new  ByButtonText();
		ByButtonText.name("userName", "pradeephnk@gmail.com");
	
		ByButtonText.clickLinktext("Home");
		
		
		
		System.out.println();
		// added the sleep to allow the domain to set all the cookies
		Thread.sleep(10000);
		// delete all the cookies
		driver.manage().deleteAllCookies();
	}
}
