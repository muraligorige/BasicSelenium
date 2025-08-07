package DataDrivernHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittenBackTheExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//convert physical file to java Obj
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\OneDrive\\Desktop\\TestData.xlsx");

		//fetch the workBook
		Workbook workbook=WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet sheet=workbook.getSheet("Data");
		
		//fetch the row
//		Row row = sheet.getRow(1);
		
		//create the row
		Row row=sheet.createRow(6);
		
		//create the cell
		Cell cell = row.createCell(4);
		
		//write the data
		cell.setCellValue("murali");
		
		//converting obj to physical file and saving the file
		FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\user\\OneDrive\\Desktop\\TestData.xlsx");
		workbook.write(fileOutputStream);
		
		//close the excel file
		workbook.close();

	}

}
