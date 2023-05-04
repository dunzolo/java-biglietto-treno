package org.lesson.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Chiedere all'utente di inserire il numero di km da percorrere
		System.out.println("Indicare il numero di km che si vuole percorrere");
		Integer userKm = in.nextInt();
		
		System.out.println("Km " + userKm);
		
		// chiedere all'utente la propria età
		System.out.println("Indicare l'età del passeggero");
		Integer userAge = in.nextInt();
		
		System.out.println("Età " + userAge);
		
		// dichiarazione variabili
		float tariffa = 0.21f;
		float sconto = 0.00f;
		float prezzoKm = 0.00f;
		String prezzoTotale = null;
		
		//calcolo prezzo al km
		prezzoKm = tariffa * userKm;
		
		//calcolo il prezzo del biglietto in base all'età del passeggero
		if(userAge < 18) {
			sconto = prezzoKm * 0.2f;
			prezzoKm = prezzoKm - sconto;
			prezzoTotale = String.format("%.2f", prezzoKm);
			System.out.println("Prezzo del biglietto: " + prezzoTotale + "€");
		} else if( userAge > 65) {
			sconto = prezzoKm * 0.4f;
			prezzoKm = prezzoKm - sconto;
			prezzoTotale = String.format("%.2f", prezzoKm);
			System.out.println("Prezzo del biglietto: " + prezzoTotale + "€");
		} else {
			prezzoTotale = String.format("%.2f", prezzoKm);
			System.out.println("Prezzo del biglietto: " + prezzoKm + "€");
		}
		
		in.close();
	}
}
