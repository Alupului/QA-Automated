package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class BasicHtmlForms extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

        driver.findElement(By.name("username")).sendKeys("Alupului");
        driver.findElement(By.name("password")).sendKeys("11111");
        driver.findElement(By.name("comments")).sendKeys("teodor.alupului@yahoo.ro");
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[4]/td/input[1]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", upload);
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[4]/td/input[1]")).click();
        WebElement checkboxitems = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[1]"));
        if(!checkboxitems.isSelected())
            checkboxitems.click();
        WebElement checkboxradio = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[6]/td/input[1]"));
        if(!checkboxradio.isSelected())
            checkboxradio.click();
        WebElement multiselval = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", multiselval);
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select")).click();
        WebElement dropdownd = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownd);
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
        WebElement cancel = driver.findElement(By.cssSelector("#HTMLFormElements > table > tbody > tr:nth-child(9) > td > input:nth-child(1)"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancel);
        driver.findElement(By.cssSelector("#HTMLFormElements > table > tbody > tr:nth-child(9) > td > input:nth-child(1)")).click();
        WebElement submit = driver.findElement(By.cssSelector("#HTMLFormElements > table > tbody > tr:nth-child(9) > td > input:nth-child(2)"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        driver.findElement(By.cssSelector("#HTMLFormElements > table > tbody > tr:nth-child(9) > td > input:nth-child(2)")).click();

        driver.quit();
    }
}
