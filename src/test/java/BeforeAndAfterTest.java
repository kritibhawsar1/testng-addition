import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeAndAfterTest {

    BeforeAndAfter beforeAndAfter;

    @BeforeClass
    public void before_class(){
        System.out.println("Before class method called");
    }
    @BeforeMethod
    public void before_method(){
        System.out.println("Before Method method called");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\MAHAKAAL\\Documents\\GitHub\\testng-addition\\drivers\\chrome\\125\\chromedriver.exe");
    }

    @Parameters({"mainUrl"})
    @Test(priority = 1)
    public void openUrl(String mainUrl) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);

        System.out.println("Method called");

        driver.quit();
    }

    @AfterMethod
    public void after_method(){
        System.out.println("After Method method called");

    }
    @AfterClass
    public void after_class(){
        System.out.println("After class method called");
    }

}
