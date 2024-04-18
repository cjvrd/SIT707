package sit707_week2;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.chrome.ChromeOptions;;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation
 * https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// method to take screenshot, name it as url title and save it to current folder
	// as png
	public static void saveScreenshot(WebDriver driver) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(driver.getTitle() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void officeworks_registration_page_locatorAPI(String officeworksURL) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver(options);

		System.out.println("Driver info: " + driver);

		sleep(2);

		// Load a webpage in chromium browser.
		driver.get(officeworksURL);

		// Find first input field which is firstname using relative locator api
		WebElement firstnameElement = driver.findElement(RelativeLocator.with(By.id("firstname")).above(By.id("lastname")));
		System.out.println("Found element: " + firstnameElement);
		// Send first name
		firstnameElement.sendKeys("John");
		sleep(1);

		// last name
		WebElement lastnameElement = driver.findElement(RelativeLocator.with(By.id("lastname")).below(By.id("firstname")));
		System.out.println("Found element: " + lastnameElement);
		lastnameElement.sendKeys("Johnson");
		sleep(1);

		// phone number
		WebElement phoneNumberElement = driver.findElement(RelativeLocator.with(By.id("phoneNumber")).below(By.id("lastname")));
		System.out.println("Found element: " + phoneNumberElement);
		phoneNumberElement.sendKeys("0412345678");
		sleep(1);

		// email
		WebElement emailElement = driver.findElement(RelativeLocator.with(By.id("email")).below(By.id("phoneNumber")));
		System.out.println("Found element: " + emailElement);
		emailElement.sendKeys("johnjohnson@gmail.com");
		sleep(1);

		// password
		WebElement passwordElement = driver.findElement(RelativeLocator.with(By.id("password")).below(By.id("email")));
		System.out.println("Found element: " + passwordElement);
		passwordElement.sendKeys("password");
		sleep(1);

		// confirm password
		WebElement confirmpasswordElement = driver.findElement(RelativeLocator.with(By.id("confirmPassword")).below(By.id("password")));
		System.out.println("Found element: " + confirmpasswordElement);
		confirmpasswordElement.sendKeys("password");
		sleep(1);

		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		driver.findElement(RelativeLocator.with(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button")).below(By.id("confirmPassword"))).click();
		System.out.println("Clicked create account button");
		sleep(1);

		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		saveScreenshot(driver);

		// Sleep a while
		sleep(2);

		// close chrome driver
		driver.close();
	}

}
