package ru.stqa.pft.addressbook.tests;// Generated by Selenium IDE

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHalper().createGroupe(new GroupData("test5", null, null));
    }

}
