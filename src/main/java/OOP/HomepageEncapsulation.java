package OOP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageEncapsulation {

    private WebDriver driver;

    public HomepageEncapsulation(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class='sign-up-link hide-in-os-page'])[1]")
    private WebElement signUpButton;

    public WebElement getSignUpButton() {
        return signUpButton;
    }

    public void clickOnSignUp(){
        signUpButton.click();
    }

}
