package krishna.practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerMOdel2 {
	public static void main(String[] args) throws InterruptedException {
		String dot = "9/October/2020";
		String date, month, year;
		String caldt, calmonth, calyear;
		/*
		 * Split the String into String Array
		 */
		String dateArray[] = dot.split("/");
		date = dateArray[0];
		month = dateArray[1];
		year = dateArray[2];
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://cleartrip.com");
		driver.findElement(By.id("DepartDate")).click();

		WebElement cal;
		cal = driver.findElement(By.className("calendar"));
		calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		/**
		 * Select the year
		 */
		System.out.println(calyear);
		while (!calyear.equals(year)) {
			System.out.println(calyear);
			driver.findElement(By.className("nextMonth")).click();
			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.println("Displayed Year::" + calyear);
		}

		calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		/**
		 * Select the Month
		 */
		while (!calmonth.equalsIgnoreCase(month)) {
			driver.findElement(By.className("nextMonth ")).click();
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}

		cal = driver.findElement(By.className("calendar"));
		/**
		 * Select the Date
		 */
		List<WebElement> rows, cols;
		rows = cal.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			cols = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) {
				caldt = cols.get(j).getText();
				if (caldt.equals(date)) {
					cols.get(j).click();
					break;
				}
			}
		}

		
		driver.close();
	}

	

}
