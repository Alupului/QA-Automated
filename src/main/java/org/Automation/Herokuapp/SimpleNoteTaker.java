package org.Automation.Herokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SimpleNoteTaker {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/apps/notes/simplenotes.html");

        WebElement lst = driver.findElement(By.cssSelector("#local-storage-link"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", lst);
        driver.findElement(By.cssSelector("#local-storage-link")).click();
        driver.findElement(By.cssSelector("#note-title-input")).sendKeys("Alupului");
        driver.findElement(By.cssSelector("#note-details-input")).sendKeys("QA Manual");
        WebElement add1 = driver.findElement(By.cssSelector("#add-note"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", add1);
        driver.findElement(By.cssSelector("#add-note")).click();
        WebElement cancel1 = driver.findElement(By.cssSelector("#cancel-note"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", cancel1);
        driver.findElement(By.cssSelector("#cancel-note")).click();
        WebElement load1 = driver.findElement(By.cssSelector("#load-notes"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", load1);
        driver.findElement(By.cssSelector("#load-notes")).click();
        WebElement show1 = driver.findElement(By.cssSelector("#show-notes"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", show1);
        driver.findElement(By.cssSelector("#show-notes")).click();
        WebElement cl1 = driver.findElement(By.cssSelector("#clear-notes"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", cl1);
        driver.findElement(By.cssSelector("#clear-notes")).click();
        WebElement sst = driver.findElement(By.cssSelector("#session-storage-link"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", sst);
        driver.findElement(By.cssSelector("#session-storage-link")).click();
        driver.findElement(By.cssSelector("#note-title-input")).sendKeys("Alupului");
        driver.findElement(By.cssSelector("#note-details-input")).sendKeys("QA Manual");
        WebElement add2 = driver.findElement(By.cssSelector("#add-note"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", add2);
        driver.findElement(By.cssSelector("#add-note")).click();
        WebElement cancel2 = driver.findElement(By.cssSelector("#cancel-note"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", cancel2);
        driver.findElement(By.cssSelector("#cancel-note")).click();
        WebElement load2 = driver.findElement(By.cssSelector("#load-notes"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", load2);
        driver.findElement(By.cssSelector("#load-notes")).click();
        WebElement show2 = driver.findElement(By.cssSelector("#show-notes"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", show2);
        driver.findElement(By.cssSelector("#show-notes")).click();
        WebElement cl2 = driver.findElement(By.cssSelector("#clear-notes"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", cl2);
        driver.findElement(By.cssSelector("#clear-notes")).click();

        driver.quit();
    }
}
