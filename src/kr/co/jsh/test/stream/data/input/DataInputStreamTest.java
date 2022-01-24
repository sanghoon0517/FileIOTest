package kr.co.jsh.test.stream.data.input;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strPath = "C:\\dev\\testDataOutput.txt";
		
		DataInputStream dataInputStream = null;
		
		try {
			dataInputStream = new DataInputStream(new FileInputStream(strPath));
			
			int bytesLength = "Test Data Stream".getBytes().length;
			byte[] bytes = new byte[bytesLength];
			int read = dataInputStream.read(bytes);
			
			String getStrData = new String(bytes, 0, read);
			System.out.println(getStrData);
			
			String getStrData1 = dataInputStream.readUTF();
			String getStrData2 = dataInputStream.readUTF();
			
			System.out.println(getStrData1);
			System.out.println(getStrData2);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dataInputStream != null) {
					dataInputStream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
