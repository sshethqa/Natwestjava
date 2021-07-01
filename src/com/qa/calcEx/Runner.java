package com.qa.calcEx;

public class Runner {
	
	//main the ctrl+space then hit enter
	public static void main(String[] args) {
		
		// sysout the ctrl+space
		
		System.out.println(Calculator.add(15, 7)); 
		
		System.out.println(Calculator.div(15, 3));
		
		System.out.println(Calculator.mul(30, 2));
		
		System.out.println(Calculator.sub(60, 20));
		
		System.out.println(Calculator.div2(10, 3));
		
		System.out.println(Calculator.div3(5, 3));
		
		System.out.println("Remainder1 = " + Calculator.remainder(5, 2));
		
		System.out.println("Remainder2 = " + Calculator.remainder2(16));
	
	}
	
}

// to terminate other 'Runners', right click 'Run as' and click 'Java Application'