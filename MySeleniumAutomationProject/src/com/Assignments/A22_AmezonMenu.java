package com.Assignments;
/*22.Open https://www.amazon.in/
		a.Display all the menus
*/
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class A22_AmezonMenu {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
//		Actions act = new Actions(driver);
		WebElement all = driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]"));
		System.out.println(all.getText());
		List<WebElement>allMenus=driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/ul/li/div/a"));
		for(WebElement a : allMenus) 
			System.out.println(a.getAttribute("innerText"));
		driver.close();		
	}

}
