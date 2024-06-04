package org.lessons.java.security;

//import scanner class
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {

		//create a instance of scanner
		Scanner input = new Scanner(System.in);

		//init the variable and ask the user to put the value
		System.out.println("Inserisci il tuo cognome");
		String lastName = input.nextLine();
		System.out.println("Inserisci il tuo nome");
		String firstName = input.nextLine();
		System.out.println("Inserisci il tuo colore preferito");
		String color = input.nextLine();
		System.out.println("Inserisci il tuo giorno di nascita");
		byte day = input.nextByte();
		System.out.println("Inserisci il tuo mese di nascita");
		byte month = input.nextByte();
		System.out.println("Inserisci il tuo anno di nascita");
		short year = input.nextShort();

		//close the instance of scanner
		input.close();

		//sum day, month and year
		int sum = day + month + year;

		//display the generated "SUPERSECURE" password
		System.out.println(lastName + "-" + firstName + "-" + color + "-" + sum);
	}

}
