import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class ReadWriteFromExcel {

    @Test
    public void dataReadTest() throws Exception{
        File srcFile = new File("https://onedrive.live.com/edit.aspx?resid=21FA4DFDEF237419!s0e06fe19833142cd8deafe3937b7b2ce");
        FileInputStream fis = new FileInputStream(srcFile);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);  //get workbook
        XSSFSheet sheet = workbook.getSheetAt(0);  //get specific sheet inside workbook
//        XSSFSheet sheet = workbook.getSheet("Names");

        String name = sheet.getRow(2).getCell(2).getStringCellValue(); //will get name at row 2 and column 2
        System.out.println("Name: "+name);

        //ITERATING ALL THE DATA IN SHEET USING ITERATORS
        Iterator<Row> rowIterator = sheet.iterator(); // all the rows in sheet
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next(); // row i
            Iterator<Cell> cellIterator = row.iterator();  //all the cells for row i
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();  //cell j
                
                //PROCESSING THE CELL VALUE BASED ON THEIR DATA TYPE USING DATA FORMATTER
                DataFormatter dataFormatter = new DataFormatter();
                String city = dataFormatter.formatCellValue(cell);
//                int pincode = dataFormatter.hashCode();
                System.out.println("City: "+city);
            }
        }
        workbook.close();
        fis.close();
        System.out.println("Read Done");
    }

}
