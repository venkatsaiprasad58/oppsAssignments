package com.ojas.studentAccessmodifier;

//StudentAccessModifiers
public class Student1 {

	public int studentId;
	public String studentName;
	private int marks;
	private char grade;

	public Student1()
	{
		studentId = 0;
		studentName = null;
		marks = 0;
		grade = ' ';
	}

	public Student1(int studentId, String studentName, int marks) 
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		calculateGrade();
	}

	private void calculateGrade() {

		if (marks > 90) {
			grade = 'A';
		} else if (marks > 80 && marks <= 90) {
			grade = 'B';
		} else if (marks > 70 && marks <= 80) {
			grade = 'C';
		} else if (marks > 60 && marks <= 70) {
			grade = 'D';
		} else {
			grade = 'E';
		}
	}

	public String displayDetails() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", grade="
				+ grade + "]";
	}
	
	public static void main(String[] args) {
		Student1 s = new Student1(101,"prasad",75);
		System.out.println(s.displayDetails());
	}

	
}
