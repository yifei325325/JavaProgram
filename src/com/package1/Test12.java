package com.package1;
/*
 * 类的属性，构造方法，方法，访问限制的学习
 */

public class Test12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 student1 = new Student1();
		student1.setId(1);
		student1.setName("Kenny");
		student1.setScoreOfMath(78.9f);
		student1.setScoreOfEnglish(90.2f);
		student1.setScoreOfComputer(95.7f);
		
		System.out.println("学号：\t"+student1.getId());
		System.out.println("姓名：\t"+student1.getName());
		System.out.println("总分：\t"+student1.totalScore());
		System.out.println("平均分：\t"+student1.avgScore());
		System.out.println("最大值：\t"+student1.getMax());
		System.out.println("最小值：\t"+student1.getMin());
		System.out.println("##################################");
		
		
		Student1 student2 = new Student1(2,"Jason",88.5f,95.3f,84.2f);
		System.out.println("学号：\t"+student2.getId());
		System.out.println("姓名：\t"+student2.getName());
		System.out.println("总分：\t"+student2.totalScore());
		System.out.println("平均分：\t"+student2.avgScore());
		System.out.println("最大值：\t"+student2.getMax());
		System.out.println("最小值：\t"+student2.getMin());
		
		
	}
}

class Student1{
	private int id;
	private String name;
	private float scoreOfMath;
	private float scoreOfEnglish;
	private float scoreOfComputer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getScoreOfMath() {
		return scoreOfMath;
	}
	public void setScoreOfMath(float scoreOfMath) {
		this.scoreOfMath = scoreOfMath;
	}
	public float getScoreOfEnglish() {
		return scoreOfEnglish;
	}
	public void setScoreOfEnglish(float scoreOfEnglish) {
		this.scoreOfEnglish = scoreOfEnglish;
	}
	public float getScoreOfComputer() {
		return scoreOfComputer;
	}
	public void setScoreOfComputer(float scoreOfComputer) {
		this.scoreOfComputer = scoreOfComputer;
	}

	
	
	//默认构造方法，不能不写，否则不传参 的构造方法不能用
	public Student1(){
		
	}
	public Student1(int id, String name,float scoreOfMath, float scoreOfEnglish,float scoreOfComputer){
		this.id = id;
		this.name = name;
		this.scoreOfMath = scoreOfMath;
		this.scoreOfEnglish = scoreOfEnglish;
		this.scoreOfComputer = scoreOfComputer;
	}
	
	public float totalScore(){
		return this.scoreOfMath+this.scoreOfEnglish+this.scoreOfComputer;
	}
	
	public float avgScore(){
		return this.totalScore()/3;
	}
	
	public float getMax(){
		float temp = this.scoreOfMath>this.scoreOfEnglish?this.scoreOfMath:this.scoreOfEnglish;
		return temp>this.scoreOfComputer?temp:this.scoreOfComputer;
	}
	public float getMin(){
		float temp = this.scoreOfMath<this.scoreOfEnglish?this.scoreOfMath:this.scoreOfEnglish;
		return temp<this.scoreOfComputer?temp:this.scoreOfComputer;
	}
	
}