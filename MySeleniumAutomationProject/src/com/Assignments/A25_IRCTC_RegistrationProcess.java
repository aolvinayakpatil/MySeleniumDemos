/*25.Open https://www.irctc.co.in/nget/profile/user-registration
		a.Complete the registration process.
		b.Display the messages after clicking on Submit button.
*/
package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A25_IRCTC_RegistrationProcess {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		
		
	}

}
