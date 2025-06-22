package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D29_HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",driver.findElement(By.xpath("//span[contains(text(),\"Remote\")]")));
		System.out.println("Title: "+ driver.getTitle());
		
		Set<String>windows=driver.getWindowHandles();
		Iterator<String>itr=windows.iterator();
		String win1=itr.next();
		String win2=itr.next();
		
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"search-result-container\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/label/i")).click();
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		driver.findElement(By.cssSelector("input[placeholder=\"Enter skills / designations / companies\"]")).sendKeys("Selenium WebDriver",Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}

}
