package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuappLandingPage extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.eviltester.com/styled/index.html");

    }

}
