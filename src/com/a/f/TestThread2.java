/**
 * 练习多线程
 */
package com.a.f;


public class TestThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoSum ds = new DoSum(10);
		Thread t = new Thread(ds);
		t.start();
		
		PrintHW phw = new PrintHW(10);
		Thread t2 = new Thread(phw);
		t2.start();

	}

}

class DoSum implements Runnable{
	private int n;
	private int sum = 0;
	private int times=0;
	public DoSum(int n){
		this.n = n;
	}
	
	public void run(){
		for(int i=0;i<=n;i++){
			sum+=i;
			System.out.println("sum+"+i+"="+sum);
			this.times++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("sum="+sum);
	}
}

class PrintHW implements Runnable{
	private int n;
	private int times=0;
	public PrintHW(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
	}
	public void run() {
		while(true){
			times++;
			System.out.println("我是"+times+"次打印 Hello World");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(times==n){break;}
		}
	}
	
}