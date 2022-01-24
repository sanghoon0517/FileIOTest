package kr.co.jsh.test.stream.file.input;

import java.io.*;

public class FileInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		FileReader	fileReader = null;
		
		try {
			fileInputStream = new FileInputStream("C:\\dev\\test.txt");
			
			while(true) {
				int read = fileInputStream.read();
				if(read == -1) break;
				char readChar = (char) read;
				System.out.print(readChar);
			}
			
			fileReader = new FileReader("C:\\dev\\test.txt");
			while(true) {
				int read = fileReader.read();
				if(read == -1) break;
				char readChar = (char) read;
				System.out.print(readChar);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if(fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
				
	}

}
