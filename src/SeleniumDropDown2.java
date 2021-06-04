import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropDown2 {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();

        Helpers.launch("https://www.ebay.com/");
        Helpers.sleep(2L);
        Select allMenu = new Select(driver.findElement(By.id("gh-cat")));
        Helpers.sleep(2L);
        allMenu.selectByIndex(1);
        Helpers.sleep(2L);
        allMenu.selectByValue("267");
        Helpers.sleep(2L);
        allMenu.selectByVisibleText("Art");
        Helpers.closeQuit();

    }
}
