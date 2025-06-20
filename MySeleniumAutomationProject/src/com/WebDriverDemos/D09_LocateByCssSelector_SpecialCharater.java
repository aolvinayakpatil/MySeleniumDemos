package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09_LocateByCssSelector_SpecialCharater {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.facebook.com");
		
		WebElement userName = driver.findElement(By.cssSelector("input[data-testid=\"royal-email\"]"));
		userName.sendKeys("Pravin@gmail.com");
		WebElement pass = driver.findElement(By.cssSelector("input[name=\"pass\"][id=\"pass\"]"));
		pass.sendKeys("Pravin123");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[name=\"login\"]"));
		loginBtn.click();
	}

}
