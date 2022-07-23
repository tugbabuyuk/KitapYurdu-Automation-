import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest  {

    protected WebDriver driver;


    @BeforeAll
    public  void set(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get( "https://www.kitapyurdu.com/");
        driver.manage().window().maximize();

    }
    @AfterAll
    public void teardown(){
        driver.quit();

    }


}