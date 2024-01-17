package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class WindowsLinkPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/windows-test.html");

        WebElement basicajaxinnewpage = driver.findElement(By.id("gobasicajax"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", basicajaxinnewpage);
        driver.findElement(By.id("gobasicajax")).click();
        WebElement attributesinnewpage = driver.findElement(By.id("goattributes"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", attributesinnewpage);
        driver.findElement(By.id("goattributes")).click();
        WebElement allertsinnewindow = driver.findElement(By.id("goalerts"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", allertsinnewindow);
        driver.findElement(By.id("goalerts")).click();

        driver.quit();
    }
}
