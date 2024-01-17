package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ClickAutoGrowButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");

        WebElement growbutton = driver.findElement(By.cssSelector("#growbutton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", growbutton);
        driver.findElement(By.cssSelector("#growbutton")).click();

        driver.quit();
    }
}
