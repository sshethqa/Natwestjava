package com.qa.Arrays;

import java.util.ArrayList;

public class ArraysEx {

	public static void arrayEx1() {

		int[] values = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		System.out.println(values.length);

		for(int count=0;count<values.length;count++) {
			System.out.println(values[count]);
		}

	}
	
	public static void arrayEx2() {
		
		ArrayList<Integer> values2 = new ArrayList<>();
		
		for(int count=0;count<10;count++) {
			
			values2.add(count*2);
			System.out.println(values2);
			
		}

	}
	
	public static void arrayEx3() {
		
		ArrayList<Integer> values3 = new ArrayList<>();
		
		
	}
}
