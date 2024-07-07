package OOP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpEncapsulation {

    private WebDriver driver;

    public SignUpEncapsulation(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //declaring web elements as private and generating setter getter for them
    @FindBy(xpath = "//*[@id='user_full_name']")
    private WebElement fullName;

    @FindBy(xpath = "//*[@id='user_email_login']")
    private WebElement email;

    @FindBy(xpath = "//*[@id='user_password']")
    private WebElement password;

    @FindBy(xpath = "(//*[@type='checkbox'])[1]")
    private WebElement checkBox;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    private WebElement signUpButton;

    public void clickOnCheckbox(){
        checkBox.click();
    }

    public void clickOnSignUpButton(){
        signUpButton.click();
    }

    public WebElement getFullName() {
        return fullName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }
}
