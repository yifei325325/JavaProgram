/**
 * ��ʾ��ǰʱ��
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
		System.out.println("�ܺ�������"+totalMillisSeconds);
		System.out.println("��������"+totalSeconds);
		System.out.println("��ǰ������"+ currentSeconds);
		System.out.println("�ܷ�������"+ totalMinutes);
		System.out.println("��ǰ��������"+ currentMinutes);
		System.out.println("��Сʱ����"+ totalHours);
		System.out.println("��ǰСʱ����"+ currentHours);
		System.out.println("��ǰʱ���ǣ�"+currentTime);
		
		
	}

}
