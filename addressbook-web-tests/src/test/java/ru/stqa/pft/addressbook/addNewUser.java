package ru.stqa.pft.addressbook;// Generated by Selenium IDE

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class addNewUser {
    private ChromeDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/index.php");
        log("admin", "secret");
    }

    @Test
    public void untitled() {
        gotoUserPage();
        inetUserCreation();
        fillUserForm(new UserData("Starovoytov", "Igor", "Victorovich", "SKLN", "idsys", "Tver", "89301530042", "bficrew@mail.ru"));
    }

    private void fillUserForm(UserData userData) {
        driver.findElement(By.name("firstname")).sendKeys(userData.getName());
        driver.findElement(By.name("middlename")).click();
        driver.findElement(By.name("middlename")).sendKeys(userData.getFamil());
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys(userData.getOtche());
        driver.findElement(By.name("nickname")).click();
        driver.findElement(By.name("nickname")).sendKeys(userData.getNick());
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).sendKeys(userData.getCompany());
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).sendKeys(userData.getTower());
        driver.findElement(By.cssSelector("label:nth-child(30)")).click();
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).sendKeys(userData.getFax());
        driver.findElement(By.name("theform")).click();
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys(userData.getMblLo());
        driver.findElement(By.cssSelector("input:nth-child(87)")).click();
    }

    private void inetUserCreation() {
        driver.findElement(By.name("firstname")).click();
    }

    private void gotoUserPage() {
        driver.findElement(By.linkText("add new")).click();
    }

    private void log(String user, String password) {
        driver.manage().window().setSize(new Dimension(1667, 937));
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).sendKeys(user);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
