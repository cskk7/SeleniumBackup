// To check the web elements by tag name
// Print out the necessary
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        // Find elements using tag name
        List<WebElement> allInputElements = driver.findElements(By.tagName("a"));

        if(allInputElements.size() != 0)
        {
            System.out.println(allInputElements.size() + " Elements found by TagName as input \n");
            int count = 1;
            for(WebElement inputElement : allInputElements)
            {

                System.out.println("Link "+count+": "+inputElement.getAttribute("href"));
                count++;
            }
        }

        driver.close();
        driver.quit();
    }
}
