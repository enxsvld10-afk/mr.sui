package model;

public class Student extends Person {
	private double gpa;
	
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
		
	}
	@Override 
	public String toString() {
		return name + " | GPA: " + gpa;
	}
	

}
