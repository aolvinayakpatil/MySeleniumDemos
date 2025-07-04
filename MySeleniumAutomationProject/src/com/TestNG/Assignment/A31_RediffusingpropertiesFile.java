package com.TestNG.Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A31_RediffusingpropertiesFile {
  WebDriver driver;
  File file;
  FileInputStream fis;
  Properties prop;
  @BeforeTest
  public void launchBrowser() throws IOException 
  {
	  file=new File("src/com/TestNG/Assignment/A31_RediffLocators.properties");
	  fis=new FileInputStream(file);
	  prop=new Properties();
	  prop.load(fis);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(prop.getProperty("url"));
  }
  @BeforeMethod
  public void refreshBrowser()
  {
	  driver.navigate().refresh();
  }
  @Test
  public void rediffRegistration1() throws InterruptedException 
	{
		driver.findElement(By.cssSelector(prop.getProperty("fullName"))).sendKeys("Vinayak Patil");
		driver.findElement(By.cssSelector(prop.getProperty("rediffID"))).sendKeys("VDP3456");
		driver.findElement(By.cssSelector(prop.getProperty("chkavailable"))).click();
		driver.findElement(By.id(prop.getProperty("pass"))).sendKeys("Pass@12345");
		driver.findElement(By.id(prop.getProperty("repass"))).sendKeys("Pass@12345");
		new Select(driver.findElement(By.cssSelector(prop.getProperty("day")))).selectByVisibleText("18");
		new Select(driver.findElement(By.cssSelector(prop.getProperty("month")))).selectByVisibleText("MAY");
		new Select(driver.findElement(By.cssSelector(prop.getProperty("year")))).selectByVisibleText("1968");
		WebElement 	fRadio = driver.findElement(By.xpath(prop.getProperty("rdbtnmale")));
		fRadio.click();
	}
  @Test
  public void rediffRegistration2() throws InterruptedException 
	{
		driver.findElement(By.cssSelector(prop.getProperty("fullName"))).sendKeys("Sneha Patil");
		driver.findElement(By.cssSelector(prop.getProperty("rediffID"))).sendKeys("SVP3456");
		driver.findElement(By.cssSelector(prop.getProperty("chkavailable"))).click();
		driver.findElement(By.id(prop.getProperty("pass"))).sendKeys("Pass@12345");
		driver.findElement(By.id(prop.getProperty("repass"))).sendKeys("Pass@12345");
		new Select(driver.findElement(By.cssSelector(prop.getProperty("day")))).selectByVisibleText("28");
		new Select(driver.findElement(By.cssSelector(prop.getProperty("month")))).selectByVisibleText("JAN");
		new Select(driver.findElement(By.cssSelector(prop.getProperty("year")))).selectByVisibleText("1986");
		WebElement 	fRadio = driver.findElement(By.xpath(prop.getProperty("rdbtnfemale")));
		fRadio.click();
	}
  @AfterTest
  public void closeDriver() 
  {
	  driver.close();
  }

}
