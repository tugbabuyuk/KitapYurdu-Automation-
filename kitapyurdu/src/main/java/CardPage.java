import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage  extends basepage{
    By checkcard =By.cssSelector(".right > .button.red");
    CardPage(WebDriver driver){
        super(driver);
    }
    public boolean checktheCardPage() {
        find(checkcard);

        return isDisplayed(checkcard );

    }
}
