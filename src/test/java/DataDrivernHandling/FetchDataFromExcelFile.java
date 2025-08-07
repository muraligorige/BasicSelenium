package DataDrivernHandling;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelFile {

	public static void main(String[] args) throws IOException {
		
		//convert physical file to java Obj
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\OneDrive\\Desktop\\TestData.xlsx");

		//fetch the workBook
		Workbook workbook=WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet sheet=workbook.getSheet("Data");
		
		//fetch the row
		Row row=sheet.getRow(5);
		
		//fetch the cell
		Cell cell=row.getCell(1);
		
		//fetch the data
//		String data=cell.getStringCellValue();
//		System.out.println("Mobile Name:-"+data);
		
		//fetch the data by using numeric values and also fetch the data in string format irrespective with the datatype stored in excel
		double data1=cell.getNumericCellValue();
		String numericData=cell.toString();
		System.out.println("Mobile price:-"+numericData);
		
		//close the excel workbook
		workbook.close();
	}

}