package com.ibm.iostream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("./src/main/resources/ibm/bifile1.txt")))) {
			
			out.writeShort(12345);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}