package sit707;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.parser.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    //method to pause selenium
    public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

    //method to take screenshot, name it as url title and save it to current folder as png
    public static void saveScreenshot(WebDriver driver) {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(driver.getTitle()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.setProperty(
            "webdriver.chrome.driver",
            "C:/chromedriver-win64/chromedriver.exe"
        );

        WebDriver driver = new ChromeDriver();
        System.out.println(driver);
        
        //go to url
        driver.get("https://www.selenium.dev/");
        //maximize page to find elements
        driver.manage().window().maximize();
        //click read more element
        driver.findElement(By.xpath("//a[@href='/documentation/webdriver/']")).click();
        //create list of heading elements
        List<WebElement> headingElements = driver.findElements(By.cssSelector("h1, h2, h3, h4, h5, h6"));
        //iterate over list and print each
        for (WebElement heading : headingElements) {
            System.out.println(heading.getText());
        };
        sleep(2);

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement searchField = driver.findElement(By.className("gLFyf"));
        searchField.sendKeys("hello");
        searchField.submit();
        sleep(2);

        driver.get("https://wikipedia.org");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/footer/p/small[2]/a")).click();
        sleep(2);
        saveScreenshot(driver);
        driver.findElement(By.xpath("//*[@id=\"footer-places-privacy\"]/a")).click(); 
        sleep(2);
        saveScreenshot(driver);
        sleep(2);

        driver.close();
    }
}