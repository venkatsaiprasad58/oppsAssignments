package com.ojas.studentSubjects;

import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Science Student Marks");
		System.out.println("==============================");

		System.out.println("Enter physics  Marks");
        int physicsMarks = sc.nextInt();
		System.out.println("Enter Science  Marks");
        int chimestryMarks = sc.nextInt();
		System.out.println("Enter Maths Student Marks");
		int mathsMarks = sc.nextInt();
		ScienceStudent ss = new ScienceStudent(physicsMarks,chimestryMarks,mathsMarks);
		ss.getPersent();
		
		System.out.println("Enter History Student Marks");
		System.out.println("==========================");
		System.out.println("History Marks");
		int historymarks = sc.nextInt();
		System.out.println("Civics Marks");
		int civicsmarks = sc.nextInt();
		HistoryStudent hs = new HistoryStudent(historymarks,chimestryMarks);
		hs.getPersent();
	}

}
