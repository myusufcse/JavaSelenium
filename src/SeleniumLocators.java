import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SeleniumLocators {
    public static void main(String[] args) {

        WebDriver driver = Helpers.getChromeDriver();

        Helpers.launch("http://automationpractice.com/index.php");

        WebElement contact_us = driver.findElement(By.id("contact-link"));
        Helpers.print(""+contact_us.getSize().getHeight());
        contact_us.click();
        Helpers.sleep(2L);
        driver.navigate().back();
        driver.findElement(By.className("login")).click();
        Helpers.sleep(2L);

        Helpers.print(""+driver.findElements(By.tagName("img")).size());
        // Don't use absolute path in xpath
        //driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[3]/button"));
        driver.findElement(By.linkText("Forgot your password?")).click();
        Helpers.sleep(2L);
        driver.findElement(By.partialLinkText("Login")).click();
        Helpers.sleep(2L);
        driver.findElement(By.xpath("//p[@class='lost_password form-group']/a[@rel='nofollow']")).click();
        Helpers.sleep(2L);

        driver.findElement(By.cssSelector("#header_logo img")).click();

        Helpers.closeQuit();
    }

}
