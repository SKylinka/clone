package ru.stqa.pft.addressbook.tests;// Generated by Selenium IDE

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {




  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHalper().isThereAGroup()) {
      app.getGroupHalper().createGroupe(new GroupData("test5", null, null));
    }
    app.getGroupHalper().selectGroup();
    app.getGroupHalper().deleteSelectedGroups();
    app.returnToGroupPage();
  }

}
