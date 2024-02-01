package org.Automation.DemoQA;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Droppable extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get("https://demoqa.com/droppable");

        WebElement dragme = driver.findElement(By.id("draggable"));
        WebElement drophere = driver.findElement(By.id("droppable"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", drophere);
        action.dragAndDrop(dragme, drophere).build().perform();
        WebElement acceptable = driver.findElement(By.id("acceptable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", drop);
        action.dragAndDrop(acceptable, drop).build().perform();
        WebElement notacceptable = driver.findElement(By.id("notAcceptable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", drop1);
        action.dragAndDrop(notacceptable, drop1).build().perform();

        driver.quit();
    }
}