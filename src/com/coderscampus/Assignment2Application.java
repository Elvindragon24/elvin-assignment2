package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		int secretNumber = random.nextInt(100) + 1;
		int attempts = 5;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 100");
		
		while (true) {
			try {
				System.out.println("Enter your guess: ");
				int guess = scanner.nextInt();
				attempts++;
			if (guess < secretNumber) {
				System.out.println("Try a higher number.");
			} else if (guess > secretNumber) {
				System.out.println("Try a lower number.");
			} else {
				System.out.println("You win!");
			} 
			}catch (java.util.InputMismatchException e) {
				 System.out.println("Your guess is not between 1 and 100. Please try again.");
				 scanner.next();
			 }
			}

	}
}
