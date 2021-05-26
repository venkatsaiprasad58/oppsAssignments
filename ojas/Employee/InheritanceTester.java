package com.ojas.Employee;

public class InheritanceTester {

	public static void main(String[] args) {
		Manager manager = new Manager("Ramu", 101, 25000, ManagerType.HR);
		System.out.println(manager.toString());
		Clerk clerk = new Clerk("Krish", 103, 2500, 70, 80);
		System.out.println(clerk.toString());
		clerk.setAcuuracy(90);
		clerk.setSalary();
		System.out.println(clerk.toString());
	}

}
