package com.ojas.accountCustomer;

class Customer {
	private String firstName;
	private String secondName;

	Customer() {
		System.out.println("Default Constructor");
	}

	public Customer(String firstName, String secondName) {
		this();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", secondName=" + secondName + "]";
	}

}

class Account {
	Customer customer;
	int accountNo;
	double balance = 0;
	float intrest;

	void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		if (amount < balance) {
			balance -= amount;
			System.out.println("Account balance = " + balance);
		} else {
			System.out.println("Not Sufficent balance.");
		}
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + ", accountNo=" + accountNo + ", balance=" + balance + ", intrest="
				+ intrest + "]";
	}

}

public class Account_Customer {
	public static void main(String[] args) {
		Customer customer = new Customer("Prasad", "Hotur");
		Account account = new Account();
		account.accountNo = 101;
		account.balance = 10000;
		account.intrest = 2;
		account.customer = customer;
		System.out.println(account.toString());

		account.deposit(45000);
		account.withdraw(5000);

		System.out.println(account.toString());

	}

}
