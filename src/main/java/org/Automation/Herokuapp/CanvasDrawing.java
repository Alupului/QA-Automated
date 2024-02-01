package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class CanvasDrawing extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/canvas-javascript-test.html");

        WebElement axx = driver.findElement(By.cssSelector("#xnum"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", axx);
        driver.findElement(By.cssSelector("#xnum")).sendKeys("10");
        WebElement axy = driver.findElement(By.cssSelector("#ynum"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", axy);
        driver.findElement(By.cssSelector("#ynum")).sendKeys("20");
        WebElement size = driver.findElement(By.cssSelector("#shapesize"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", size);
        driver.findElement(By.cssSelector("#shapesize")).sendKeys("10");
        WebElement color = driver.findElement(By.cssSelector("#colourselect"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", color);
        driver.findElement(By.cssSelector("#colourselect")).sendKeys("black");
        WebElement shape = driver.findElement(By.cssSelector("#shapeselect"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", shape);
        driver.findElement(By.cssSelector("#shapeselect")).sendKeys("circle");
        WebElement show = driver.findElement(By.cssSelector("body > div > div.centered > form > div:nth-child(3) > input[type=button]:nth-child(1)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", show);
        driver.findElement(By.cssSelector("body > div > div.centered > form > div:nth-child(3) > input[type=button]:nth-child(1)")).click();
        WebElement clear = driver.findElement(By.cssSelector("body > div > div.centered > form > div:nth-child(3) > input[type=button]:nth-child(2)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", clear);
        driver.findElement(By.cssSelector("body > div > div.centered > form > div:nth-child(3) > input[type=button]:nth-child(2)")).click();

        driver.quit();
    }
}
