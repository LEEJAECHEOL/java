package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class GetWeather {

	public static void main(String[] args) {
		try {
			// 1. 주소 설정 URL 클래스 사용
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%82%A0%EC%94%A8");
			
			// 2. 버퍼연결을 위해 스트림에 접근
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			
			// 3. 버퍼 연결 (8192 byte)
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			String input = null;
			String download = "";
			while((input = br.readLine()) != null){
				download += input;
			}
			
//			int index = download.indexOf("todaytemp");
//			String temp = download.substring(index + 11, index+ 15);
//			int index2 = temp.indexOf("<");
//			System.out.println(temp.substring(0, index2));
			
			Document doc = Jsoup.parse(download);
			Elements temp = doc.select(".todaytemp");
			System.out.println(temp.get(0).text());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
