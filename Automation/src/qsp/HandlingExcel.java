package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	// get the java representative object of physical file
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	// load the file or create a workbook
	Workbook wb = WorkbookFactory.create(fis);
	//get the control of the sheet, get the control of row, then cell, the get or read the data
	String data = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
	System.out.println(data);
}
}



