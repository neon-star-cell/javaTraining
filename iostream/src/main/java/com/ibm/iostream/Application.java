package com.ibm.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		try (FileReader inputStream = new FileReader("file1.txt");
				FileWriter outputStream = new FileWriter("file2.txt");) {
			int c;

			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}