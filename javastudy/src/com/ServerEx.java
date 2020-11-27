package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			listener = new ServerSocket(9999);	// 소켓 생성
			System.out.println("연결을 기다리고 있습니다........");
			socket = listener.accept();	// 클라이언트로부터 연결 요청을 기다림
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));	// 입력 스트림
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	// 출력 스트림
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye연결로 연결을 종료하였습니다.");
					break;
				}
				System.out.println("클라이언트 : " + inputMessage);
				System.out.print("보내기 >> ");
				String outMessage = scanner.nextLine();
				out.write(outMessage + "\n");
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
		
	}
}
