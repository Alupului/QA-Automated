package org.Automation.DemoQA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class UploadAndDownload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/upload-download");

        WebElement download1 = driver.findElement(By.id("downloadButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", download1);
        driver.findElement(By.id("downloadButton")).click();
        WebElement upload1 = driver.findElement(By.xpath("//*[@id=\"uploadFile\"]"));
        upload1.sendKeys("C:\\Users\\Jhackhendhar\\Downloads\\sampleFile.jpg");
        driver.findElement(By.xpath("//*[@id=\"uploadFile\"]")).click();

        driver.quit();
    }
}
