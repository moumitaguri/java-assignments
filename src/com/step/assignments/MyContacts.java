package com.step.assignments;

import java.util.Scanner;

public class MyContacts {
    public static MobilePhone myPhone = new MobilePhone();
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        while (!quit) {
            printInstructions();
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 0:
                    printListOfContacts();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContactName();
                    break;
                case 3:
                    updateContactNumber();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();

                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    private static void updateContactNumber() {
        System.out.println("Type contact name you want to update");
        String name = scanner.nextLine();

        Contact contact = myPhone.find(name);
        if (contact != null) {
            System.out.println("Type new number for the contact");
            int modifiedNumber = scanner.nextInt();
            System.out.println("old version : " + contact.printContact());

            myPhone.updateNumber(contact, modifiedNumber);
            System.out.println("1 contact is modified in your list");
            System.out.println("modified version : " + contact.printContact());

            return;
        }
        System.out.println("contact does not exist in your list");

    }

    private static void updateContactName() {
        System.out.println("Type contact name you want to update");
        String name = scanner.nextLine();


        Contact contact = myPhone.find(name);
        if (contact != null) {
            System.out.println("Type new name for the contact");
            String modifiedName = scanner.nextLine();

            System.out.println("old version : " + contact.printContact());

            myPhone.updateName(contact, modifiedName);
            System.out.println("1 contact is modified in your list");
            System.out.println("modified version : " + contact.printContact());
            return;
        }
        System.out.println("contact does not exist in your list");

    }

    private static void removeContact() {
        System.out.println("Type contact name you want to remove");
        String name = scanner.nextLine();

        Contact contact = myPhone.find(name);
        if (contact != null) {
            myPhone.remove(contact);
            System.out.println("1 contact is deleted from your list");
            return;
        }
        System.out.println("contact does not exist in your list");

    }


    private static void findContact() {
        System.out.println("Type contact name you want to search");
        String name = scanner.nextLine();

        Contact contact = myPhone.find(name);
        if (contact != null) {
            System.out.println(contact.printContact());
            return;
        }
        System.out.println("contact does not exist in your list");


    }


    private static void addContact() {
        Contact contact = new Contact();

        System.out.println("Enter number of the contact");
        contact.setContactNumber(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Enter name of the contact");
        contact.setName(scanner.nextLine());

        myPhone.store(contact);
        System.out.println("1 contact is added to your contact list");
        System.out.println("new contact : " + contact.printContact());
    }

    private static void printListOfContacts() {

        if (myPhone.getContacts().isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        myPhone.getContacts().forEach(contact -> System.out.println((contact.printContact())));
    }

    private static void printInstructions() {
        System.out.println("Enter 0 to get the list of contacts ");
        System.out.println("Enter 1 to add a contact");
        System.out.println("Enter 2 to update a contact name");
        System.out.println("Enter 3 to update a contact number");
        System.out.println("Enter 4 to remove a contact");
        System.out.println("Enter 5 to search for a contact");
        System.out.println("Enter 6 to quit");

    }


}
