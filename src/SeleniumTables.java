import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SeleniumTables {
    public static void main(String[] args) {
        WebDriver driver = Helpers.getFireFoxDriver();

        Helpers.launch("https://www.w3schools.com/html/html_tables.asp");
        Helpers.sleep(2L);

        int tableRow = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int tableCol = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for(int i = 1; i<=tableCol; i++) {
            String column1Head = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th["+i+"]")).getText();
            System.out.printf("%20s", column1Head);
        }
        System.out.println();
        for (int row = 2; row <= tableRow; row++) {
            for(int col = 1; col<=tableCol; col++) {
                String columnValue = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+row+"]/td["+col+"]")).getText();
                System.out.printf("%20s", columnValue);
            }
            System.out.println();
        }

        Helpers.closeQuit();

    }
}
