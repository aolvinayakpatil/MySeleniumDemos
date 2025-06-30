package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class D07_ReadFromXML {
	WebDriver driver;
	@Parameters({"userName","password"})//This will read values from XML file
  @Test
  public void loginToPracticeTest(String un, String ps) {
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(un);
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(ps);
	  driver.findElement(By.xpath("//*[@id=\"login\"]/button")).submit();
  }
  @AfterMethod
  public void afterMethod() {
	  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)","");
	  driver.findElement(By.linkText("Logout")).click();
  }

  @BeforeTest
  public void beforeTest() {
	  	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/login");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
