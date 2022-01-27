package com.sonata.IOExample;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FileInputStreamOne {

	public static void main(String[] args) throws IOException {
		//Writing of the file
		
		FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
        fout.write(65);    
        fout.close();    
        System.out.println("success...");    
        
        //read the same file from the stream.
        File data = new File("D:\\testout.txt");  
        FileInputStream  file = new FileInputStream(data);  
        FilterInputStream filter = new BufferedInputStream(file);  
        int k =0;  
        while((k=filter.read())!=-1){  
            System.out.print((char)k);  
        }  
        file.close();  
        filter.close();  
        
        
	}

}
