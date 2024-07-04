import baseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SessionHandlingTest extends BaseTest {

    SessionHandling sessionHandling;

    @Test
    public void executSessionOne(){
        sessionHandling = new SessionHandling(startDriver());
        getDriver().get(sessionHandling.sessionOneUrl);
    }

    @Test
    public void executSessionTwo(){
        sessionHandling = new SessionHandling(startDriver());
        getDriver().get(sessionHandling.sessionTwoUrl);
    }

    @Test
    public void executSessionThree(){
        sessionHandling = new SessionHandling(startDriver());
        getDriver().get(sessionHandling.sessionThreeUrl);
    }
}
