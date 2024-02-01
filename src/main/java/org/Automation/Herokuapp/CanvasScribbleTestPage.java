package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class CanvasScribbleTestPage extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions builder = new Actions(driver);

        driver.get("https://testpages.herokuapp.com/styled/gui-scribble.html");

        WebElement canvas = driver.findElement(By.cssSelector("#canvas"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", canvas);
        builder.moveToElement(canvas).perform();
        builder.clickAndHold(canvas).perform();
        builder.moveByOffset(150, 50).perform();
        builder.moveToElement(canvas).perform();
        builder.clickAndHold(canvas).perform();
        builder.moveByOffset(100, 50).perform();
        builder.moveToElement(canvas).perform();
        driver.findElement(By.cssSelector("#canvas")).click();

        driver.quit();
    }
}
