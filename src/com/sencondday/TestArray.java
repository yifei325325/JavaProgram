package com.sencondday;

import java.io.*;

public class TestArray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dog[] dogs = new Dog[4];
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
//		����������ֵ
		for(int i=0;i<dogs.length;i++){
			dogs[i] = new Dog();
			System.out.println("name"+(i+1)+":");
			dogs[i].setName(br.readLine());
			System.out.println("weight"+(i+1)+":");
			
//			���յ��û��������ַ����͵ģ�Ҫת����float��
			String s_weight = br.readLine();
			float weight = Float.parseFloat(s_weight);
			
			dogs[i].setWeight(weight);
		}
//		ȡ�����صĹ�
		float max = dogs[0].getWeight();
		int maxIndex = 0;
		for (int i=1;i<dogs.length;i++){
			if(max<dogs[i].getWeight()){
				max = dogs[i].getWeight();
				maxIndex = i+1;
			}
		}
		System.out.println("���صĹ������ǣ�"+max+"\n����ǣ�"+maxIndex);
//		���ݹ�����ù�����
		System.out.print("�����빷����");
		String newName = br.readLine();
		for(int i=0;i<dogs.length;i++){		
			if(newName.equals(dogs[i].getName())){
				System.out.println("���������ǣ�"+dogs[i].getWeight()+"kg.");
			}
		}
		
		
	}

}

class Dog{
	private String name;
	private float weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
}