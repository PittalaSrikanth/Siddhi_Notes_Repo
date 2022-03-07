package com.hoursplus.utilities;

import java.io.IOException;

public class ExcelTest
{
	public static void main(String aras[]) throws IOException {
		
		int rowcoutn = ExcelUtils.rowCount("./src/test/java/com/hoursplus/testData/Book1.xlsx", "sheet1");
		System.out.println(rowcoutn);
		int cellcoutn = ExcelUtils.cellCount("./src/test/java/com/hoursplus/testData/Book1.xlsx", "sheet1",1);
		System.out.println(cellcoutn);
		String cellvalue = ExcelUtils.CellDataByIndexes("./src/test/java/com/hoursplus/testData/Book1.xlsx", "sheet1",0,0);
		System.out.println(cellvalue);
		String cell = ExcelUtils.CellData("Sheet1","srikanth7","row1");
		System.out.println(cell);
		
	}
	
}
