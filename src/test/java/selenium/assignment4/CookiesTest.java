package selenium.assignment4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Set;

public class CookiesTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://parabank.parasoft.com");

        driver.manage().addCookie(new Cookie("Learner", "L345312"));
        driver.manage().addCookie(new Cookie("Traveler", "T567315"));
        driver.manage().addCookie(new Cookie("Explorer", "E345312"));

        System.out.println(" Get " + driver.manage().getCookieNamed("Traveler"));
        System.out.println("===================================================");

        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {

            System.out.println(driver.manage().getCookieNamed(cookie.getName()));

        }
        System.out.println("===================================================");
        driver.manage().deleteCookieNamed("Explorer");

        cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {

            System.out.println(driver.manage().getCookieNamed(cookie.getName()));

        }
        System.out.println("===================================================");

        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println(cookies.size());

        driver.quit();
    }
}
