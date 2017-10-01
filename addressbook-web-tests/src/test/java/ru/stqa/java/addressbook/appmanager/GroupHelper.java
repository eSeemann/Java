package ru.stqa.java.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.java.addressbook.model.GroupData;

/**
 * Created by eSeemann on 25.09.2017.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void initNewGroup() {
        click(By.name("new"));
    }

    public void deleteSelectedGroup() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

}
