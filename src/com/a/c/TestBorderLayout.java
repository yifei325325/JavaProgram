/**
 * BorderLayout����ϰ
 * 1���̳�JFrame
 * 2���������
 * 3���������
 * 4��������
 * 5�����ô�������
 * 6����������ʵ��
 */
package com.a.c;

import javax.swing.*;
import java.awt.*;
//1,�̳�JFrame
public class TestBorderLayout extends JFrame{
//	2���������
	JButton jb1,jb2,jb3,jb4,jb5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6����������ʵ��
		TestBorderLayout tbl = new TestBorderLayout();

	}
	public TestBorderLayout () {
//		3���������
		jb1 = new JButton("����");
		jb2 = new JButton("�ϲ�");
		jb3 = new JButton("����");
		jb4 = new JButton("����");
		jb5 = new JButton("�в�");
//		4��������
		this.add(jb1,BorderLayout.EAST);
		this.add(jb2,BorderLayout.SOUTH);
		this.add(jb3,BorderLayout.WEST);
		this.add(jb4,BorderLayout.NORTH);
		this.add(jb5,BorderLayout.CENTER);
//		5�����ô�������
		this.setSize(400,300);
		this.setLocation(100, 100);
		this.setTitle("�߽粼�ְ���");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
