package org.lesson.java;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il numero di valori da valutare");
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
