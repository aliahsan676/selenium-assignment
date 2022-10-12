package selenium.assignment4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class JavaScriptAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/alerts");

        //Alert
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        //Confirmation
        WebElement confirmationButton = driver.findElement(By.id("confirmButton"));
        confirmationButton.click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);

        confirmationButton.click();
        Thread.sleep(3000);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);

        //Prompt
        WebElement prompt = driver.findElement(By.id("promtButton"));
        prompt.click();
        Thread.sleep(3000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.dismiss();
        Thread.sleep(3000);

        prompt.click();
        Thread.sleep(3000);
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Selenium SQA for Web");
        promptAlert.accept();
        Thread.sleep(3000);



        driver.quit();

    }
}
