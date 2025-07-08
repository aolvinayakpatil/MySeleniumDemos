package com.TestNG.Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A31_jotFormusingpropertiesFile {
	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;
	
	@Test
  public void jotRegistration()
	{
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"formPreviewArea\"]")));
		driver.findElement(By.xpath(prop.getProperty("fName"))).sendKeys("Vinayak");
		driver.findElement(By.xpath(prop.getProperty("lName"))).sendKeys("Patil");
		driver.findElement(By.id(prop.getProperty("stdRno"))).sendKeys("VDP121234");
		driver.findElement(By.xpath(prop.getProperty("regCrs"))).sendKeys("Computer Science");
		driver.findElement(By.xpath(prop.getProperty("examStart"))).sendKeys("07-02-2025");
		driver.findElement(By.xpath(prop.getProperty("examEnd"))).sendKeys("07-10-2025");
		driver.findElement(By.xpath(prop.getProperty("comment"))).sendKeys("Register for CS");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)", "");
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath(prop.getProperty("submit"))));
	}

  @BeforeTest
  public void launchBrowser() throws IOException 
  {
	  file=new File("PropertiesFile/jotFormLocators.properties");
	  fis=new FileInputStream(file);
	  prop=new Properties();
	  prop.load(fis);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(prop.getProperty("url"));
  } 

  @AfterTest
  public void afterTest()
  {
	driver.close();  
  }

}
