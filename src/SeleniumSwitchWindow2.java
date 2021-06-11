import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;


public class SeleniumSwitchWindow2 {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();

        Helpers.launch("https://demoqa.com/browser-windows");
        Helpers.sleep(2L);

        Helpers.click(By.id("messageWindowButton"));

        String firstWindow = driver.getWindowHandle(); // step1
        Set<String> allWindows = driver.getWindowHandles(); // step2
        Iterator<String> iterator = allWindows.iterator(); // step3.1

        while(iterator.hasNext()) { // step3.2
            String secondWindow = iterator.next(); // step4
            if(!firstWindow.equalsIgnoreCase(secondWindow)) {
                driver.switchTo().window(secondWindow);  // step5
                Helpers.sleep(2L);
                String btnText = driver.findElement(By.tagName("body")).getText();
                Helpers.print(btnText);
                driver.close(); // step6
            }
        }
        driver.switchTo().window(firstWindow); // step7

        String hdrText = driver.findElement(By.className("main-header")).getText();
        Helpers.print(hdrText);
        Helpers.sleep(2L);
        Helpers.closeQuit();

    }
}
