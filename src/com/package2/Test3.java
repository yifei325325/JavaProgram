package com.package2;

import com.package3.Animal;
import com.package3.Cat;
import com.package3.Dog;

/**
 * 
 * @author Kenny
 *继承和重载
 */
public class Test3{
	public static void main(String args[]){
		
		Cat cat = new Cat();
		cat.cry();
		Dog dog = new Dog();
		dog.cry();
		
	}
}

class Animal{
	int age;
	String name;
	public void cry(){
		System.out.println("我是动物，我不知道我怎么叫！");
	}
}

class Cat extends Animal{
	public void cry(){
		System.out.println("我是猫，我喵喵叫！我5"+"岁");
	}
}
class Dog extends Animal{
	public void cry(){
		System.out.println("我是狗，我汪汪叫！我6岁");
		System.out.println("我体重是13.2kg");
	}
}