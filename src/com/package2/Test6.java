package com.package2;
/**
 * 
 * @author Kenny
 *static 关键字,静态属性：所有对象都能访问和操作的属性，所以也叫类属性
 */
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(29, "Kenny");
		Person p2 = new Person(30, "Jason");
		//因为是类属性，所以要类去操作它
		Person.city = "TOYOTO";
		System.out.println("p1 的名字："+p1.name+"\np1的年龄："+p1.age+"\np1的城市："+Person.city);
		System.out.println("p2 的名字："+p2.name+"\np2的年龄："+p2.age+"\np2的城市："+Person.city);

	}
}

class Person {
	int age;
	String name;
	static String city = "London";
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}
	// TODO Auto-generated constructor stub
}