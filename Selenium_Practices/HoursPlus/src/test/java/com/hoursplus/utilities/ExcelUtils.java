package com.hoursplus.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils
{
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static FileInputStream file;
	public static FileOutputStream fileout;
	public static XSSFCell cell;
	public static XSSFRow row;
	
	public static  int rowCount(String excelfile, String sheetname) throws IOException
	{
		file = new FileInputStream(excelfile);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetname);
		int rowCount = sheet.getLastRowNum();
		workbook.close();
		file.close();
		return rowCount;
	}
	
	public static int cellCount(String excelfile,String sheetname,int rownum) throws IOException
	{
		file = new FileInputStream(excelfile);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		workbook.close();
		file.close();
		return cellcount;
	}
	
	public static  String CellDataByIndexes(String excelfile,String sheetname,int rownum,int cellnum) throws IOException
	{
		file = new FileInputStream(excelfile);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		String celldata = cell.getStringCellValue();
		workbook.close();
		file.close();
		return celldata;
	}
	public static  String CellData(String sheetname,String rowvalue,String colovalue) throws IOException
	{
		file = new FileInputStream("./src/test/java/com/hoursplus/testData/Book1.xlsx");
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(0);
		cell = row.getCell(0);
		Map<String,Integer> coloumList = new  HashMap<String,Integer>();
		Map<String,Integer> rowList = new  HashMap<String,Integer>();
		int cstartindex = row.getFirstCellNum();
		int clastindex = row.getLastCellNum();
		for(int start =cstartindex; start<clastindex;start++)
		{
			XSSFCell cell = row.getCell(start);
			try {
				cell.getStringCellValue();
			} catch (NullPointerException e) {
				continue;
			}
			coloumList.put(cell.getStringCellValue(), cell.getColumnIndex());
		}
		int rstartindex = sheet.getFirstRowNum();
		int rlastindex = sheet.getLastRowNum();
		for(int start =rstartindex; start<=rlastindex;start++)
		{
			XSSFRow row = sheet.getRow(start);
			try {
				cell = row.getCell(0);
			} catch (NullPointerException e) {
				continue;
			}
			rowList.put(cell.getStringCellValue(), cell.getRowIndex());
		}
		row = sheet.getRow(rowList.get(rowvalue));
		cell = row.getCell(coloumList.get(colovalue));
		String celldata = cell.getStringCellValue();
		workbook.close();
		file.close();
		return celldata;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}