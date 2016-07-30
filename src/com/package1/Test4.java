package com.package1;

/*
 *有一群小孩在玩堆雪人，不时的有小孩加入，要最后知道有多少小孩加入了。 
 *静态成员变量(类变量)的学习
 * */

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Children c1 = new Children(5, "Kenny1");
		Children c2 = new Children(6, "Kenny2");
		Children c3 = new Children(7, "Kenny3");
		Children c4 = new Children(8, "Kenny4");
		Children c5 = new Children(9, "Kenny5");
		c1.sayMyInfo();
		c2.sayMyInfo();
		c3.sayMyInfo();
		c4.sayMyInfo();
		c5.sayMyInfo();
//		静态成员变量最好用类名.变量名直接来访问
		System.out.println("共有"+Children.total+"个小孩加入了！");
	}

}

class Children{
	int age;
	String name;
	//total 是静态变量，所以它可以被任何一个对象访问。
	static int total = 0;
	public Children(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void sayMyInfo(){
		total++;
		System.out.println("我的名字叫："+this.name);
	}
}
