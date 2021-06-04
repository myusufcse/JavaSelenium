import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SeleniumDragAndDrop2 {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();

        Helpers.launch("https://demoqa.com/droppable/");
        Helpers.sleep(2L);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));
        Helpers.sleep(2L);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,destination).build().perform();
        Helpers.sleep(2L);
        Helpers.closeQuit();

    }
}
