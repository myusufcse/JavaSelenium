import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropDown {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getChromeDriver();

        Helpers.launch("http://automationpractice.com/index.php");
        Helpers.sleep(2L);
        driver.findElement(By.id("contact-link")).click();
        Select dropdown = new Select(driver.findElement(By.id("id_contact")));
        Helpers.sleep(2L);
        dropdown.selectByIndex(1);
        Helpers.print(dropdown.getOptions().get(1).getText());

        Helpers.sleep(2L);
        Helpers.closeQuit();
    }
}
