/**
 * ���ܣ�ѧϰGirdLayout�Ĳ��ַ�ʽ
 */
package com.a.c;
import java.awt.*;

import javax.swing.*;
public class TestGridLayout extends JFrame{
//	1������һ�����飬��š�size����jb
	int size = 9;
	JButton jbs[] = new JButton[size];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGridLayout tgl = new TestGridLayout();

	}
	
	public TestGridLayout(){
//		2����ÿ��jbʵ��������
		for(int i=0;i<size;i++){
			jbs[i] = new JButton(String.valueOf(i)); 
		}
//		3������ʹ�õĲ��ֹ���������
		this.setLayout(new GridLayout(3,3,10,10));
//		4��������
		for(int i=0;i<size;i++){
			
			this.add(jbs[i]);
		}
		
//		5�����ô�������
		this.setSize(400,300);
		this.setLocation(100,100);
		this.setTitle("���񲼾ְ���");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

}
