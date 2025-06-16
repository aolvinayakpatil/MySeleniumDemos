package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D20Synchronization_ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		//From
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div/div/div/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("srcDest")).sendKeys("kolh");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div/div")).click();
		
		//To
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("srcDest")).sendKeys("Pun");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/div")).click();
		
		//date
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[36]/div/div/span")).click();
		
		//Search Button
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button/i")).click();
		Thread.sleep(10000);
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"14540670\"]/div[2]/div[3]/div/div[1]/div[1]")).getText());
		driver.close();
		
	}

}
