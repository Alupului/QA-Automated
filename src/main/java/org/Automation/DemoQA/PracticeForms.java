package org.Automation.DemoQA;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class PracticeForms {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys("Alupului");
        driver.findElement(By.id("lastName")).sendKeys("Teodor-Iulian");
        driver.findElement(By.id("userEmail")).sendKeys("teodor.alupului@yahoo.ro");
        WebElement gender1 = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", gender1);
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
        WebElement gender2 = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", gender2);
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
        WebElement gender3 = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]/label"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", gender3);
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]/label")).click();
        driver.findElement(By.id("userNumber")).sendKeys("0747637222");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("17 May 1990");
        driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[2]")).sendKeys("QA Enginner");
        WebElement hobbie1 = driver.findElement(By.cssSelector("#hobbies-checkbox-1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hobbie1);
        driver.findElement(By.cssSelector("##hobbies-checkbox-1")).click();
        WebElement hobbie2 = driver.findElement(By.cssSelector("#hobbies-checkbox-2"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hobbie2);
        driver.findElement(By.cssSelector("#hobbies-checkbox-2")).click();
        WebElement hobbie3 = driver.findElement(By.cssSelector("#hobbies-checkbox-3"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hobbie3);
        driver.findElement(By.cssSelector("#hobbies-checkbox-3")).click();
        WebElement photo = driver.findElement(By.cssSelector("#userForm > div:nth-child(8) > div.col-md-9.col-sm-12 > div > label"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", photo);
        driver.findElement(By.cssSelector("#userForm > div:nth-child(8) > div.col-md-9.col-sm-12 > div > label")).sendKeys("sampleFile.jpg");
        driver.findElement(By.id("currentAddress")).sendKeys("Bohotin");
        WebElement cityandstate = driver.findElement(By.cssSelector("#state > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cityandstate);
        driver.findElement(By.cssSelector("#state > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder")).sendKeys("NCR");

        driver.quit();
    }
}
