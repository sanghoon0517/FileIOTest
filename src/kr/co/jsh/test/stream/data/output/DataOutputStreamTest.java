package kr.co.jsh.test.stream.data.output;

import java.awt.Desktop;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strPath = "C:\\dev\\testDataOutput.txt";
		
		DataOutputStream dataOutputStream = null;
		
		try {
			dataOutputStream = new DataOutputStream(new FileOutputStream(strPath));
			
			byte[] bytes = "Test Data Stream".getBytes();
			dataOutputStream.write(bytes);
			
			String strData = "데이타스트림 테스트 중입니다.(String 버전) UTF-8메소드\n";
			dataOutputStream.writeUTF(strData);

			String strData2 = "데이타스트림 테스트 중입니다.(String 버전) just write()메소드";
			dataOutputStream.writeUTF(strData2);
//			String strData2 = "데이타스트림 테스트 중입니다.(String 버전) just write()메소드";
//			dataOutputStream.write(strData2.getBytes());
			
			dataOutputStream.flush();
			
			Desktop.getDesktop().open(new File(strPath));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputStream != null) {
					dataOutputStream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
				
		

	}

}
