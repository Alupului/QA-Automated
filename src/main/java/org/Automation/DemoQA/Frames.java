package org.Automation.DemoQA;

import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Frames extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/frames");

        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1);
        String headingText = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(headingText);

        driver.quit();
    }
}
