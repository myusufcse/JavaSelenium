import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;


public class SeleniumSwitchFrames {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();

        Helpers.launch("https://demoqa.com/frames");
        Helpers.sleep(2L);

        driver.switchTo().frame("frame1");

        String btnText = driver.findElement(By.id("sampleHeading")).getText();
        Helpers.print(btnText);

        driver.switchTo().defaultContent();
        String labelText = driver.findElement(By.xpath("//div[@id=\"framesWrapper\"]/div[1]")).getText();
        Helpers.print(labelText);
        Helpers.sleep(2L);

        Helpers.closeQuit();

    }
}
