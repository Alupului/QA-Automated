package org.Automation.DemoQA;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Sortable extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/sortable");

        WebElement list = driver.findElement(By.id("demo-tab-list"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", list);
        driver.findElement(By.id("demo-tab-list")).click();
        WebElement grid = driver.findElement(By.id("demo-tab-grid"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", grid);
        driver.findElement(By.id("demo-tab-grid")).click();

        driver.quit();
    }
}
