package com.ojas.student;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new DaysScholar(1, "Prasad", 12000.0000d, 500.0000d);
		Student s2 = new Hosteller(2, "suresh", 13000.000d, 600.000d);
		
		System.out.println(s1.displayDetails());
		System.out.println("Total :"+s1.payFee(13000.0000d));
		
		
		System.out.println(s2.displayDetails());
		System.out.println("Total :"+s2.payFee(13000.0000d));

	}

}
