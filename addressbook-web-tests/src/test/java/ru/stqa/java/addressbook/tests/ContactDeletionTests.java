package ru.stqa.java.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.goToHomePage();
        app.selectContact();
        app.deleteSelectedContact();
    }


}
