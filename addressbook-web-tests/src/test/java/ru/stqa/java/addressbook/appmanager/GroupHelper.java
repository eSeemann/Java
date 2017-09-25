package ru.stqa.java.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.java.addressbook.model.GroupData;

/**
 * Created by eSeemann on 25.09.2017.
 */
public class GroupHelper extends BaseHelper {

    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void initNewGroup() {
        wd.findElement(By.name("new")).click();
    }

    public void deleteSelectedGroup() {
        wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }
}
