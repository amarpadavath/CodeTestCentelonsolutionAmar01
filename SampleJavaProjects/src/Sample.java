import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {

    private WebDriver driver;

    // Constructor to initialize the WebDriver instance
    public JavaScriptUtils(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click an element using JavaScript
    public void clickElementUsingJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    // Method to scroll into view using JavaScript
    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Method to get the page title using JavaScript
    public String getPageTitleUsingJS() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript("return document.title;");
    }

    // You can add more methods here for different JavaScript actions.
}
