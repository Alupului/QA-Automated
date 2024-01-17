package org.Automation.DemoQA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Sortable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

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
