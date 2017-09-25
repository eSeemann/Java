package ru.stqa.java.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ru.stqa.java.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {

        app.goToHomePage();
        app.initNewContact();
        app.fillContactForm(new ContactData("Ewgeniz", "Seemann", "015209802143", "ewgeniyseemann@gmail.com"));
        app.submitContactCreation();
        app.returnToHomePage();
    }

   }
