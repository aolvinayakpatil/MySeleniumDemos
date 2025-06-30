package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A28_NimbleWorkShadowbutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nimblework.com/resources/?tx_post_tag=case-studies");
		
		SearchContext sc=driver.findElement(By.xpath("//*[@id=\"kairon-client-container\"]/div")).getShadowRoot();
		sc.findElement(By.cssSelector("button[class=\"ka-button\"]")).click();
		Thread.sleep(5000);
		sc.findElement(By.cssSelector("input[placeholder=\"Type a message\"]")).sendKeys("Hello",Keys.ENTER);
		
	}

}
