package com.ojas.student;

public class Student {
	
	int studentId;
	String name;
	double examFee;
	
	public String displayDetails() {
		return name;
		
	}
	public double payFee(double amount) {
		return examFee;
		
	}
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	public Student() {
		super();
	}
	
	
}
