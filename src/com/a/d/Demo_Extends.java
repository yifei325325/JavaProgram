/**
 * �̳�
 */
package com.a.d;

public class Demo_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(15);//ѧ����̳�������ķ���
		System.out.println("���䣺"+student.getAge());
		student.setName("����");
		System.out.println("������"+student.getName());
		student.setSchool("�廪��ѧ");//ѧ�����Լ��ķ���
		System.out.println("ѧУ��"+student.getSchool());
		System.out.println("test");
		System.out.println("test4");

	}

	
}
//����
class Person{
	private int age;
	private String name;
	
	public Person(){
//		System.out.println("���๹�췽��");
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
//ѧ����̳�����
class Student extends Person{
//	ѧ�����Լ������Ժͷ���
	private String school;
	
	public Student(){
		System.out.println("���๹�췽��");
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
		
	
	
