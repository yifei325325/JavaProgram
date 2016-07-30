package com.package1;
/*
 * 求出一个数组中的最大和最小值
 * */

public class maxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 17, 12, 54, 4, 14, 8, 7, 9, 514, 12, 7, 45, 78, 7, 1, 3, 6, 8 };
		int max = a[0];
		int min = a[0];
		for (int m = 0; m < a.length; m++) {
			if (a[m] > max) {
				max = a[m];
			}
			if (a[m] < min) {
				min = a[m];
			}
		}
		System.out.println("最大值是：" + max);
		System.out.println("最小值是：" + min);
	}

}
