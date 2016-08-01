package com.package1;

/*
 * 类方法（静态方法的学习）
 * 每个学生都有费用，计算所有学生的总费用
 */
public class Test7 {
	
	public static void main(String [] args){
		
		Student s1 = new Student(29,"Kenny",359);
		Student s2 = new Student(28,"Jason",456);
		System.out.println("总费用是："+  Student.getTotalFee());
	}
}

class Student{
	int age;
	String name;
	int fee;
	static int totalFee;
	public Student(int age, String name, int fee){
		this.age = age;
		this.name = name;
		totalFee += fee;
	}
	
	public static int getTotalFee() {
		return totalFee;
	}
}