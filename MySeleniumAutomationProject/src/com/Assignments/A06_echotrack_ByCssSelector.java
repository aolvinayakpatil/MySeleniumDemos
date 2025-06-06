package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A06_echotrack_ByCssSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		WebElement userName = driver.findElement(By.cssSelector("input[placeholder=\"Username\"]"));
		userName.sendKeys("vinayak");
		WebElement pass = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
		pass.sendKeys("vinayak123");
		WebElement loginBtn = driver.findElement(By.cssSelector("input[value=\"Login\"]"));
		loginBtn.click();
	}
}
