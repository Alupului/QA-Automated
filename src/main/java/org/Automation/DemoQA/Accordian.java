package org.Automation.DemoQA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Accordian {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/accordian");

        WebElement sect1 = driver.findElement(By.cssSelector("#section1Heading"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", sect1);
        driver.findElement(By.cssSelector("#section1Heading")).click();
        WebElement sect2 = driver.findElement(By.cssSelector("#section2Heading"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", sect2);
        driver.findElement(By.cssSelector("#section2Heading")).click();
        WebElement sect3 = driver.findElement(By.cssSelector("#section3Heading"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", sect3);
        driver.findElement(By.cssSelector("#section3Heading")).click();

        driver.quit();
    }
}
