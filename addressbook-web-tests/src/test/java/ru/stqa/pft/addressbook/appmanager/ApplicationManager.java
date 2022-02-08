package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHalper groupHalper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {

        if (browser == org.openqa.selenium.remote.BrowserType.CHROME) {
            driver = new ChromeDriver();
        } else  if (browser == org.openqa.selenium.remote.BrowserType.FIREFOX){
            driver = new FirefoxDriver();
        } else  if (browser == BrowserType.IE){
            driver = new InternetExplorerDriver();
        }

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/group.php");
        groupHalper = new GroupHalper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        driver.quit();
    }

    public void returnToGroupPage() {
        groupHalper.returnToGroupe();
    }

    public GroupHalper getGroupHalper() {
        return groupHalper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
