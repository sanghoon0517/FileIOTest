package kr.co.jsh.test.stream.reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strPath = "C:\\dev\\testOutputStream.txt";
		
		InputStreamReader inputStreamReader = null;
		
		BufferedReader bufferedReader = null; //test하기 위해 추가
		
		try {
			inputStreamReader = new InputStreamReader(new FileInputStream(strPath), "UTF-8");
			
			while(true) {
				//reader로 읽어들였을시
				int read = inputStreamReader.read();
				if(read == -1) break;
				char readChar = (char) read;
				System.out.print(readChar);
			}
			
			System.out.println();
			//버퍼로 테스트
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(strPath), "UTF-8"));
			
			while(true) {
				//버퍼로 읽어들였을 시
				String strData = bufferedReader.readLine();
				if(strData == null) break;
				System.out.println(strData);
			}
			
			//버퍼로 테스트2
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(strPath), "UTF-8"));
			while(true) {
				int read = bufferedReader.read();
				if(read == -1) break;
				char readChar = (char) read;
				System.out.print(readChar);
			}
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(inputStreamReader != null) {
					inputStreamReader.close();
				}
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
