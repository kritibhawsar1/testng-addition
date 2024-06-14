import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeforeAndAfter {

    public BeforeAndAfter(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String heading = "Complete Web Form";

    @FindBy(xpath = "//*[@class='container']/h1")
    public WebElement headingXpath;

    public String readText(WebElement element){
        return element.getText().trim();
    }

}
