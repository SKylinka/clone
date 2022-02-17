package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHalper().isThereAGroup()) {
            app.getGroupHalper().createGroupe(new GroupData("test5", null, null));
        }
        app.getGroupHalper().selectGroup();
        app.getGroupHalper().initGroupeModification();
        app.getGroupHalper().fillGroupForm(new GroupData("test5", "test6", "test7"));
        app.getGroupHalper().sumbitGroupeModification();
        app.getGroupHalper().returnToGroupe();
    }

}
