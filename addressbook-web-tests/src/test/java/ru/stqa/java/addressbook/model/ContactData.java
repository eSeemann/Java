package ru.stqa.java.addressbook.model;

public class ContactData {
    private final String vorname;
    private final String nachname;
    private final String handy;
    private final String mailto;
    private String group;

    public ContactData(String vorname, String nachname, String handy, String mailto, String group) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.handy = handy;
        this.mailto = mailto;
        this.group = group;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getHandy() {
        return handy;
    }

    public String getMailto() {
        return mailto;
    }

    public String getGroup() {
        return group;
    }
}
