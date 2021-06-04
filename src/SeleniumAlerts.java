import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.awt.windows.ThemeReader;


public class SeleniumAlerts {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();

        Helpers.launch("https://demoqa.com/alerts");
        Helpers.sleep(2L);

        Helpers.click(By.id("alertButton"));
        Helpers.sleep(2L);
        Alert alert = driver.switchTo().alert();
        Helpers.sleep(2L);
        Helpers.print(alert.getText());
        Helpers.sleep(2L);
        alert.accept();
        Helpers.sleep(2L);

        Helpers.click(By.id("confirmButton"));
        alert = driver.switchTo().alert();
        Helpers.sleep(2L);
        Helpers.print(alert.getText());
        Helpers.sleep(2L);
        alert.dismiss();
        Helpers.sleep(2L);

        Helpers.click(By.id("promtButton"));
        alert = driver.switchTo().alert();
        Helpers.sleep(2L);
        alert.sendKeys("Internet is slow in BBF");
        Helpers.sleep(2L);
        alert.accept();
        Helpers.sleep(2L);

        Helpers.closeQuit();

    }
}
