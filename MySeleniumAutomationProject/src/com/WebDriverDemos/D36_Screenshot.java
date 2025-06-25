package com.WebDriverDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class D36_Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.linkText("Slider")).click();
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		act.dragAndDropBy(slider, slider.getLocation().x+200,slider.getLocation().y).perform();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("Screenshots\\MyScreenshot.jpeg"));
		
		System.out.println("Screenshot capured");
		driver.close();
		
	}

}
