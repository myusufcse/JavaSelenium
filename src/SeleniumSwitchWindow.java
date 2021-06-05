import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;


public class SeleniumSwitchWindow {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();

        Helpers.launch("https://demoqa.com/browser-windows");
        Helpers.sleep(2L);

        Helpers.click(By.id("tabButton"));

        String firstWindow = driver.getWindowHandle(); // step1
        Helpers.print(firstWindow);  // FOR

        Set<String> allWindows = driver.getWindowHandles(); // step2
        allWindows.forEach(System.out::println); // FOR

        allWindows.remove(firstWindow); // step3

        String secondWindow = allWindows.iterator().next(); // step4
        Helpers.print(secondWindow);  // FOR
        driver.switchTo().window(secondWindow);  // step5

        Helpers.sleep(2L);
        String btnText = driver.findElement(By.id("sampleHeading")).getText();
        Helpers.print(btnText);
        driver.close(); // step6
        Helpers.sleep(2L);
        driver.switchTo().window(firstWindow); // step7

        String hdrText = driver.findElement(By.className("main-header")).getText();
        Helpers.print(hdrText);
        Helpers.sleep(2L);
        Helpers.closeQuit();

    }
}
