/**
 * 学习ArrayList
 */
package com.oct.seventeenth;
import java.util.*;
public class Demo6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		System.out.println("al的大小是："+al.size());
		Clerk clerk1 = new Clerk(12,"宋江" );
		Clerk clerk2 = new Clerk(21,"卢俊义" );
		Clerk clerk3 = new Clerk(16,"吴用" );
		Clerk clerk4 = new Clerk(19,"林冲" );
		al.add(clerk1);
		al.add(clerk2);
		al.add(clerk3);
		al.add(clerk4);
		System.out.println("al的大小是："+al.size());
//		遍历列表中的结果
		for(int i=0;i<al.size();i++){
			Clerk temp = (Clerk)al.get(i);
			System.out.println("名字是："+temp.getName());
		}
//		删除吴用
		al.remove(clerk3);
		System.out.println("=====删除吴用后=====");
		for(int i=0;i<al.size();i++){
			Clerk temp = (Clerk)al.get(i);
			System.out.println("名字是："+temp.getName());
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
