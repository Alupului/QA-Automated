package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class HoverPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/csspseudo/css-hover.html");

        WebElement hovpara = driver.findElement(By.id("hoverpara"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", hovpara);
        driver.findElement(By.id("hoverpara")).click();
        WebElement hovdiv = driver.findElement(By.id("hoverdivpara"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", hovdiv);
        driver.findElement(By.id("hoverpara")).click();

        driver.quit();
    }
}
