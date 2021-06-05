import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Helpers {

    static WebDriver driver;

    public static void print(String msg) {
        System.out.println("*****************");
        System.out.println(msg);
        System.out.println("*****************");
    }
    public static void sleep(long seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver","res/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getFireFoxDriver() {
          System.setProperty("webdriver.gecko.driver","res/geckodriver");
          driver = new FirefoxDriver();
          return driver;
    }

    public static void launch(String url) {
        //http://automationpractice.com/index.php
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        // Testing code goes here
        driver.manage().window().maximize();
    }

    public static void closeQuit() {
        // driver.close(); // close the current tab
        driver.quit(); // quit the browser
    }

    public static void click(By byValue) {
        driver.findElement(byValue).click();
    }

    public static void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0,4000)");
    }

    public static void scrollUp() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(1000, 0)");
    }
}
