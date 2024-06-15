import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BeforeAndAfter {

    public BeforeAndAfter(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String heading = "Complete Web Form";

    public String[] names = {"Kriti", "Bhawsar", "SE"};

    public String date = "31/12/2001";

    @FindBy(xpath = "//*[@class='container']/h1")
    public WebElement headingXpath;

    public String readText(WebElement element){
        return element.getText().trim();
    }

    @FindAll({
            @FindBy(xpath = "//*[@id='first-name']"),
            @FindBy(xpath = "//*[@id='last-name']"),
            @FindBy(xpath = "//*[@id='job-title']")
    })
    public List<WebElement> namesXpath;

    @FindAll({
            @FindBy(xpath = "//*[@id='radio-button-1']"),
            @FindBy(xpath = "//*[@id='checkbox-2']")
    })
    public List<WebElement> radioButtonAndCheckBoxXpath;

    @FindBy(xpath = "//*[@id='select-menu']")
    public WebElement experienceDropdownXpath;

    @FindBy(xpath = "//*[@value='1']")
    public WebElement experienceValueXpath;

    @FindBy(xpath = "//*[@id='datepicker']")
    public WebElement datePickerXpath;

    @FindBy(xpath = "//*[@role='button']")
    public WebElement submitButtonXpath;
}
