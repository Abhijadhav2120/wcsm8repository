package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	//read data from IPL excel sheet
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//REAd data from  IPL excel sheet
		
		FileInputStream fsi = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fsi);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(3);
	    Cell cell = row.getCell(0);
	    String data = cell.getStringCellValue();
	    System.out.println(data);
	
	}

}
