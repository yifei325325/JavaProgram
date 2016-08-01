package com.package1;
/*
 * 将一个n×n的数组沿着对角线反转
 * 
Before:
1	2	3	
4	5	6	
7	8	9	

After:
1	4	7	
2	5	8	
3	6	9
 * */
public class Test5 {

	public static void main(String args[]) {
		printArray(3);

	}

	public static void printArray(int n) {
		int a[][] = new int[n][n];
		// 填充数字
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				a[i - 1][j - 1] = j + (i - 1) * n;
			}
		}
		// 打印数字
		System.out.println("Before:");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(a[i - 1][j - 1] + "\t");
			}
			System.out.print("\n");
		}
		// 数组反转
		System.out.println("\nAfter:");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(a[j - 1][i - 1] + "\t");
			}
			System.out.print("\n");
		}
	}
}
