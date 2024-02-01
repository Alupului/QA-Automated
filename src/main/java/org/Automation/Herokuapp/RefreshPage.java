package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class RefreshPage extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/refresh");

        WebElement refresh = driver.findElement(By.cssSelector("#embeddedrefreshdatevalue"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", refresh);
        driver.findElement(By.cssSelector("#embeddedrefreshdatevalue")).click();

        driver.quit();
    }
}
