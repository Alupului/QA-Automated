package org.Automation.DemoQA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class BookStore {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/books");

        WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"searchBox\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", searchbox);
        driver.findElement(By.xpath("//*[@id=\"searchBox\"]")).sendKeys("Java");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", login);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
        driver.findElement(By.id("userName")).sendKeys("Alupului");
        driver.findElement(By.id("password")).sendKeys("111111");

        driver.quit();
    }
}
