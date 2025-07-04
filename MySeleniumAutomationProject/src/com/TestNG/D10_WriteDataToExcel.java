package com.TestNG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D10_WriteDataToExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
  public void writeData() {
		row = sheet.createRow(0);//it will create 1st Row
		cell=row.createCell(0);//it will create 1st Cell
		cell.setCellValue("Vinayak");
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  file = new File("ExcelFiles/FirstExcelFile.xlsx");
	  fos=new FileOutputStream(file);
	  wb= new XSSFWorkbook();
	  sheet=wb.createSheet("Test Data");
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }

}
