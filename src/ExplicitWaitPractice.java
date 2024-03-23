import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitPractice {
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();


        driver.get("https://practicetestautomation.com/practice-test-login/");



//        WebElement username = driver.findElement(By.id("username"));

        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(5))
          .until(ExpectedConditions.presenceOfElementLocated(By.id("username")));


        wait.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        driver.close();
        driver.quit();
    }
}
