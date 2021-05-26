package com.ojas.studentSubjects;


public class HistoryStudent extends Student2 {
	
	public int historymarks;
	public int civicsmarks;

	
	@Override
	void getPersent() {
		
		int total = historymarks+civicsmarks;
		double percent = total/2;
		System.out.println("History Student Percentage :"+percent);
}


	public HistoryStudent() {
		super();
	}


	public HistoryStudent(int historymarks, int civicsmarks) {
		super();
		this.historymarks = historymarks;
		this.civicsmarks = civicsmarks;
	}

}
