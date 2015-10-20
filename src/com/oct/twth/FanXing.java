/**
 * 泛型的学习
 */
package com.oct.twth;

import java.util.ArrayList;

public class FanXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Dog dog = new Dog();
		dog.setAge(5);
		dog.setColor("Yellow");
		dog.setName("小花");
		System.out.println(dog.getAge());
		System.out.println(dog.getName());
		System.out.println(dog.getColor());*/
		
		ArrayList<Dog> al = new ArrayList<Dog>();
		
		Dog dog = new Dog("小花", 5, "yellow");
		al.add(dog);
		Dog temp = al.get(0);
		System.out.println(temp.getAge()+temp.getColor()+temp.getName());
		
		

	}

}

class Dog{
	private String name;
	private int age;
	private String color;
	
	public Dog(String name,int age,String color ){
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
}