import baseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class HandlingDynamicTableTest extends BaseTest {

    HandlingDynamicTable handlingDynamicTable;

    @Parameters({"mainUrl"})
    @Test(priority = 1)
    public void printNumberOfRowsAndColumnsTest(String mainUrl) throws InterruptedException {

        handlingDynamicTable = new HandlingDynamicTable(startDriver());
        getDriver().manage().window().maximize();
        getDriver().get(mainUrl);

        System.out.println("Number of columns: "+handlingDynamicTable.columnsXpath.size());
        System.out.println("Number of rows: "+handlingDynamicTable.rowsXpath.size());
    }

    @Parameters({"mainUrl"})
    @Test(priority = 1)
    public void printCellValueTest(String mainUrl) throws InterruptedException {

        handlingDynamicTable = new HandlingDynamicTable(startDriver());
        getDriver().manage().window().maximize();
        getDriver().get(mainUrl);

        System.out.println("Cell value for 7th row and 3rd column: "+handlingDynamicTable.readText(handlingDynamicTable.seventRowFourthColumnValueXpath));
    }
}
