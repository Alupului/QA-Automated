package org.Automation.DemoQA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class AutoComplete {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/auto-complete");

        WebElement multicolorname = driver.findElement(By.id("autoCompleteMultiple"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", multicolorname);
        driver.findElement(By.id("autoCompleteMultiple")).sendKeys("Violet, Black");
        WebElement singlecolorname = driver.findElement(By.cssSelector("#autoCompleteSingleContainer > div"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", singlecolorname);
        driver.findElement(By.cssSelector("#autoCompleteSingleContainer > div")).sendKeys("Black");


    }
}
