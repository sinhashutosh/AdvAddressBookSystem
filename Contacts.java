package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    String firstName;
    String lastName;
    String city;
    String state;
    String zip;
    String phonenumber;
    String email;

    public Contacts(String firstName, String lastName, String city, String state, String zip, String phonenumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phonenumber = phonenumber;
        this.email = email;
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
