package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private String groupe;


    public ContactData(String firstname, String lastname, String groupe) {
        this.firstname = firstname;
        this.lastname = lastname;

        this.groupe = groupe;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }

    public String getGroupe() {
        return groupe;
    }
}
