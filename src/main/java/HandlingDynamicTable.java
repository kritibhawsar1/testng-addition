import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HandlingDynamicTable {

    public HandlingDynamicTable(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindAll({
            @FindBy(xpath = "//*[@id='leftcontainer']/table/thead/tr/th")
    })
    public List<WebElement> columnsXpath;

    @FindAll({
            @FindBy(xpath = "//*[@id='leftcontainer']/table/tbody/tr/td[1]")
    })
    public List<WebElement> rowsXpath;

    @FindBy(xpath = "//*[@id='leftcontainer']/table/tbody/tr[7]/td[4]")
    public WebElement seventRowFourthColumnValueXpath;

    public String readText(WebElement element){
        return element.getText().trim();
    }
}
