package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int choice;
        System.out.println("Welcome Address Book");
        HashMap<String, Contacts> contactsHashMap = new HashMap<>();
        ContactOperation contacts = new ContactOperation();
        while (true) {
            choice = availableChoice();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    ContactOperation.addContact(contactsHashMap);
                    break;
                case 2:
                    System.out.println(contactsHashMap);
                    break;
                case 3:
                    System.out.println("Enter Address book name whose detail you want to edit");
                    String tempAddressBook = sc.next();
                    ContactOperation.editContact(tempAddressBook, contactsHashMap);
                    break;
                case 4:
                    System.out.println("Enter Address book name whose detail you want to remove");
                    String tempAddressBookName = sc.next();
                    ContactOperation.deleteContact(tempAddressBookName, contactsHashMap);
                    break;
                case 5:
                    searchBy(contactsHashMap);
                    break;
                case 6:
                    contacts.viewByCity(contactsHashMap);
                    break;
                case 7:
                    contacts.viewByState(contactsHashMap);
                    break;
                case 8:
                    contacts.getNumber(contactsHashMap);
                    break;
                case 9:
                    contacts.sort(contactsHashMap);
                    break;
                case 10:
                    contacts.vewAddressBook();
                    break;
                default:
                    System.out.println("Wrong Input!");
                    break;
            }
        }
    }

    private static void searchBy(HashMap<String, Contacts> contactHashMap) {
        System.out.println("Choose any number from (1-2) for searching");
        System.out.println("1. By City");
        System.out.println("2. By State");
        int choice = sc.nextInt();
        ContactOperation contactOperation = new ContactOperation();
        switch (choice) {
            case 1:
                contactOperation.searchByCity(contactHashMap);
                break;
            case 2:
                contactOperation.searchByState(contactHashMap);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }


    public static int availableChoice() {
        System.out.println("Enter Your Choice ");
        System.out.println("0. exit");
        System.out.println("1. Add New Contact");
        System.out.println("2. View Address Book");
        System.out.println("3. Edit Contact");
        System.out.println("4. Delete Contact");
        System.out.println("5. Searching");
        System.out.println("6. View Persion By City");
        System.out.println("7. View Persion By State");
        System.out.println("8. Get Person Mobile Number");
        System.out.println("9. Sorting by Person Name");
        System.out.println("10. View Address Book File");
        return sc.nextInt();
    }
}
