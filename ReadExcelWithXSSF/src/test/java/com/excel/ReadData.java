package com.excel;

import java.io.FileInputStream;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	FileInputStream fs;

	@SuppressWarnings("deprecation")
	public void readexcel() throws Exception {

		String path = "E:\\Taranjot\\ReadData.xlsx";

		fs = new FileInputStream(path);

		XSSFWorkbook xb = new XSSFWorkbook(fs);

		XSSFSheet sheet = xb.getSheetAt(0);

		// int totalRows = sheet.getLastRowNum();

		Iterator<Row> totalRows = sheet.rowIterator();// iterating over excel sheet

		while (totalRows.hasNext()) {
			Row row = totalRows.next();

			Iterator<Cell> totalColumns = row.cellIterator(); // iterating over each column

			while (totalColumns.hasNext()) {

				Cell cellValue = totalColumns.next();

				switch (cellValue.getCellType()) {
				case STRING:
					System.out.print(cellValue.getStringCellValue() + " \t");
					break;

				case NUMERIC:
					System.out.print(cellValue.getNumericCellValue() + " \t");
					break;
				case BOOLEAN:
					System.out.print(cellValue.getBooleanCellValue() + " \t");
					break;
				case BLANK:

					System.out.print("**" + " \t");
					break;

				default:

				}
			}
			System.out.println("\n");
		}

	}
}
