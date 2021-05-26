package com.ojas.studentSubjects;

public abstract class Student2 {
	public String studentname;
	public String studentclass;
	protected static int totalNoOfStudents;
	
	public Student2() {
		super();
	}

	public Student2(String studentname, String studentclass) {
		super();
		this.studentname = studentname;
		this.studentclass = studentclass;
	}
	
	abstract  void getPersent();
	
	static void getTotalNoOfstudents() {
		
	}

}
