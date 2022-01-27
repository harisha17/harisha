package com.sonata.IOExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWithResource {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(
				"D:\\testout.txt"))) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
