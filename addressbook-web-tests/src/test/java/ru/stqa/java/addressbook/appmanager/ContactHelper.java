package ru.stqa.java.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.java.addressbook.model.ContactData;

/**
 * Created by eSeemann on 25.09.2017.
 */
public class ContactHelper {

    FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void returnToHomePage() {
        wd.findElement(By.linkText("home page")).click();
    }

    public void initNewContact() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void deleteSelectedContact() {
        wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
        wd.switchTo().alert().accept();
    }

    public void selectContact() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void initContactModification() {
        wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
    }

    public void submitContactModification() {
        wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();
    }

    public void submitContactCreation() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void fillContactForm(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getVorname());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getNachname());
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(contactData.getHandy());
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(contactData.getMailto());
    }
}
