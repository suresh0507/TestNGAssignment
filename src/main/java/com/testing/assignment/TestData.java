package com.testing.assignment;

import org.aspectj.apache.bcel.classfile.Method;
import org.testng.annotations.DataProvider;

public class TestData {
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\Data.xlsx");
	
	@DataProvider (name = "getData")
	public Object[][] getData(Method method) {
		String sheetName = null;
		if (method.getName().matches("additionTest|subtractionTest|multiplicationTest|divisionTest")) {
			sheetName = "numbers";
		}else if(method.getName().equals("productPriceTest")) {
			sheetName = "ProductList";
		}
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows - 1][cols];
		
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
			
		}
		
	}
	

}
