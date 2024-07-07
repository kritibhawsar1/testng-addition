import baseTest.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest extends BaseTest {

    DataProviderClass dataProviderclass;

    @Parameters({"mainUrl"})
    @Test(dataProvider = "loginData", priority = 1)
    public void LoginTest(String username, String password) throws InterruptedException {

        dataProviderclass = new DataProviderClass(startDriver());
        getDriver().manage().window().maximize();
        getDriver().get(dataProviderclass.url);
        Thread.sleep(3000);

        dataProviderclass.username.sendKeys(username);
        dataProviderclass.password.sendKeys(password);

        Thread.sleep(2000);

    }

    @DataProvider(name = "loginData")
    public Object[][] loginData(){
        Object[][] data = new Object[2][2];
        data[0][0] = "Admin";
        data[0][1] = "admin123";

        data[1][0] = "Admin2";
        data[1][1] = "test2123";

        return data;
    }

}
