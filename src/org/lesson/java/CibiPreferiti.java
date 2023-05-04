package org.lesson.java;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] arr = {"Pizza", "Pasta", "Torta", "Biscotti", "Frutta", "Pane", "Cioccolato"};
		
		int arrLength = arr.length;
		System.out.println("L'array è composto da " + arrLength + " elementi");
		
		System.out.println("Il cibo presente in prima posizione è: " + arr[0]);
		
		System.out.println("Il cibo presente in ultima posizione è: " + arr[arrLength - 1]);
		
		if(arrLength % 2 == 0) {
			System.out.println("Il cibo presente a metà classifica è: " + arr[(arrLength / 2) - 1]);
		}
		else {
			System.out.println("Il cibo presente a metà classifica è: " + arr[arrLength / 2]);
		}
		
	}
}
