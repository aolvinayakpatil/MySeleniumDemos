package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class D09_UtilityforPOMClient {
	WebDriver driver;
	//Object Repository
	@FindBy (css = "input[name^=\"name\"]") WebElement fullName;
	@FindBy (xpath= "/html/body/div[2]/div[2]/form/div/div[3]/div/input")WebElement rediffmail;
	@FindBy (id = "newpasswd")WebElement password;
	@FindBy (id = "newpasswd1")WebElement confirmpass;
	public D09_UtilityforPOMClient(WebDriver d)//Constructor
	{
		driver=d;
		PageFactory.initElements(driver,this);
	}
	public void setFullName(String fn)
	{
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input")).sendKeys(fn);
		fullName.sendKeys(fn);
	}
	public void chooseRediffId(String rid)
	{
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[3]/div/input")).sendKeys(rid);
		rediffmail.sendKeys(rid);
	}
	public void choosePsw(String ps)
	{
		//driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys(ps);
		password.sendKeys(ps);
		//driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(ps);
		confirmpass.sendKeys(ps);
	}
	public void dateOfBirth(String day, String month, String year)
	{
		new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"))).selectByVisibleText(day);
		new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"))).selectByVisibleText(month);
		new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"))).selectByVisibleText(year);
	}
	public String checkAvailability() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[4]/input")).click();
		Thread.sleep(2000);
		String msg=driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText();
		System.out.println(msg);
		return msg;
	}
}
