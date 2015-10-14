/**
 * 源码、反码、补码的练习
 * 1，正数的源码、反码、补码相同
 * 2，负数的源码首位是“1”，反码是除首位以外，其他位“1->0”,"0->1"。补码是反码+1
 * 3，负数的运算都是使用补码运算
 */
package com.oct.fourteenth;

public class FanMaBuMa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("~2 = "+(~2));
		System.out.println("~-5 = "+(~-5));
		System.out.println("-3^3= "+(-3^3));
		System.out.println("1>>2 = "+(1>>2));
		System.out.println("1<<2 = "+(1<<2));
		System.out.println("-1>>2 = "+(-1>>2));
		System.out.println("-1<<2 = "+(-1<<2));
		

	}

}
