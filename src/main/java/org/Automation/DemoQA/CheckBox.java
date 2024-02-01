package org.Automation.DemoQA;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class CheckBox extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");

        WebElement checkbox = driver.findElement(By.cssSelector("label[for='tree-node-home']"));
        if(!checkbox.isSelected())
            checkbox.click();
        WebElement node1 = driver.findElement(By.xpath("//button[@class=\"rct-node.rct-node-parent.rct-node-collapsed\"]"));
        boolean selectState = node1.isSelected();
        if(!selectState) {
            node1.click();
        }

        driver.quit();
    }
}
