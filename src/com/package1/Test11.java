package com.package1;

/*
 * 向排序好的数组中插入一个数字，并使其在适当的位置
 */
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,21,31,41,51,100,121,455,898};
		insertNum(a, 12);
	}
	
	public static void insertNum(int a[], int num){
		int temp[] = new int[a.length+1];
		int count = 0;
		for(int i=0;i<a.length;i++){
			temp[i]=a[i];
			if(num<a[i]){
				temp[i] = num;
				count = i;
				break;
			}
		}

		if (count == 0){
			temp[temp.length-1] = num;

		}else{
			for(int j= count;j<a.length;j++){
				temp[j+1] = a[j];
			}
		}
		for (int j=0;j<temp.length;j++){
			System.out.print(temp[j]+" ");
		}
	}
}
