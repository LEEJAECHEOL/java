package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import com.google.gson.Gson;

import protocol.RequestDto;

public class MyClientSocket4 {
	
	private Socket socket;
	private BufferedReader reader;
	private Scanner sc;
	private PrintWriter writer;
	
	public MyClientSocket4() {
		try {
			socket = new Socket("localhost", 10000);
			
			SocketThread st = new SocketThread();
			st.start();
			
			sc = new Scanner(System.in);
			writer = new PrintWriter(socket.getOutputStream(), true);	// 두번째 인자 값 true 넣으면 오토 flush()
			
			while(true) {
				//ALL : 안녕, MSG:ssar1:안녕
				String keyboard = sc.nextLine();
				// json으로 파싱
				RequestDto dto = new RequestDto();
				String[] gubun = keyboard.split(":");
				if(gubun.length == 2) {
					dto.setGubun(gubun[0]);
					dto.setMsg(gubun[1]);
				}else if(gubun.length == 3) {
					dto.setGubun(gubun[0]);
					dto.setId(gubun[1]);
					dto.setMsg(gubun[2]);
				}
				Gson gson = new Gson();
				String jsonData = gson.toJson(dto);
				writer.println(jsonData);
				writer.flush();
			}
			
		} catch (Exception e) {
			System.out.println("Connect Error");
			e.printStackTrace();
		}
	}
	
	class SocketThread extends Thread {
		
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String input = null;
				while((input = reader.readLine()) != null) {
					System.out.println(input);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new MyClientSocket4();
	}

}
