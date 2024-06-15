import baseTest.BaseTest;
import org.junit.Assert;
import org.testng.annotations.*;

public class BeforeAndAfterTest extends BaseTest {

    BeforeAndAfter beforeAndAfter;

    @Parameters({"mainUrl"})
//    @Test(priority = 1)
    public void openUrl(String mainUrl) throws InterruptedException {

        beforeAndAfter = new BeforeAndAfter(startDriver());
        getDriver().manage().window().maximize();
        getDriver().get(mainUrl);

        System.out.println("Method called");
        String s = beforeAndAfter.readText(beforeAndAfter.headingXpath);
        System.out.println(s);
        Assert.assertEquals(beforeAndAfter.heading, beforeAndAfter.readText(beforeAndAfter.headingXpath));
    }

    @Parameters({"mainUrl"})
    @Test(priority = 1)
    public void fillingFormTest(String mainUrl) throws InterruptedException {

        beforeAndAfter = new BeforeAndAfter(startDriver());
        getDriver().manage().window().maximize();
        getDriver().get(mainUrl);

        System.out.println("Inserting name");
        for(int i=0; i<beforeAndAfter.namesXpath.size(); i++)
        {
            beforeAndAfter.namesXpath.get(i).sendKeys(beforeAndAfter.names[i]);
            Thread.sleep(200);
        }

        System.out.println("Selecting radio button and checkboxes");
        int i=0;
        while(i<beforeAndAfter.radioButtonAndCheckBoxXpath.size()){
            beforeAndAfter.radioButtonAndCheckBoxXpath.get(i).click();
            i++;
            Thread.sleep(200);
        }

        System.out.println("Selecting experience from dropdown");
        beforeAndAfter.experienceDropdownXpath.click();
        beforeAndAfter.experienceValueXpath.click();
        Thread.sleep(200);

        System.out.println("Selecting date in date picker");
        beforeAndAfter.datePickerXpath.sendKeys(beforeAndAfter.date);
        Thread.sleep(400);

        System.out.println("clicking submit button");
        beforeAndAfter.submitButtonXpath.click();
        
    }

}
