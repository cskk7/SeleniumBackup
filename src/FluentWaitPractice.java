//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//
//public class FluentWaitPractice {
//    public static void main(String[] args) {
//
//        WebDriver driver  = new ChromeDriver();
//        driver.get("https://practicetestautomation.com/practice-test-login/");
//
//
//        Wait wait = new FluentWait(WebDriver, driver)
//                .withTimeout(timeout, SECONDS)
//                .pollingEvery(timeout, SECONDS)
//                .ignoring(Exception.class);
//
//        WebElement password = driver.findElement(By.id("password"));
//        password.sendKeys("password");
//
//        WebElement submit = driver.findElement(By.id("submit"));
//        submit.click();
//
//    }
//
//    WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
//        public WebElement applyy(WebDriver driver) {
//            return driver.findElement(By.id("foo"));
//        }
//}
//}
