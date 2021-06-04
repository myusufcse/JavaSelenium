import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SeleniumDragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();

        Helpers.launch("https://www.testandquiz.com/selenium/testing.html");
        Helpers.sleep(2L);
// Type casting
//       float fa = 10.1f;
//        int ia = (int)fa; // 10

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("scrollBy(0,4000)");
        Helpers.sleep(2L);

        WebElement source = driver.findElement(By.id("sourceImage"));
        WebElement destination = driver.findElement(By.id("targetDiv"));
        Helpers.sleep(2L);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,destination).build().perform();
        Helpers.sleep(2L);
        Helpers.closeQuit();

    }
}
