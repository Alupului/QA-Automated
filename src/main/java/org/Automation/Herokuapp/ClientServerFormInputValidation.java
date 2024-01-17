package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ClientServerFormInputValidation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/validation/input-validation.html");

        driver.findElement(By.id("firstname")).sendKeys("Alupului");
        driver.findElement(By.id("surname")).sendKeys("Teodor-Iulian");
        driver.findElement(By.id("age")).sendKeys("33");
        WebElement countrysel = driver.findElement(By.cssSelector("#country"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", countrysel);
        driver.findElement(By.cssSelector("#country")).sendKeys("Afganistan");
        driver.findElement(By.id("notes")).sendKeys("QA Manual");
        WebElement submit = driver.findElement(By.cssSelector("body > div > div:nth-child(7) > form > input[type=submit]:nth-child(31)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        driver.findElement(By.cssSelector("body > div > div:nth-child(7) > form > input[type=submit]:nth-child(31)")).click();

        driver.quit();
    }
}
