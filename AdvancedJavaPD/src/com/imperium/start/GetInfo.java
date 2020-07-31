package com.imperium.start;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.imperium.calc.Calc;
import com.imperium.model.Stars;

public class GetInfo
{
	public static List<Stars>getInfo() {
		
		File file = new File("StarsList");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		List <Stars> stars = new ArrayList<Stars>();
		
		while(sc.hasNext()) {
			Stars s = new Stars();
			String header = sc.nextLine();
			String temp, name, dob, height;
			
			//set the name of the star
			temp = sc.nextLine();
			name = Calc.cleanName(temp);
			s.setName(name);
			
			//set the DOB of the star
			temp = sc.nextLine();
			dob = Calc.cleanBday(temp);
			s.setDob(dob);
			
			//set the height of the star
			temp = sc.nextLine();
			height = Calc.cleanHeight(temp);
			s.setHeight(height);
			
			//set list of spouses
			String spousesHeader = sc.nextLine();
			int count = 0;
			List <String> sp = new ArrayList<String>();
			while(count == 0) {
				String st = sc.nextLine();
				if(st.contains("List of Movies")) {
					count++;
				}
				else {
					st = Calc.cleanSpouse(st);
					sp.add(st);
				}
			}
			s.setSpouses(sp);
			
			count = 0;
			List <String> movies = new ArrayList<String>();
			while(count == 0) {
				String st = sc.nextLine();
				if(st.contains("Reported Salary")) {
					count++;
				}
				else {
					st = Calc.cleanMovieTitle(st);
					movies.add(st);
				}
			}
			s.setCurrentProjects(movies);
			
			count = 0;
			List <String> salary = new ArrayList<String>();
			while(count == 0) {
				String st = sc.nextLine();
				if(st.contains("End Record")) {
					count++;
				}
				else {
					st = Calc.cleanSalary(st);
					salary.add(st);
				}
			}
			s.setSalary(salary);
			
			//System.out.println(s.getCounter());
			
			stars.add(s);
		}
		for(Stars s : stars) {
			//System.out.print(s.getCounter() + "\t");
			System.out.println("Name:     " + s.getName() + "\t");
			/*System.out.println("DOB:      " + s.getDob() + "\t");
			System.out.println("Height:   " + s.getHeight() + "\t");
			System.out.println("Sp/Exes:  " + s.getSpouses() + "\t");
			System.out.println("Films:    " + s.getCurrentProjects() + "\t");
			*/System.out.println("Salaries: " + s.getSalary());
			System.out.println();
		}
		return stars;
	}
}
