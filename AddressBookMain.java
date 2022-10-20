package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        System.out.println("Welcome Address Book");
        List<Contacts> list = new ArrayList<>();

        while (true) {
            choice = availableChoice();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    Contacts contacts;
                    System.out.println("Enter First Name ");
                    String firstName = sc.next();
                    System.out.println("Enter Last Name ");
                    String lastName = sc.next();
                    System.out.println("Enter City ");
                    String city = sc.next();
                    System.out.println("Enter State ");
                    String state = sc.next();
                    System.out.println("Enter Pin Code");
                    String zip = sc.next();
                    System.out.println("Enter Mobile Number");
                    String phonenumber = sc.next();
                    System.out.println("Enter Email Id");
                    String email = sc.next();
                    list.add(new Contacts(firstName, lastName, city, state, zip, phonenumber, email));
                    break;
                case 2:
                    System.out.println(list);
                    break;
                case 3:
                    System.out.println("Enter First Name of Contact whose detail you want to edit");
                    String tempName = sc.next();
                    editContact(tempName, list);

            }
        }
    }

    private static void editContact(String tempFirstName, List<Contacts> list) {
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

    public static int availableChoice() {
        System.out.println("Enter Your Choice ");
        System.out.println("0. exit.");
        System.out.println("1. Add New Contact.");
        System.out.println("2. View Contact.");
        System.out.println("3. Edit Contact");
        return sc.nextInt();
    }
}
