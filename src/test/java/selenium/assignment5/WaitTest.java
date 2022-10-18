package selenium.assignment5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        //Implicit Wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.manage().window().maximize();

        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //Locator : id   || it requires id name.
        WebElement webElement = driver.findElement(By.id("customer.firstName"));
        // Applied Explicit Wait
        wait.until(ExpectedConditions.elementToBeClickable(webElement));

        webElement.clear();
        webElement.sendKeys("Ali");
        Thread.sleep(3000);

        driver.quit();
    }
}
