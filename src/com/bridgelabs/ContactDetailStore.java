package com.bridgelabs;

import java.util.Scanner;

public class ContactDetailStore {
	String Book;
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	long phonenumber;
	String email;

	@Override
	public String toString() {
		return "ContactDetailStore [Book=" + Book + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phonenumber=" + phonenumber
				+ ", email=" + email + "]";
	}

	public void editWithName(String firstName, String lastName) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first name for aurthorisation");
		String firstNameToCheck = sc.nextLine();
		System.out.println("enter your last name for aurthorisation");
		String lastNameToCheck = sc.nextLine();
		System.out.println(firstName + firstNameToCheck + lastName + lastNameToCheck);
		if (firstName.equals(firstNameToCheck) && lastName.equals(lastNameToCheck)) {
			int toBreakLoop=1;
			while (toBreakLoop==1) {
		System.out.println("to change enter 1 for book , 2 for first Name , 3 for last name  , 4 for adress change , 5 for city change , 6 for state change, 7 for zip change , 8 for phone number , 9 for email and 10 to exit and save changes :  ");
				int input = sc.nextInt();
				switch (input) {
				case 1 :
					System.out.println("enter book name");
						this.Book = sc.nextLine();
						break;
				case 2 :
					System.out.println("enter first name");
					firstName = sc.nextLine();
					break;
				case 3 :	
					System.out.println("enter  last name ");
					lastName = sc.nextLine();
					break;
				case 4:	
					System.out.println("enter address");
					address = sc.nextLine();
					break;
				case 5:	
					System.out.println("enter city");
					city = sc.nextLine();
					break;
				case 6:	
					System.out.println("enter state");
					state = sc.nextLine();
					break;
				case 7:
					System.out.println("enter zip");
					zip = sc.nextInt();
					break;
				case 8:
					System.out.println("enter number");
					phonenumber = sc.nextLong();
					break;
				case 9:
					System.out.println("enter email ");
					email = sc.nextLine();
					break;
				case 10	:
					System.out.println("your details is modified ");
					input=0;
				default :
					break ;
				}
			}

		} else {
			System.out.println("you entered the incorrect name");
		}
	}

	public ContactDetailStore(String book, String firstName, String lastName, String address, String city, String state,
			int zip, long phonenumber, String email) {
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
