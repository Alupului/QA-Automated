package org.Automation.DemoQA;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class DataPicker extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/date-picker");

        WebElement date = driver.findElement(By.id("datePickerMonthYearInput"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", date);
        driver.findElement(By.id("datePickerMonthYearInput")).sendKeys("17 mai 1990");
        WebElement dateandtime = driver.findElement(By.id("dateAndTimePickerInput"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", dateandtime);
        driver.findElement(By.id("dateAndTimePickerInput")).sendKeys("17 mai 1990 ,4:07");

        driver.quit();
    }
}
