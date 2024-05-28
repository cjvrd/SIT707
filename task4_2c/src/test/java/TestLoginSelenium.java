import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class TestLoginSelenium {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    WebDriver driver;

    @Before
    public void initDriver() {
        // Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");

		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		driver = new ChromeDriver();

		sleep(2);

		// Load a webpage in chromium browser.
		driver.get("https://www.bunnings.com.au/login");
    }

    @Test
    public void testInvalidEmailDoesntMatterPassword() {
        WebElement email = driver.findElement(By.id("okta-signin-username"));
        email.sendKeys("invalidemail@bunnings.com.au");

        WebElement password = driver.findElement(By.id("okta-signin-password"));
        password.sendKeys("doesntmatterpassword");

        WebElement signinButton = driver.findElement(By.id("okta-signin-submit"));
        signinButton.click();

        sleep(2);

        String failedLoginMessage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div/div/div[2]/div/div/div[2]/main/div[2]/div/div/form/div[1]/div[1]/div/div/p")).getText();

        Assert.assertEquals("Your email address or password is incorrect.", failedLoginMessage);

        driver.close();
    }

    @Test
    public void testInvalidEmailEmptyPassword() {
        WebElement email = driver.findElement(By.id("okta-signin-username"));
        email.sendKeys("invalidemail@bunnings.com.au");

        WebElement signinButton = driver.findElement(By.id("okta-signin-submit"));
        signinButton.click();

        sleep(2);

        String failedLoginMessage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div/div/div[2]/div/div/div[2]/main/div[2]/div/div/form/div[1]/div[1]/div/div/p")).getText();

        Assert.assertEquals("Please correct the highlighted errors", failedLoginMessage);

        driver.close();
    }

    @Test
    public void testEmptyEmailDoesntMatterPassword() {
        WebElement password = driver.findElement(By.id("okta-signin-password"));
        password.sendKeys("doesntmatterpassword");

        WebElement signinButton = driver.findElement(By.id("okta-signin-submit"));
        signinButton.click();

        sleep(2);

        String failedLoginMessage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div/div/div[2]/div/div/div[2]/main/div[2]/div/div/form/div[1]/div[1]/div/div/p")).getText();

        Assert.assertEquals("Please correct the highlighted errors", failedLoginMessage);

        driver.close();
    }

    @Test
    public void testValidEmailEmptyPassword() {
        WebElement email = driver.findElement(By.id("okta-signin-username"));
        email.sendKeys("vicik66120@hutov.com");

        WebElement signinButton = driver.findElement(By.id("okta-signin-submit"));
        signinButton.click();

        sleep(2);

        String failedLoginMessage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div/div/div[2]/div/div/div[2]/main/div[2]/div/div/form/div[1]/div[1]/div/div/p")).getText();

        Assert.assertEquals("Please correct the highlighted errors", failedLoginMessage);

        driver.close();
    }

    @Test
    public void testValidEmailInvalidPassword() {
        WebElement email = driver.findElement(By.id("okta-signin-username"));
        email.sendKeys("vicik66120@hutov.com");

        WebElement password = driver.findElement(By.id("okta-signin-password"));
        password.sendKeys("invalidpassword");

        WebElement signinButton = driver.findElement(By.id("okta-signin-submit"));
        signinButton.click();

        sleep(2);

        String failedLoginMessage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div/div/div[2]/div/div/div[2]/main/div[2]/div/div/form/div[1]/div[1]/div/div/p")).getText();

        Assert.assertEquals("Your email address or password is incorrect.", failedLoginMessage);
        
        driver.close();
    }

    @Test
    public void testLoginSuccess() {
        WebElement email = driver.findElement(By.id("okta-signin-username"));
        email.sendKeys("vicik66120@hutov.com");

        WebElement password = driver.findElement(By.id("okta-signin-password"));
        password.sendKeys("Password123!");

        WebElement signinButton = driver.findElement(By.id("okta-signin-submit"));
        signinButton.click();

        sleep(2);

        //successful login redirects to www.bunnings.com.au homepage

        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals("https://www.bunnings.com.au/", currentUrl);

        driver.close();
    }
}
