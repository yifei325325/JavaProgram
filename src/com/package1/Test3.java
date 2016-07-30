package com.package1;
/*
 * 计算从1 到 n 的和；
 * */
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("sum = "+sum(10));

	}
	
	public static int sum(int n){
		int result = 0;
		for(int i=0;i<=n;i++){
			 result = result + i;
		}
		return result;
	}

}
