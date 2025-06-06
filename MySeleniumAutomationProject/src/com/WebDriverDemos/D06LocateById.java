package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D06LocateById {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("vinayakpatil@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456759");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}
}