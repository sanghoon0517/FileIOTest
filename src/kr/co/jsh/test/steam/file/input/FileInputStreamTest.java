package kr.co.jsh.test.steam.file.input;

import java.io.*;

public class FileInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		FileReader	fileReader = null;
		
		try {
			fileInputStream = new FileInputStream("C:\\dev\\test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
