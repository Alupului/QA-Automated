package org.Automation.DemoQA;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class DymanicProperties extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/dynamic-properties");

        driver.findElement(By.id("IUdwX")).getText();
        WebElement enable = driver.findElement(By.cssSelector("button#enableAfter"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", enable);
        driver.findElement(By.cssSelector("button#enableAfter")).click();
        WebElement color = driver.findElement(By.cssSelector("button#colorChange"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", color);
        driver.findElement(By.cssSelector("button#colorChange")).click();
        WebElement visible = driver.findElement(By.cssSelector("buttom#visibleAfter"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", visible);
        driver.findElement(By.cssSelector("buttom#visibleAfter")).click();

        driver.quit();
    }
}
