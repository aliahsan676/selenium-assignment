package selenium.assignment2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();

        //Locator : id   || it requires id name.
        WebElement webElement = driver.findElement(By.id("customer.firstName"));
        webElement.clear();
        webElement.sendKeys("Ali");
        Thread.sleep(3000);

        //Locator : className
        System.out.println(driver.findElement(By.className("title")).getText());
        Thread.sleep(3000);


        //Locator : name
        WebElement lastname = driver.findElement(By.name("customer.lastName"));
        lastname.clear();
        lastname.sendKeys("Ahsan");
        Thread.sleep(3000);

        //Locator : partialLinkText
        driver.findElement(By.partialLinkText("in info?")).click();
        Thread.sleep(3000);

        //Locator : linkText
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);

        //Locator : tagName
        System.out.println(driver.findElement(By.tagName("title")).getText());
        Thread.sleep(3000);

        //Locator : xpath
        String xpath = driver.findElement(By.xpath("/html/body/div[2]/div/ul[1]/li[5]/a")).getText();
        System.out.println(xpath);


        //Locator : cssSelector
        driver.findElement(By.cssSelector("input[id='customer.ssn']")).sendKeys("myPasswordSSN");
        Thread.sleep(3000);



        driver.quit();

    }
}
