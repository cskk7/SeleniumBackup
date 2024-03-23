// To verify whether that the input properly provided inside textbox or not - 22/12/2023
// Output: The text we entered inside the textbox will be printed in the console
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxInputVerify {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

//   Email input checking
        WebElement myEmailInput = driver.findElement(By.id("email"));

        myEmailInput.sendKeys("myName@gmail.com");

        String actualEmailInput = myEmailInput.getAttribute("value");
        System.out.println("Entered email is: " + actualEmailInput);


//   Password input checking
        WebElement myPasswordInput = driver.findElement(By.id("pass"));
        myPasswordInput.sendKeys("abcd1234");
        String actualPasswordInput = myPasswordInput.getAttribute("value");
        System.out.println("Entered password is: " + actualPasswordInput);

        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
