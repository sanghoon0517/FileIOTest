package kr.co.jsh.test.stream.buffered.input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strPath = "C:\\dev\\test.txt";
		
		BufferedInputStream bufferedInputStream = null;
		
		try {
			bufferedInputStream = new BufferedInputStream(new FileInputStream(strPath));
			
			byte[] bytes = new byte[100] ;
			while(true) {
				int read = bufferedInputStream.read(bytes);
				if(read == -1) break;
				
				String getData = new String(bytes, 0, read);
				System.out.print(getData);
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(bufferedInputStream != null) {
						bufferedInputStream.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
