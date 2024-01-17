package org.Automation.DemoQA;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class NestedFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/nestedframes");

        WebElement frame = driver.findElement(By.cssSelector("body > iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body/p")).click();

        driver.quit();
    }
}
