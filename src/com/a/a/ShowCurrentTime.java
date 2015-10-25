/**
 * 显示当前时间
 */
package com.a.a;

import java.util.TimeZone;


public class ShowCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMillisSeconds = System.currentTimeMillis();
		long totalSeconds = totalMillisSeconds/1000;
		long currentSeconds = totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		long currentMinutes = totalMinutes%60;
		long totalHours = totalMinutes/60;
		long currentHours = totalHours%24;
		final int TIME_ZONE = 8;
		String currentTime = (currentHours+TIME_ZONE)+":"+currentMinutes
				+":"+currentSeconds;
		System.out.println("总毫秒数："+totalMillisSeconds);
		System.out.println("总秒数："+totalSeconds);
		System.out.println("当前秒数："+ currentSeconds);
		System.out.println("总分钟数："+ totalMinutes);
		System.out.println("当前分钟数："+ currentMinutes);
		System.out.println("总小时数："+ totalHours);
		System.out.println("当前小时数："+ currentHours);
		System.out.println("当前时间是："+currentTime);
		
		
	}

}
