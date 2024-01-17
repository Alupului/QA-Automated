package org.Automation.DemoQA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Resizable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/resizable");

        var frame1= driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", frame1);
        action.clickAndHold(frame1).moveByOffset(500, 300).perform();
        WebElement frame2 = driver.findElement(By.xpath("//*[@id=\"resizable\"]/span"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", frame2);
        action.clickAndHold(frame2).moveByOffset(400,200).build().perform();

        driver.quit();
    }
}
