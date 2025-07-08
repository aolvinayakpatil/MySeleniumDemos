package com.TestNG.Assignment;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A32_OHRM_Client {
	WebDriver driver;
	A32_OHRM_Utility ohrm;
	@Test
	public void orangeHRMlogin() throws InterruptedException 
	{
		ohrm.login("Admin", "admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		ohrm.addEmpFL("Vinayak", "Patil", "vdp39S", "Patil@Pass12");
		ohrm.login("vdp39S", "Patil@Pass12");
		ohrm.empInfo();
		ohrm.login("Admin", "admin123");
		ohrm.deleteRecord("vdp39S");
	}
	@BeforeTest
	public void openBrowser()
	{
		Map<String, Object>pref = new HashMap<>();
		pref.put("profile.credentials_enable_serve", false);
		pref.put("profile.password_manager_leak_detection", false);
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("prefs", pref);
		driver = new ChromeDriver(op);

		//driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ohrm = new A32_OHRM_Utility(driver);
	}

	@AfterTest
	public void afterTest() 
	{
		driver.close();
	}

}
