package ru.stqa.java.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by eSeemann on 25.09.2017.
 */
public class NavigationHelper extends BaseHelper {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void goToHomePage() {
        wd.get("http://localhost/addressbook/");
    }
}
