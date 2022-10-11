package selenium.assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement countryName = driver.findElement(By.name("country"));
        Select select = new Select(countryName);

        select.selectByIndex(2);
        Thread.sleep(3000);

        select.selectByValue("AUSTRIA");
        Thread.sleep(3000);

        select.selectByVisibleText("BELGIUM");
        Thread.sleep(3000);

        List<WebElement> webElements = select.getOptions();

        for (WebElement webElement: webElements){

            System.out.println(webElement.getAttribute("value") + " " + webElement.getText());
        }

        driver.navigate().to("https://demoqa.com/select-menu");
        Select select2 = new Select(driver.findElement(By.id("cars")));
        select2.selectByIndex(1);
        select2.selectByIndex(2);

        Thread.sleep(3000);


        driver.quit();



    }
}
