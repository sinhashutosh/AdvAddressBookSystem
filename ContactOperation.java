package org.example;

import java.util.List;
import java.util.Scanner;

public class ContactOperation {
    static Scanner sc = new Scanner(System.in);
    public static void editContact(String tempFirstName, List<Contacts> list) {
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).firstName.equals(tempFirstName)) {
                    System.out.println("\nEnter the Field to Edit \n 1.First Name \n2.Last Name \n3.City \n4.State \n5.Zip" +
                            "\n6.Phone Number \n7.Email ID");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter New First Name");
                            list.get(i).firstName = sc.next();
                            break;
                        case 2:
                            System.out.println("Enter New Last Name");
                            list.get(i).lastName = sc.next();
                            break;
                        case 3:
                            System.out.println("Enter New City");
                            list.get(i).city = sc.next();
                            break;
                        case 4:
                            System.out.println("Enter New State");
                            list.get(i).state = sc.next();
                            break;
                        case 5:
                            System.out.println("Enter New Zip Code");
                            list.get(i).zip = sc.next();
                            break;
                        case 6:
                            System.out.println("Enter New Phone Number");
                            list.get(i).phonenumber = sc.next();
                            break;
                        case 7:
                            System.out.println("Enter New Email Id");
                            list.get(i).email = sc.next();
                            break;
                        default:
                            System.out.println("Invalid Selection");
                            break;
                    }
                }
            }
        } else {
            System.out.println("Contacts not Found...");
        }
    }
    public static void deleteContact(String tempFirstName, List<Contacts> list) {
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).firstName.equals(tempFirstName)) {
                    list.remove(i);
                } else {
                    System.out.println("Contact Not Exists");
                }
            }
        } else {
            System.out.println("Contacts not Found...");
        }
    }
}
