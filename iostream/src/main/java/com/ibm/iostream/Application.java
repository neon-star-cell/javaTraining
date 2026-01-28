package com.ibm.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application
{
	public static void main( String[] args )
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("file1.txt");
			out = new FileOutputStream("file2.txt");
			byte c;
			
			while((c = (byte)in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}