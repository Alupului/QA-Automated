package org.Automation.DemoQA;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Slider extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/slider");

        driver.findElement(By.cssSelector("#sliderContainer > div.col-9 > span > input")).click();
        WebElement slider = driver.findElement(By.id("sliderValue"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", slider);
        driver.findElement(By.id("sliderValue")).sendKeys("30");

        driver.quit();
    }
}
