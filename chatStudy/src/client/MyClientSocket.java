package client;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket {

	private Socket socket;
	
	
	public MyClientSocket() {
		try {
			socket = new Socket("172.17.70.92", 10000);
			
			// 키보드로 부터 입력을 받아서
			Scanner sc = new Scanner(System.in);
			// 소켓에 버퍼 달기(쓰기)
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			
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
		new MyClientSocket();
	}

}
