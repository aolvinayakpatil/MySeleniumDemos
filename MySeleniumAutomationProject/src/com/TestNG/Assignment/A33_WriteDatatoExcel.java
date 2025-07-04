package com.TestNG.Assignment;

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

public class A33_WriteDatatoExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	@Test
	public void writeLoginData() {
		sheet.createRow(0).createCell(0).setCellValue("User Name");
		sheet.getRow(0).createCell(1).setCellValue("Password");
		sheet.getRow(0).createCell(2).setCellValue("Result");
		sheet.createRow(1).createCell(0).setCellValue("Admin");
		sheet.getRow(1).createCell(1).setCellValue("admin123");
		sheet.getRow(1).createCell(2).setCellValue("Not Run");
		sheet.createRow(2).createCell(0).setCellValue("Vinayak");
		sheet.getRow(2).createCell(1).setCellValue("vinayak123");
		sheet.getRow(2).createCell(2).setCellValue("Not Run");
		sheet.createRow(3).createCell(0).setCellValue("Admin");
		sheet.getRow(3).createCell(1).setCellValue("admin123");
		sheet.getRow(3).createCell(2).setCellValue("Not Run");
		sheet.createRow(4).createCell(0).setCellValue("Pravin");
		sheet.getRow(4).createCell(1).setCellValue("pravin123");
		sheet.getRow(4).createCell(2).setCellValue("Not Run");

	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File("ExcelFiles/Login Data.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("Login Details");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
