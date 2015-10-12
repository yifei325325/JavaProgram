/**
 * ¶àÎ¬Êý×é
 */
package com.sencondday;

public class MutilArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[4][6];
		a[1][2] = 1;
		a[2][1] = 2;
		a[2][3] = 3;
		
		for(int i=0;i<4;i++){
			for(int j=0;j<6;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("");
		}
		

	}

}
