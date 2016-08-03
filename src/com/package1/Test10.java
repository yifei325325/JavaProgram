package com.package1;

/*
 * 一个数组有10个数字，使得每个数字都等于它的下标，并将数组的元素反向打印出来
 */
public class Test10 {
	public static void main(String args[]) {
		System.out.println("Before:");
		printArray(newArray(10));
		System.out.println("\nAfter:");
		reversArray(newArray(10));

	}

	// 生成数组
	public static int[] newArray(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		return a;
	}

	public static void printArray(int a[]) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + "  ");
		}
	}

	public static void reversArray(int a[]) {
		// 临时数组
		int temp[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			// 将原数组的每个值从后往前赋给临时数组
			temp[i] = a[a.length - 1 - i];
		}
		for (int j = 0; j < temp.length; j++) {
			// 打印出临时数组
			System.out.print(temp[j] + "  ");
		}
	}
}
