package ru.stqa.pft.addressbook.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }


    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("lastname"),contactData.getLastname());

        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroupe());
        } else  {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }


    public void sumbitContactCreation() {click(By.name("sumbit"));}

    public void returnToHomePage() {click(By.linkText("home page"));}

    public void initContactModification() {click(By.cssSelector("tr:nth-child(2) > .center:nth-child(8) img"));}

    public void sumbitContactModification() {
        click(By.name("update"));
    }
}
