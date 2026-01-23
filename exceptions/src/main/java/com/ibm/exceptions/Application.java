package com.ibm.exceptions;

public class Application
{
	public static void main( String[] args )
	{
		try {
			System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException exception) {
			System.out.println("You need to provide 2 valid numbers");
		} catch (ArithmeticException exception) {
			System.out.println("You can't divide by zero");
		} catch (Exception exception) {
			System.out.println("Unknown exception");
		}
		
		System.out.println("The End");
	}
}