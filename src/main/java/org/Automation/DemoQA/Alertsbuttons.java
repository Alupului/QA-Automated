package org.Automation.DemoQA;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Alertsbuttons extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

            driver.get("https://demoqa.com/alerts");

            WebElement alertBtn = driver.findElement(By.cssSelector("#alertButton"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertBtn);
            driver.findElement(By.cssSelector("#alertButton")).click();
            WebElement timerBtn = driver.findElement(By.cssSelector("#timerAlertButton"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", timerBtn);
            driver.findElement(By.cssSelector("#timerAlertButton")).click();
            WebElement confirmBtn = driver.findElement(By.cssSelector("#confirmButton"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirmBtn);
            driver.findElement(By.cssSelector("#confirmButton")).click();
            WebElement promptBtn = driver.findElement(By.cssSelector("#promtButton"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", promptBtn);
            driver.findElement(By.cssSelector("#promtButton")).click();

            driver.quit();
        }
    }



