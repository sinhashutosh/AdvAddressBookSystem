package org.example;

import java.util.Scanner;
public class Contacts {
    String firstName;
    String lastName;
    String city;
    String state;
    String zip;
    String phonenumber;
    String email;
    static Scanner sc = new Scanner(System.in);

    void insertDetails() {
        System.out.println("Enter First Name ");
        firstName = sc.next();
        System.out.println("Enter Last Name ");
        lastName = sc.next();
        System.out.println("Enter City ");
        city = sc.next();
        System.out.println("Enter State ");
        state = sc.next();
        System.out.println("Enter Pin Code");
        zip = sc.next();
        System.out.println("Enter Mobile Number");
        phonenumber = sc.next();
        System.out.println("Enter Email Id");
        email = sc.next();
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
