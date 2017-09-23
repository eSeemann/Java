package ru.stqa.java.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.java.addressbook.model.GroupData;

public class GroupCretationTests extends TestBase {

    @Test
    public void testGroupCretation() {

        app.gotoGroupPage();
        app.initNewGroup();
        app.fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
