package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelFunctions {
public static	Map<String,String> testData = new HashMap<String,String>();

	// Generic method to return the number of rows in the sheet.
		public static int getRowCount(String xlPath, String sheet) {
			int rc = 0;
			try {
				FileInputStream fis = new FileInputStream(xlPath);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet s = wb.getSheet(sheet);
				rc = s.getLastRowNum();
			} catch (Exception e) {
//				System.out.println(e);
			}
			return rc;
		}

		// Generic method to return the column values in the sheet.
		public static String getCellValue(String xlPath, String sheet, int row, int col) {
			String data = "";
			try {
				XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(xlPath));
				XSSFSheet myExcelSheet = myExcelBook.getSheet(sheet);
				data = myExcelSheet.getRow(row).getCell(col).toString();
			}
			catch (Exception e) {
//				System.out.println(e);
			}
			return data;
		}
		


		public static void writeData(String xlpath, String sheet, int row, int col, String data) {
			try {
				XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(xlpath));
				FileOutputStream output = new FileOutputStream(xlpath);
				XSSFSheet myExcelSheet = myExcelBook.getSheet(sheet);
				myExcelSheet.createRow(row).createCell(col).setCellValue(data);	
				myExcelBook.write(output);
				myExcelBook.close();	
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		
		
		public static int columncount(String xlPath, String sheet, int rownum) throws FileNotFoundException, IOException
		{
			XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(xlPath));
			XSSFSheet myExcelSheet = myExcelBook.getSheet(sheet);
			XSSFRow myExcelRow = myExcelSheet.getRow(rownum);
			int colNum = myExcelRow.getLastCellNum();
			return colNum;
		}
		
		
		public String getExceldata(String xlPath, String sheet,int rownum,int cellnum) throws FileNotFoundException, IOException {
			XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(xlPath));
			XSSFSheet myExcelSheet = myExcelBook.getSheet(sheet);
            //  myExcelSheet.getRow(0).getCell(0);
			DataFormatter format=new DataFormatter();
			return  format.formatCellValue(myExcelSheet.getRow(rownum).getCell(cellnum));
		}


	    public static Map<String,String> getMapData(String xlPath, String sheet, int rowInt){
	    	
	    	try {
	    		
				
				XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(xlPath));
				XSSFSheet myExcelSheet = myExcelBook.getSheet(sheet);
				int noOfRows = myExcelSheet.getPhysicalNumberOfRows();
				int noOfColumns = myExcelSheet.getRow(1).getPhysicalNumberOfCells();

			//	for(int i=2;i<noOfRows;i++) {
					
					for(int j=0; j<=noOfColumns;j++)
					{
					Row row = myExcelSheet.getRow(1);
					Cell keyCell = row.getCell(j);
					String key = keyCell.toString().trim();
//					
					Cell valueCell = myExcelSheet.getRow(rowInt).getCell(j);
					String value = valueCell.toString();
					testData.put(key, value);
					
					}
			//	}
	    	}
	    	catch(Exception e) {
	    		//e.printStackTrace();
	    	}
			return testData;
	    }

		/*
		 * public static void main(String [] args) { Map<String,String> testData =
		 * getMapData("./XLSX/MarquisDataForm.xlsx","TestData");
		 * 
		 * for(Entry<String,String> map : testData.entrySet()) {
		 * System.out.println(map.getKey()+"   "+map.getValue()); } }
		 */
}
