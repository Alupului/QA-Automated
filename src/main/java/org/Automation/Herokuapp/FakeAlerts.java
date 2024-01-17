package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class FakeAlerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");

        WebElement shalbox= driver.findElement(By.id("fakealert"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", shalbox);
        driver.findElement(By.id("fakealert")).click();
        WebElement shmodbox= driver.findElement(By.id("modaldialog"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", shmodbox);
        driver.findElement(By.id("modaldialog")).click();

        driver.quit();
    }
}
