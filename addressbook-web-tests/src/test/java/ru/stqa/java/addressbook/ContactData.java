package ru.stqa.java.addressbook;

public class ContactData {
    private final String vorname;
    private final String nachname;
    private final String handy;
    private final String mailto;

    public ContactData(String vorname, String nachname, String handy, String mailto) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.handy = handy;
        this.mailto = mailto;
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
}
