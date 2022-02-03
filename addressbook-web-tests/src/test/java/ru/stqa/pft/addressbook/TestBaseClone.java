package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBaseClone {

    private ChromeDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/index.php");
        log("admin", "secret");
    }

    public void fillUserForm(UserData userData) {
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

    public void inetUserCreation() {
        driver.findElement(By.name("firstname")).click();
    }

    public void gotoUserPage() {
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

    public void clickDeleteUser() {
      driver.findElement(By.id("3")).click();
      driver.findElement(By.cssSelector(".left:nth-child(8) > input")).click();
      //assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
      driver.switchTo().alert().accept();
    }

    public void clickButtonHome() {
      driver.findElement(By.linkText("home")).click();
    }
}
