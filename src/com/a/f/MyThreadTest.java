package com.a.f;

public class MyThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1 = new MyThread("线程A");
		MyThread mt2 = new MyThread("线程B");
		MyThread mt3 = new MyThread("线程C");
		mt1.start();
		mt2.start();
		mt3.start();

	}

}

class MyThread extends Thread{
	private String name;
	
	public MyThread(String name){
		this.name = name;
	}
	
	public void run(){
		for(int i=0;i<30;i++){
			System.out.println(name+"运行，"+ "i= "+i);
		}
	}
	
}
