package selenium.assignment4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WindowsOrTabsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/browser-windows");

        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();


        //Open a new tab and switch to a new tab

//        driver.switchTo().newWindow(WindowType.TAB);
//        Thread.sleep(3000);
//        driver.close();
//        System.out.println("Tab Operation");

        //Open a new tab and switch to a new tab by click
//        driver.findElement(By.id("tabButton")).click();
//        Thread.sleep(3000);
//        driver.close();
//        Thread.sleep(3000);

        //Open a new tab and switch to new tab by link
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demoqa.com/sample");
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.close();

        driver.switchTo().window(originalWindow);
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.className("main-header")).getText());


        //Open a new window and switch to new window

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://demoqa.com/sample");
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.close();

        driver.switchTo().window(originalWindow);
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.className("main-header")).getText());



        driver.quit();
    }
}
