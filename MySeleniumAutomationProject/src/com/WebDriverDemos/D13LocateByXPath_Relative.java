package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13LocateByXPath_Relative {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.facebook.com");
		driver.findElement(By.xpath("//form[@method=\"post\"]/div/div/input")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("212452");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	}

}
