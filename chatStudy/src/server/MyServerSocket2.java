package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServerSocket2 {
	
	private ServerSocket serverSocket;
	private Socket socket;
	private Scanner sc;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public MyServerSocket2() {
		try {
			serverSocket = new ServerSocket(10000);
			System.out.println("client wating!!....");
			socket = serverSocket.accept();	// 데몬 (리스닝)
			System.out.println("요청 성공함!!...");

			sc = new Scanner(System.in);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String input = null;
			
			Thread t1 = new Thread(new WriteThread());
			t1.start();
			
			while((input = reader.readLine() )!= null) {
				System.out.println("클라이언트 메시지 : " + input);
			}
			
			reader.close();
			writer.close();
			sc.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 키보드로부터 입력받은 후 쓰는 스레드
	class WriteThread implements Runnable{
		
		@Override
		public void run() {
			while(true) {
				String input = sc.nextLine();
				try {
					writer.write(input + "\n");
					writer.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	public static void main(String[] args) {
		new MyServerSocket2();
	}

}
