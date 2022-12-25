package krishna.practice;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
	
	
	

//	Basic Xpath 
		
//Relative  ============ //tagename[@attribute=value]
	
//Contains==============//*[contains(@type,'text')]
	
//Starts-with===========//*[starts-with(@id,'mes')]
	
//text()=================//*[text()='Selenium']
	
//following ============.//*[@name='uid']//following::input[3]
	
//ancestor=============.//*[@name='submit']//ancestor::div
	
//child===============//*[@id="gf-BIG"]/table/tbody/tr/td[1]/ul//child::li
	
//proceeding============//*[@type='password']//preceding::input
	
//Sibling====//*[@id='uid']//following-sibling::input
	
//parent========//*[@id="gf-BIG"]/table/tbody/tr/td[1]/ul//parent::li
	
//self=========//*[@name='uid']//self::input
	
//decendant======//*[@id="gf-BIG"]/table/tbody//descendant::li
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				".//driver//chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/v1/" );
		
		driver.manage().window().maximize();
		
		java.util.List<WebElement> value =driver.findElements(By.xpath("//label"));
		
		int listoflinks=value.size();
		
		
		driver.close();
		
		System.out.println(listoflinks);
		
	}

}
