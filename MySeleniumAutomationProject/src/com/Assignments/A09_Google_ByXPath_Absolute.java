package com.Assignments;
/*9.Open https://www.google.com
	a.Search for “Pattankodoli Yatra”
	b.Hit Enter
Use Absolute XPath Locator
*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A09_Google_ByXPath_Absolute {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.google.com");
		driver.findElement(By.xpath("html/body/div/div[3]/form/div/div/div/div/div[2]/textarea")).sendKeys("Pattankodoli Yatra",Keys.ENTER);
	}
}