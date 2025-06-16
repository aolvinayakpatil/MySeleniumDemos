package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18_HandingDropDownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( " https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);
		System.out.println("Selected Country: " +countries.getFirstSelectedOption().getText());
		
		List<WebElement>CountryList = countries.getOptions();
		System.out.println("Total Countries : " + CountryList.size());
		
		int i = 0;
		for(WebElement c : CountryList)
		{
			System.out.println(i + ". " +c.getText());
			i++;
		}
		//countries.selectByVisibleText("Switzerland");
		//countries.selectByValue("203");
		//countries.selectByContainsVisibleText("tzerl");
		countries.selectByIndex(200);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
	}

}
