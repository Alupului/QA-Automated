package org.Automation.DemoQA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ProgressBar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/progress-bar");

        WebElement progressbar = driver.findElement(By.id("progressBar"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", progressbar);
        driver.findElement(By.id("progressBar")).click();
        WebElement start = driver.findElement(By.id("startStopButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", start);
        driver.findElement(By.id("startStopButton")).click();
        WebElement stop = driver.findElement(By.id("startStopButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", stop);
        driver.findElement(By.id("startStopButton")).click();

        driver.quit();
    }
}
