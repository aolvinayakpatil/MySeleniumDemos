package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D06_AssertionDemo {
	WebDriver driver;
	String expUrl ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;
  @Test(dataProvider = "getLoginData")
  public void loginToOHRM(String un, String ps) {
	  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(ps);
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
	  actUrl=driver.getCurrentUrl();
	  
//  	Assert.assertEquals(actUrl, expUrl, "Invalid credentials!!!");
//	 	Assert.assertTrue(actUrl.contains("dashboard"), "Invalid credentials!!!");
	  	Assert.assertTrue(actUrl.equals(expUrl),"Invalid credentials!!!");
  }
  @AfterMethod
  public void logOut() {
	  if(driver.getCurrentUrl().contains("dashboard")) {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
		  driver.findElement(By.partialLinkText("Log")).click();
		  System.out.println("Test case is Passed");
	  }
	  else
	  {
		  System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText());
	  }
  }


  @DataProvider
  public Object[][] getLoginData() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Vinayak", "vinayak123" },
      new Object[] { "Admin", "admin123" },
      new Object[] { "Pravin", "pravin123" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
