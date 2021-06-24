package com.bekzodkeldiyarov.secondTask;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addContact(String phoneNumber, String name) {
        phoneBook.put(phoneNumber, name);
    }

    public void getContact(String name) {
        for (Map.Entry<String, String> contact : phoneBook.entrySet()) {
            if (name.equals(contact.getValue())) {
                System.out.println("Phone number of " + contact.getValue() + " is " + contact.getKey());
            }
        }
    }

}
