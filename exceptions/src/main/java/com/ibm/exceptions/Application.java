package com.ibm.exceptions;

class IllegalAgeExecption extends Exception {
	@Override
	public String getMessage() {
		return "You need to be 18 or above to register for voting";
	}
}

class Voting {
	void register(int age) throws IllegalAgeExecption {
		if(age < 18) {
			throw new IllegalAgeExecption();
		}
	}
}

public class Application
{
	public static void main( String[] args )
	{
		Voting voting = new Voting();
		try {
			voting.register(17);
		} catch (IllegalAgeExecption exception) {
			exception.printStackTrace();
		}
		
		System.out.println("The End");
	}
}