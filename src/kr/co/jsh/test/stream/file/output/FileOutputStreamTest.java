package kr.co.jsh.test.stream.file.output;

import java.awt.Desktop;
import java.io.*;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fileOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream("C:\\dev\\testOut.txt");
			
			fileOutputStream.write((int) 'D');
			fileOutputStream.write((int) 'o');
			fileOutputStream.write((int) 'n');
			fileOutputStream.write((int) '\'');
			fileOutputStream.write((int) 't');
			fileOutputStream.write((int) ' ');
			fileOutputStream.write((int) 'l');
			fileOutputStream.write((int) 'i');
			fileOutputStream.write((int) 's');
			fileOutputStream.write((int) 't');
			fileOutputStream.write((int) 'e');
			fileOutputStream.write((int) 'n');
			fileOutputStream.write((int) ' ');
			fileOutputStream.write((int) 't');
			fileOutputStream.write((int) 'o');
			fileOutputStream.write((int) ' ');
			fileOutputStream.write((int) 't');
			fileOutputStream.write((int) 'h');
			fileOutputStream.write((int) 'i');
			fileOutputStream.write((int) 's');
			fileOutputStream.write((int) ' ');
			fileOutputStream.write((int) 'l');
			fileOutputStream.write((int) 'e');
			fileOutputStream.write((int) 'c');
			fileOutputStream.write((int) 't');
			fileOutputStream.write((int) 'u');
			fileOutputStream.write((int) 'r');
			fileOutputStream.write((int) 'e');
			fileOutputStream.write((int) '\n');
			
			String strData = "쓰레기 강의";
			
			byte[] sourceBytes = strData.getBytes("UTF-8");
			fileOutputStream.write(sourceBytes);
			
			Desktop.getDesktop().open(new File("C:\\dev\\testOut.txt"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
