package com.ojas.student;


public class Hosteller extends Student {
	double hostelFee;
	public Hosteller() 
	{
		double hostelFee = 0.00d;
	}

	public Hosteller(int StudentId, String name, double examfee, double hostelFee) 
	{
		super(StudentId, name, examfee);
		this.hostelFee = hostelFee;
		
	}
	
	public String displayDetails()
	{
		return "Hosteller [StudentId=" + studentId + ", name=" + name + ", examfee=" + examFee + ", hostelFee=" + hostelFee + "]";
	}
	
	public double payFee(double amount)
	{
		return hostelFee + super.payFee(amount);
	}
}
