// To check the backgroung color of button and the color of text inside the button.
// Output: The color in rgba format will be printed in the console
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ButtonColor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.facebook.com/");

        String buttonColor = driver.findElement(By.xpath("//button[text()='Log in']")).getCssValue("background-color");
        System.out.println("Button color: " + buttonColor);

//        WebElement buttonLogin = driver.findElement(By.xpath("//button[text()='Log in']"));
//        actions.moveToElement(buttonLogin).build().perform();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Log in']")));
        actions.moveToElement(wait).build().perform();
        String secondColor = wait.getCssValue("background-color");
        System.out.println("Button color: " + secondColor);

//        String buttonTextColor = driver.findElement(By.xpath("//button[text()='Log in']")).getCssValue("color");



//        System.out.println("Button color: " + buttonColor);
//        System.out.println("Text color " + buttonTextColor);
        driver.close();
        driver.quit();
    }
}
