package com.package1;

/*
 * 计算一个数组中所有元素的和
 */

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,5,15,46,21,812,89,2,7};
		System.out.println("和是："+sumArray(a));
		
	}	
	public static int sumArray(int a[]){
		int sum = 0;
		for (int i=0;i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}

	

}
