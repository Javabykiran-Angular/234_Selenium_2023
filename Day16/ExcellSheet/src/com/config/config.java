package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class config {
	
	
	
	public void readExcelSheet() {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\Selenium234_Workspace\\testdata\\testdata.xlsx");
			
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			XSSFRow row=sheet.getRow(0);
			XSSFCell cell=row.getCell(0);
			String strdata=cell.getStringCellValue();
			System.out.println(strdata);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	
	public void readExcelSheetAllData() {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\\\Selenium234_Workspace\\\\testdata\\\\testdata.xlsx");
			
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int rowCount=sheet.getLastRowNum();
			
			for(int i=0;i<=rowCount;i++) {
				XSSFRow row=sheet.getRow(i);
				
				int cellCount=row.getLastCellNum();
				
				System.out.println("Cell Count => "+cellCount);
				
				for(int j=0;j<cellCount;j++) {
					
					XSSFCell cell=row.getCell(j);
					
					System.out.print("  Cell  => "+cell.getStringCellValue());
					
				}
				System.out.println("");				
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	
	
	

}
