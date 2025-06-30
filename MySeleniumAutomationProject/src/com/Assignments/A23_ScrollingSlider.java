package com.Assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
/*23.Open https://www.fitpeo.com/revenue-calculator
		a.Try scrolling slider so that the value will become 800
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;


public class A23_ScrollingSlider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fitpeo.com/revenue-calculator");
		
		//Actions act = new Actions(driver);
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]/input")).click();
		//act.dragAndDropBy(null, 0, 0);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		WebElement slider = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]/input"));
		for (int i=0;i<600;i++)
			slider.sendKeys(Keys.ARROW_RIGHT);
		driver.close();
	}

}
