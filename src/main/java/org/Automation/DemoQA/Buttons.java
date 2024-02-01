package org.Automation.DemoQA;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Buttons extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        WebElement click1 = driver.findElement(By.cssSelector("button#doubleClickBtn"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click1);
        driver.findElement(By.cssSelector("button#doubleClickBtn")).click();
        WebElement click2 = driver.findElement(By.cssSelector("button#rightClickBtn"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click2);
        driver.findElement(By.cssSelector("button#rightClickBtn")).click();
        WebElement click3 = driver.findElement(By.id("YfesD"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click3);
        driver.findElement(By.id("YfesD")).click();

        driver.quit();
    }
}
