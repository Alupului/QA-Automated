package org.Automation.DemoQA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Menu {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demoqa.com/menu");

        WebElement menu1 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", menu1);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a")).click();
        WebElement menu2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", menu2);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a")).click();
        WebElement menu3 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", menu3);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a")).click();

        driver.quit();
    }
}
