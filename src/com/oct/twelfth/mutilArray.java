/**
 * ¶àÎ¬Êý×é
 */
package com.oct.twelfth;

public class mutilArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[4][6];
		
		a[1][3] = 1;
		a[2][2] = 2;
		a[2][4] = 3;
		
		for(int i=0;i<4;i++){
			for(int j=0;j<6;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.print("\n");
		}
	}
}
