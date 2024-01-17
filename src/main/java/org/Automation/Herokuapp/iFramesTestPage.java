package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class iFramesTestPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/iframes-test.html");

        WebElement mainframe = driver.findElement(By.cssSelector("#dynamic-iframe"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", mainframe);
        action.dragAndDropBy(mainframe, 250, 250).build().perform();

        driver.quit();
    }
}
