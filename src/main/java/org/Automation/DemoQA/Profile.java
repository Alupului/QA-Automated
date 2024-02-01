package org.Automation.DemoQA;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Profile extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/profile");

        WebElement log = driver.findElement(By.linkText("<a href=\"/login\" style=\"font-weight: bold;\">login</a>"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", log);
        driver.findElement(By.linkText("<a href=\"/login\" style=\"font-weight: bold;\">login</a>")).click();
        WebElement reg = driver.findElement(By.linkText("<a href=\"/register\" style=\"font-weight: bold;\">register</a>"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", reg);
        driver.findElement(By.linkText("<a href=\"/register\" style=\"font-weight: bold;\">register</a>")).click();

        driver.quit();
    }
}
