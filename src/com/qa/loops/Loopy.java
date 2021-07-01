package com.qa.loops;

public class Loopy {
	// for loop check starting position (count=0)
	// count ++ is basically whatever count equals +1
	// count>3 is basically how many times it runs. if count equals
	// 0, then count 0=1 is not >3, therefore will run again. so now
	// count= 1 +1, therefore 2 is not >3, and so on...
	public static void hello() {
		for(int count=0; count<3; count ++) {
			System.out.println("hello");
		}
	}
	
	public static void timesTable (int num) {
		for(int count=1; count<=10; count ++) {
			int out = num*count;
			System.out.println(num + " x " + count + " = " + out);
		}
	}

	public static void timesTable2(int num) {
		for(int count=1; count<=num;count++) {
			int out = num*count;
			System.out.println(num + " x " + count + " = " + out);
}
}
}
	