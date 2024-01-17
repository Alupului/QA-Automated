package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Events {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        WebElement onblur = driver.findElement(By.cssSelector("#onblur"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", onblur);
        driver.findElement(By.cssSelector("#onblur")).click();
        WebElement onclick = driver.findElement(By.cssSelector("#onclick"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", onclick);
        driver.findElement(By.cssSelector("#onclick")).click();
        WebElement oncontextmenu = driver.findElement(By.cssSelector("#oncontextmenu"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", oncontextmenu);
        driver.findElement(By.cssSelector("#oncontextmenu")).click();
        WebElement ondoubleclick = driver.findElement(By.cssSelector("#ondoubleclick"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ondoubleclick);
        driver.findElement(By.cssSelector("#ondoubleclick")).click();
        WebElement onfocus = driver.findElement(By.cssSelector("#onfocus"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", onfocus);
        driver.findElement(By.cssSelector("#onfocus")).click();
        WebElement okdown = driver.findElement(By.cssSelector("#onkeydown"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", okdown);
        driver.findElement(By.cssSelector("#onkeydown")).click();
        WebElement onkeyup = driver.findElement(By.cssSelector("#onkeyup"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", onkeyup);
        driver.findElement(By.cssSelector("#onkeyup")).click();
        WebElement onkpress = driver.findElement(By.cssSelector("#onkeypress"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", onkpress);
        driver.findElement(By.cssSelector("#onkeypress")).click();
        WebElement onmouseover = driver.findElement(By.cssSelector("#onmouseover"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", onmouseover);
        driver.findElement(By.cssSelector("#onmouseover")).click();
        WebElement onmouseleave = driver.findElement(By.cssSelector("#onmouseleave"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", onmouseleave);
        driver.findElement(By.cssSelector("##onmouseleave")).click();
        WebElement onmousedown = driver.findElement(By.cssSelector("#onmousedown"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", onmousedown);
        driver.findElement(By.cssSelector("#onmousedown")).click();

        driver.quit();
    }
}
