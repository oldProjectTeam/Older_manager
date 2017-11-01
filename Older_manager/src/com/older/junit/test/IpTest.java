package com.older.junit.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {

	public static void main(String[] args) {
		InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String hostAddr = addr.getHostAddress();
		 System.out.println(hostAddr);
	}

}
