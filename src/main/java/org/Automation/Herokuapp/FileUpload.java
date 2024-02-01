package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class FileUpload extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");

        WebElement fc = driver.findElement(By.xpath("//*[@id=\"fileinput\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", fc);
        fc.sendKeys("C:\\fakepath\\sampleFile.jpeg");
        WebElement image = driver.findElement(By.cssSelector("#itsanimage"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", image);
        driver.findElement(By.cssSelector("#itsanimage")).click();
        WebElement file = driver.findElement(By.cssSelector("#itsafile"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", file);
        driver.findElement(By.cssSelector("#itsafile")).click();
        WebElement up = driver.findElement(By.cssSelector("body > div > div.centered > form > div:nth-child(4) > input"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", up);
        driver.findElement(By.cssSelector("body > div > div.centered > form > div:nth-child(4) > input")).click();

        driver.quit();
    }
}
