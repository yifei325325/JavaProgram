/**
 * 学习线程同步
 */
package com.a.g;

public class ThreadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindow tw = new TicketWindow();
		Thread t1 = new Thread(tw);
		Thread t2 = new Thread(tw);
		Thread t3 = new Thread(tw);
		t1.start();
		t2.start();
		t3.start();
	}

}

class TicketWindow implements Runnable{
	private int nums = 1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
			while(true){
				synchronized (this) {
					if(nums<=2000){
						System.out.println(Thread.currentThread().getName()+"正在卖出第 "
								+nums+"张票");
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						nums++;
					}else{break;}
				
				}
			}
		
	}
	
}