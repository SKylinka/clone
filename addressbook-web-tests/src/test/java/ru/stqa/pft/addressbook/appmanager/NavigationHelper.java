package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper extends HelperBase{


    public NavigationHelper(WebDriver driver) {
        super((ChromeDriver) driver);

    }


    public void gotoGroupPage() {

        click(By.linkText("groups"));
    }
    public void gotoHomePage() {

        click(By.linkText("home"));
    }
}
