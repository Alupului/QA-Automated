package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class CSSMediaQuery extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get("https://testpages.herokuapp.com/styled/css-media-queries.html");


        var size= driver.findElement(By.cssSelector("body > div > div.centered > h2.csshidden.s1800"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", size);
        action.clickAndHold(size).moveByOffset(10,20).perform();

        driver.quit();
    }
}
