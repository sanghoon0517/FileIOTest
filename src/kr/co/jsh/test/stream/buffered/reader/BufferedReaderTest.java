package kr.co.jsh.test.stream.buffered.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strPath = "C:\\dev\\test.txt";
		
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(strPath));
			
			while(true) {
				String reader = bufferedReader.readLine();
				if(reader == null) break;
				System.out.println(reader);
			}
					
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(bufferedReader != null) {
						bufferedReader.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
