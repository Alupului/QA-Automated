package org.Automation.DemoQA;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Links {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/links");

        driver.findElement(By.linkText("Home")).click();

        driver.findElement(By.id("simpleLink")).click();
        driver.findElement(By.id("dynamicLink")).click();
        driver.findElement(By.id("created")).click();
        driver.findElement(By.id("no-content")).click();
        driver.findElement(By.id("moved")).click();
        driver.findElement(By.id("cbad-request")).click();
        driver.findElement(By.id("unauthorized")).click();
        driver.findElement(By.id("forbidden")).click();
        driver.findElement(By.id("invalid-url")).click();

        driver.quit();
    }
    }
