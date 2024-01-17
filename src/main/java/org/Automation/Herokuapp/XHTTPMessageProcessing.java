package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class XHTTPMessageProcessing {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/sync/xhttp-messages.html");

        WebElement countmesage = driver.findElement(By.cssSelector("#messagesdisplay"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", countmesage);
        driver.findElement(By.cssSelector("#messagesdisplay")).click();

        driver.quit();
    }
}
