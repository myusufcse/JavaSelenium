import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class SeleniumAlertsUsingFluentWait {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();

        Helpers.launch("https://demoqa.com/alerts");
        Helpers.sleep(2L);

        Helpers.click(By.id("timerAlertButton"));

//        WebDriverWait wait = new WebDriverWait(driver, 10);

        Wait wait = new FluentWait(driver).
                withTimeout(10, TimeUnit.SECONDS).
                pollingEvery(5, TimeUnit.SECONDS).
                ignoring(Exception.class);

        Alert alert = (Alert) wait.until(new Function(){
            @Override
            public Object apply(Object o) {
                try {
                    return driver.switchTo().alert();
                } catch (NoAlertPresentException e) {
                    return null;
                }
            }
        });

        Helpers.sleep(2L);
        Helpers.print(alert.getText());
        Helpers.sleep(2L);
        alert.accept();
        Helpers.sleep(2L);

        Helpers.closeQuit();

    }
}
