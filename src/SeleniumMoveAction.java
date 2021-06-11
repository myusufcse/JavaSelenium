import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SeleniumMoveAction {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();
        Helpers.launch("https://demoqa.com/menu/");
        Helpers.sleep(2L);
        List<WebElement> menu = driver.findElements(By.xpath("//*[@id=\"nav\"]/li"));
        // menu.get(1).click();
        Actions actions = new Actions(driver);
        Helpers.sleep(2L);
        actions.moveToElement(menu.get(1)).perform();
        Helpers.sleep(2L);
        actions.moveToElement(menu.get(1),0,90).moveByOffset(250,0).clickAndHold().perform();
        Helpers.sleep(2L);
        Helpers.closeQuit();
    }
}
//    WebElement menu2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]"));
//        Helpers.sleep(2L);
//                Actions actions = new Actions(driver);
//                actions.moveToElement(menu2).perform();
//                WebElement subMenu = driver.findElement(By.linkText("SUB SUB LIST »"));
//                actions.moveToElement(subMenu).click().perform();