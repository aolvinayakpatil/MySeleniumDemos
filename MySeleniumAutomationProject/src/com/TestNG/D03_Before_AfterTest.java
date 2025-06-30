package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03_Before_AfterTest {
	WebDriver driver;
	@BeforeTest
	public void launchBrower()
	{
		System.out.println("Before Test");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("After Test");
		driver.close();
	}
	@Test(priority=4)
	public void testMyntra()
	{
		driver.get("https://www.myntra.com/");
		System.out.println("Title: "+driver.getTitle());
	}
	@Test(priority=2)
	public void testDecathlon()
	{
		driver.get("https://www.decathlon.in/");
		System.out.println("Title: "+driver.getTitle());
	}
	@Test(priority=3)
	public void testAmazon()
	{
		driver.get("https://www.amazon.in/");
		System.out.println("Title: "+driver.getTitle());
	} 
	@Test (priority=1)
	public void testFlipkart()
	{
		driver.get("https://www.flipkart.com/");
		System.out.println("Title: "+driver.getTitle());
	}
}
