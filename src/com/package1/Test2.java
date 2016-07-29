package com.package1;

/*
 * 学习类的构造方法和成员函数
 * 
 * 
 * */

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(34,"Kenny");
		
		System.out.println(p.getAge());
		System.out.println(p.getName());
		
		p.printStar(5);

	}

}

class Person {
	private int age;
	private String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("构造方法运行中。。。");
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	
	public void printStar(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("#");
		}
		System.out.print("\n1");
		for (int j = n; j < 0; j--) {
			System.out.print("*");
		}
		System.out.print("\n2");
	}
}