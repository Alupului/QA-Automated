package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class FieldValidation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/basic-javascript-validation-test.html");

        driver.findElement(By.cssSelector("#lteq30")).sendKeys("alupului");
        WebElement submitvalue = driver.findElement(By.cssSelector("body > div > div.centered > form > input.styled-click-button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submitvalue);
        driver.findElement(By.cssSelector("body > div > div.centered > form > input.styled-click-button")).click();

        driver.quit();
    }
}
