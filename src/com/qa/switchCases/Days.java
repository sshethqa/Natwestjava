package com.qa.switchCases;

public class Days {

	public static String daysOfWeek(String today) {
		
		switch(today) {
		case "monday":
			System.out.println("mondays suck");
			break;
		case "tuesday":
			System.out.println("tuesday is meh");
			break;
		case "wednesday":
			System.out.println("wednesday is half way");
			break;
		case "thursday":
			System.out.println("thursday can smell the weekend");
			break;
		case "friday":
			System.out.println("friday nearly there");
			break;
		case "saturday":
			System.out.println("saturday is a winner");
			break;
		case "sunday":
			System.out.println("sunday relax day");
			break;
		default: 
			System.out.println("invalid option");
		}
		return null;
	}
	
	public static String monthsOfYear(String month) {
	
		switch(month) {
		case "january":
			System.out.println("JAN");
		case "february":
			System.out.println("FEB");
		case "march":
			System.out.println("MAR");
		case "april":
			System.out.println("APR");
		case "may":
			System.out.println("MAY");
		case "june":
			System.out.println("JUN");
			break;
		case "july":
			System.out.println("JUL");
		case "august":
			System.out.println("AUG");
		case "september":
			System.out.println("SEP");
		case "october":
			System.out.println("OCT");
		case "november":
			System.out.println("NOV");
		case "december":
			System.out.println("DEC");
	}
		return null;
	}
}
