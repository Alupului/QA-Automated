package org.Automation.DemoQA;

import org.Automation.utils.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQALandingPage extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");

    }
