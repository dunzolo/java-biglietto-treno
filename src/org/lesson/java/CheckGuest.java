package org.lesson.java;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		String[] list = {
				"Dua Lipa", 
				"Paris Hilton", 
				"Manuel Agnelli", 
				"J-Ax", 
				"Francesco Totti", 
				"Ilary Blasi", 
				"Bebe Vio", 
				"Luis", 
				"Pardis Zarei", 
				"Martina Maccherone", 
				"Rachel Zeilic"
			};
		
		Scanner in = new Scanner(System.in);
		
		// chiedo all'utente di inserire il proprio nome
		System.out.println("Inserisci il tuo nome e cognome");
		String name_surname = in.nextLine();
		
		boolean check = false;
		
		// controllo se il nome è presente in lista
		for(int i = 0; i < list.length; i++) {
			// controllo riducendo tutto a caratteri minuscoli
			if(name_surname.toLowerCase().contentEquals(list[i].toLowerCase())) {
				check = true;
				System.out.println("OK! Presente");
			}
		}
		
		int i = 0;
		
//		while(i < list.length) {
//			// controllo riducendo tutto a caratteri minuscoli
//			if(name_surname.toLowerCase().contentEquals(list[i].toLowerCase())) {
//				check = true;
//				System.out.println("OK! Presente");
//			}
//			i++;
//		}
		
		do {
			// controllo riducendo tutto a caratteri minuscoli
			if(name_surname.toLowerCase().contentEquals(list[i].toLowerCase())) {
				check = true;
				System.out.println("OK! Presente");
			}
			i++;
			
		} while (i < list.length);
		
		// se non è presente
		if(!check) {
			System.out.println("Mi spiace il tuo nome non è presente in lista!");
		}
		
		in.close();
	}
}
