package com.bekzodkeldiyarov.secondTask;

public class PhoneBookTest {
    public void start() {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("1631840778298", "Thomas Burgess");
        phoneBook.addContact("18325800559", "Donald Schneider");
        phoneBook.addContact("1810993061", "Gail King");
        phoneBook.addContact("917336511412", "Mary Davidson");
        phoneBook.addContact("7290071064", "Ashley Beck");
        phoneBook.addContact("39374114775", "Dan Wilkins");
        phoneBook.addContact("06265536544293", "Ronald Figueroa");
        phoneBook.addContact("171434554265", "Christine Jones");
        phoneBook.addContact("752904517177", "Dan Wilkins");

        phoneBook.getContact("Dan Wilkins");

    }
}
