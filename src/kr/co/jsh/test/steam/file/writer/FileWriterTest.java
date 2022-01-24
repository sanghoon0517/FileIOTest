package kr.co.jsh.test.steam.file.writer;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		
		String strFilePath = "C:\\dev\\testWriter.txt";
		
		try {
			fileWriter = new FileWriter(strFilePath);
			
			fileWriter.write((char)'t');
			fileWriter.write((char)'r');
			fileWriter.write((char)'a');
			fileWriter.write((char)'s');
			fileWriter.write((char)'h');
			fileWriter.write((char)' ');
			fileWriter.write((char)'l');
			fileWriter.write((char)'e');
			fileWriter.write((char)'c');
			fileWriter.write((char)'c');
			fileWriter.write((char)'t');
			fileWriter.write((char)'u');
			fileWriter.write((char)'r');
			fileWriter.write((char)'e');
			fileWriter.write((char)'\n');
			
			
			char[] cMsg = "FileWriter 공부 중.. write(char[] a)메소드 사용 toCharArray()사용..\n".toCharArray();
			fileWriter.write(cMsg);
			
			String strMsg = "공부 열심히 하자.";
			fileWriter.write(strMsg);
			
			Desktop.getDesktop().open(new File(strFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fileWriter != null) {
						fileWriter.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
