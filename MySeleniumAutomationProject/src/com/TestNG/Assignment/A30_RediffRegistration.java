package com.TestNG.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
  public void createAccount(String un, String rid, String cpw,String day, String month, String year,String country,String city,String hintq,String hinta,String mothername,String mobno) throws InterruptedException {
		driver.findElement(By.cssSelector("input[name^=\"name\"]")).sendKeys(un);
		driver.findElement(By.cssSelector("input[placeholder*=\"Rediffmail\"]")).sendKeys(rid);
		driver.findElement(By.cssSelector("input[name^=\"btnchkavail\"]")).click();
		Thread.sleep(3000);
		System.out.println(rid+" "+ driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText());
		driver.findElement(By.cssSelector("input[id$=\"swd\"]")).sendKeys(cpw);
		driver.findElement(By.cssSelector("input[name*=\"confirm\"]")).sendKeys(cpw);
		new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"))).selectByVisibleText(day);
		new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"))).selectByVisibleText(month);
		new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"))).selectByVisibleText(year);	
		WebElement 	fRadio = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[9]/div/label[2]/input"));
		if(fRadio.isSelected() == true)
			fRadio.click();
		new Select(driver.findElement(By.id("country"))).selectByVisibleText(country);
		new Select(driver.findElement(By.cssSelector("select[name^=\"city\"]"))).selectByVisibleText(city);
		WebElement chkbox = driver.findElement(By.cssSelector("input[name^=\"chk_altemail\"]"));
		chkbox.click();
		driver.findElement(By.cssSelector("input[name^=\"hinta\"]")).sendKeys(hinta);
		driver.findElement(By.cssSelector("input[name^=\"mothername\"]")).sendKeys(mothername);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(By.cssSelector("input[name^=\"mobno\"]")).sendKeys(mobno);
		Thread.sleep(10000);
		driver.findElement(By.id("Register")).click();
			
}

  @DataProvider
  public Object[][] userData() {
    return new Object[][] {
      new Object[] { "Vinayak", "vi452nay","PassWord@123","23","MAR","1985","India","Kolhapur","What is the name of your first school?","abcd","aswed","9579840015"},
      new Object[] { "Pravin", "pragw456vin","PassWord@123","23","MAY","1995","India","Pune","What is your favourite food?","defg","aswed","9579840063" },
    };
  }


 @AfterTest
  public void closeBrowser() {
	  driver.close();
  }
  
}
