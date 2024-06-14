package baseTest;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class BaseTest {

    public WebDriver driver;

    public WebDriver startDriver() {
        driver = new ChromeDriver();
        return driver;
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    @BeforeClass
    public void before_class(){
        System.out.println("Before class method called");
    }
    @BeforeMethod
    public void before_method(){
        System.out.println("Before Method method called");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MAHAKAAL\\Documents\\GitHub\\testng-addition\\drivers\\chrome\\125\\chromedriver.exe");
    }
    @AfterMethod
    public void after_method(){
        System.out.println("After Method method called");
        this.getDriver().quit();
    }
    @AfterClass
    public void after_class(){
        System.out.println("After class method called");
    }

}
