package DataDrivernHandling;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingAllTheExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//convert physical file to java Obj
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\OneDrive\\Desktop\\TestData.xlsx");

		//fetch the workBook
		Workbook workbook=WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet sheet=workbook.getSheet("Data");
		
		//fetch all the rows and cells data
		 for(int i=0;i<=sheet.getLastRowNum();i++) {
            if (sheet.getRow(i)!=null) {
                for (int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
                    if (sheet.getRow(i).getCell(j)!=null) {
                        String data=sheet.getRow(i).getCell(j).toString();
                        System.out.print(data+ "  ");
                    }
                }
                System.out.println();
            }
        }

		//close the excel file
		workbook.close();	
	}
}