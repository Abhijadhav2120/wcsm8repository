package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fsi = new FileInputStream("./data/TestData.xlsx");
	Workbook wo = WorkbookFactory.create(fsi);
	Sheet sheet = wo.getSheet("IPL");
	Row row = sheet.getRow(4);
	Cell cell = row.getCell(0);
	String data = cell.getStringCellValue();
	System.out.println(data);
}
}
