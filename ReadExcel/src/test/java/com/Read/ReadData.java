package com.Read;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;;

public class ReadData {

	FileInputStream fs;

	public void dataRead() throws Exception {

		// . Open file with proper extension
		String path = "src//test//resources//TaranData.xls";

		fs = new FileInputStream(path);
		// User will see Workbook To create Object of HSSFWorkbook
		HSSFWorkbook wb = new HSSFWorkbook(fs);

		HSSFSheet sh = wb.getSheet("Taran");
		// wb.getSheetAt(0);

		// Read Rows from the Sheet

		int totalRows = sh.getLastRowNum();
		System.out.println("Count of Rows are :" + totalRows);

		// To iterate number of Each row

		for (int i = 0; i < totalRows; i++) {

			// Get me Single Row

			HSSFRow singleRow = sh.getRow(i);

			// Column dependency on Rows We are finding how many columns are there which
			// contains data

			int totalColumns = singleRow.getLastCellNum();
			
			//System.out.println(sh.getRow(4).get);

			for (int j = 0; j < totalColumns; j++) {

				HSSFCell cell = singleRow.getCell(j);
				
				
				if(cell!=null) {
					
					System.out.print(cell.getStringCellValue()+" \t ");
				}

			}
		
			System.out.println(" ");
		}
		
		
		wb.close();

	}

}
