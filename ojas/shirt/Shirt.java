package com.ojas.shirt;

public class Shirt {
	
	float collarSize;
	float length;
	Enum material;
	
	public Shirt() {
		collarSize = 0;
		length = 0;
		material = ShirtMaterial.COTTON;
	}

	public Shirt(float collarSize, float length, Enum material) {
		super();
		this.collarSize = collarSize;
		this.length = length;
		this.material = material;
	}
	
	public String displayDetails() {
		return "Shirt [collarSize=" + collarSize + ", length=" + length + ", material=" + material + "]";
	}

}
