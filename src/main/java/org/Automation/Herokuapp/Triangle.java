package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Triangle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/apps/triangle/triangle001.html");

        driver.findElement(By.cssSelector("#side1")).sendKeys("10");
        driver.findElement(By.cssSelector("#side2")).sendKeys("10");
        driver.findElement(By.cssSelector("#side3")).sendKeys("10");
        WebElement type = driver.findElement(By.cssSelector("#identify-triangle-action"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", type);
        driver.findElement(By.cssSelector("#identify-triangle-action")).click();

        driver.quit();
    }
}
