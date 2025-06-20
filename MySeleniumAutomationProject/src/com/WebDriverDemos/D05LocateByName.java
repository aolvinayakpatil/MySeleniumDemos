package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D05LocateByName {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("vinayakpatil@gmail.com");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("123456759");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}
}
