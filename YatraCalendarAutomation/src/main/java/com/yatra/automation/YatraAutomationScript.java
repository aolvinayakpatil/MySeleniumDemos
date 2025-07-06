package com.yatra.automation;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YatraAutomationScript {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(chromeOptions);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));// Synchronizing the webdriver
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		closePopUp(wait);
		clickOnDepartureDate(wait);
		WebElement currentMonthWebElement = selectTheMonthFromCalendar(wait, 0); // Current Month
		WebElement nextMonthWebElement = selectTheMonthFromCalendar(wait, 1);// Next Month
		Thread.sleep(2000);
		String lowestPriceForCurrentMonth=getMeLowestPrice(currentMonthWebElement);
		String lowestPriceForNextMonth=getMeLowestPrice(nextMonthWebElement);
		System.out.println(lowestPriceForCurrentMonth);
		System.out.println(lowestPriceForNextMonth);
		compareTwoMonthsPrices(lowestPriceForCurrentMonth, lowestPriceForNextMonth);
	}

	private static void clickOnDepartureDate(WebDriverWait wait) {
		By departureDateButtonLocator = By.xpath("//div[@aria-label=\"Departure Date inputbox\" and @role=\"button\"]");
		WebElement departureDateButton = wait
				.until(ExpectedConditions.elementToBeClickable(departureDateButtonLocator));
		departureDateButton.click();
	}

	private static void closePopUp(WebDriverWait wait) {
		By popUpLocator = By.xpath("//div[contains(@class,\"style_popup\")][1]");

		try {
			WebElement popUpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(popUpLocator));
			WebElement crossButton=popUpElement.findElement(By.xpath(".//img[@alt=\"cross\"]"));
			crossButton.click();
		}
		catch(TimeoutException e) {
			System.out.println("popup not shown in the screen..!!");
		}
	}

	private static String getMeLowestPrice(WebElement MonthWebElement) {
		By priceLocator = By.xpath(".//span[contains(@class,\"custom-day-content\")]");
		List<WebElement> julyPriceList = MonthWebElement.findElements(priceLocator);
		int lowestPrice = Integer.MAX_VALUE;
		WebElement priceElement = null;
		for (WebElement price : julyPriceList) {
			String priceString = price.getText();
			if (priceString.length() > 0) {
				priceString = priceString.replace("₹", "").replace(",", "");
				int priceInt = Integer.parseInt(priceString);// Conver the String into Integer
				if (priceInt < lowestPrice) {
					lowestPrice = priceInt;
					priceElement = price;
				}
			}
		}

		WebElement dateElement = priceElement.findElement(By.xpath(".//../.."));

		String result = dateElement.getAttribute("aria-label") + "--- Price is Rs" + lowestPrice;
		return result;
	}

	public static WebElement selectTheMonthFromCalendar(WebDriverWait wait, int index) {
		By calendarMonthsLocator = By.xpath("//div[@class=\"react-datepicker__month-container\"]");
		List<WebElement> calendarMonthsList = wait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(calendarMonthsLocator));
		System.out.println(calendarMonthsList.size());
		WebElement monthCalendarWebElement = calendarMonthsList.get(index);
		return monthCalendarWebElement;
	}

	public static void compareTwoMonthsPrices(String currentMonthPrice, String nextMonthPrice) {
		int currentMonthRSIndex = currentMonthPrice.indexOf("Rs");
		int nextMonthRSIndex = nextMonthPrice.indexOf("Rs");
		String currentPrice = currentMonthPrice.substring(currentMonthRSIndex + 2);
		String nextPrice = nextMonthPrice.substring(nextMonthRSIndex + 2);
		int current = Integer.parseInt(currentPrice);
		int next = Integer.parseInt(nextPrice);
		if(current<next) {
			System.out.println("The lowest price for the two months is" + current);
		}
		else if(current==next) {
			System.out.println("Price is same for both months..! Choose whatever you prefer!!");
		}
		else {
			System.out.println("The lowest price for the two months is" + next);
		}
	}
}