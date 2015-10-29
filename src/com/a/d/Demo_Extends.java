/**
 * 继承
 */
package com.a.d;

public class Demo_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(15);//学生类继承自人类的方法
		System.out.println("年龄："+student.getAge());
		student.setName("张三");
		System.out.println("姓名："+student.getName());
		student.setSchool("清华大学");//学生类自己的方法
		System.out.println("学校："+student.getSchool());
		System.out.println("test");
		System.out.println("test4");

	}

	
}
//人类
class Person{
	private int age;
	private String name;
	
	public Person(){
//		System.out.println("父类构造方法");
	}
	
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
}
//学生类继承人类
class Student extends Person{
//	学生类自己的属性和方法
	private String school;
	
	public Student(){
		System.out.println("子类构造方法");
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
		
	
	
