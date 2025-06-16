package com.Assignments;
/*3.Open https://www.echotrak.com/Login.aspx?ReturnUrl=%2f
	a.Enter user name (vinayak)
	b.Enter password (vinayak123)
	c.Click on Login button
	Use Id locator
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03_echotrack_ById {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		WebElement userName = driver.findElement(By.id("txtCustomerID"));
		userName.sendKeys("vinayak");
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys("vinayak123");
		WebElement loginBtn = driver.findElement(By.id("Butsub"));
		loginBtn.click();
		//driver.close();
	}

}
