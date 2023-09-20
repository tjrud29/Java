package com.kh.IAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressName {
	public static void main(String[] args) {
		InetAddressName inetMain = new InetAddressName();
		inetMain.InetSample();
		
		
		
	} 
	public void InetExam() {
		
		InetAddress address;
		try {
			address = InetAddress.getByName("www.naver.com");
			System.out.println("host name :" + address.getHostName());
			System.out.println("Ip Adress : " + address.getHostAddress());
			
			//현재 호스트(내 컴퓨터)의 InetAddress 객체 열기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local Ip Address : " + localHost.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void InetSample() {
		//호스트의 이름을 가져와서 객체 생성
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//IP주소를 byte 배열로 얻기
			//InetAddress 객체에서 IP주소를 바이트 배열로 얻음
			//IP 주소를 바이트 배열로 얻으면 각 바이트를 통해 IP주소를 다룰수 있음
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address bytes로 얻음");
			for(byte ip : ipAddress) {
				System.out.println(ip + ".");
				
				//도메인 명에 지정된 모든 호스트의 IP주소를 배열로 얻기
				InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
				System.out.println("구글에 지정된 모든 호스트의 아이피 주소를 배열로 얻음");
				for(InetAddress addr : alladdress) {
					System.out.println(addr.getHostAddress());
				}
			}
			//호스트 이름 얻기
			String hostName = address.getHostName();
			System.out.println("HOST Name :" +hostName);
			
			//지역 호스트의 IP주소 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local HOST address " + localHost.getHostAddress());
			
			//멀티 캐스트 주소 여부 확인
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("멀티캐스트 주소 입력값 : " + isMultiCast);
			
			//호스트 이름을 이용해서 InetAddress 객체 생성
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP주소 이름 : " + name.getHostAddress());
			
			//호스트의 완전한 이름 가져오기(전체 도메인 이름)
			//호스트의 정규화 된 (FQDN) 도메인의 이름을 얻음
			//FQDN : FULL Qualified Domain Name
			String hostFullName = name.getCanonicalHostName();
			System.out.println("풀네임 : " + hostFullName);
			
			
			
			//LookPack 주소 여부 확인
			boolean isLookPack = address.isLoopbackAddress();
			System.out.println("룩팩인가요 :" + isLookPack);
			
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	
	}

