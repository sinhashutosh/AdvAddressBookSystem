package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ContactOperation {
    static Scanner sc = new Scanner(System.in);

    public static void editContact(String tempAddressBook, HashMap contactHashMap) {
        if (contactHashMap.size() > 0) {
            for (int i = 0; i < contactHashMap.size(); i++) {
                if (contactHashMap.containsKey(tempAddressBook)) {
                    Contacts contacts;
                    contacts = (Contacts) contactHashMap.get(tempAddressBook);
                    System.out.println("\nEnter the Field to Edit \n1.First Name \n2.Last Name \n3.City \n4.State \n5.Zip" +
                            "\n6.Phone Number \n7.Email ID");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter New First Name");
                            contacts.firstName = sc.next();
                            break;
                        case 2:
                            System.out.println("Enter New Last Name");
                            contacts.lastName = sc.next();
                            break;
                        case 3:
                            System.out.println("Enter New City");
                            contacts.city = sc.next();
                            break;
                        case 4:
                            System.out.println("Enter New State");
                            contacts.state = sc.next();
                            break;
                        case 5:
                            System.out.println("Enter New Zip Code");
                            contacts.zip = sc.next();
                            break;
                        case 6:
                            System.out.println("Enter New Phone Number");
                            contacts.phonenumber = sc.next();
                            break;
                        case 7:
                            System.out.println("Enter New Email Id");
                            contacts.email = sc.next();
                            break;
                        default:
                            System.out.println("Invalid Selection");
                            break;
                    }
                    contactHashMap.put(tempAddressBook, contacts);
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Contacts not Found...");
        }
    }

    public static void deleteContact(String tempFirstName, HashMap contactHashMap) {
        if (contactHashMap.containsKey(tempFirstName)) {
            contactHashMap.remove(tempFirstName);
        } else {
            System.out.println("No such Address Book found...");
        }
    }
}
