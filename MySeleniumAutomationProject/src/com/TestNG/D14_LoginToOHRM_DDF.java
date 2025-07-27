package com.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D14_LoginToOHRM_DDF {
	String fpath="ExcelFiles/Login Data.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	XSSFCellStyle style;
	XSSFFont font;

	WebDriver driver;
	int i=1;
	@Test(dataProvider = "excelData")
	public void f(String un, String ps) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();


	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fpath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Login Details");
		fos = new FileOutputStream(file);
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	@AfterMethod
	public void afterMethod() {
		style = wb.createCellStyle();
		font = wb.createFont();
		if(driver.getCurrentUrl().contains("dash")) {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
			driver.findElement(By.partialLinkText("Log")).click(); 
			
			sheet.getRow(i).getCell(2).setCellValue("Pass");
		}
		else
			sheet.getRow(i).getCell(2).setCellValue("Fail");
		i++;

	}


	@DataProvider
	public Object[][] excelData() {
		int rows=sheet.getPhysicalNumberOfRows();
		String[][]loginData=new String[rows-1][2];
		for (int i=0;i<rows-1;i++)
		{
			row=sheet.getRow(i+1);
			for(int j=0;j<2;j++)
			{
				String data=sheet.getRow(i+1).getCell(j).getStringCellValue();
				loginData[i][j]=data;
			}
		}
		return loginData;	
	}
	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fis.close();
		driver.close();
	}
}
