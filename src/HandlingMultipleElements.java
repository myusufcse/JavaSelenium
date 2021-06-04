import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HandlingMultipleElements {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getChromeDriver();
        Helpers.launch("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2F&hl=en&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
        Helpers.sleep(2L);
        List<WebElement> elements = driver.findElements(By.xpath("//input[@type=\"text\"]"));
        Helpers.sleep(2L);
        Helpers.print(""+elements.size());
        if(elements.get(0).getAttribute("name").equals("firstName")){
            elements.get(0).sendKeys("Muhammed");
        }
        elements.get(1).sendKeys("Yusuf");
        Helpers.print("Is checkbox selected ? : "+driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        driver.navigate().to("http://automationpractice.com/index.php");
        Helpers.sleep(2L);

        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"example\"]/div[5]/div/div[2]/div[4]/div[1]/div[3]/div[2]")));
        dropdown.selectByIndex(0);

        Helpers.sleep(2L);
        Helpers.closeQuit();
    }
}
