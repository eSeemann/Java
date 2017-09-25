package ru.stqa.java.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.java.addressbook.model.GroupData;

public class GroupCretationTests extends TestBase {

    @Test
    public void testGroupCretation() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initNewGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
