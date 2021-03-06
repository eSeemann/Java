package ru.stqa.java.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.java.addressbook.model.ContactData;

/**
 * Created by eSeemann on 25.09.2017.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().goToHomePage();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Ewgeniz", "Seemann", "015209802143", "ewgeniyseemann@gmail.com", "test1"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Ewgeniz", "Seemann", "015209802143", "ewgeniyseemann@gmail.com", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
