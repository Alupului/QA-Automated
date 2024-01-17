package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class HardToSelectButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/challenges/hard-selectors.html");

        WebElement selbyid= driver.findElement(By.cssSelector("#select\\.me\\.by\\.id"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", selbyid);
        driver.findElement(By.cssSelector("#select\\.me\\.by\\.id")).click();

        driver.quit();
    }
}
