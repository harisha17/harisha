package com.sonata.IOExample;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResource {
	
	private static void printFile() throws IOException {
	    FileInputStream input = new FileInputStream("D:\\testout.txt");
	    try(input) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    }
	}

	public static void main(String[] args) throws IOException{
		TryWithResource.printFile();
	}

}
