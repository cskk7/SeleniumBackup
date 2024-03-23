import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VizagAjio {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get("https://www.ajio.com/");
        WebElement menButton = driver.findElement(By.xpath("//span[text()='MEN']"));
        actions.moveToElement(menButton).build().perform();
        Thread.sleep(3000);
        WebElement shirtButton = driver.findElement(By.linkText("Shirts"));
        shirtButton.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
