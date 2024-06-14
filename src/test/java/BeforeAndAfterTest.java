import baseTest.BaseTest;
import org.junit.Assert;
import org.testng.annotations.*;

public class BeforeAndAfterTest extends BaseTest {

    BeforeAndAfter beforeAndAfter;

    @Parameters({"mainUrl"})
    @Test(priority = 1)
    public void openUrl(String mainUrl) throws InterruptedException {

        beforeAndAfter = new BeforeAndAfter(startDriver());
        getDriver().manage().window().maximize();
        getDriver().get(mainUrl);

        System.out.println("Method called");
        String s = beforeAndAfter.readText(beforeAndAfter.headingXpath);
        System.out.println(s);
        Assert.assertEquals(beforeAndAfter.heading, beforeAndAfter.readText(beforeAndAfter.headingXpath));

        driver.quit();
    }

}
