package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Alertsbtns extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

        WebElement shalbox = driver.findElement(By.cssSelector("#alertexamples"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", shalbox);
        driver.findElement(By.cssSelector("#alertexamples")).click();
        WebElement shcfbox = driver.findElement(By.xpath("//*[@id=\"confirmexample\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", shcfbox);
        driver.findElement(By.xpath("//*[@id=\"confirmexample\"]")).click();
        WebElement shprmtbox = driver.findElement(By.xpath("//*[@id=\"promptexample\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", shprmtbox);
        driver.findElement(By.xpath("//*[@id=\"promptexample\"]")).click();

        driver.quit();
    }
}
