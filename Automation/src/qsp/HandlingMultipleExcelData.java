package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingMultipleExcelData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		// get last row number where the data is present
		int rowcount=w.getSheet("InvalidLogin").getLastRowNum();
		/*	short cellcount = w.getSheet("InvalidLogin").getRow(0).getLastCellNum();
			for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				String un = w.getSheet("InvalidLogin").getRow(i).getCell(j).getStringCellValue();
				System.out.println(un);
			}*/
		for(int i=0;i<=rowcount;i++)
		{
			String un = w.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
			String pw = w.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"---->"+pw);
		}
	}
}


