package selenium.assignment2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class WebElementTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();

        WebElement webElement = driver.findElement(By.tagName("a"));
        System.out.println("First Link :" + webElement.getText().trim());


        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        System.out.println("Link Number: " + webElements.size());

        for (WebElement webElement1: webElements ){
            System.out.println(webElement1.getText());
        }
       driver.quit();

    }
}

