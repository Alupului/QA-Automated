package org.Automation.DemoQA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Dragabble {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();


        driver.get("https://demoqa.com/dragabble");

        var size1= driver.findElement(By.id("dragBox"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", size1);
        action.clickAndHold(size1).moveByOffset(250,250).perform();
        var size21 = driver.findElement(By.id("restrictedX"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", size1);
        action.clickAndHold(size21).moveByOffset(250,100).perform();

        driver.quit();
    }
}
