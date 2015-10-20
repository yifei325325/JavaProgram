/**
 * Scanner 类的学习
 */
package com.oct.twth;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入第一个整数： ");
		Scanner scanner1 = new Scanner(System.in);
		int firstInt = scanner1.nextInt();
		System.out.println("请输入第二个整数： ");
		Scanner scanner2 = new Scanner(System.in);
		int secInt = scanner2.nextInt();
		int result = firstInt+secInt;
		System.out.println(firstInt+"+"+secInt+"="+result);
		

	}

}
