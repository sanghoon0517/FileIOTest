package kr.co.jsh.test.stream.piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PipedInputStream pipedInputStream = new PipedInputStream();
		PipedOutputStream pipedOutputStream = new PipedOutputStream();
		
		Thread thread1 = new Thread() {
			public void run() {
				int count = 0;
				while(true) {
					try {
						Thread.sleep(1000);
						String strMsg = "쓰레드 실행 중 입니다 ["+count+"]";
						pipedOutputStream.write(strMsg.getBytes());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					count++;
				}
			}
		};
		thread1.start();
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				byte[] bytes = new byte[1024];
				while(true) {
					try {
						Thread.sleep(1000);
						int readData = pipedInputStream.read(bytes);
						String strReadData = new String(bytes, 0, readData);
						
						System.out.println(strReadData);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		thread2.start();

	}

}
