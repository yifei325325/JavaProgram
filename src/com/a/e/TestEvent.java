/**
 * ѧϰʱ�����
 */
package com.a.e;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class TestEvent extends JFrame implements ActionListener{
	JPanel mp ;
	JButton jb1,jb2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEvent te = new TestEvent();

	}
	
	public TestEvent() {
		// TODO Auto-generated constructor stub
		mp = new JPanel();
		jb1 = new JButton("��ɫ");
		jb2 = new JButton("��ɫ");
		Cat mycat = new Cat();
		
		mp.setBackground(Color.WHITE);
//		ע�����Դ����TestEvent������ʵ��ȥ����
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb1.addActionListener(mycat);
		jb2.addActionListener(mycat);
//		���ü�����Ϣ
		jb1.setActionCommand("black");
		jb2.setActionCommand("red");
		
		
		this.add(jb1,BorderLayout.NORTH);
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("black")){
			mp.setBackground(Color.black);
		}else if(e.getActionCommand().equals("red")){
			mp.setBackground(Color.RED);
		}else{
			System.out.println("��֪��");
		}
		
	}
}
class Cat implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("black")){
			System.out.println("èҲ֪���㰴�˺�ɫ��ť");
		}else if(e.getActionCommand().equals("red")){
			System.out.println("èҲ֪���㰴�˺�ɫ��ť");
			
		}
	}
	
}
 