package org.Automation.DemoQA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Tabs {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/tabs");

        WebElement what = driver.findElement(By.id("demo-tab-what"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", what);
        driver.findElement(By.id("demo-tab-what")).click();
        WebElement origin = driver.findElement(By.id("demo-tab-origin"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", origin);
        driver.findElement(By.id("demo-tab-origin")).click();
        WebElement use = driver.findElement(By.id("demo-tab-use"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", use);
        driver.findElement(By.id("demo-tab-use")).click();
        WebElement more = driver.findElement(By.id("demo-tab-more"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", more);
        driver.findElement(By.id("demo-tab-more")).click();

        driver.quit();
    }
}
