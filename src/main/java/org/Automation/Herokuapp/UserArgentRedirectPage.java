package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class UserArgentRedirectPage extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/redirect/user-agent-redirect-test");

        WebElement link = driver.findElement(By.linkText("<a href=\"/styled/redirect/mobile/user-agent-mobile-test\">/styled/redirect/mobile/user-agent-mobile-test</a>"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", link);
        driver.findElement(By.linkText("<a href=\"/styled/redirect/mobile/user-agent-mobile-test\">/styled/redirect/mobile/user-agent-mobile-test</a>")).click();

        driver.quit();
    }
}
