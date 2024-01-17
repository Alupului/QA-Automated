package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class MultipleProgressBar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/progress-bars-sync.html");

        WebElement task1 = driver.findElement(By.cssSelector("#progresstext0"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", task1);
        driver.findElement(By.cssSelector("#progresstext0")).click();
        driver.findElement(By.cssSelector("#progresstext0")).click();
        WebElement task2 = driver.findElement(By.cssSelector("#progresstext1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", task2);
        driver.findElement(By.cssSelector("#progresstext1")).click();
        WebElement task3 = driver.findElement(By.cssSelector("#progresstext2"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", task3);
        driver.findElement(By.cssSelector("#progresstext2")).click();

        driver.quit();
    }
}
