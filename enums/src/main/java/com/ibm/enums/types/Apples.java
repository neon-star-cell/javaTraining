package com.ibm.enums.types;

public enum Apples {
	
	
	ARBI(310),
	TELUGU(189),
	KASHMIRI(250),
	BIHARI(170),
	BENGALI(189);
	
	private int price;
	
	private Apples(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}
