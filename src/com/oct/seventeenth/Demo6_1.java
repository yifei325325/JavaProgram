/**
 * ѧϰArrayList
 */
package com.oct.seventeenth;
import java.util.*;
public class Demo6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		System.out.println("al�Ĵ�С�ǣ�"+al.size());
		Clerk clerk1 = new Clerk(12,"�ν�" );
		Clerk clerk2 = new Clerk(21,"¬����" );
		Clerk clerk3 = new Clerk(16,"����" );
		Clerk clerk4 = new Clerk(19,"�ֳ�" );
		al.add(clerk1);
		al.add(clerk2);
		al.add(clerk3);
		al.add(clerk4);
		System.out.println("al�Ĵ�С�ǣ�"+al.size());
//		�����б��еĽ��
		for(int i=0;i<al.size();i++){
			Clerk temp = (Clerk)al.get(i);
			System.out.println("�����ǣ�"+temp.getName());
		}
//		ɾ������
		al.remove(clerk3);
		System.out.println("=====ɾ�����ú�=====");
		for(int i=0;i<al.size();i++){
			Clerk temp = (Clerk)al.get(i);
			System.out.println("�����ǣ�"+temp.getName());
		}
	}

}
class Clerk{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Clerk(int age,String name){
		this.age = age;
		this.name = name;
	}
	
}
