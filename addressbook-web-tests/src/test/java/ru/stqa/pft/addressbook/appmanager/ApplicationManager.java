package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public ChromeDriver driver;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHalper groupHalper;

    public void init() {
        driver = new ChromeDriver();
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
