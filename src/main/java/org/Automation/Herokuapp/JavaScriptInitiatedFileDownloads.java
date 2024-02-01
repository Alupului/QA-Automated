package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class JavaScriptInitiatedFileDownloads extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/download/download-via-js.html");

        WebElement fetchfromserver = driver.findElement(By.xpath("//*[@id=\"server-fetch-data-object\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", fetchfromserver);
        driver.findElement(By.xpath("//*[@id=\"server-fetch-data-object\"]")).click();
        WebElement fetchfromserver1 = driver.findElement(By.xpath("//*[@id=\"server-fetch-uri-encoded\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", fetchfromserver1);
        driver.findElement(By.xpath("//*[@id=\"server-fetch-uri-encoded\"]")).click();
        WebElement generandsave = driver.findElement(By.xpath("//*[@id=\"generate-data-object\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", generandsave);
        driver.findElement(By.xpath("//*[@id=\"generate-data-object\"]")).click();
        WebElement generanduricode = driver.findElement(By.xpath("//*[@id=\"generate-uri-encoded\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", generanduricode);
        driver.findElement(By.xpath("//*[@id=\"generate-uri-encoded\"]")).click();
        WebElement contrdirdown = driver.findElement(By.xpath("//*[@id=\"direct-download\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", contrdirdown);
        driver.findElement(By.xpath("//*[@id=\"direct-download\"]")).click();

        driver.quit();
    }
}
