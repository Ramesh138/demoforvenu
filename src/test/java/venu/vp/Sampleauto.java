package venu.vp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Sampleauto {

    static WebDriver driver;

    public static void pinCreation() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        // driver.navigate().to("http://demo.guru99.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.velocitypools.com/account/signup");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");   //Scroll down

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


    public static void adminSelection() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        // driver.navigate().to("http://demo.guru99.com/");
        driver.manage().window().maximize();
        driver.get("https://www.velocitypools.com/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //   driver.manage().window().setSize(new Dimension(1172, 824));
        driver.findElement(By.id("username")).sendKeys("vps50083199");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Webadmin@_143");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);

        for (int i=0;i< 10;i++) {
            driver.findElement(By.linkText("Pins")).click();
            driver.findElement(By.cssSelector(".visible > li:nth-child(1) span")).click();
            driver.findElement(By.id("add_btn")).click();
            driver.findElement(By.name("username")).click();
            {
                WebElement dropdown = driver.findElement(By.name("username"));
                dropdown.findElement(By.xpath("//*[@id=\"form_div\"]/form/div[2]/div/select/option[2]")).click();
            }
            driver.findElement(By.cssSelector(".btn-info:nth-child(1)")).click();
            Thread.sleep(2000);

        }
        Thread.sleep(2000);


        driver.findElement(By.linkText("Log Out")).click();
    }


    public static void vpFlow(String Username,String Password) throws InterruptedException {
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

        driver.get("https://www.velocitypools.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("My Account")).click();
       // JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");   //Scroll down
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


        String createdpin=driver.findElement(By.xpath(" //*[@id=\"table_export\"]/tbody/tr/td[1]")).getText();

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
        try {
            for (int i=0;i<10;i++){
                vpFlow("vps12121519","123456");

              }
        }catch (Exception E){

        }finally {
          driver.quit();
        }


    }
}