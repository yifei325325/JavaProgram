package com.package1;
/*
 * 一个数组中有10个数字，任意输入一个数字，检测该数字是否包含在数组中
 */

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 5, 89, 45, 12, 36, 98, 56, 12, 14, 12 };
		check(a, 12);
	}

	public static void check(int a[], int num) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				count++;
			}
		}
		if (count>=1){
			System.out.println("the num is in the Array! \nAnd there are "+count+" times");
		}else{
			System.out.println("the num is not in the Array!!!");
			
		}
	}
}
