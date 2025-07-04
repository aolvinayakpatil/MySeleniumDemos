package com.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D08_KeywordDriverFramework {
	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;
		
  @Test
  public void registration() {
	  driver.findElement(By.id(prop.getProperty("fNameID"))).sendKeys("Vinayak");
	  driver.findElement(By.cssSelector(prop.getProperty("lNameCss"))).sendKeys("Patil");
	  driver.findElement(By.xpath(prop.getProperty("emailXpath"))).sendKeys("vp@gmail.com");
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  file=new File("src/com/TestNG/D08_KDFramework_MyLocators.properties");
	  fis=new FileInputStream(file);
	  prop=new Properties();
	  prop.load(fis);
	  prop.getProperty("url");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get(prop.getProperty("url"));
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
