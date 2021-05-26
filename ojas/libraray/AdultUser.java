package com.ojas.libraray;

import java.util.Calendar;
import java.util.Date;


public class AdultUser implements LibraryUser {

	int userId;
	String userName;
	private int age = 8;
	private String bookType = "kids";
	private boolean isBookReturned = true;
	Date dueDate;

	public boolean isBookReturned() {
		return isBookReturned;
	}

	public void setBookReturned(boolean isBookReturned) {
		this.isBookReturned = isBookReturned;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getBookType() {
		return bookType;
	}

	protected void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public void registerAccount() {
		if (getAge() > 12) {
			System.out.println("You have successfully registered under an Adult  Account");
		} else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void requestbook() {
		if (getAge() > 8 && getBookType() == BookCategory.FICTION.name() && isBookReturned) {
			System.out.println("Book Issued successfully, please return the book within 10 day");
			Calendar c = Calendar.getInstance();
			Date currentDate = new Date();
			c.setTime(currentDate);
			c.add(Calendar.DATE, 10); // same with c.add(Calendar.DAY_OF_MONTH, 1);
			System.out.println("Due date : " + c.getTime());

			setDueDate(c.getTime());

		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}

	}

	@Override
	public void name() {
		// TODO Auto-generated method stub

	}

}
