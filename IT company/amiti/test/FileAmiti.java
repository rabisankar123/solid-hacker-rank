package com.amiti.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileAmiti {
	public static void main(String[] args) {
		File file=new File("E:/desktop/file.txt");
		
		FileWriter fw=null;
		try {
			file.createNewFile();
			fw=new FileWriter(file);
			fw.write("1.Byte 2.short");
			System.out.println("file write");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				fw.flush();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
