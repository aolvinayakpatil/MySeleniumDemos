package com.TestNG.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A32_OHRM_Utility {
	WebDriver driver;

	public A32_OHRM_Utility(WebDriver d)
	{
		driver = d;
	}
	public void login(String un, String ps)
	{
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	}
	public void logout()
	{
		driver.findElement(By.className("oxd-userdropdown-icon")).click();
		driver.findElement(By.partialLinkText("Log")).click();
	}
	public void addEmpFL(String fn, String ln,String un,String ps) throws InterruptedException
	{
		driver.findElement(By.cssSelector("input[name=\"firstName\"]")).sendKeys(fn);
		driver.findElement(By.cssSelector("input[name=\"lastName\"]")).sendKeys(ln);
		driver.findElement(By.cssSelector("span[class^=\"oxd-switch-input\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys(ps);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys(ps);
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(5000);
		logout();
	}
	public void empInfo() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		Thread.sleep(5000);
		WebElement displayEmpId=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		String empId= displayEmpId.getAttribute("value");
		System.out.println("Employee ID: " + empId);
		logout();
	}
	public void deleteRecord(String newUserName) throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Admin")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(newUserName);
		driver.findElement(By.className("oxd-button--secondary")).click();
		Thread.sleep(5000);
		WebElement chkBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]"));
		chkBox.click();
		driver.findElement(By.className("oxd-button--label-danger")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
		logout();
	}
}