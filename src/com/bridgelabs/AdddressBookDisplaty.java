package com.bridgelabs;

import java.util.Scanner;

public class AdddressBookDisplaty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter details seperated by enter in this sequance :[Book, firstName, lastName, address, city, state , email,zip, phonenumber]:");

		
		String bookName = sc.nextLine();
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		String address = sc.nextLine();
		String city = sc.nextLine();
		String state = sc.nextLine();
		String email = sc.nextLine();
		sc.nextLine();
		int zip = sc.nextInt();
		long number = sc.nextLong();
		

		ContactDetailStore mukul = new ContactDetailStore(bookName, firstName, lastName, address, city, state, zip, number, email);
		System.out.println(mukul);
		System.out.println("Enter the 1 to edit your name and 2 to exit ");
		int input = sc.nextInt();
		if(input==1) {
		      mukul.editWithName(firstName,lastName);
		}else{
			
		}
		System.out.println(mukul);
	}

}
