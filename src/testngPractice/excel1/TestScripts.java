package testngPractice.excel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Map;

public class TestScripts {

    @Test(dataProvider = "AmazonProduct", dataProviderClass = DataProviderPrac.staticProviderClass.class)
    public void searchAmazonProducts(Map<String, String> dataMap) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement txtSearchEngine = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("#twotabsearchtextbox")));
        System.out.println("\n Devices : " + dataMap.get("Devices"));

        txtSearchEngine.sendKeys(dataMap.get("Devices"));
        txtSearchEngine.submit();
        driver.quit();
    }
}
