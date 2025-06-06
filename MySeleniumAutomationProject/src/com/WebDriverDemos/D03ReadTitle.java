package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03ReadTitle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.liquid-technologies.com/online-json-to-schema-converter");
		String title = driver.getTitle();
		System.out.println("Title : "+title);
		//if (title.equals("Free Online JSON to JSON Schema Converter"))
		if (title.contains("Free Online"))	
			System.out.println("Test Case is Pass");
		else
			System.out.println("Test case is Fail");
		driver.close();

	}

}
