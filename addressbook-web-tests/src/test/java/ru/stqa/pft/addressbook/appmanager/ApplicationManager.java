package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.BrowserType;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHalper groupHalper;
    private Browser browser;
    private ContactHelper contactHelper;


    public ApplicationManager(Browser browser) {
        this.browser = browser;
    }

    public void init() {

        if (browser.equals(Browser.CHROME)) {
            driver = new ChromeDriver();
        } else  if (browser.equals(Browser.FIREFOX)){
            driver = new FirefoxDriver();
        } else  if (browser.equals(Browser.IE)){
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("http://localhost/addressbook/group.php");
        groupHalper = new GroupHalper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
        contactHelper = new ContactHelper(driver);
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

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
