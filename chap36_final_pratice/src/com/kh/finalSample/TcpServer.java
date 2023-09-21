package com.kh.finalSample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws Exception {
		int port =3333;
		ServerSocket server;
		server = new ServerSocket(port);
		System.out.println("서버가 포트" + port + "에서 실행 중입니다.");
		while(true) {
			Socket client = server.accept();
			System.out.println("클라이언트 접속:" + client.getInetAddress());
			client.close();
		}
	}
	
}	