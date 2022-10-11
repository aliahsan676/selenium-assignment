package selenium.assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class InteractingTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        WebElement webElement = driver.findElement(By.name("firstName"));
        webElement.click();
        Thread.sleep(3000);

        webElement.sendKeys("First Name: Ali");
        Thread.sleep(3000);

        webElement.clear();
        Thread.sleep(3000);

        webElement.sendKeys("Second Name: Ahsan");
        Thread.sleep(3000);

        driver.findElement(By.name("submit")).submit();
        Thread.sleep(5000);



        driver.quit();


    }
}
