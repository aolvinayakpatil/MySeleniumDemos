package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D07LocateByClassName {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.className("gLFyf"));
		searchBox.sendKeys("Do a Barrel roll");
		searchBox.sendKeys(Keys.ENTER); // This will hit enter key from the Keyboard
		
	}

}
