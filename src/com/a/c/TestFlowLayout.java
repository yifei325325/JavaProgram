/**
 * ���ܣ�ѧϰFlowLayout����
 */
package com.a.c;
import java.awt.*;

import javax.swing.*;

public class TestFlowLayout extends JFrame{
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFlowLayout tfl = new TestFlowLayout();

	}
	
	public TestFlowLayout(){
		jb1 = new JButton("����");
		jb2 = new JButton("�ŷ�");
		jb3 = new JButton("����");
		jb4 = new JButton("��");
		jb5 = new JButton("����");
		jb6 = new JButton("κ��");
		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//���ò��ֹ�����
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
//		5�����ô�������
		this.setSize(380,300);
		this.setLocation(100, 100);
		this.setTitle("��ʽ���ְ���");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

}
