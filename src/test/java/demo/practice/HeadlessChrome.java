package demo.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.List;

public class HeadlessChrome {

    @Test
    public static void test1() throws InterruptedException {

        // Launch
        System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
       // WebDriver  driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://demo.guru99.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("Page Title: " +title);
        driver.quit();


    }
}
