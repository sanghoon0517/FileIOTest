package kr.co.jsh.test.stream.endecode;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class IncodingDecodingMain {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String strData = "한국";

		//받은 String값을 가지고 바이트코드의 배열 형태로 받아서 인자(arguments)를 통해 "인코딩한 바이트코드 배열"로 다시 리턴한다.
		//인코딩 인자를 적지 않으면 workspace에 적용된 인코딩 타입을 기본값으로 "인코딩"하여 바이트코드 배열을 리턴한다.
		byte[] defaultBytes =strData.getBytes();
		byte[] ms949Bytes =strData.getBytes("MS949");
		byte[] utf8Bytes =strData.getBytes("UTF-8");
		byte[] euckrBytes =strData.getBytes("EUC-KR");
		
		System.out.println("시스템설정방식 : "+Arrays.toString(defaultBytes));		
		System.out.println("MS949 : "+Arrays.toString(ms949Bytes));		
		System.out.println("UTF-8 : "+Arrays.toString(utf8Bytes));		
		System.out.println("EUC-KR : "+Arrays.toString(euckrBytes));
		
		//바이트코드 배열로 된 값을 String화 하면서 두번째 인자를 통해 "디코딩"한 바이트코드 배열로 다시 바꾸고, 해당 바이트코드 배열을 String객체를 통해 인스턴스를 생성한다.
		String strDataDefault = new String(defaultBytes);
		String strDataMs949 = new String(ms949Bytes, "MS949");
		String strDataUtf8 = new String(utf8Bytes, "UTF-8");
		String strDataEucKr = new String(euckrBytes, "EUC-KR");
		
		System.out.println("시스템설정방식 : "+strDataDefault);		
		System.out.println("MS949 : "+strDataMs949);		
		System.out.println("UTF-8 : "+strDataUtf8);		
		System.out.println("EUC-KR : "+strDataEucKr);		
	}

}
