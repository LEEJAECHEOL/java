package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

public class MyServerSocket3 {
	
	private ServerSocket serverSocket;
	private Socket socket;
	Vector<SocketThread> vc;
	
	public MyServerSocket3() {
		try {
			serverSocket = new ServerSocket(10000);
			vc = new Vector<>();
			
			while(true) {
				System.out.println("client wating!!....");
				socket = serverSocket.accept();	// 데몬 (리스닝)
				System.out.println("요청 성공함!!...");
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 키보드로부터 입력받은 후 쓰는 스레드
	class SocketThread extends Thread {
		
		private Socket socket;
		private String id;
		private BufferedReader reader;
		private PrintWriter writer;
		
		public SocketThread(Socket socket) {
			this.socket = socket;
		}
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream(), true);
				String line = null;
				while((line = reader.readLine()) != null) {
					System.out.println("from client : " + line);
					for(SocketThread socketThread : vc) {
						socketThread.writer.println(line);
						socketThread.writer.flush();
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new MyServerSocket3();
	}

}
