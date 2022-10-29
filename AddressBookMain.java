package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        System.out.println("Welcome Address Book");
        HashMap<String, Contacts> contactsHashMap = new HashMap<>();

        while (true) {
            choice = availableChoice();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    ContactOperation contactsEntry = new ContactOperation();
                    contactsEntry.addContact(contactsHashMap);
                    break;
                case 2:
                    System.out.println(contactsHashMap);
                    break;
                case 3:
                    System.out.println("Enter Address book name whose detail you want to edit");
                    String tempAddressBook = sc.next();
                    ContactOperation contactOperation = new ContactOperation();
                    contactOperation.editContact(tempAddressBook, contactsHashMap);
                    break;
                case 4:
                    System.out.println("Enter Address book name whose detail you want to remove");
                    String tempAddressBookName = sc.next();
                    ContactOperation contactOperation1 = new ContactOperation();
                    contactOperation1.deleteContact(tempAddressBookName, contactsHashMap);
                    break;
            }
        }
    }


    public static int availableChoice() {
        System.out.println("Enter Your Choice ");
        System.out.println("0. exit.");
        System.out.println("1. Add New Contact.");
        System.out.println("2. View Contact.");
        System.out.println("3. Edit Contact");
        System.out.println("4. Delete Contact");
        return sc.nextInt();
    }
}
