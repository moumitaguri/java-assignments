package com.step.assignments;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<>();


    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void store(Contact contactToStore) {
        contacts.add(contactToStore);
    }

    public void remove(Contact contactToRemove) {
        contacts.remove(contactToRemove);

    }

//    public Contact getContact(Contact contact) {
//
//        return contacts.get(contacts.indexOf(contact));
//    }

//    public Contact query(Contact contactToFind) {
//
//        if (contactExists(contactToFind)) {
//            contactToFind.printContact();
//        }
//        System.out.println("contact does not exist");
//        return null;
//
//    }

    public Contact find(String name){
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)){
                return contacts.get(i);
            }
        }
        return null;
    }


    public void updateName(Contact contactToModify, String name) {
        contactToModify.modifyName(name);
    }

    public void updateNumber(Contact contactToModify, int contactNumber) {
        contactToModify.modifyNumber(contactNumber);
    }

//    public boolean contactExists(Contact contact) {
//        return contacts.contains(contact);
//    }

}


