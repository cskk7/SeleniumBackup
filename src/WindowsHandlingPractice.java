import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsHandlingPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        String parentHandle = driver.getWindowHandle();
        driver.findElement(By.id("newWindowBtn")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        for(String handle : windowHandles){
            if(!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                driver.findElement(By.id("firstname")).sendKeys("Karthik");
                driver.close();
            }
        }

    }
}
