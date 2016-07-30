package com.package1;

/*
 * 冒泡排序
 * 
 * */
public class Bubble {
	public static void main(String args[]) {
		int a[] = { 1, 54, 25, 8, 9, 25, 81, 24, 41, 2457, 1245, 751, 112, 457, 33, 638, 979, 613, 31064, 646 };
		int tmp = 0;
		for (int j = 0; j < a.length; j++) {

			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					tmp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = tmp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
