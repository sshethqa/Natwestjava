package com.qa.Arrays;

public class Arrays {

	public static void arrayExample() {

		String[] names = {"Kal", "Tom", "Marvin", "Pam"};

		System.out.println(names[3]);

		// Column 0 1 2 3
		// Row 0 Kal Tom Marvin Pam

		int[] primeNumbs = {"2", "3", "5", "7", "11", "13"};
	
			System.out.println(primeNumbs[5]);

		int[][] coolNumbs = { { "12", "16", "22" }, { "48", "60" } };

		System.out.println(coolNumbs[0][1]);

	}

}
