package com.qa.calcEx;

public class Calculator {

//Exercises
//Calculator Revisited
//Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller than the second, otherwise it prints out a message saying that the division cannot be performed.
//Results Revisited
//Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.
//
//Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.
//
//eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84
//
//they would have an overall grade of 85.3% (Pass)
//
//but in this case the student would fail because their physics grade is 54% (Fail)
//
//Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.

	public static int add(int a, int b) {
		int c = a + b;
		return c;

	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;

	}

	public static int mul(int a, int b) {
		int c = a * b;
		return c;

	}

// doing a division calculation will result in a rounding error unless you use "double" instead of "int" as int is a whole number.
	public static int div(int a, int b) {
		int c = a / b;
		return c;

	}

// 'double' parameter indicates that the decimal point needs to be shown
	public static double div2(double a, double b) {
		double c = a / b;
		return c;

	}
// Exercise 2

// Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller than the second, 
// otherwise it prints out a message saying that the division cannot be performed.

	public static double div3(double a, double b) {
		double c = 0;
		if (a < b) {
			c = a/b;
		} else {
			System.out.println("division cannot be performed");
		}
		return c;

	}

// % - modulus	
// 5%2 -> 1
	public static int remainder(int a, int b) {
		int c = a%b;
		return c;
	}
	
	
	public static int remainder2(int a) {
		int c = a%2;
		if(c==0) {
			System.out.println("'Even' because c is zero");
		}
			else { 
				System.out.println("'Odd' because c is not zero");
			}
		return c;

	}
	

}
