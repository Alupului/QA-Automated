package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Attributes {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");

        WebElement paragraphadd = driver.findElement(By.cssSelector("body > div > div:nth-child(13) > button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", paragraphadd);
        driver.findElement(By.cssSelector("body > div > div:nth-child(13) > button")).click();

        driver.quit();
    }
}
