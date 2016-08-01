package com.package1;
/*
 * 类方法；静态区域块的学习
 */
public class Test6 {
	
	static int i = 1;
	//静态区域块，即使对象不用创建，它也会执行一次
	static{
		i++;
	}
	
	public Test6(){
		i++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t6 = new Test6();
		System.out.println(Test6.i);
		Test6 t66 = new Test6();
		System.out.println(Test6.i);

	}

}
