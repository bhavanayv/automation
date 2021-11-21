package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook w=WorkbookFactory.create(fis);
	//get the control of the sheet
	Sheet sheet = w.getSheet("CreateCustomer");
	//get the control of the row
	Row row = sheet.getRow(1);
	//get the control of the cell
	Cell cell = row.getCell(2);
	//get the data from the cell 
	String data = cell.getStringCellValue();
	//print it on the console 
	System.out.println(data);
}
}

