package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
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

public class D12_WriteMultipleDatausingDataProvider {
	String fpath = "ExcelFiles/Login Data using Data Provider.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index =0;

	@Test(dataProvider = "loginDetails")
	public void writeLoginData(String un, String ps) {
		sheet.createRow(index).createCell(0).setCellValue(un);
		sheet.getRow(index).createCell(1).setCellValue(ps);
		sheet.getRow(index).createCell(2).setCellValue("Not Run");
		index++;
	}

	@DataProvider
	public Object[][] loginDetails() {
		return new Object[][] {
			new Object[] { "Vinayak", "Patil" },
			new Object[] { "Pravin", "Garade" },
			new Object[] { "admin", "admin123" },
			new Object[] { "Pravin", "Sharma" },
			new Object[] { "admin", "admin123" },
		};
	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File(fpath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("Login_Data");
		sheet.createRow(index).createCell(0).setCellValue("User Name");
		sheet.getRow(index).createCell(1).setCellValue("Password");
		sheet.getRow(index).createCell(2).setCellValue("Result");
		index++;
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
