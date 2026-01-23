package com.ibm.thread;

class Runner implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The current thread is " + Thread.currentThread());
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}

public class Application
{
	public static void main( String[] args )
	{
		Runner runner = new Runner();
		Thread producer = new Thread(runner, "Producer");
		Thread consumer = new Thread(runner, "Consumer");
//		System.out.println(producer);
//		System.out.println(producer.getState());
		
		producer.start();
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		System.out.println(producer.getState());

//		try {
//		System.out.println("The current thread is " + Thread.currentThread());
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println(producer.getState());
		System.out.println(consumer.getState());
		System.out.println("The End");
	}
}