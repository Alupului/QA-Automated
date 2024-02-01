package org.Automation.utils;

import dev.failsafe.internal.util.Durations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void testBase(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}

