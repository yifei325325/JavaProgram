/**
 * ѧϰjava���쳣����
 */
package com.oct.twetythird;
import java.io.*;
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.��ͼ��һ�������ڵ��ļ�
		try {
			FileReader fr = new FileReader("d:\\first1.html");
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
