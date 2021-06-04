import org.junit.Assert;
import org.openqa.selenium.*;

import static org.junit.Assert.assertEquals;

public class FormFill {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getChromeDriver();
        Helpers.launch("https://www.disneyplus.com/en-be");
        Helpers.sleep(5L);
        driver.findElement(By.xpath("//*[@id=\"nav-initial\"]/div/a")).click();
        Helpers.sleep(5L);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("fghjkl");
        email.sendKeys(Keys.ENTER);
        Helpers.sleep(5L);
        String errorMsg = driver.findElement(By.xpath("//div[@data-testid=\"text-input-error\"]")).getText();
        String expectedErrorMsg = "Sorry, we are having trouble creating your account. Please re-enter your account details and try again. If the problem persists, contact Disney+ Support (error code 6).";
        assertEquals(errorMsg, expectedErrorMsg);
        //Assert.assertNotEquals(errorMsg, expectedErrorMsg);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@data-testid=\"text-input-error\"]")).isEnabled());
        Helpers.sleep(5L);
        Helpers.closeQuit();
    }
}
