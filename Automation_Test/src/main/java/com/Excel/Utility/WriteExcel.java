package com.Excel.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	
	
	public static void setDat(String loc, int sheetNumber, int row, int column, String data) throws Exception
	{
		
			// TODO Auto-generated method stub
			//File src=new File("E:\\ExcelOperation\\ExcelData\\TestData.xlsx");
		File src=new File(loc);    
		FileInputStream fis=new FileInputStream(src);
	        XSSFWorkbook wb=new XSSFWorkbook(fis);
	        XSSFSheet sheet1=wb.getSheetAt(sheetNumber);
	      sheet1.getRow(row).getCell(column).setCellValue(data);
	      //sheet1.getRow(1).getCell(0).setCellValue("LL");
	      FileOutputStream fout=new FileOutputStream(src);
	      wb.write(fout);
	      wb.close();
		
	}

}
