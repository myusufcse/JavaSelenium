import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumAlertsUsingWait {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();

        Helpers.launch("https://demoqa.com/alerts");
        Helpers.sleep(2L);

        Helpers.click(By.id("timerAlertButton"));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        Helpers.sleep(2L);
        Helpers.print(alert.getText());
        Helpers.sleep(2L);
        alert.accept();
        Helpers.sleep(2L);

        Helpers.closeQuit();

    }
}
