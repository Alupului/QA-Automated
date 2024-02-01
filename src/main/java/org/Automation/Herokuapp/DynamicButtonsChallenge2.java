package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class DynamicButtonsChallenge2 extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");

        WebElement start = driver.findElement(By.cssSelector("#button00"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", start);
        driver.findElement(By.cssSelector("#button00")).click();
        WebElement b1 = driver.findElement(By.cssSelector("#button01"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", b1);
        driver.findElement(By.cssSelector("#button01")).click();
        WebElement b2 = driver.findElement(By.cssSelector("#button02"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", b2);
        driver.findElement(By.cssSelector("#button02")).click();
        WebElement b3 = driver.findElement(By.cssSelector("#button03"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", b3);
        driver.findElement(By.cssSelector("#button03")).click();

        driver.quit();
    }
}
