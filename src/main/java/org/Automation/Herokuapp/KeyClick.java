package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class KeyClick extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/key-click-display-test.html");

        WebElement clickme = driver.findElement(By.cssSelector("#button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", clickme);
        driver.findElement(By.cssSelector("#button")).click();

        driver.quit();
    }
}
