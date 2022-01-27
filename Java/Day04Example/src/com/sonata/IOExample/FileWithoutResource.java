package com.sonata.IOExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWithoutResource {

	public static void main(String[] args) {
	   
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("D:\\SimpleJava.txt"));
			System.out.println(br.readLine());
		} catch (IOException e) {e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
