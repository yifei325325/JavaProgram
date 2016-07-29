package com.package1;

/*
 * 学习类的构造方法和成员函数
 * 
 * 
 * */

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.printStar(5);

	}

}

class Person {
	public Person() {
		System.out.println("构造方法运行中。。。");
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