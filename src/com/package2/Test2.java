package com.package2;
/**
 * 
 * @author Kenny
 *String类的学习
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个char型数组
		char c[] = {'H','e','l','l','o'};
		//String 的构造方法
		String str1 = new String(c,0,1);
		//打印结构是“H”
		System.out.println(str1);
		
		String str2 = "world";
		//将str2直接转化成一个char型数组
		char c2[] = str2.toCharArray();
		for (int i=0;i<c2.length;i++){
			System.out.print(c2[i]);
		}
		
		System.out.println("\n#########我是分割线############");
		//打印出“world”的第3个字母
		System.out.println(str2.charAt(2));
		
		String str3 = "Kenny";
		byte b[] = str3.getBytes();
		for (int i=0;i<b.length;i++){
			
			//打印结果是：75  101  110  110  121  （每个字母的ASCII码）
			System.out.print(b[i]+"  ");
		}
		//匿名的对象的构造方法
		System.out.println("\nstr3:"+new String(b));
		
		//replaceAll()方法
		String str4 = "Hello Wolrd!";
		String newStr4 = str4.replaceAll("o","p" );
//		打印的结果是：Hellp Wplrd!
		System.out.print(newStr4);
				
	}
}
