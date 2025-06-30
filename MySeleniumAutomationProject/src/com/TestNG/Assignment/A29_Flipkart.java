package com.TestNG.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A29_Flipkart {
	WebDriver driver;
	JavascriptExecutor js;
	
	@Test(priority=1,groups="Group1")
  public void clickOnGrocery() 
	{
	js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[contains(text(),\"Grocery\")]")));
	}
	@Test(priority=2,groups="Group2")
	  public void clickOnMobiles() 
		{
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[contains(text(),\"Mobiles\")]")));
		}
	@Test(priority=3,groups="Group2")
	  public void clickOnAppliances() 
		{
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[text()=\"Appliances\"]")));
		}
	@Test(priority=4,groups="Group1")
	  public void clickOnFlightBookings() 
		{
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[contains(text(),\"Flight Bookings\")]")));
		}
  @BeforeMethod(alwaysRun= true)
  public void beforeMethod() 
  {
	  driver.get("https://www.flipkart.com/");
	  System.out.println("Flipkart Website Title: "+driver.getTitle());
  }

  @AfterMethod(alwaysRun= true)
  public void afterMethod() 
  {
	  System.out.println("Click Menu Title: "+driver.getTitle());
  }

  @BeforeTest(alwaysRun= true)
  public void beforeTest() 
  {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	js= (JavascriptExecutor)driver;
  }

  @AfterTest(alwaysRun= true)
  public void afterTest()
  {
	  driver.close();
  }

}
