package com.kh.IAddress.Pretice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PraticeAddress {

	public static void main(String[] args) {

		PraticeAddress PA = new PraticeAddress();
		
		
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
		
		
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println(localHost.getHostName());
		System.out.println(localHost.getHostAddress());
		
		byte[] ipAddress = address.getAddress();
		System.out.println(ipAddress);
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
