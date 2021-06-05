import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SeleniumSwitchFrames2 {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();

        Helpers.launch("https://demoqa.com/frames");
        Helpers.sleep(2L);

        Helpers.scrollDown();

        WebElement frameElement = driver.findElement(By.xpath("//*[@id=\"frame2\"]"));

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.getElementById('frame2').setAttribute('width', '500px')");
//        js.executeScript("document.getElementById('frame2').setAttribute('height', '350px')");

        driver.switchTo().frame(frameElement);


        String btnText = driver.findElement(By.id("sampleHeading")).getText();
        Helpers.print(btnText);

        driver.switchTo().defaultContent();
        String labelText = driver.findElement(By.xpath("//div[@id=\"framesWrapper\"]/div[1]")).getText();
        Helpers.print(labelText);
        Helpers.sleep(2L);

        Helpers.closeQuit();

    }
}
