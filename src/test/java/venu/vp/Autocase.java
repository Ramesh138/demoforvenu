package venu.vp;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Autocase {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        /*driver.navigate().to("http://demo.guru99.com/");

        String title = driver.getTitle();
        System.out.println("Page Title: " +title);


        driver.quit();

        driver = new ChromeDriver();*/
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void tC1() {
        driver.get("https://www.velocitypools.com/account/signup");
        driver.manage().window().setSize(new Dimension(1170, 824));
        driver.findElement(By.name("sponsor_username")).sendKeys("vps50083199");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("full_name")).click();
        driver.findElement(By.name("full_name")).sendKeys("Venu");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("V@gmail.com");
        driver.findElement(By.name("phone")).click();
        driver.findElement(By.name("phone")).sendKeys("1234567890");
        driver.findElement(By.name("sponsor_username")).click();
        driver.findElement(By.name("sponsor_username")).click();
        driver.findElement(By.name("sponsor_username")).click();
        {
            WebElement element = driver.findElement(By.name("sponsor_username"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.name("sponsor_username")).sendKeys("vps22275350");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.cssSelector(".h-100")).click();
        driver.findElement(By.cssSelector(".btn-block")).click();
        driver.findElement(By.linkText("Log Out")).click();
        driver.findElement(By.id("username")).sendKeys("vps50083199");
        driver.findElement(By.id("password")).sendKeys("123456");
    }
}
