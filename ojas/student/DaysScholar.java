package com.ojas.student;


public class DaysScholar extends Student {
	double TransportFee;
	public DaysScholar() 
	{
		double TransportFee = 0.00d;
	}

	public DaysScholar(int StudentId, String name, double examfee, double TransportFee)
	{
		super(StudentId, name, examfee);
		this.TransportFee = TransportFee;
	}
	
	public String displayDetails()
	{
		return "DaysScholar [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", TransportFee=" + TransportFee + "]";
	}

	public double payFee(double amount)
	{
		return super.payFee(amount) + TransportFee;
	}
}
