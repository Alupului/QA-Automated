package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Search extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/search");

        WebElement typetext = driver.findElement(By.cssSelector("body > div > form > p:nth-child(1) > input[type=text]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", typetext);
        driver.findElement(By.cssSelector("body > div > form > p:nth-child(1) > input[type=text]")).sendKeys("Selenium-RC");
        WebElement search = driver.findElement(By.cssSelector("body > div > form > input[type=submit]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", search);
        driver.findElement(By.cssSelector("body > div > form > input[type=submit]")).click();

        driver.quit();
    }
}
