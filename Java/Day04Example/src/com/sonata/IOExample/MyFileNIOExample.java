package com.sonata.IOExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MyFileNIOExample {

	public static void main(String[] args) {
		
		Path path = Paths.get("D:\\testout.txt");
		try {
		    List<String> lines = Files.readAllLines(path);
		    
		    for(String s: lines) {
		    	System.out.println(s);
		    }
		} catch (IOException e) {
		    // something failed
		   e.printStackTrace();
			//System.out.println(e);
		}
	}

}
