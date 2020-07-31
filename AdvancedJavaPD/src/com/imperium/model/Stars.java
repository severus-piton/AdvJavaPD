package com.imperium.model;

import java.util.List;

public class Stars {
	static int counter = -1; // static makes this integer belong to the whole class, not just the objects
	
	String name;
	String dob;
	String height;
	
	List <String> spouses;
	List <String> currentProjects;
	List <String> salary;
	
	public Stars () {
		counter++;
	}

	public int getCounter() {
		return counter;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public List<String> getSpouses() {
		return spouses;
	}
	public void setSpouses(List<String> spouses) {
		this.spouses = spouses;
	}
	public List<String> getCurrentProjects() {
		return currentProjects;
	}
	public void setCurrentProjects(List<String> currentProjects) {
		this.currentProjects = currentProjects;
	}
	public List<String> getSalary() {
		return salary;
	}
	public void setSalary(List<String> salary) {
		this.salary = salary;
	}
	
	//this is the constructor
	
	//getters & setters
	
	
}
