/**
 * GUI���򿪷�
 */
package com.a.b;

import javax.swing.*;
import java.awt.*;

public class MyFirstGUI extends JFrame{
	JButton jb1 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstGUI mfg = new MyFirstGUI();
		
	

	}
	public MyFirstGUI(){
		//�������
		jb1 = new JButton("���ǰ�ť");
		//������
		this.add(jb1);
		//���ô�������
		this.setTitle("Hello World");
		this.setSize(500, 400);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ÿɼ���
		this.setVisible(true);
	}

}
