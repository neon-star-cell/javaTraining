package com.ibm.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		try (FileReader in = new FileReader("file1.txt")) {
			try (FileWriter out = new FileWriter("file3.txt")) {
				byte c;

				while ((c = (byte) in.read()) != -1) {
					out.write(c);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}