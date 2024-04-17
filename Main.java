package Project;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("\nWelcome to Online Movie Ticket Booking System......:)");
		SignUp obj = new SignUp();
		System.out.println("\nSelect option for Register/Login: " + "\n1.Register \n2.Login");
		obj.signup(sc.next());
		Ticket t = new Ticket();
		Seating s = new Seating();
		t.BookingSummary();
		Payment p = new Payment();
		t.m1();

	}

}