package com.itns.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		//FileWriter fr=new FileWriter("hindi.txt");
		FileReader fis=new FileReader("hindi.txt");
		int i=fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}

	}

}
