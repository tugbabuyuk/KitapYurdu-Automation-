import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
public class Kitapyurdu extends basepage {

    By homepagelocator= By.id("header-bottom");
    By itemDetailLocator= By.id("button-cart");
    By oneproduct= By.id("product-306815");
    By cardcount=By.id("cart-items");
    By checkitemDetail= By.cssSelector(".search-heading-title span:nth-of-type(1)");
    By gotocard = By.id("cart");
    By gotocardbutton= By.id("js-cart");

    Kitapyurdu(WebDriver driver){
        super(driver);
    }

    public void search(String roman) {

        find(By.id("search-input"));
        click(By.id("search-input"));
        gettext(By.id("search-input"),"roman");
        find(By.id("search-input")).sendKeys(Keys.ENTER) ;
    }

    public boolean checktheItemNumber() {
        String count = find(cardcount).getText();
        return Integer.parseInt(count) > 0;
    }

    public void gotoCard() {
        find(gotocard);
        click(gotocard);
    }

    public boolean isonItemPage() {
        String checkİtemDetailPage= find(checkitemDetail).getText();
        if (checkİtemDetailPage == "roman"){
            return true;
        }
        else return false;
    }

    public void selectitem() {
        find(oneproduct);
        click(oneproduct);
    }

    public boolean isonItemDetailPage() {
        return isDisplayed(itemDetailLocator);
    }

    public void addtoCard() {
        find(itemDetailLocator);
        click(itemDetailLocator);
        click(gotocard);
        find(gotocardbutton);
        click(gotocardbutton);
    }

    public boolean CheckHomepage() {
        find(homepagelocator);
        return isDisplayed(homepagelocator);
    }
}
