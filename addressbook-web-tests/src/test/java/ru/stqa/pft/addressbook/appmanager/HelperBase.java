package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperBase {

    protected WebDriver driver;

    public HelperBase(ChromeDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).sendKeys(text);
    }
    public boolean isAlertPresent(){
        try {
            driver.switchTo().alert();
            return true;

        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
