package OopTest;

import OOP.HomepageEncapsulation;
import OOP.SignUpEncapsulation;
import baseTest.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Parent class BaseTest contains information about driver(shows inheritance)
public class SignUpEncapsulationTest extends BaseTest {

    SignUpEncapsulation signUpEncapsulation;

    @Parameters({"mainUrl"})
    @Test(priority = 1)
    public void SignUpTest(String mainUrl) throws InterruptedException {

//        homepageEncapsulation = new HomepageEncapsulation(startDriver());
//        getDriver().manage().window().maximize();
//        getDriver().get(mainUrl);
//        homepageEncapsulation.clickOnSignUp();
//        Thread.sleep(2000);

        signUpEncapsulation = new SignUpEncapsulation(startDriver());
        getDriver().manage().window().maximize();
        getDriver().get(mainUrl);
        Thread.sleep(2000);
        signUpEncapsulation.getFullName().sendKeys("KritiBhawsar");
        Thread.sleep(2000);
        signUpEncapsulation.getEmail().sendKeys("kritiBhawsar@gmail.com");
        Thread.sleep(2000);
        signUpEncapsulation.getPassword().sendKeys("Kriti123");
        Thread.sleep(2000);
        signUpEncapsulation.clickOnCheckbox();
        Thread.sleep(2000);
        signUpEncapsulation.clickOnSignUpButton();

        //driver is closed inside after_method()
    }
}
