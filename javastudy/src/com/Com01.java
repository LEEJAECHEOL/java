package com;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Com01 {

	public static void main(String[] args) {
		try {
			// 1. 주소 설정 URL 클래스 사용
			URL url = new URL("https://www.naver.com");
			
			// 2. 버퍼연결을 위해 스트림에 접근
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			
			// 3. 버퍼 연결 (8192 byte)
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			String input = null;
			String download = "";
			while((input = br.readLine()) != null){
				download += input;
			}
			FileWriter fw = new FileWriter("/Users/lee/Desktop/index.html");
			fw.write(download);
			System.out.println(download);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
