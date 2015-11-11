/**
 * java socket±à³Ì Client¶Ë
 */
package com.a.h;
import java.net.*;
public class TalkClient {

	public static void main(String[] args) {
		String ss = null;
		try {
			ss = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(ss);
		String ssArray[] = ss.split("\\.");
//		String ssArray[] = ss.split("0");
//		for(int i=0;i<ssArray.length;i++){
//			System.out.println(ssArray[i]);
//		}
		System.out.println(ssArray[3]);
		
		String test = "helloworld";
		String s = test.substring(4,9);
		System.out.println(s);
	}

}
