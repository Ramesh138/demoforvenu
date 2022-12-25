package krishna.practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ByButtonText implements Webelemetinterface  {
	
	static WebDriver driver;
	public static By buttonText(String buttonText)
	{
		return new By(){
			@Override
			public List<WebElement> findElements(SearchContext arg0) {
				String xpath = "//button[text()='" + buttonText + "']";
				List<WebElement> elements = arg0.findElements(By.xpath(xpath));
				 return elements;
			}
		};
	}
	
	
	
	
	public static void clickLinktext(String linkvalue) throws InterruptedException {
		String value =".//*[text()="+linkvalue+"]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(value)).click();
	}
	
	public static void name(String ele,String value) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name(ele)).sendKeys(value);	
		
	}




	@Override
	public void byXpath(String ele,String value) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(ele)).sendKeys(value);
	}




	@Override
	public void byname(String ele,String value) {
		// TODO Auto-generated method stub
		driver.findElement(By.name(ele)).sendKeys(value);
		
	}




	@Override
	public void byid(String ele,String value) {
		// TODO Auto-generated method stub
		driver.findElement(By.id(ele)).sendKeys(value);
	}
}
