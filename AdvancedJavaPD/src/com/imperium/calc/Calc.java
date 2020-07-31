package com.imperium.calc;

public class Calc {

	public static void main(String[] args) {
		String name = "Name: Tom Cruise";
		String dob = "Born: July 3, 1962 in Syracuse, New York, USA";
		String height = "Height: 5' 7\" (1.7 m)";
		String spouse = "Katie Holmes, (18 November 2006 - 20 August 2012) ( divorced) ( 1 child)";
		String title = "Mission: Impossible 7	 Date:  2021";
		String salary = "Taps (1981)	$50,000,000 Gobbledigook";
		
		System.out.println(cleanSalary(salary));
		/*System.out.println(
				cleanName(name) + ", " + 
				cleanBday(dob) + ", " + 
				cleanHeight(height) + ", " + 
				cleanSpouse(spouse)
				);*/
	}
	
	//method to cut out only the actual name from the line
	public static String cleanName(String name) {
		return name.substring(6);
	}
	
	public static String cleanBday(String dob) {
		return dob.substring(6, dob.indexOf(" in"));
	}
	
	public static String cleanHeight(String height) {
		return height.substring(height.indexOf("(")+1,height.indexOf(" m"));
	}
	
	public static String cleanSpouse(String spouse) {
		int i = spouse.indexOf(",");
		if (i != -1) {
			spouse = spouse.substring(0,i);
		}
		return spouse;
	}

	public static String cleanMovieTitle(String title) {
		int i = title.indexOf("Date:");
		if (i != -1) {
			title = title.substring(0, i);
		}
		return title.trim();
	}
	
	public static String cleanSalary(String salary) {
		int start = salary.indexOf("$");
		
		if (start != -1) {
			String temp = salary.substring(start);
			int end = temp.indexOf(" ");
			
			if (end != -1) { //     substring start @ 0 includes title, @ start only dollar amount
				salary = salary.substring(start, (start + end));
			}
		}
		else {
			salary = salary +"$0";
		}
		return salary;
	}
	
}
