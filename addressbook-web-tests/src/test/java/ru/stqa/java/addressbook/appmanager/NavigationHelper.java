package ru.stqa.java.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.java.addressbook.model.ContactData;
import ru.stqa.java.addressbook.model.GroupData;

/**
 * Created by eSeemann on 25.09.2017.
 */
public class NavigationHelper {

    FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void goToHomePage() {
        wd.get("http://localhost/addressbook/");
    }
}
