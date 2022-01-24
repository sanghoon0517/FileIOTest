package kr.co.jsh.test.stream.buffered.writer;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strPath = "C:\\dev\\testBufferedWriter.txt";
		
		BufferedWriter bufferedWriter = null;
		
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(strPath));
			
			bufferedWriter.write('b');
			bufferedWriter.write('u');
			bufferedWriter.write('f');
			bufferedWriter.write('f');
			bufferedWriter.write('e');
			bufferedWriter.write('r');
			bufferedWriter.write('e');
			bufferedWriter.write('d');
			bufferedWriter.write('w');
			bufferedWriter.write('r');
			bufferedWriter.write('i');
			bufferedWriter.write('t');
			bufferedWriter.write('e');
			bufferedWriter.write('r');
			bufferedWriter.write(' ');
			bufferedWriter.write('t');
			bufferedWriter.write('e');
			bufferedWriter.write('s');
			bufferedWriter.write('t');
			bufferedWriter.write('\n');
			
			String strData = "BufferedWriter String test. ♥♥♥\n";
			bufferedWriter.write(strData);
			
			char[] charData = "Char Type Data Test - BufferedWriter".toCharArray();
			
			bufferedWriter.write(charData);
			
			//남은 데이터 털어내기
			bufferedWriter.flush();
			
			Desktop.getDesktop().open(new File(strPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(bufferedWriter != null) {
						bufferedWriter.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
				

	}

}
