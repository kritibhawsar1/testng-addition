import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void openUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MAHAKAAL\\Documents\\GitHub\\maven-practise\\src\\drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");

        WebElement searchInput = driver.findElement(By.xpath("//*[@id='search-input']/input"));
        WebElement  searchButton = driver.findElement(By.xpath("//*[@id='search-icon-legacy']"));
        searchInput.sendKeys("automation");;
        searchButton.click();
        System.out.println("clicked");
        Assert.assertEquals(searchInput.getText(),"automation");
        System.out.println("completed");

        driver.quit();
    }

}
