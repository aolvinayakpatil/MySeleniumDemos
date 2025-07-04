package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D11_WriteMultipleDataToExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	@Test
  public void writeFriendsData() {
		row = sheet.createRow(0);
		row.createCell(0).setCellValue("Vinayak");
		row.createCell(1).setCellValue("Patil");
		row = sheet.createRow(1);
		row.createCell(0).setCellValue("Pravin");
		row.createCell(1).setCellValue("Garade");
		row = sheet.createRow(2);
		row.createCell(0).setCellValue("Tejas");
		row.createCell(1).setCellValue("Satawekar");
		row = sheet.createRow(3);
		row.createCell(0).setCellValue("Santosh");
		row.createCell(1).setCellValue("Kumbhar");
		row = sheet.createRow(4);
		row.createCell(0).setCellValue("Sachin");
		row.createCell(1).setCellValue("Kumbhar");
		row = sheet.createRow(5);
		row.createCell(0).setCellValue("Avinash");
		row.createCell(1).setCellValue("Patil");
		//create row in 1 liner code
		sheet.createRow(6).createCell(0).setCellValue("Ankush");
		sheet.getRow(6).createCell(1).setCellValue("Raghav");
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  file = new File("ExcelFiles/Collage Friends.xlsx");
	  fos=new FileOutputStream(file);
	  wb= new XSSFWorkbook();
	  sheet=wb.createSheet("BCS");
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }

}
