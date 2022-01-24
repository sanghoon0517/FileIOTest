package kr.co.jsh.test.steam.file.reader;

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		
		String strFilePath = "C:\\dev\\test.txt";
		
		try {
			fileReader = new FileReader(strFilePath);
			
			while(true) {
				int read = fileReader.read();
				if(read == -1) break;
				System.out.print((char) read);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fileReader != null) fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
