package kr.co.jsh.test.steam.bytearray;

import java.io.*;

public class UseByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream("C:\\dev\\test.txt");
			
			byte[] bytes = new byte[10];
			
			while(true) {
				int read = fileInputStream.read(bytes);
				
				if(read == -1) break;
				
				String getData = new String(bytes,0,read);
				System.out.println(getData);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
