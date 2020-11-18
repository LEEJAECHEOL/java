package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {

	public static void main(String[] args) {
		InputStream in = System.in;	// 문자를 하나받는데 아스키코드로 받
		InputStreamReader ir = new InputStreamReader(in); 	// 아스키 코드표를 문자 하나로 만듬 (char캐스팅)
		BufferedReader br = new BufferedReader(ir);		// 
		
		try {
			String data = br.readLine(); // 버퍼를 비워냄 readLine
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
