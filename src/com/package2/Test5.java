/**
 * 引用传递练习2
 */

package com.package2;

import java.sql.SQLNonTransientConnectionException;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		System.out.println("fun()调用前： "+str1);
		fun(str1);
		System.out.println("fun()调用后： "+str1);
		/**执行结果如下：
		 * fun()调用前： Hello
		 * fun()调用后： Hello
		 */
		
		
		
	}
	
	public static void fun(String s){
		s = "World";
	}

}
