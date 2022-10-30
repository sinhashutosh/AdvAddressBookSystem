package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ContactOperation {
    static String firstName;
    static String lastName;
    static String city;
    static String state;
    static String zip;
    static String phoneNumber;
    static String email;
    static Scanner sc = new Scanner(System.in);
    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getCity() {
        return city;
    }

    public static String getState() {
        return state;
    }

    public static String getZip() {
        return zip;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static String getEmail() {
        return email;
    }




    public static void addContact(HashMap contactHashMap) {
        System.out.println("Enter address book Name");
        String addressBookName = sc.next();
        System.out.println("Enter First Name ");
        firstName = sc.next();
        contactHashMap.values().stream().forEach(p -> {
            if (p.equals(firstName)) {
                System.out.println("Contact Already Exists");
                return;
            }
        });
        System.out.println("Enter Last Name ");
        lastName = sc.next();
        System.out.println("Enter City ");
        city = sc.next();
        System.out.println("Enter State ");
        state = sc.next();
        System.out.println("Enter Pin Code");
        zip = sc.next();
        System.out.println("Enter Mobile Number");
        phoneNumber = sc.next();
        System.out.println("Enter Email Id");
        email = sc.next();
        if (contactHashMap.containsKey(addressBookName)) {
            System.out.println("AddressBookName Already exists");
            System.out.println("Enter Another Name Which is not Available in following list");
            System.out.println(contactHashMap.keySet());
            addressBookName = sc.next();
            contactHashMap.put(addressBookName, new Contacts(firstName, lastName, city, state, zip, phoneNumber, email));
        } else {
            contactHashMap.put(addressBookName, new Contacts(firstName, lastName, city, state, zip, phoneNumber, email));
        }

    }

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
                    return;
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

    public void searchByCity(HashMap<String,Contacts> contactHashMap) {
        System.out.println("Enter the City Whose Person Detail You Want To Search");
        String requirdCity = sc.next();
        List listByCity = contactHashMap.values().stream().filter(p->p.city.equals(requirdCity)).collect(Collectors.toList());

        if (listByCity.isEmpty()) {
            System.out.println("No Such contact Found");
            return;
        } else {
            System.out.println(listByCity);
        }
    }

    public void searchByState(HashMap<String,Contacts> contactHashMap) {
        System.out.println("Enter the State Whose Person Detail You Want To Search");
        String requirdState = sc.next();
        List listByState = contactHashMap.values().stream().filter(p->p.state.equals(requirdState)).collect(Collectors.toList());

        if (listByState.isEmpty()) {
            System.out.println("No Such contact Found");
            return;
        } else {
            System.out.println(listByState);
        }
    }
}
