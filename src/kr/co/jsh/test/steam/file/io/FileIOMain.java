package kr.co.jsh.test.steam.file.io;

import java.awt.Desktop;
import java.io.*;

public class FileIOMain {

	public static void fileCopy(File target, String destination) throws Exception {
		
		File destinationFile = new File(destination);
		boolean destExists = destinationFile.exists();
		
		if(destExists) {
			String showMsg = "이미 파일이 존재하여 복사할 수 없습니다.";
			throw new Exception(showMsg);
		}
		
		FileInputStream fileInputStream = new FileInputStream(target);
		FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);
		
		byte[] bytes = new byte[1024]; //1024 Bytes = 1 KBytes
		while(true) {
			int read = fileInputStream.read(bytes);
			if(read == -1) {
				break;
			}
			fileOutputStream.write(bytes, 0, read);
		}
		fileOutputStream.close();
		fileInputStream.close();
		
		Desktop.getDesktop().open(new File(destination));
	}
	
	public static void main(String[] args) {
		String targetPath = "C:\\dev\\test.txt";
		String destinationPath = "C:\\dev\\fileIOTest\\test.txt";
		
		try {
			fileCopy(new File(targetPath), destinationPath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
