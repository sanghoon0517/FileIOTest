package kr.co.jsh.test.stream.writer;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strPath = "C:\\dev\\testOutputStream.txt";
		
		OutputStreamWriter outputStreamWriter = null;
		
		try {
			outputStreamWriter = new OutputStreamWriter(new FileOutputStream(strPath), "UTF-8");
			outputStreamWriter.write("OutputStreamWriter Test 중입니다..\n");
			outputStreamWriter.append("append()메소드를 이용한 문자열 추가..");
			
			Desktop.getDesktop().open(new File(strPath));
			
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
				if(outputStreamWriter != null) {
					outputStreamWriter.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
