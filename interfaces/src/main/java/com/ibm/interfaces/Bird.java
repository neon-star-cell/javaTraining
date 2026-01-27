package com.ibm.interfaces;

public class Bird implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Bird taking off");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird flying");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Bird landing");
	}

}
