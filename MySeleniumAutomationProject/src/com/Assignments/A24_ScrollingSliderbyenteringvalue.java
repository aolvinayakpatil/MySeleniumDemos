package com.Assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
/*23.Open https://www.fitpeo.com/revenue-calculator
		a.Try scrolling slider so that the value will become 800
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A24_ScrollingSliderbyenteringvalue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fitpeo.com/revenue-calculator");
		
		driver.findElement(By.id(":R57alklbrpida:")).sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		driver.findElement(By.id(":R57alklbrpida:")).sendKeys("600");
	}

}
