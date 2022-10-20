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
            }
        }
    }

    public static int availableChoice() {
        System.out.println("Enter Your Choice ");
        System.out.println("0. exit.");
        System.out.println("1. Add New Contact.");
        System.out.println("2. View Contact.");
        return sc.nextInt();
    }
}
