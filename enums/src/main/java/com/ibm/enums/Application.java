package com.ibm.enums;

import com.ibm.enums.types.Apples;

public class Application
{
	public static void main( String[] args )
	{
		Apples apple;
		apple = Apples.KASHMIRI;
		System.out.println(apple);
		
		Apples[] apples = Apples.values();
		
		for(Apples currApple: apples) {
			System.out.println("Price of " + currApple + " Apple: " + currApple.getPrice());
		}
	}
}