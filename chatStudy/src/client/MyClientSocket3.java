package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket3 {

	private Socket socket;
	private Scanner sc;
	private BufferedReader reader;
	private PrintWriter writer;
	
	public MyClientSocket3() {
		try {
//			socket = new Socket("172.17.70.92", 10000);
			socket = new Socket("127.0.0.1", 10000);
			SocketThread st = new SocketThread();
			st.start();
			writer = new PrintWriter(socket.getOutputStream(), true);
			sc = new Scanner(System.in);
			
			while(true) {
				String input = sc.nextLine();
				writer.println(input);
				writer.flush();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	class SocketThread extends Thread {
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String line = null;
				while((line = reader.readLine()) != null) {
					System.out.println("from server : " + line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		new MyClientSocket3();
	}

}
