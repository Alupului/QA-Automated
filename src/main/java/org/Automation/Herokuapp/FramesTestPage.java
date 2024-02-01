package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class FramesTestPage extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");

        WebElement leftside = driver.findElement(By.xpath("/html/body/h1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", leftside);
        action.dragAndDropBy(leftside, 250, 250).build().perform();
        WebElement middleside = driver.findElement(By.xpath("/html/body/h1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", middleside);
        action.dragAndDropBy(middleside, 200, 200).build().perform();
        WebElement rightside = driver.findElement(By.xpath("/html/body/h1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", rightside);
        action.dragAndDropBy(rightside, 250, 250).build().perform();

        driver.quit();
    }
}
