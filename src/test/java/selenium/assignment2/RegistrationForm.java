package selenium.assignment2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationForm {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();


        WebElement webElement1 = driver.findElement(By.id("customer.firstName"));
        webElement1.clear();
        webElement1.sendKeys("Ali");
        Thread.sleep(3000);

        WebElement webElement11 = driver.findElement(By.id("customer.lastName"));
        webElement11.clear();
        webElement11.sendKeys("Ahsan");
        Thread.sleep(3000);

        WebElement webElement2 = driver.findElement(By.id("customer.address.street"));
        webElement2.clear();
        webElement2.sendKeys("66, Mohakhali");
        Thread.sleep(3000);

        WebElement webElement3 = driver.findElement(By.id("customer.address.city"));
        webElement3.clear();
        webElement3.sendKeys("Dhaka");
        Thread.sleep(3000);

        WebElement webElement4 = driver.findElement(By.id("customer.address.state"));
        webElement4.clear();
        webElement4.sendKeys("Bangladesh");
        Thread.sleep(3000);

        WebElement webElement5 = driver.findElement(By.id("customer.address.zipCode"));
        webElement5.clear();
        webElement5.sendKeys("1212");
        Thread.sleep(3000);

        WebElement webElement6 = driver.findElement(By.id("customer.phoneNumber"));
        webElement6.clear();
        webElement6.sendKeys("01711001122");
        Thread.sleep(3000);

        WebElement webElement7 = driver.findElement(By.id("customer.ssn"));
        webElement7.clear();
        webElement7.sendKeys("A23dr1");
        Thread.sleep(3000);

        WebElement webElement8 = driver.findElement(By.id("customer.username"));
        webElement8.clear();
        webElement8.sendKeys("ali_ahsan");
        Thread.sleep(3000);

        WebElement webElement9 = driver.findElement(By.id("customer.password"));
        webElement9.clear();
        webElement9.sendKeys("1234567");
        Thread.sleep(3000);

        WebElement webElement10 = driver.findElement(By.id("repeatedPassword"));
        webElement10.clear();
        webElement10.sendKeys("1234567");
        Thread.sleep(3000);

        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);





        driver.quit();



    }
}
