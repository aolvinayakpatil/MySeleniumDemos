package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05_FbLogin_ByclassName {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		// WebElement userName = driver.findElement(By.className("inputtext _55r1
		// _6luy"));//InvalidSelectorException
		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("Pravin@gmail.com");
		// WebElement pass = driver.findElement(By.className("inputtext"));//locator-->
		// className value is same for username & password
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Pravin123");
		WebElement loginBtn = driver.findElement(By.className("_42ft"));// InvalidSelectorException
		// WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		// driver.close();
	}

}
