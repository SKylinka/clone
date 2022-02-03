package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHalper extends HelperBase {

    public GroupHalper(ChromeDriver driver) {
        super(driver);
    }

    public void returnToGroupe() {
        click(By.linkText("group page"));
    }

    public void sumbitGroupeCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupeCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupeModification() {   click(By.name("edit")); }

    public void sumbitGroupeModification() {  click(By.name("update"));
    }
}
