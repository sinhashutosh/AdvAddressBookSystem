package org.example;


public class AddressBookMain {
    public static void main( String[] args ) {
        System.out.println( "Welcome Address Book" );
        Contacts addDetail = new Contacts();
        addDetail.insertDetails();
        System.out.println();
        System.out.println(addDetail);
    }
}
