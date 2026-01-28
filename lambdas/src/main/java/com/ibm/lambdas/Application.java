package com.ibm.lambdas;

interface Printer {
	void printing();
}

class Process {
	public void execute(Printer printer) {
		printer.printing();
	}
}

public class Application {
	public static void main(String[] args) {
//		Thread thread1 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println(Thread.currentThread());		
//			}
//		});
//		
//		thread1.start();
		Process process = new Process();
//		process.execute(new Printer() {
//			public void printing() {
//				System.out.println("Printing");
//			}
//		});
		
		process.execute(() -> System.out.println("HP printer printing"));

	}
}