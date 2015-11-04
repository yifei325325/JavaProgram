package com.a.f;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.start();
		Dog dog = new Dog();
		Thread t = new Thread(dog);
		t.start();

	}

}

class Cat extends Thread{
	int i = 0;
	public void run(){
		while(true){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello,World!");
			i++;
			if (i==10){break;}
		}
	}
}

class Dog implements Runnable{
	int times = 0;
	public void run() {
		while (true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times++;
			System.out.println("我是第"+times+"个");
			if(times==10){break;}
		}
		
	}
}