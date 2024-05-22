package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginServiceTest {
	
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//UNIT TESTS
	@Test
	public void testLoginFailInvalidUsername() {
		String username = "invalid";
		String password = "doesntmatter";
		String DOB = "doesntmatter";
		LoginService loginService = new LoginService();
		Boolean loginResult = loginService.login(username, password, DOB);
		System.out.println("login = " + loginResult);
		Assert.assertFalse(loginResult);
	}

	@Test
	public void testLoginFailInvalidPassword() {
		String username = "ahsan";
		String password = "invalid";
		String DOB = "doesntmatter";
		LoginService loginService = new LoginService();
		Boolean loginResult = loginService.login(username, password, DOB);
		System.out.println("login = " + loginResult);
		Assert.assertFalse(loginResult);
	}

	@Test
	public void testLoginFailInvalidDOB() {
		String username = "ahsan";
		String password = "ahsan_pass";
		String DOB = "invalid";
		LoginService loginService = new LoginService();
		Boolean loginResult = loginService.login(username, password, DOB);
		System.out.println("login = " + loginResult);
		Assert.assertFalse(loginResult);
	}

	@Test
	public void testLoginFailInvalidUsernameSelenium() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.navigate().to(
				"C:/SIT707/8.1P-resources/pages/login.html");
		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("invalid");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass");

		// Find DOB element
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("01/01/2024");
		
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		/*
		 * On successful login, the title of page changes to 'success',
		 * otherwise, 'fail'.
		 */
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals("fail", title);
		
		driver.close();
	}

	@Test
	public void testLoginFailInvalidPasswordSelenium() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.navigate().to(
				"C:/SIT707/8.1P-resources/pages/login.html");
		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("invalid");

		// Find DOB element
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("01/01/2024");
		
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		/*
		 * On successful login, the title of page changes to 'success',
		 * otherwise, 'fail'.
		 */
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals("fail", title);
		
		driver.close();
	}

	@Test
	public void testLoginFailInvalidDOBSelenium() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.navigate().to(
				"C:/SIT707/8.1P-resources/pages/login.html");
		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass");

		// Find DOB element
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("05/05/2025");
		
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		/*
		 * On successful login, the title of page changes to 'success',
		 * otherwise, 'fail'.
		 */
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals("fail", title);
		
		driver.close();
	}

	@Test
	public void testLoginSuccess() {
		String username = "ahsan";
		String password = "ahsan_pass";
		String DOB = "2024-01-01";
		Boolean loginResult = LoginService.login(username, password, DOB);
		System.out.println("login = " + loginResult);
		Assert.assertTrue(loginResult);
	}

	@Test
	public void testLoginSuccessSelenium() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.navigate().to(
				"C:/SIT707/8.1P-resources/pages/login.html");
		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass");

		// Find DOB element
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("01/01/2024");
		
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		/*
		 * On successful login, the title of page changes to 'success',
		 * otherwise, 'fail'.
		 */
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals("success", title);
		
		driver.close();
	}
}
