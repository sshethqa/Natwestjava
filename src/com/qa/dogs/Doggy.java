package com.qa.dogs;

public class Doggy {

	public static void whileLoop() {
		int dogs = 0;
		boolean notEnoughDogs = true;

		while (notEnoughDogs) {
			System.out.println("gimme dog");
			dogs++;
			System.out.println("Dogs = " + dogs);
			if (dogs == 15) {
				notEnoughDogs = false;
			}
		}
	}

	public static void doWhile() {
		int dog = 0;
		boolean notEnoughDogs = true;

		do {
			System.out.println("gimme dog");
			dog++;
			System.out.println("Dogs = " + dog);
			if (dog == 15) {
				notEnoughDogs = false;
			}
		} while (notEnoughDogs);
	}

	
	
	public static void whileLoop2() {
		int iceCream = 0;
		boolean notEnoughIceCream = true;
		System.out.println("---whileloop---");

		while (notEnoughIceCream) {
			System.out.println("have an icecream");
			iceCream++;
			System.out.println("Icecreams eaten = " + iceCream);
			if (iceCream == 10) {
				System.out.println("limit reached");
				notEnoughIceCream = false;
			}

		}
	}}
	
	
////	public static void doWhile2() {
//		System.out.println("---doWhileLoop---");
//		int iceCream = 0;
//		boolean notEnoughIceCream = true;
//		
//		
//		do {
//			System.out.println("have an icecream");
//			
//		}
//	
//}
