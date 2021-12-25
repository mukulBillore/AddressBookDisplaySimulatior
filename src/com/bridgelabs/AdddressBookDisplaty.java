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
		double number = sc.nextDouble();
		

		ContactDetailStore mukul = new ContactDetailStore(bookName, firstName, lastName, address, city, state, zip, number, email);
		System.out.println(mukul);
	}

}
