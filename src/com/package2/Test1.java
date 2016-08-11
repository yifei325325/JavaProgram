package com.package2;
/**
 * 
 * @author Kenny
 *String 类的学习 “==”和“equals”的区别
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello";
		String str2 = new String("Hello");
		
		//str1 和str2 的内存地址是不同的，所以“==”的结果为假
		if (str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		//equals 是对比内存中存储的值的是否相同，虽然str1 和 str2 指向的不同的内存地址，但是存储的值是一样的。（“Hello”）所以结果为真
		if (str1.equals(str2)){
			System.out.println("str1 equals str2");
			
		}else {
			System.out.println("str1  not equals str2");
		}
			

	}

}


