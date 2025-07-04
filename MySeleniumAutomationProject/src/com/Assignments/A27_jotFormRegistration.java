/*27.Open https://www.jotform.com/form-templates/exam-registration-form
		a.Complete the registration process
 */
package com.Assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A27_jotFormRegistration {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.jotform.com/form-templates/exam-registration-form");
		//Switch to Registration Form frame
		driver.switchTo().frame(driver.findElement(By.id("formPreviewArea")));
		//Enter Student details
		driver.findElement(By.id("first_9")).sendKeys("Vinayak");
		driver.findElement(By.id("last_9")).sendKeys("Patil");
		driver.findElement(By.id("input_10")).sendKeys("9579840018");
		driver.findElement(By.id("input_3")).sendKeys("Testing");
		driver.findElement(By.id("lite_mode_11")).sendKeys("06-30-2025");
		driver.findElement(By.id("lite_mode_12")).sendKeys("07-08-2025");
		driver.findElement(By.id("input_8")).sendKeys("Best of Luck");
		//Click on Submit
		js.executeScript("arguments[0].click()", driver.findElement(By.id("input_16")));
		driver.close();

	}

}
