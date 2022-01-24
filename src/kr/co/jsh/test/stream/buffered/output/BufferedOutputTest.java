package kr.co.jsh.test.stream.buffered.output;

import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strPath = "C:\\dev\\test2.txt";
		
		BufferedOutputStream bufferedOutputStream = null;
		
		try {
			bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(strPath));
			bufferedOutputStream.write('t');
			bufferedOutputStream.write('e');
			bufferedOutputStream.write('s');
			bufferedOutputStream.write('t');
			bufferedOutputStream.write(' ');
			bufferedOutputStream.write('b');
			bufferedOutputStream.write('u');
			bufferedOutputStream.write('f');
			bufferedOutputStream.write('f');
			bufferedOutputStream.write('e');
			bufferedOutputStream.write('r');
			bufferedOutputStream.write('e');
			bufferedOutputStream.write('d');
			bufferedOutputStream.write('\n');
			
			bufferedOutputStream.write("bufferedOutputStream Test 중입니다.".getBytes());
			
			Desktop.getDesktop().open(new File(strPath));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(bufferedOutputStream != null) {
						bufferedOutputStream.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
				

	}

}
