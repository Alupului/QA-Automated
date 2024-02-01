package org.Automation.DemoQA;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ModalDialogs extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/modal-dialogs");


        WebElement smallmod = driver.findElement(By.id("showSmallModal"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", smallmod);
        driver.findElement(By.id("showSmallModal")).click();
        WebElement closebtn1 = driver.findElement(By.id("closeSmallModal"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", closebtn1);
        driver.findElement(By.id("closeSmallModal")).click();
        WebElement largemod = driver.findElement(By.xpath("//*[@id=\"showLargeModal\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", largemod);
        driver.findElement(By.xpath("//*[@id=\"showLargeModal\"]")).click();

        driver.quit();
    }
}
