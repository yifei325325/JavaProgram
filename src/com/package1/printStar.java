package com.package1;
/*
 * 打印金字塔型星星
 * */

public class printStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print_Star(5);

	}

	public static void print_Star(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
