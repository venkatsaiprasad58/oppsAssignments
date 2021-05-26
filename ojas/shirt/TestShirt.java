package com.ojas.shirt;

public class TestShirt {
	
	public static void main(String[] args) {
		Shirt t1 = new Shirt(2.00f, 5.00f, ShirtMaterial.POLYESTER);

		System.out.println(t1.displayDetails());

	}

}
