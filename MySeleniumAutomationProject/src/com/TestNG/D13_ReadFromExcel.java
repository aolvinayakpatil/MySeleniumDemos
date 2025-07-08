package com.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D13_ReadFromExcel {
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	@Test(enabled=false)
	public void readSingleRow() {
		row=sheet.getRow(0);
		cell=row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
	}
	@Test
	public void readAllExcelData() {
		int rows=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i=0;i<rows;i++)
		{
			row =sheet.getRow(i);
			for(int j=0;j<cells;j++)
			{
				cell=row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("ExcelFiles/Login Data using Data Provider.xlsx");
		fis = new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Login_Data");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
