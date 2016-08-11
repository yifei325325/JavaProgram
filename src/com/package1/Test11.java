package com.package1;

/*
 * 向排序好的数组中插入一个数字，并使其在适当的位置
 * 
 */
/**
 * 
 * @author kenny.li
 * @version 1.0
 *
 */
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 21, 31, 41, 51, 100, 121, 455, 898 };
		insertNum(a, 899);
	}
	public static void insertNum(int a[], int num) {
		int temp[] = new int[a.length + 1];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
			if (num < a[i]) {
				//将num和原数组中的数一个个比较
				temp[i] = num;
				//得到插入数的下一个下标
				count = i;
				break;
			}
		}
//如果count==0，即这个数是最大的数，直接这个数放到数组的末位
		if (count == 0) {
			temp[temp.length - 1] = num;

		} else {
			for (int j = count; j < a.length; j++) {
				//数组往后推一位
				temp[j + 1] = a[j];
			}
		}
		for (int j = 0; j < temp.length; j++) {
			System.out.print(temp[j] + " ");
		}
	}
}
