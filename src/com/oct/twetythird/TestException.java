/**
 * 学习java的异常处理
 */
package com.oct.twetythird;
import java.io.*;
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.试图打开一个不存在的文件
		try {
			FileReader fr = new FileReader("d:\\first1.html");
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
