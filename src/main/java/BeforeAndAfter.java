import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BeforeAndAfter {

    public String heading = "Complete Web Form";

    @FindBy(xpath = "//*[@class='container']/h1")
    public WebElement headingXpath;

}
