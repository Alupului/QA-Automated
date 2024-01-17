package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class FileDownloads {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/download/download.html");

        WebElement dirlinkdown = driver.findElement(By.id("direct-download-a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", dirlinkdown);
        driver.findElement(By.id("direct-download-a")).click();
        WebElement dirlinkdownnewindow = driver.findElement(By.id("direct-download-window-a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", dirlinkdownnewindow);
        driver.findElement(By.id("direct-download-window-a")).click();
        WebElement serverdownl = driver.findElement(By.id("server-download-a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", serverdownl);
        driver.findElement(By.id("server-download-a")).click();
        WebElement postgetredirserv = driver.findElement(By.id("post-getserver-download"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", postgetredirserv);
        driver.findElement(By.id("post-getserver-download")).click();
        WebElement dirlink = driver.findElement(By.id("direct-link-a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", dirlink);
        driver.findElement(By.id("direct-link-a")).click();

        driver.quit();
    }
}
