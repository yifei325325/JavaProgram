/**
 * 学习时间监听
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
		jb1 = new JButton("黑色");
		jb2 = new JButton("红色");
		Cat mycat = new Cat();
		
		mp.setBackground(Color.WHITE);
//		注册监听源，由TestEvent这个类的实例去监听
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb1.addActionListener(mycat);
		jb2.addActionListener(mycat);
//		设置监听消息
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
			System.out.println("不知道");
		}
		
	}
}
class Cat implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("black")){
			System.out.println("猫也知道你按了黑色按钮");
		}else if(e.getActionCommand().equals("red")){
			System.out.println("猫也知道你按了红色按钮");
			
		}
	}
	
}
 