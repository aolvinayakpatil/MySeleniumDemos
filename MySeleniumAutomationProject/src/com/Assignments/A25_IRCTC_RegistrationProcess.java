/*25.Open https://www.irctc.co.in/nget/profile/user-registration
		a.Complete the registration process.
		b.Display the messages after clicking on Submit button.
*/
package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class A25_IRCTC_RegistrationProcess {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")));
		driver.findElement(By.id("userName")).sendKeys("vdpatil1213214");
		driver.findElement(By.id("fullName")).sendKeys("Vinayak Dundappa Patil");
		driver.findElement(By.id("usrPwd")).sendKeys("Vinayak@9592");
		driver.findElement(By.id("cnfUsrPwd")).sendKeys("Vinayak@9592");
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.id("email")).sendKeys("vpatil@gmail.com");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-signup/div/div/form/div/div[2]/div/div[2]/div[8]/select"))).selectByVisibleText("+91 - India");
		driver.findElement(By.id("mobile")).sendKeys("9896325145");
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-signup/div/div/form/div/div[2]/div/div[2]/div[12]/div/button")).click();
		//driver.close();		
		
	}

}
