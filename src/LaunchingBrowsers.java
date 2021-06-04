import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class LaunchingBrowsers {

    public static void main(String[] args) {
        //To Open Chrome Driver
        WebDriver driver = Helpers.getChromeDriver();

        driver.get("https://www.google.com/");
        // implicit wait
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        // navigate and locator in tomo class.
//        driver.navigate().to("https://www.ing.com/");
//        sleep(15L);
//        driver.navigate().back();
//        sleep(15L);
//        driver.navigate().forward();
//        sleep(15L);
//        driver.navigate().refresh();

        // managing windows
        driver.navigate().to("https://www.disneyplus.com/");
        driver.manage().window().setSize(new Dimension(1024,1366));
        //sleep(3000L);
        driver.manage().window().maximize();
        //sleep(3000L);
//        driver.manage().window().fullscreen();
//        sleep(5000L);
        Dimension dimension = driver.manage().window().getSize();
        Helpers.print("width : "+ dimension.getWidth());
        Helpers.print("height : "+ dimension.getHeight());
        //get info from browser
        String url = driver.getCurrentUrl();
        Helpers.print(url);
        String title = driver.getTitle();
        Helpers.print(title);
        //driver.findElement(By.id("logo1")).click();

        // print(driver.getPageSource());
        // To Close and Quit the browser

        Helpers.closeQuit();

//        try {
//            driver = new SafariDriver();
//        }catch (Exception e) {
//            try {
//                driver = new ChromeDriver();
//            }catch (Exception e1){
//                driver = new FirefoxDriver();
//            }
//        }

//        if(args[0].equalsIgnoreCase("chrome")) {
//            driver = new ChromeDriver();
//        } else {
//            driver = new FirefoxDriver();
//        }
    }
}
