package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket2 {

	private Socket socket;
	private Scanner sc;
	private BufferedWriter writer;
	private BufferedReader reader;
	
	public MyClientSocket2() {
		try {
			socket = new Socket("172.17.70.92", 10000);
			
			// 키보드로 부터 입력을 받아서
			sc = new Scanner(System.in);
			// 소켓에 버퍼 달기(쓰기)
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					String input = null;
					try {
						while((input = reader.readLine()) != null) {
							System.out.println("서버로 부터 온 메시지 : " + input);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
			
			// 메인 스레드는 키보드로 부터 입력을 받은 뒤 클라이언트 소켓에 전송
			while(true) {
				String input = sc.nextLine();
				// 서버에 전송
				writer.write(input +"\n");
				writer.flush();
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new MyClientSocket2();
	}

}
