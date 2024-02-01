package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class HardToSelectButtons extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/challenges/hard-selectors.html");

        WebElement selbyid= driver.findElement(By.cssSelector("#select\\.me\\.by\\.id"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", selbyid);
        driver.findElement(By.cssSelector("#select\\.me\\.by\\.id")).click();

        driver.quit();
    }
}
