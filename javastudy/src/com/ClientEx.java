package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 9999);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.print("보내기 >> ");
				String outMessage = scanner.nextLine();
				
				if(outMessage.equalsIgnoreCase("bye")) {
					out.write(outMessage + "\n");
					out.flush();
					break;
				}
				out.write(outMessage + "\n");
				out.flush();
				
				String inputMessage = in.readLine();
				System.out.println("서버 : " + inputMessage);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				scanner.close();
				if(socket != null)
					socket.close();
			} catch (IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
		
	}
}
