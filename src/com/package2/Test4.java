package com.package2;
/**
 * 
 * @author Kenny
 *引用传递练习1
 */
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		//修改temp的值
		d1.temp = 80;
		System.out.println("fun调用前："+d1.temp);
		fun(d1);
		System.out.println("fun调用后："+d1.temp);
	}
	//把Demo的对象传递给一个函数
	public static void fun(Demo d){
		d.temp = 100;
	}

}
class Demo{
	int temp = 50;
}