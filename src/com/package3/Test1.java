/**
 * 多态的学习
 */
package com.package3;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master master = new Master();
		//多态的体现，形参中传入的都是的子类
		master.feedAnimals(new Dog(), new Bone());
		master.feedAnimals(new Cat(), new Fish());
	}

}

class Master{
	public void feedAnimals(Animal an, Food f){
		an.eat();
		f.showName();
	}
}

class Food{
	public void showName(){
		
	}
}

class Fish extends Food{

	public void showName() {
		System.out.println("鱼");
	}
}

class Bone extends Food{

	public void showName() {
		System.out.println("骨头");
	}
	
}

class Animal {
	String name;
	int age;
	
	public void cry(){
		System.out.println("我是动物，我不知道怎么叫！");
	}
	
	public void eat(){
		System.out.println("我不知道吃什么");
	}
}

class Dog extends Animal{
	public void cry(){
		System.out.println("我是狗，我汪汪叫！");
	}
	public void eat(){
		System.out.println("狗爱吃骨头！");
	}
}

class Cat extends Animal{
	public void cry(){
		System.out.println("我是猫，我喵喵叫！");
	}

	public void eat() {
		System.out.println("猫爱吃鱼！");
	}
	
}