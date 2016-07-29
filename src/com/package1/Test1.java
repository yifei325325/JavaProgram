package com.package1;

/*
 * 打印三角形
 * */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStar(5);
	}
	
	public static void printStar(int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("#");
			}
			System.out.print("*");
		}
	}

}
