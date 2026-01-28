package com.ibm.lambdas;

import java.util.Arrays;
import java.util.List;

interface Printer {
	void printing(String printerName, int count);
}

class Process {
	public void execute(String printerName, int count, Printer printer) {
		printer.printing(printerName, count);
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
//		Process process = new Process();
//		process.execute(new Printer() {
//			public void printing() {
//				System.out.println("Printing");
//			}
//		});
		
//		process.execute("HP", 5, (printerName, count) -> System.out.println(printerName + " printer printing " + count + " pages."));
//		process.execute("Canon", 10, Application::printIt);
//		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		list.forEach(number -> System.out.println(number));
		
		list.forEach(System.out::println);
		
		list.stream()
					.map(element -> String.valueOf(element))
					.forEach(System.out::println);
		
		list.stream()
					.map(String::valueOf)
					.forEach(System.out::println);
		
		System.out.println(list.stream()
									.reduce(0, (total, element) -> Integer.sum(total, element)));
		
		System.out.println(list.stream()
									.reduce(0, Integer::sum));
	}

	public static void printIt(String name, int count) {
		System.out.println(name + " printer printing " + count + " pages.");
	}
}