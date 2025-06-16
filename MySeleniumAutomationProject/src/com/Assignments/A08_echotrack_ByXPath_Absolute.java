package com.Assignments;
/*8.Open https://www.echotrak.com/Login.aspx?ReturnUrl=%2f
	a.Enter user name (vinayak)
	b.Enter password (vinayak123)
	c.Click on Login button
	d.Display an error message.
Use Absolute XPath locator
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A08_echotrack_ByXPath_Absolute {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[2]/fieldset/input[1]")).sendKeys("Vinayak");
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[2]/fieldset/input[2]")).sendKeys("vi12034g");
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[3]/div/input")).click();
		WebElement errmsg = driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div/span"));
		String msg = errmsg.getText();
		System.out.println("Error Message: " + msg);
	}
}