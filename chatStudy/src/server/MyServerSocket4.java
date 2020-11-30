package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import com.google.gson.Gson;

import protocol.Chat;
import protocol.RequestDto;

public class MyServerSocket4 {
	private ServerSocket serverSocket;
	Vector<SocketThread> vc;	// 대기열(큐)

	public MyServerSocket4() {
		try {
			serverSocket = new ServerSocket(10000);
			vc = new Vector<>();
			
			while(true) {
				System.out.println("Request Wating ....");
				// 1. 새로운 소켓 생성 socket
				Socket socket = serverSocket.accept();
				System.out.println("Request Receive");
				// 2. 새로운 스레드 생성
				// 3. 새로운 스레드한테 socket 변수 넘기기
				SocketThread st = new SocketThread(socket);
				st.start();
				// 4. 새로운 스레드 자체를 vc에 담기
				vc.add(st);
			}
		} catch (Exception e) {
			System.out.println("Server Connect Error");
			e.printStackTrace();
		}
	}
	
	class SocketThread extends Thread {
		private Socket socket;
		private String id;
		private BufferedReader reader;
		private PrintWriter writer;
		
		public void setID(String id) {
			this.id = id;
		}

		public SocketThread(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream());
				
				String input = null;
				while((input = reader.readLine()) != null) {
					// 전체 메시지 보내기
					// Routing (라우팅 추가)
					Gson gson = new Gson();
					RequestDto dto = gson.fromJson(input, RequestDto.class);
					routing(dto);
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private void routing(RequestDto dto) {
			if(dto.getGubun().equals(Chat.ALL)) {
				for (int i = 0; i < vc.size(); i++) {
					if(vc.get(i) == this && vc.get(i).id == null) {
						vc.get(i).writer.println("아이디를 생성 후 메세지를 입력할 수 있습니다.\n 아이디 생성 방법(ID:사용할 아이디)");
						vc.get(i).writer.flush();
						break;
					}
					if(vc.get(i) != this) {
						vc.get(i).writer.println(id + "-->" + dto.getMsg());
						vc.get(i).writer.flush();
					}
				}
			} else if(dto.getGubun().equals(Chat.MSG)){
				String tempId = dto.getId();
				String tempMsg = dto.getMsg();
				boolean check = false;
				for (int i = 0; i < vc.size(); i++) {
					if(vc.get(i).id == null) {
						check = true;
						break;
					}
					if(vc.get(i).id.equals(tempId)) {
						vc.get(i).writer.println(id+"-->"+ tempMsg);
						vc.get(i).writer.flush();
					}
				}
				if(check) {
						this.writer.println("상대방의 아이디가 없습니다.");
						this.writer.flush();
				}
			} else if(dto.getGubun().equals(Chat.ID)) {
				String tempId = dto.getMsg();
				setID(tempId);
			} 
		}
	}
	public static void main(String[] args) {
		new MyServerSocket4();
	}

}
