package com.bridgelabs;

public class ContactDetailStore {
	String Book;
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int  zip;
	double phonenumber ;
	@Override
	public String toString() {
		return "ContactDetailStore [Book=" + Book + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phonenumber=" + phonenumber
				+ ", email=" + email + "]";
	}
	String email;
	public ContactDetailStore(String book, String firstName, String lastName, String address, String city, String state,
			int zip, double phonenumber, String email) {
		super();
		Book = book;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phonenumber = phonenumber;
		this.email = email;
	}
	
}
