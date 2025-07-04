package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.Assert;

public class D09_POM_Client {
  WebDriver driver;
  D09_UtilityforPOMClient r1;
	@Test
  public void createAccount1() throws InterruptedException {
		r1.setFullName("Vinayak Patil");
		r1.chooseRediffId("vdpross");
		r1.choosePsw("Vins@9295");
		r1.dateOfBirth("18", "MAY", "1967");
		String msg=r1.checkAvailability();
		Assert.assertTrue(msg.contains("available"),msg);
  }
	@Test
	  public void createAccount2() throws InterruptedException {
			r1.setFullName("Sneha Patil");
			r1.chooseRediffId("svpross");
			r1.choosePsw("Snehs@9295");
			r1.dateOfBirth("28", "FEB", "1970");
			String msg=r1.checkAvailability();
			Assert.assertTrue(msg.contains("Sorry"),msg);
	  }
  @BeforeTest
  public void launchBrowser() 
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details"); 
	  r1=new D09_UtilityforPOMClient(driver);
  }
@BeforeMethod
public void refreshPage()
{
	driver.navigate().refresh();
}
  @AfterTest
  public void closeBrowser() 
  {
	  driver.close();
  }

}
