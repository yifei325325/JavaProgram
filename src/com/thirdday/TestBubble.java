/**
 * ���ܣ���ϰ�����㷨֮����ð������
 * ����˼�룺
 * ð������Bubble Sort����һ�ּ򵥵������㷨�����ظ����߷ù�Ҫ��������У�һ�αȽ�����Ԫ�أ�������ǵ�˳�����Ͱ����ǽ����������߷����еĹ������ظ��ؽ���ֱ��û������Ҫ������Ҳ����˵�������Ѿ�������ɡ�����㷨��������������ΪԽС��Ԫ�ػᾭ�ɽ������������������еĶ��ˡ�

	ð�������㷨����������:

 �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
 ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������
 ������е�Ԫ���ظ����ϵĲ��裬�������һ����
 ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�
 */
package com.thirdday;


public class TestBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,-1,9,89,-7,12,32,25,74};
		Bublle bublle = new Bublle();
		bublle.bubbleSort(arr);

	}

}


class Bublle{
	public void bubbleSort(int[] arr){
		int temp;//����һ����ʱ����
		//��ʼѭ���������Ƚϣ�Ҫ�Ƚ�arr.length-1�Ρ�
		for (int i=0;i<arr.length-1;i++){
			//��ʼ�Ƚϲ�����λ��
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]= temp;
				}
			}
			
		}
		//��ӡ��������
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
