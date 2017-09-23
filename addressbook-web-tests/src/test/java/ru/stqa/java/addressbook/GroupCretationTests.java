package ru.stqa.java.addressbook;

import org.testng.annotations.Test;

public class GroupCretationTests extends TestBase {

    @Test
    public void testGroupCretation() {

        gotoGroupPage();
        initNewGroup();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
