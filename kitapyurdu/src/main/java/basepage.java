import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class basepage {
    WebDriver driver;

    public basepage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public void click(By locator){
        find(locator).click();
    }
    public void gettext(By locator,String text){
        find(locator).sendKeys(text);
    }
    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();

    }
}