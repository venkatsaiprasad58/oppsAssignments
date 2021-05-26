package com.ojas.studentSubjects;


public class ScienceStudent extends Student2 {
	
		public int physicsMarks;
		public int chemistryMarks;
		public int mathsMarks;
		
		public ScienceStudent() {
			super();
		}
	
		public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks) {
			super();
			this.physicsMarks = physicsMarks;
			this.chemistryMarks = chemistryMarks;
			this.mathsMarks = mathsMarks;
		}
	
		@Override
		void getPersent() {
	
			int total = physicsMarks+chemistryMarks+mathsMarks;
			double percent= total/3;
			System.out.println("Science Student Percentage : "+ percent);
			
		}
	}
