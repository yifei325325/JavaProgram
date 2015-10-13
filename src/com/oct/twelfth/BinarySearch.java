/**
 * 二分法查找
 */
package com.oct.twelfth;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,5,7,9,13,78,99,101,120};
		BSearch bsearch = new BSearch();
		bsearch.search(0, a.length-1, 5, a);

	}

}

class BSearch{
	public void search(int leftIndex,int rightIndex,int val,int arr[]){
		int midIndex = (leftIndex+rightIndex)/2;
		int midVal = arr[midIndex];
		for(int i=0;i<midIndex;i++){
//			if()
			System.out.println("test");
			System.out.println(midVal);
		}
	}
}
