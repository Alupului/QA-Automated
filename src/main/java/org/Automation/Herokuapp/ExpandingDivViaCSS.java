package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ExpandingDivViaCSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/expandingdiv.html");

        WebElement node = driver.findElement(By.cssSelector("body > div > div.centered > div > div"));
        boolean selectState = node.isSelected();
        if(!selectState) {
            node.click();
        }
        WebElement linkclick = driver.findElement(By.cssSelector("body > div > div.centered > div > div > p:nth-child(6) > a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", linkclick);
        driver.findElement(By.cssSelector("body > div > div.centered > div > div > p:nth-child(6) > a")).click();
        WebElement linkbackclick = driver.findElement(By.cssSelector("body > div > div.centered > div > p > a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", linkbackclick);
        driver.findElement(By.cssSelector("body > div > div.centered > div > p > a")).click();

        driver.quit();
    }
}
