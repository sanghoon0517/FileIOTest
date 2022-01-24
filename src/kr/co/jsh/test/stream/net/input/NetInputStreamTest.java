package kr.co.jsh.test.stream.net.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream  inputStream = null;
		BufferedReader bufferedReader = null;
		
		try {
			URL url = new URL("http://www.google.co.kr");
			URLConnection urlConnection = url.openConnection();
			inputStream = urlConnection.getInputStream();
			
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
			
			while(true) {
				String urlData = bufferedReader.readLine();
				if(urlData == null) break;
				System.out.println(urlData);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(inputStream != null) inputStream.close();
				if(bufferedReader != null) bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
