package KeywordDriven;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import TestBase.TestBase;



public class KeywordDriven {
	
	
	public Workbook book;
	
	public Sheet sh;
	
	public void readdata() {
		
		String path = "E:\\Taranjot\\data.xlsx";
		FileInputStream fs = null;
		try {
			 fs = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	try {
		book  =	WorkbookFactory.create(fs);
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 sh = book.getSheet("Sheet1");
	TestBase base = new TestBase();
	 for(int i=1 ; i<= sh.getLastRowNum(); i++) { 
		 
		 String teststeps =sh.getRow(i).getCell(0).toString().trim();
		 String locatorType =sh.getRow(i).getCell(1).toString().trim();
		 String selector =sh.getRow(i).getCell(2).toString().trim();
		 String action =sh.getRow(i).getCell(3).toString().trim();
		 String value =sh.getRow(i).getCell(4).toString().trim();
		 
		 System.out.println(teststeps+":"+locatorType+ ":"+selector+ ":"+action+ ":"+value);
		
		 base.execute(teststeps, locatorType, selector, action, value);
		
		 
	 }
	
		
	}
		
	}
	


