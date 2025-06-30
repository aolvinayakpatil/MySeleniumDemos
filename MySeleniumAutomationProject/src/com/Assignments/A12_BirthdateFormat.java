/*12.Open https://register.rediff.com/register/register.php?FormName=user_details
		a.Select your birth date and display in following format
			My Birthdate is 29 JAN 1979
*/
package com.Assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class A12_BirthdateFormat {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement selectdaydrp= driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
		Select selecteDay=new Select(selectdaydrp);
		
		WebElement selectMonthdrp= driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
		Select selecteMonth=new Select(selectMonthdrp);
		
		WebElement selectYeardrp= driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
		Select selecteYear=new Select(selectYeardrp);
		
		selecteDay.selectByValue("18");
		String day=selecteDay.getFirstSelectedOption().getText();
		
		selecteMonth.selectByValue("05");
		String month=selecteMonth.getFirstSelectedOption().getText();
		
		selecteYear.selectByValue("1992");
		String year=selecteYear.getFirstSelectedOption().getText();
		
		System.out.println("My Birthdate is "+day+" "+month+" "+year );
	
		driver.close();
	}

}
