package venu.vp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Sampleauto {

    static WebDriver driver;

    public static String vpFlow(String Username, String Password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        // driver.navigate().to("http://demo.guru99.com/");
        driver.manage().window().maximize();
        driver.get("https://www.velocitypools.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.linkText("My Account")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");   //Scroll down
        Thread.sleep(2000);

        driver.findElement(By.linkText("Register")).click();
      //  JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");   //Scroll down
        Thread.sleep(2000);
        driver.findElement(By.name("sponsor_username")).click();
        driver.findElement(By.name("sponsor_username")).clear();
        driver.findElement(By.name("sponsor_username")).sendKeys(Username);
        driver.findElement(By.name("password")).sendKeys(Password);
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
        driver.findElement(By.name("sponsor_username")).sendKeys(Username);
        driver.findElement(By.name("password")).click();
        driver.findElement(By.cssSelector(".h-100")).click();
        driver.findElement(By.cssSelector(".btn-block")).click();

        driver.findElement(By.linkText("Log Out")).click();
        Thread.sleep(2000);
//        driver.manage().window().maximize();
        driver.get("https://www.velocitypools.com/admin");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Webadmin@_143");
       // driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Pins")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".visible > li:nth-child(1) span")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add_btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("username")).click();
        {
            WebElement dropdown = driver.findElement(By.name("username"));
            dropdown.findElement(By.xpath("//*[@id=\"form_div\"]/form/div[2]/div/select/option[2]")).click();
        }
        driver.findElement(By.cssSelector(".btn-info:nth-child(1)")).click();
        Thread.sleep(2000);

        String createdUser=driver.findElement(By.xpath("//*[@id=\"table_export\"]/tbody/tr[1]/td[3]")).getText();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Log Out")).click();
        Thread.sleep(2000);
        driver.quit();
        return createdUser;
    }

    public static void activate(String createdUser) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        // driver.navigate().to("http://demo.guru99.com/");
        driver.manage().window().maximize();
        driver.get("https://www.velocitypools.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//        driver.get("https://www.velocitypools.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("My Account")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");   //Scroll down
        Thread.sleep(2000);

        //driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(createdUser);
        js.executeScript("window.scrollBy(0,100)");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123456");
        js.executeScript("window.scrollBy(0,100)");
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("password")).click();
        js.executeScript("window.scrollBy(0,100)");
        driver.findElement(By.cssSelector(".col-12 > .btn")).click();
        Thread.sleep(2000);
        String createdpin=driver.findElement(By.xpath(" //*[@id=\"table_export\"]/tbody/tr/td[1]")).getText();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Here")).click();
        driver.findElement(By.name("pin")).click();
        driver.findElement(By.name("pin")).sendKeys(createdpin);
        driver.findElement(By.cssSelector(".btn-block")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Log Out")).click();
        Thread.sleep(2000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        List<String> li=new ArrayList<>();

       String val= "vps58571420";
       String val1[]=val.split(",");
       for(int j=0;j< val1.length;j++){
           System.out.println(val1[j]);
               for (int i=0;i<5;i++){
                   String value=   vpFlow(val1[j],"123456");
                   li.add(value);
                   activate(value);
               }
           }
      System.out.println( "Created pin list ====== "+li);

    }
}