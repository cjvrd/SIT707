package web.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMathQuestionSelenium {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    private void sleep(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFullPass() {
        System.out.println("Driver info: " + driver);

        // go to q1 (skipping login because we already tested that last week)
        driver.get("http://localhost:8080/q1");
        sleep(2);

        WebElement ele = driver.findElement(By.id("number1"));
        ele.clear();
        ele.sendKeys("1");

        ele = driver.findElement(By.id("number2"));
        ele.clear();
        ele.sendKeys("1");

        ele = driver.findElement(By.id("result"));
        ele.clear();
        ele.sendKeys("2");

        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // q2
        ele = driver.findElement(By.id("number1"));
        ele.clear();
        ele.sendKeys("2");

        ele = driver.findElement(By.id("number2"));
        ele.clear();
        ele.sendKeys("1");

        ele = driver.findElement(By.id("result"));
        ele.clear();
        ele.sendKeys("1");

        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // q3
        ele = driver.findElement(By.id("number1"));
        ele.clear();
        ele.sendKeys("2");

        ele = driver.findElement(By.id("number2"));
        ele.clear();
        ele.sendKeys("2");

        ele = driver.findElement(By.id("result"));
        ele.clear();
        ele.sendKeys("4");

        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // find completed test text on page
        String status = driver
                .findElement(By.xpath("/html/body/div[text()='Congratulations, you have completed the test!']"))
                .getText();

        Assert.assertEquals("Congratulations, you have completed the test!", status);
    }

    @Test
    public void testQ1WrongAnswer() {
        System.out.println("Driver info: " + driver);

        // go to q1 (skipping login because we already tested that last week)
        driver.get("http://localhost:8080/q1");
        sleep(2);

        WebElement ele = driver.findElement(By.id("number1"));
        ele.clear();
        ele.sendKeys("1");

        ele = driver.findElement(By.id("number2"));
        ele.clear();
        ele.sendKeys("1");

        ele = driver.findElement(By.id("result"));
        ele.clear();
        ele.sendKeys("3");

        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // find wrong answer text on page
        String status = driver
                .findElement(By.xpath("/html/body/div[text()='Wrong answer, try again.']"))
                .getText();

        Assert.assertEquals("Wrong answer, try again.", status);
    }

    @Test
    public void testQ2WrongAnswer() {
        System.out.println("Driver info: " + driver);

        // go to q1 (skipping login because we already tested that last week)
        driver.get("http://localhost:8080/q2");
        sleep(2);

        WebElement ele = driver.findElement(By.id("number1"));
        ele.clear();
        ele.sendKeys("1");

        ele = driver.findElement(By.id("number2"));
        ele.clear();
        ele.sendKeys("1");

        ele = driver.findElement(By.id("result"));
        ele.clear();
        ele.sendKeys("3");

        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // find wrong answer text on page
        String status = driver
                .findElement(By.xpath("/html/body/div[text()='Wrong answer, try again.']"))
                .getText();

        Assert.assertEquals("Wrong answer, try again.", status);
    }

    @Test
    public void testQ3WrongAnswer() {
        System.out.println("Driver info: " + driver);

        // go to q1 (skipping login because we already tested that last week)
        driver.get("http://localhost:8080/q3");
        sleep(2);

        WebElement ele = driver.findElement(By.id("number1"));
        ele.clear();
        ele.sendKeys("1");

        ele = driver.findElement(By.id("number2"));
        ele.clear();
        ele.sendKeys("1");

        ele = driver.findElement(By.id("result"));
        ele.clear();
        ele.sendKeys("3");

        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // find wrong answer text on page
        String status = driver
                .findElement(By.xpath("/html/body/div[text()='Wrong answer, try again.']"))
                .getText();

        Assert.assertEquals("Wrong answer, try again.", status);
    }

    @Test
    public void testQ1EmptyInput() {
        System.out.println("Driver info: " + driver);

        // go to q1 (skipping login because we already tested that last week)
        driver.get("http://localhost:8080/q1");
        sleep(2);

        WebElement ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // find wrong answer text on page
        String status = driver
                .findElement(By.xpath("/html/body/div[text()='Please enter a valid input.']"))
                .getText();

        Assert.assertEquals("Please enter a valid input.", status);
    }

    @Test
    public void testQ2EmptyInput() {
        System.out.println("Driver info: " + driver);

        // go to q1 (skipping login because we already tested that last week)
        driver.get("http://localhost:8080/q2");
        sleep(2);

        WebElement ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // find wrong answer text on page
        String status = driver
                .findElement(By.xpath("/html/body/div[text()='Please enter a valid input.']"))
                .getText();

        Assert.assertEquals("Please enter a valid input.", status);
    }

    @Test
    public void testQ3EmptyInput() {
        System.out.println("Driver info: " + driver);

        // go to q1 (skipping login because we already tested that last week)
        driver.get("http://localhost:8080/q3");
        sleep(2);

        WebElement ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // find wrong answer text on page
        String status = driver
                .findElement(By.xpath("/html/body/div[text()='Please enter a valid input.']"))
                .getText();

        Assert.assertEquals("Please enter a valid input.", status);
    }

    @Test
    public void testQ1InvalidInput() {
        System.out.println("Driver info: " + driver);

        // go to q1 (skipping login because we already tested that last week)
        driver.get("http://localhost:8080/q1");
        sleep(2);

        WebElement ele = driver.findElement(By.id("number1"));
        ele.clear();
        ele.sendKeys("a");

        ele = driver.findElement(By.id("number2"));
        ele.clear();
        ele.sendKeys("a");

        ele = driver.findElement(By.id("result"));
        ele.clear();
        ele.sendKeys("a");

        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // find wrong answer text on page
        String status = driver
                .findElement(By.xpath("/html/body/div[text()='Please enter a valid input.']"))
                .getText();

        Assert.assertEquals("Please enter a valid input.", status);
    }

    @Test
    public void testQ2InvalidInput() {
        System.out.println("Driver info: " + driver);

        // go to q1 (skipping login because we already tested that last week)
        driver.get("http://localhost:8080/q2");
        sleep(2);

        WebElement ele = driver.findElement(By.id("number1"));
        ele.clear();
        ele.sendKeys("a");

        ele = driver.findElement(By.id("number2"));
        ele.clear();
        ele.sendKeys("a");

        ele = driver.findElement(By.id("result"));
        ele.clear();
        ele.sendKeys("a");

        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // find wrong answer text on page
        String status = driver
                .findElement(By.xpath("/html/body/div[text()='Please enter a valid input.']"))
                .getText();

        Assert.assertEquals("Please enter a valid input.", status);
    }

    @Test
    public void testQ3InvalidInput() {
        System.out.println("Driver info: " + driver);

        // go to q1 (skipping login because we already tested that last week)
        driver.get("http://localhost:8080/q3");
        sleep(2);

        WebElement ele = driver.findElement(By.id("number1"));
        ele.clear();
        ele.sendKeys("a");

        ele = driver.findElement(By.id("number2"));
        ele.clear();
        ele.sendKeys("a");

        ele = driver.findElement(By.id("result"));
        ele.clear();
        ele.sendKeys("a");

        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();

        sleep(2);

        // find wrong answer text on page
        String status = driver
                .findElement(By.xpath("/html/body/div[text()='Please enter a valid input.']"))
                .getText();

        Assert.assertEquals("Please enter a valid input.", status);
    }
}