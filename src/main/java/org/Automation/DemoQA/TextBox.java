package org.Automation.DemoQA;


import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class TextBox extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");


        driver.findElement(By.id("userName")).sendKeys("Alupului");
        driver.findElement(By.id("userEmail")).sendKeys("teodor.alupului@yahoo.ro");
        driver.findElement(By.id("currentAddress")).sendKeys("Bohotin");
        driver.findElement(By.id("permanentAddress")).sendKeys("Bohotin");
        // or driver.findElement(By.cssSelector("button#submit")).click();
        WebElement element = driver.findElement(By.cssSelector("button#submit"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.cssSelector("button#submit")).click();

        driver.quit();
    }
}
