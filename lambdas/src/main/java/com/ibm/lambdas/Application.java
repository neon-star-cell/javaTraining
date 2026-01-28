package com.ibm.lambdas;

public class Application
{
	public static void main( String[] args )
	{
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread());		
			}
		});
		
		thread1.start();
	}
}