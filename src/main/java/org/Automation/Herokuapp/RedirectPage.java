package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class RedirectPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");

        WebElement click5sec = driver.findElement(By.cssSelector("#delaygotobasic"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", click5sec);
        driver.findElement(By.cssSelector("#delaygotobasic")).click();
        WebElement click2sec = driver.findElement(By.cssSelector("#delaygotobounce"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", click2sec);
        driver.findElement(By.cssSelector("#delaygotobounce")).click();

        driver.quit();
    }
}
