package ru.stqa.java.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by eSeemann on 25.09.2017.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));
    }


    public void goToHomePage() {
        if (isElementPresent(By.id("maintable"))){
            return;
        }
        wd.get("http://localhost/addressbook/");
    }
}
