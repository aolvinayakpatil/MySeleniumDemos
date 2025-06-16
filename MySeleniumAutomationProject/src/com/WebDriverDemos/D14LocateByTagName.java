package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14LocateByTagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.google.com");
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links: " +links.size());
//		links.get(0).click();
//		System.out.println(links.get(0).getText());
//		for(int i=0; i < links.size(); i++)
//			System.out.println(links.get(i).getText());
		for (WebElement l : links)
			System.out.println(l.getText());
	}

}
