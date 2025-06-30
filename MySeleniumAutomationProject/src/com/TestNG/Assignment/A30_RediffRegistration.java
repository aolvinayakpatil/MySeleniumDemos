package com.TestNG.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A30_RediffRegistration {
  WebDriver driver;
  
  @BeforeTest
  public void launchBrowser() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  
  } 
  @BeforeMethod
  public void clearData() {
	  driver.navigate().refresh();
	  
  }
	
	@Test(dataProvider = "userData")
  public void createAccount(String un, String rid, String cpw) throws InterruptedException {
		driver.findElement(By.cssSelector("input[name^=\"name\"]")).sendKeys(un);
		driver.findElement(By.cssSelector("input[placeholder*=\"Rediffmail\"]")).sendKeys(rid);
		driver.findElement(By.cssSelector("input[value='Check availability']")).click();
		Thread.sleep(3000);
		System.out.println(rid+" "+ driver.findElement(By.id("check_availability")).getText());
		/*if (driver.findElement(By.id("check_availability")).getText().contains("available")) {
			System.out.println(rid+" "+ driver.findElement(By.id("check_availability")).getText());
		}else {
			System.out.println(rid+" "+ driver.findElement(By.id("check_availability")).getText());
		}*/
		driver.findElement(By.cssSelector("input[id$=\"swd\"]")).sendKeys(cpw);
		driver.findElement(By.cssSelector("input[name*=\"confirm\"]")).sendKeys(cpw);
		
  }

  @DataProvider
  public Object[][] userData() {
    return new Object[][] {
      new Object[] { "Vinayak", "adsfgsg","PassWord@123" },
      new Object[] { "Pravin", "pravin","PassWord@123" },
    };
  }


 @AfterTest
  public void closeBrowser() {
	  driver.close();
  }
  
}
