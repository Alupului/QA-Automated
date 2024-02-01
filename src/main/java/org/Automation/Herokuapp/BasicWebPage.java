package org.Automation.Herokuapp;


import org.Automation.utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class BasicWebPage extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");

        WebElement title = driver.findElement(By.cssSelector("h1"));
        System.out.println(title.getText());
        WebElement paragraph = driver.findElement(By.cssSelector("div.explanation"));
        System.out.println(paragraph.getText());
        WebElement paragraph1 = driver.findElement(By.id("para1"));
        System.out.println(paragraph1.getText());
        WebElement paragraph2 = driver.findElement(By.id("para2"));
        System.out.println(paragraph2.getText());

        driver.quit();
    }
}

