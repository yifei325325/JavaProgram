/**
 * Scanner ���ѧϰ
 */
package com.oct.twth;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������һ�������� ");
		Scanner scanner1 = new Scanner(System.in);
		int firstInt = scanner1.nextInt();
		System.out.println("������ڶ��������� ");
		Scanner scanner2 = new Scanner(System.in);
		int secInt = scanner2.nextInt();
		int result = firstInt+secInt;
		System.out.println(firstInt+"+"+secInt+"="+result);
		

	}

}
