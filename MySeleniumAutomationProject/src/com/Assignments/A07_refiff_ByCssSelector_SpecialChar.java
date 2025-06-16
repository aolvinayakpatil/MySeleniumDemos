package com.Assignments;
/*7.Open https://register.rediff.com/register/register.php?FormName=user_details
	a.Enter full name
	b.Enter Rediff Id
	c.Enter password
	d.Enter confirm password
Use CssSelector Special characters
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A07_refiff_ByCssSelector_SpecialChar {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement fullName = driver.findElement(By.cssSelector("input[name^=\"name\"]"));
		fullName.sendKeys("Vinayak Patil");
		WebElement rediffMail = driver.findElement(By.cssSelector("input[placeholder*=\"Rediffmail\"]"));
		rediffMail.sendKeys("vinayak123");
		WebElement passWord = driver.findElement(By.cssSelector("input[id$=\"swd\"]"));
		passWord.sendKeys("vp1234567");
		WebElement reTypepassWord = driver.findElement(By.cssSelector("input[name*=\"confirm\"]"));
		reTypepassWord.sendKeys("vp1234567");
	}
}
