import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SessionHandling {

    public SessionHandling(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String sessionOneUrl = "https://www.youtube.com/";
    public String sessionTwoUrl = "https://www.google.com/";
    public String sessionThreeUrl = "https://www.linkedin.com/";

}
