package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class JavaScriptCountdown extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/javascript-countdown-test.html");

        WebElement selecttime = driver.findElement(By.cssSelector("#timer-seconds"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", selecttime);
        driver.findElement(By.cssSelector("#timer-seconds")).sendKeys("100");
        WebElement starttimer = driver.findElement(By.cssSelector("#start-timer"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", starttimer);
        driver.findElement(By.cssSelector("#start-timer")).click();
        WebElement stoptimer = driver.findElement(By.cssSelector("#stop-timer"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", stoptimer);
        driver.findElement(By.cssSelector("#stop-timer")).click();
        WebElement cleartimer = driver.findElement(By.cssSelector("#clear-timer"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", cleartimer);
        driver.findElement(By.cssSelector("#clear-timer")).click();
        WebElement resettimer = driver.findElement(By.cssSelector("#reset-timer"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", resettimer);
        driver.findElement(By.cssSelector("#reset-timer")).click();

        driver.quit();
    }
}
